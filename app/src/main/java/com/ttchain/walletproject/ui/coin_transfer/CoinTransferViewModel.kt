package com.ttchain.walletproject.ui.coin_transfer

import android.content.Context
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseCoinTransferViewModel
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.CoinTransferBean
import com.ttchain.walletproject.model.MinerFeeGasItemBean
import com.ttchain.walletproject.model.TransCoinItemBean
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.showNumber
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.TextWatcher
import io.reactivex.Observable
import io.reactivex.functions.Function3
import io.reactivex.subjects.BehaviorSubject
import java.math.BigDecimal

class CoinTransferViewModel(
    private val context: Context,
    private val userHelper: UserHelper,
    private val baseMainModel: BaseMainModel,
    private val coinRepository: CoinRepository,
    private val helperRepository: HelperRepository,
    private val verifyRepository: VerifyRepository,
    private val minerFeeRepository: MinerFeeRepository,
    private val broadcastRepository: BroadcastRepository,
    private val baseCoinTransferRepository: BaseCoinTransferRepository
) : BaseCoinTransferViewModel(
    context,
    baseMainModel,
    helperRepository,
    minerFeeRepository,
    broadcastRepository,
    baseCoinTransferRepository
) {

    /**
     * Keep miner fee item showing tag.
     */
    var showMinerFeeItem = false
    var showMinerFeeItemResult = MutableLiveData<Boolean>()

    var minerFeeGasItem = MutableLiveData<MinerFeeGasItemBean>()
    var minerFeeGasText = MutableLiveData<String>()

    var coinTransferBean = MutableLiveData<CoinTransferBean>()
    var fiatEquals = MutableLiveData<String>()
    var isLaunchCommonAddressActivity = MutableLiveData<Boolean>()
    var amountItemContent = MutableLiveData<String>()

    private val inputAmountSubject = BehaviorSubject.create<String>()
    private val inputReceiptAddressSubject = BehaviorSubject.create<String>()
    private val inputCommentAddressSubject = BehaviorSubject.create<String>()
    private val toPrefFiatRateSubject = BehaviorSubject.create<BigDecimal>()
    private val toPrefFiatSymbolSubject = BehaviorSubject.create<String>()

    private var seekMinerFeeHeaderToFiatString = ""
    private var customMinerFeeHeaderToFiatString = ""

    var mReceiptAddress = ""

    fun onViewCreate() {
        if (baseCoinTransferModel.isBtcTransType()) {
            // BTC series
            minerFeeModel.selectedWalletId = baseCoinTransferModel.walletSelectedId
            minerFeeModel.selectedChainType =
                baseCoinTransferModel.getTransWalletChainType()
            minerFeeModel.minerFeeEditBean.transAddress =
                baseCoinTransferModel.getTransWalletAddress()

            minerFeeModel.minerFeeEditBean.isRegularPriceBtcChecked = true
            minerFeeModel.minerFeeEditBean.customPriceBtc = "0".toBigDecimal()

            minerFeeModel.minerFeeModelCustomBtcGasListener =
                object : MinerFeeRepository.MinerFeeModelCustomBtcGasListener {
                    override fun onResultMinerFeeBtcGas(decimal: BigDecimal) {
                        if (decimal.compareTo("0".toBigDecimal()) == 0 && !minerFeeModel.minerFeeEditBean.isCustomPriceBtcChecked) {
                            return
                        }

                        val text = NumberUtils.show(NumberUtils.valueOf(decimal, 8), showNumber)
                        minerFeeHeaderItemAmountText.value = "$text ${CoinEnum.BTC.inputName}"
                    }
                }
            minerFeeSatItem.value = minerFeeModel.minerFeeSatItemBean

        } else {
            // ETH/CIC series
            minerFeeModel.needPayload = false
            minerFeeModel.selectedWalletId = baseCoinTransferModel.walletSelectedId
            minerFeeModel.selectedChainType =
                baseCoinTransferModel.getTransWalletChainType()
            minerFeeModel.minerFeeEditBean.transAddress =
                baseCoinTransferModel.getTransWalletAddress()
            minerFeeModel.minerFeeModelListener =
                object : MinerFeeRepository.MinerFeeModelListener {
                    override fun onResultAdvancedStatusChanged(status: Boolean) {
                        if (status) {
                            if (customMinerFeeHeaderToFiatString.isNotEmpty()) {
                                minerFeeHeaderItemAmountText.value =
                                    customMinerFeeHeaderToFiatString
                            }
                        } else {
                            if (seekMinerFeeHeaderToFiatString.isNotEmpty()) {
                                minerFeeHeaderItemAmountText.value =
                                    seekMinerFeeHeaderToFiatString
                            }
                        }
                    }

                    override fun onResultMinerFeeGasGwei(decimal: BigDecimal) {
                        val result = "${NumberUtils.formatAmount(decimal, 2)} gwei"
                        minerFeeGasText.value = result
                    }

                    override fun onResultMinerFeeGasGweiToCoinAmount(decimal: BigDecimal) {
                        val coinAmountString = NumberUtils.showNonZero(decimal, "0")

                        seekMinerFeeHeaderToFiatString =
                            "$coinAmountString ${minerFeeModel.minerFeeEditBean.minerFeeCoinShortName}"
                        minerFeeHeaderItemAmountText.value = seekMinerFeeHeaderToFiatString
                    }

                    override fun onResultMinerFeeFormulaText(text: String) {
                    }

                    override fun onResultInputCustomGasPrice(decimal: BigDecimal) {
                    }

                    override fun onResultInputCustomGas(decimal: BigDecimal) {
                    }
                }
            minerFeeGasItem.value = minerFeeModel.minerFeeGasItemBean
        }
        showMinerFeeItemResult.value = showMinerFeeItem

        add(
            Observable.combineLatest(
                inputAmountSubject,
                toPrefFiatSymbolSubject,
                toPrefFiatRateSubject,
                Function3<String, String, BigDecimal, String> { inputAmount, symbol, rate ->
                    val input = inputAmount.toBigDecimal()
                    val amount = input.multiply(rate)
                    baseCoinTransferModel.getBaseCoinTransferBean().transCoinAmount = input
                    baseCoinTransferModel.getBaseCoinTransferBean().transCoinToFiatAmount = amount
                    val coinData = baseCoinTransferModel.getCoinData(
                        baseCoinTransferModel.getBaseCoinTransferBean().transCoinId
                    )
                    if (coinData._id > 0) {
                        symbol + NumberUtils.showNew(amount, coinData.digit)
                    } else {
                        symbol + NumberUtils.showNew(amount)
                    }
                })
                .toMain()
                .subscribe({
                    fiatEquals.value = it
                }, {
                })
        )

        add(inputReceiptAddressSubject
            .map {
                baseCoinTransferModel.getBaseCoinTransferBean().transReceiptAddress = it
                return@map it
            }
            .toMain()
            .subscribe({
            }, {
            })
        )

        add(inputCommentAddressSubject
            .map {
                baseCoinTransferModel.getBaseCoinTransferBean().transComment = it
                return@map it
            }
            .toMain()
            .subscribe({
            }, {
            })
        )
        performGetMinerFee(baseCoinTransferModel.getTransWalletAddress())
        performCreateCoinTransferBean()
    }

    fun setTransCoinId(coinId: String) {
        baseCoinTransferModel.transCoinId = coinId
        minerFeeModel.minerFeeEditBean.transCoinId = coinId
        baseCoinTransferModel.walletSelectedId = userHelper.selectedWalletID
        performUpdateSelectedWalletData()
    }

    fun setReceiptAddress(address: String) {
        mReceiptAddress = address
        baseCoinTransferModel.getBaseCoinTransferBean().transReceiptAddress = address
    }

    fun setSelectedWalletId(walletId: Int) {
        baseCoinTransferModel.walletSelectedId = walletId
    }

    private fun performCreateCoinTransferBean() {
        val bean = baseCoinTransferModel.getBaseCoinTransferBean()
        if (bean.transCoinId.isEmpty()) {
            isPageFinish = true
            throwableMessage.value = context.getString(
                R.string.error_coin_id,
                baseCoinTransferModel.transCoinId
            )
            return
        }
        add(
            Observable.just(bean)
                .map {
                    val rate =
                        coinRepository.getCoinToPrefFiatRate(baseCoinTransferModel.transCoinId)
                    it.transCoinToFiatRate = rate
                    toPrefFiatSymbolSubject.onNext(it.transToPrefFiatSymbol)
                    toPrefFiatRateSubject.onNext(rate)
                    return@map it
                }
                .toMain()
                .subscribe({
                    coinTransferBean.value = it
                }, {
                })
        )
    }

    fun performUpdateSelectedWalletData() {
        add(Observable.just("")
            .map {
                return@map baseCoinTransferModel.getBaseCoinTransferBean()
            }
            .toMain()
            .subscribe({
                coinTransferBean.value = it
            }, {
            })
        )
    }

    fun createAmountBean(): TransCoinItemBean {
        return TransCoinItemBean().apply {
            //bean.setName("ETH");
            //bean.setSubName("餘額:0.0124 ETH");
            hasFiatEquals = true
            layoutPaddingTop = R.dimen.padding_16
            layoutPaddingBottom = R.dimen.padding_16
            inputHintText = context.getString(R.string.fill_in_amount)
            inputTextChangedListener = TextWatcher {
                val input = it.toString()
                if (input.isNotEmpty()) {
                    if (input.startsWith(".")) {
                        inputAmountSubject.onNext("0$input")
                    } else {
                        inputAmountSubject.onNext(input)
                    }
                } else {
                    inputAmountSubject.onNext("0")
                }
            }
        }
    }

    fun createReceiptAddressBean(): TransCoinItemBean {
        var textSize = context.resources.getDimensionPixelSize(R.dimen.small_text).toFloat()
        textSize /= context.resources.displayMetrics.density
        return TransCoinItemBean().apply {
            name = context.getString(R.string.receipt_address)
            subName = context.getString(R.string.common_address)
            subNameIcon = R.mipmap.arrow_nav_blue
            layoutPaddingBottom = R.dimen.padding_1
            inputTextSize = textSize
            subNameClickable = true
            subNameCallListener = View.OnClickListener {
                isLaunchCommonAddressActivity.value = true
            }
            inputTextChangedListener = TextWatcher { editable ->
                editable?.let {
                    inputReceiptAddressSubject.onNext(it.toString())
                }
            }
        }
    }

    fun createMinerFeeHeaderBean(): TransCoinItemBean {
        return TransCoinItemBean().apply {
            name = context.getString(R.string.miner_fee)
            subName = ""
            subNameIcon = R.mipmap.done_blue
            subNameClickable = true
            subNameCallListener = View.OnClickListener {
                showMinerFeeItem = !showMinerFeeItem
                showMinerFeeItemResult.value = showMinerFeeItem
            }
            hideInputText = true
        }
    }

    fun createCommentBean(): TransCoinItemBean {
        var textSize = context.resources.getDimensionPixelSize(R.dimen.small_text).toFloat()
        textSize /= context.resources.displayMetrics.density
        return TransCoinItemBean().apply {
            name = context.getString(R.string.note)
            layoutPaddingTop = R.dimen.padding_16
            layoutPaddingBottom = R.dimen.padding_4
            inputHintText = context.getString(R.string.note_hint_limit)
            inputTextSize = textSize
            inputTextChangedListener = TextWatcher { editable ->
                editable?.let {
                    inputCommentAddressSubject.onNext(it.toString())
                }
            }
        }
    }

    fun onClickNext() {
        if (baseCoinTransferModel.getBaseCoinTransferBean().transCoinId == CoinEnum.BTC.coinId) {
            val remind =
                baseCoinTransferModel.getBaseCoinTransferBean().transWalletCoinRemindAmount
                    .subtract(baseCoinTransferModel.getBaseCoinTransferBean().transCoinAmount)
            baseCoinTransferModel.isSendAllBtcAmount = remind.compareTo(
                NumberUtils.valueOf(minerFeeModel.minerFeeEditBean.regularPriceBtc, 8)
            ) == 0
        }
        isValidTransactionInputThenShowDialog()
    }

    fun transferAllCoin() {
        val amount = when (baseCoinTransferModel.getBaseCoinTransferBean().transCoinId) {
            CoinEnum.BTC.coinId ->
                baseCoinTransferModel.getBaseCoinTransferBean().transWalletCoinRemindAmount
                    .subtract(
                        NumberUtils.valueOf(
                            minerFeeModel.minerFeeEditBean.regularPriceBtc,
                            8
                        )
                    )
            CoinEnum.ETH.coinId ->
                baseCoinTransferModel.getBaseCoinTransferBean().transWalletCoinRemindAmount
                    .subtract(minerFeeModel.minerFeeEditBean.minerFeeCoinAmount)
            else -> baseCoinTransferModel.getBaseCoinTransferBean().transWalletCoinRemindAmount
        }
        amountItemContent.value = NumberUtils.show(amount, showNumber)
    }

    var verifyUerPwdLiveData = MutableLiveData<Boolean>()

    fun verifyUserPwdObservable(walletId: Int, password: String) {
        add(Observable.just(password)
            .map { s -> verifyRepository.verifyWalletPwd(walletId, s) }
            .toMain()
            .subscribe({ status ->
                verifyUerPwdLiveData.value = status
            }, {
            })
        )
    }
}