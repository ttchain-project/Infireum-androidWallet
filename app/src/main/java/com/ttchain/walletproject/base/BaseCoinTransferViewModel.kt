package com.ttchain.walletproject.base

import android.content.Context
import com.ttchain.walletproject.rx.RxBusTag
import com.google.gson.Gson
import com.ttchain.walletproject.R
import com.ttchain.walletproject.blockchain.Bitcoinj
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.CustomCommentsData
import com.ttchain.walletproject.model.ResponseBTCTransactionData
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.rx.RxUtils
import com.ttchain.walletproject.showNumber
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.SortUtils
import io.reactivex.Observable
import timber.log.Timber
import java.math.BigDecimal
import java.security.InvalidParameterException

open class BaseCoinTransferViewModel(
    private val context: Context,
    private val baseMainModel: BaseMainModel,
    private val helperRepository: HelperRepository,
    private val minerFeeRepository: MinerFeeRepository,
    private val broadcastRepository: BroadcastRepository,
    private val baseCoinTransferRepository: BaseCoinTransferRepository
) : BaseViewModel() {

    var minerFeeModel = minerFeeRepository
    var baseCoinTransferModel = baseCoinTransferRepository


    fun performGetMinerFee(address: String) {
        minerFeeModel.selectedChainType = RuleUtils.getChainType(address).value

        when (RuleUtils.getChainType(address)) {
            ChainType.ETH -> {
                add(helperRepository.performGetEthFee()
                    .map {
                        return@map it.data
                    }
                    .map { data ->
                        minerFeeModel.saveEthMinerFeeFromApiToString(Gson().toJson(data))
                        return@map data
                    }
                    .toMain()
                    .compose(loadingView(showLoading = false, closeLoading = false))
                    .doFinally {
                        performSetMinerFeeToView(minerFeeModel.selectedChainType)
                    }
                    .subscribe({}, {})
                )
            }
            ChainType.BTC -> {
                add(helperRepository.performGetBtcFee()
                    .map {
                        return@map it.data
                    }
                    .map { data ->
                        minerFeeModel.saveBtcMinerFeeFromApiToString(Gson().toJson(data))
                        return@map data
                    }
                    .toMain()
                    .compose(loadingView(showLoading = true, closeLoading = false))
                    .doFinally {
                        performSetMinerFeeToView(minerFeeModel.selectedChainType)
                    }
                    .subscribe({
                    }, {
                    })
                )
            }
            else -> {
                //do nothing
            }
        }
    }

    private fun performSetMinerFeeToView(chainType: Int) {
        when (RuleUtils.getChainType(chainType)) {
            ChainType.ETH -> {
                add(
                    Observable.just("")
                        .map {
                            val data = minerFeeModel.getEthMinerFeeFromApiString()
                            return@map data.isNotEmpty()
                        }
                        .map { hasData ->
                            when {
                                hasData -> minerFeeModel.setEthMinerFeeFromApiString()
                                else -> throw InvalidParameterException("Eth fee data empty")
                            }
                            return@map ""
                        }
                        .toMain()
                        .compose(loadingView())
                        .subscribe({
                            minerFeeModel.minerFeeEditBean.let {
                                minerFeeGasItemGasPriceRange.value = it
                            }
                        }, {
                            throwableMessage.value = context.getString(R.string.g_a_network_error)
                        })
                )
            }
            ChainType.BTC -> {
                add(
                    Observable.just("")
                        .map {
                            val data = minerFeeModel.getBtcMinerFeeFromApiString()
                            return@map data.isNotEmpty()
                        }
                        .map { hasData ->
                            when {
                                hasData -> minerFeeModel.setBtcMinerFeeFromApiString()
                                else -> throw InvalidParameterException("Btc fee data empty")
                            }
                            return@map ""
                        }
                        .toMain()
                        .compose(loadingView())
                        .subscribe({
                            minerFeeModel.minerFeeEditBean.let {
                                val text = NumberUtils.show(
                                    NumberUtils.valueOf(it.regularPriceBtc, 8), showNumber
                                )
                                minerFeeHeaderItemAmountText.value =
                                    "$text ${CoinEnum.BTC.inputName}"
                                minerFeeSatItemGas.value = it
                            }
                        }, {
                            throwableMessage.value = context.getString(R.string.g_a_network_error)
                        })
                )
            }
            else -> {
                //do nothing
            }
        }
    }

    fun verifyUserInputPwdSuccess() {
        when {
            baseCoinTransferModel.isEthTransType() -> {
                val address = baseCoinTransferModel.getSelectedWalletData().address
                performGetEthNonceRequest(address)
            }
            baseCoinTransferModel.isBtcTransType() -> {
                val address = baseCoinTransferModel.getSelectedWalletData().address
                performGetBtcTransactionRequest(address)
            }
            else -> {
            }
        }
    }

    fun performGetEthNonceRequest(address: String) {
        add(
            broadcastRepository.performMainnetInfuraRequest(
                BaseCoinTransferRepository.getMainnetInfuraEthNonceModel(
                    address
                )
            ).map {
                return@map it.data
            }.toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe(
                    { nonce ->
                        performEthSignRequest(nonce ?: "")
                    },
                    {
                        consumerThrowable(it)
                    })
        )
    }

    fun performEthSignRequest(nonce: String) {
        val contract =
            when {
                baseCoinTransferModel.transCoinId != CoinEnum.ETH.coinId ->
                    baseMainModel.getCoinDataByCoinId(
                        baseCoinTransferModel.transCoinId
                    ).contract
                else -> null
            }

        val bodyModel = BaseCoinTransferRepository.getSignEthBodyModel(
            baseMainModel.getWalletEpKey(context, baseCoinTransferModel.walletSelectedId),
            contract
        )
        val queryModel = BaseCoinTransferRepository.getSignEthUrlModel(
            false, nonce, minerFeeModel.minerFeeEditBean,
            baseCoinTransferModel.getBaseCoinTransferBean()
        )

        add(
            Bitcoinj.signEthTransaction(bodyModel, queryModel)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe(
                    { signText ->
                        performEthBroadcastRequest(signText)
                    },
                    {
                        consumerThrowable(it)
                    })
        )
    }

    fun performEthBroadcastRequest(signText: String) {
        add(broadcastRepository.performMainnetInfuraRequest(
            BaseCoinTransferRepository.getMainnetInfuraEthBroadcastModel(
                signText,
                baseCoinTransferModel.getBaseCoinTransferBean().transComment
            )
        ).map {
            return@map it.data
        }.toMain()
            .compose(loadingView(showLoading = true, closeLoading = true))
            .subscribe(
                { data ->
                    performTransactionSucceed(data ?: "")
                }, {
                    consumerThrowable(it)
                })
        )
    }

    fun performGetBtcTransactionRequest(
        address: String
    ) {
        add(broadcastRepository.performGetBtcTransactionRequest(address)
            .map {
                return@map it.data
            }
            .map {
                return@map SortUtils.getBtcTransactionDataByAmount(it)
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = false))
            .subscribe(
                {
                    if (baseCoinTransferModel.transCoinId == CoinEnum.USDT.coinId) {
                        performUSDTSignRequest(it)
                    } else {
                        performBtcSignRequest(it, false)
                    }
                }, {
                    consumerThrowable(it)
                })
        )
    }

    fun performBtcSignRequest(
        list: List<ResponseBTCTransactionData>,
        isBtcToRelay: Boolean
    ) {

        val address = baseCoinTransferModel.getSelectedWalletData().address
        val privateKey = baseCoinTransferModel.getWalletEpKey(
            baseCoinTransferModel.walletSelectedId
        )

        val model = BaseCoinTransferRepository.getSignBtcBodyModel(
            address,
            privateKey,
            list,
            minerFeeModel.minerFeeEditBean,
            baseCoinTransferModel.getBaseCoinTransferBean(),
            isBtcToRelay,
            baseCoinTransferModel.isSendAllBtcAmount
        )

        add(
            Bitcoinj.signBtcTransaction(model, address)
                .compose(RxUtils.toMainThread())
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe(
                    {
                        performBtcBroadcastRequest(it)
                    }, {
                        Timber.e(it.message)
                    }
                )
        )
    }

    fun performUSDTSignRequest(list: List<ResponseBTCTransactionData>) {

        val address = baseCoinTransferModel.getSelectedWalletData().address
        val privateKey = baseCoinTransferModel.getWalletEpKey(
            baseCoinTransferModel.walletSelectedId
        )

        val usdtAmount = baseCoinTransferModel.getBaseCoinTransferBean()
            .transCoinAmount.multiply(BigDecimal("1E+8"))

        val model = BaseCoinTransferRepository.getSignUSDTBodyModel(
            address,
            privateKey,
            list,
            minerFeeModel.minerFeeEditBean,
            baseCoinTransferModel.getBaseCoinTransferBean()
        )

        add(
            Bitcoinj.signUsdtTransaction(model, usdtAmount, address)
                .compose(RxUtils.toMainThread())
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe(
                    {
                        performBtcBroadcastRequest(it)
                    }, {
                        Timber.e(it.message)
                    }
                )
        )
    }

    fun performBtcBroadcastRequest(signText: String) {

        add(broadcastRepository.performBlockExplorerRequest(
            baseCoinTransferModel.getBlockExplorerBroadcaseModel(
                signText,
                baseCoinTransferModel.getBaseCoinTransferBean().transComment
            )
        )
            .map {
                return@map it.data
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = true))
            .subscribe(
                {
                    performTransactionSucceed(it ?: "")
                },
                {
                    consumerThrowable(it)
                }
            )
        )
    }

    fun isValidTransactionInputThenShowDialog() {
        val transBean = baseCoinTransferModel.getBaseCoinTransferBean()

        val transDecimal = transBean.transCoinAmount

        transDecimal.let {
            if (it.toDouble() > 0) {
                val address = transBean.transReceiptAddress
                if (address.isNotEmpty()) {
                    if (transBean.transPayAddress == transBean.transReceiptAddress) {
                        throwableMessage.value =
                            context.getString(R.string.error_address_of_pay_as_the_same_receipt)
                    } else {
                        val transCoinId = transBean.transCoinId
                        val coinData = baseMainModel.getCoinDataByCoinId(transCoinId)

                        if (RuleUtils.getMainCoinId(address) == coinData.mainCoinId) {
                            if (baseCoinTransferModel.isEnough()) {
                                if (minerFeeModel.isValidMinerFee()) {
                                    if (RuleUtils.isValidCommentLength(transBean.transComment)) {
                                        val coinName = transBean.transCoinName
                                        confirmView.value = coinName
                                    } else {
                                        throwableMessage.value =
                                            context.getString(R.string.error_note_too_long)
                                    }
                                } else {
                                    throwableMessage.value =
                                        context.getString(R.string.miner_fee_input_p)
                                }
                            } else {
                                throwableMessage.value =
                                    transBean.transCoinName + " " + context.getString(R.string.fail_amount_not_enough)
                            }
                        } else {
                            throwableMessage.value =
                                context.getString(R.string.error_receipt_address_format)
                        }
                    }
                } else {
                    throwableMessage.value =
                        context.getString(R.string.fill_in_receipt_address_p)
                }
            } else {
                throwableMessage.value =
                    context.getString(R.string.fill_in_amount_p)
            }
            return@let ""
        }
    }

    fun performTransactionSucceed(txid: String) {
        add(
            performPostTxIdCommentRequest(
                txid,
                this.baseCoinTransferModel.getBaseCoinTransferBean().transComment
            )
                .subscribe({
                }, {
                    consumerThrowable(it)
                })
        )
        showToastText.value = context.getString(R.string.transaction_account_succeed)

        if (baseCoinTransferModel.getBaseCoinTransferBean().transCoinId == CoinEnum.USDT.coinId) {
            baseCoinTransferModel.addUsdtTransferRecordData(
                txid,
                baseCoinTransferModel.getBaseCoinTransferBean(),
                minerFeeModel.minerFeeEditBean
            )
        } else {
            baseCoinTransferModel.addTransferRecordData(
                txid,
                baseCoinTransferModel.getBaseCoinTransferBean(),
                minerFeeModel.minerFeeEditBean
            )
        }
//        RxBus.getInstance().post(
//            RxBusTag.TRANSFER_COIN_ACTION_OK, PaymentDetailDialogFragment.NORMAL
//        )
        RxBus.getInstance().post(
            RxBusTag.RED_ENVELOPE_TRANSACTION_COMPLETE,
            baseCoinTransferModel.getBaseCoinTransferBean().transReceiptAddress
        )

        baseCoinTransferModel.nonceResult = ""
        isViewFinished.value = true
    }

    fun performPostTxIdCommentRequest(txId: String, comment: String): Observable<Boolean?> {
        val commentModel = CustomCommentsData().apply {
            txID = txId
            comments = comment
            toIdentifier = baseCoinTransferModel.transCoinId
            toAddress = baseCoinTransferModel.getBaseCoinTransferBean().transReceiptAddress
        }
        return broadcastRepository.performPostCommentRequest(commentModel)
            .map {
                return@map it.data
            }
            .toMain()
    }
}