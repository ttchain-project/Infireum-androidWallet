package com.ttchain.walletproject.ui.ttn.ttntransfer

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.App.Companion.ttnFee
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.ApiTtnBalanceResponse
import com.ttchain.walletproject.model.CoinTransferBean
import com.ttchain.walletproject.model.CustomCommentsData
import com.ttchain.walletproject.model.SignTtnTransResultData
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.TtnUtils
import io.reactivex.Observable
import java.math.BigDecimal

class TtnTransferViewModel(
    private val ttnServerApiRepository: TtnServerApiRepository,
    private val baseMainModel: BaseMainModel,
    private val ttnRepository: TtnRepository,
    private val helperRepository: HelperRepository,
    private val verifyRepository: VerifyRepository,
    private val broadcastRepository: BroadcastRepository
) : BaseViewModel() {

    var balanceAmount = ""
    var comment = ""
    var coinTransferBeanViewModel = CoinTransferBean()
    var coinId = ""
    var fiatSymbol = ttnRepository.getPrefFiatData().symbol
    var fiatTextLiveData = MutableLiveData<String>()
    var ttnAddressLiveData = MutableLiveData<String>()

    init {
        add(
            helperRepository.getAllCoinToCurrency(
                ttnRepository.getPrefFiatData().name
            ).toMain()
                .subscribe({
                    rateList = it.data ?: arrayListOf()
                    val fiatText =
                        getFiatRateText(CoinEnum.TTN.coinId, ttnFee.toBigDecimal(), fiatSymbol)
                    fiatTextLiveData.value = fiatText
                }, {
                })
        )
        add(Observable.just(baseMainModel.ttnWalletData)
            .toMain()
            .subscribe {
                ttnAddressLiveData.value = it.address
            }
        )
    }

    val setCoinIdDataLiveData = MutableLiveData<CoinData>()

    fun setCoinIdData(bundleValue: String) {
        coinId = bundleValue
        Observable.just(baseMainModel.getCoinDataByCoinId(bundleValue))
            .toMain()
            .subscribe {
                setCoinIdDataLiveData.value = it
            }
    }

    fun getTtnWalletData(): WalletData {
        return baseMainModel.ttnWalletData
    }

    fun getDisplayNameByCoinId(coinId: String): String {
        return baseMainModel.getCoinDataByCoinId(coinId).displayName
    }

    var getBalanceLiveData = MutableLiveData<ApiTtnBalanceResponse>()

    fun getBalance() {
        val address = baseMainModel.ttnWalletData.address
        add(
            ttnServerApiRepository.performGetTtnBalanceWithContractAddress(address)
                .toMain()
                .subscribe({
                    getBalanceLiveData.value = it
                }, {
                    consumerThrowable(it)
                })
        )
    }

    fun setValue(amount: String, address: String, note: String) {
        coinTransferBeanViewModel = CoinTransferBean().apply {
            transCoinAmount = BigDecimal(if (amount.isEmpty()) "0" else amount)
            transCoinId = coinId
            transCoinName = CoinEnum.TTN.coinName
            transCoinDigit = 18
            transToCoinId = coinId
            transReceiptAddress = address
            transPayAddress = baseMainModel.ttnWalletData.address
            transComment = note
        }
    }

    var isValidTransactionInputThenShowDialog = MutableLiveData<BigDecimal>()

    fun isValidTransactionInputThenShowDialog() {
        val transBean = coinTransferBeanViewModel
        val transDecimal = transBean.transCoinAmount
        Observable.just(transDecimal)
            .subscribe {
                isValidTransactionInputThenShowDialog.value = it
            }
    }


    var getVerifyIdentityPwdObservableLiveData = MutableLiveData<Boolean>()

    fun getVerifyIdentityPwdObservable(pwd: String) {
        Observable.just(pwd)
            .map {
                return@map verifyRepository.verifyIdentityPwd(it)
            }
            .subscribe {
                getVerifyIdentityPwdObservableLiveData.value = it
            }
    }

    fun performGetTtnNonce() {
        val address = baseMainModel.ttnWalletData.address
        val privateKey = getWalletEpKey(baseMainModel.ttnWalletID)
        add(
            ttnServerApiRepository.performGetTtnBalanceWithContractAddress(address)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({
                    val formattedNonce = NumberUtils.formatFloorDouble(it.nonce ?: 0.0)
                    signTtnTransaction(privateKey, formattedNonce)
                }, {
                    consumerThrowable(it)
                })
        )
    }

    fun getWalletEpKey(walletID: Int): String {
        return verifyRepository.getWalletEpKey(walletID)
    }

    private fun getTtnTransModel(nonce: String): SignTtnTransResultData {
        return TtnUtils.getTtnTransModel(
            toAddress = coinTransferBeanViewModel.transReceiptAddress,
            ttnNonce = nonce,
            type = CoinEnum.TTN.inputName,
            input = "",
            coinId = coinId,
            transCoinAmount = coinTransferBeanViewModel.transCoinAmount
        )
    }

    private fun signTtnTransaction(privateKey: String, nonce: String) {
        var trans = getTtnTransModel(nonce)
        trans = TtnUtils.signTransaction(trans, privateKey)
        trans.from = baseMainModel.ttnWalletData.address
        performPostTtnBroadcast(trans)
    }

    var performPostTtnBroadcastLiveData = MutableLiveData<String>()

    private fun performPostTtnBroadcast(broadcastData: SignTtnTransResultData) {
        add(
            ttnServerApiRepository.performPostTtnBroadcast(broadcastData)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({
                    performPostTtnBroadcastLiveData.value = it
                }, {
                    consumerThrowable(it)
                })
        )
    }


    var performTransactionSucceedLiveData = MutableLiveData<Boolean>()

    fun performTransactionSucceed(txId: String) {
        if (comment.isNotEmpty()) {
            add(
                broadcastRepository.performPostCommentRequest(
                    CustomCommentsData().apply {
                        txID = txId
                        this.comments = comment
                        toIdentifier = coinTransferBeanViewModel.transToCoinId
                        toAddress = coinTransferBeanViewModel.transReceiptAddress
                    }
                ).toMain()
                    .compose(loadingView(showLoading = true, closeLoading = true))
                    .subscribe({

                    }, {
                        consumerThrowable(it)
                    })
            )
        }
        performTransactionSucceedLiveData.value = true
    }

    var transferAllAmountLiveData = MutableLiveData<BigDecimal>()

    fun transferAllAmount() {
        var amount = NumberUtils.valueOf(balanceAmount)
        if (coinId == CoinEnum.TTN.coinId) {
            amount = amount.subtract(NumberUtils.valueOf(ttnFee))
        }
        transferAllAmountLiveData.value = amount
    }
}