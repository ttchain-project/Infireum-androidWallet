package com.ttchain.walletproject.ui.coin_record

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.base.BaseCoinRecordViewModel
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.model.CoinRecordBean
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utils

class CoinRecordViewModel(
    private val context: Context,
    private val etherscanApiRepository: EtherscanApiRepository,
    val baseMainModel: BaseMainModel,
    private val broadcastRepository: BroadcastRepository,
    private val omniExplorerRepository: OmniExplorerRepository,
    private val blockExplorerRepository: BlockExplorerRepository,
    private val baseCoinRecordRepository: BaseCoinRecordRepository,
    private val helperRepository: HelperRepository,
    private val coinRepository: CoinRepository
) : BaseCoinRecordViewModel(
    etherscanApiRepository,
    baseMainModel,
    broadcastRepository,
    omniExplorerRepository,
    blockExplorerRepository,
    baseCoinRecordRepository
) {

    var mCoinId: String? = null
    var coinRecordBean = MutableLiveData<CoinRecordBean>()
    var showLightButton = MutableLiveData<Boolean>()

    var launchReceiptAsset = MutableLiveData<Int>()
    var launchCoinTransfer = MutableLiveData<Boolean>()
    var launchTtnDeposit = MutableLiveData<String>()

    init {
        showLightButton.value = false
        launchCoinTransfer.value = false
    }


    fun getCoinRecordBean(coinId: String) {
        mCoinId = coinId
        add(
            helperRepository.getAllCoinToCurrency(coinRepository.getUserPrefFiatName())
                .toMain()
                .compose(loadingView())
                .subscribe({
                    rateList = it.data ?: arrayListOf()
                    val rate = getRate(coinId)
                    coinRecordBean.value = coinRepository.getCoinRecordBean(coinId, rate)
                    performSyncTransferRecordDataList()
                }, {
                })
        )
        if (coinId == CoinEnum.BTC.coinId || coinId == CoinEnum.USDT.coinId || coinId == CoinEnum.ETH.coinId) {
            showLightButton.value = true
        }
    }

    fun performSyncTransferRecordDataList() {
        val walletData = baseMainModel.selectedWalletData
        if (mCoinId == null || !Utils.getInternetStatus(context)) {
            syncTransRecordDataListFinish.value = true
            return
        }

        val mainCoinType = RuleUtils.getMainCoinType(walletData.address)

        if (mainCoinType === MainCoinType.ETH) {
            userTransCoinId = mCoinId ?: ""
            userEthAddress = walletData.address
            if (mCoinId == CoinEnum.ETH.coinId) {
                performGetEthTransactionRecordDataList()
            } else {
                userErc20ContractAddress = mCoinId!!
                performGetErc20TransactionRecordDataList()
            }
        } else if (mainCoinType === MainCoinType.BTC && mCoinId == CoinEnum.BTC.coinId) {
            userTransCoinId = mCoinId ?: ""
            userBtcAddress = walletData.address
            performGetBtcTransactionRecordDataList()
        } else if (mainCoinType === MainCoinType.BTC && mCoinId == CoinEnum.USDT.coinId) {
            userTransCoinId = mCoinId ?: ""
            userBtcAddress = walletData.address
            performGetUsdtTransactionRecordDataList()
        } else {
            syncTransRecordDataListFinish.value = true
        }
    }

    private fun getCoinID(coinId: String): Int {
        val data = baseMainModel.getCoinDataByCoinId(coinId)
        return data._id
    }

    fun onClickReceipt() {
        mCoinId?.let {
            launchReceiptAsset.value = getCoinID(it)
        }
    }

    fun launchCoinTransfer() {
        if (mCoinId == null) {
            return
        }
        launchCoinTransfer.value = true
    }

    fun launchTtnDeposit() {
        when (mCoinId) {
            CoinEnum.BTC.coinId ->
                launchTtnDeposit.value = CoinEnum.BTCN.coinId
            CoinEnum.USDT.coinId ->
                launchTtnDeposit.value = CoinEnum.USDTN.coinId
            CoinEnum.ETH.coinId ->
                launchTtnDeposit.value = CoinEnum.ETHN.coinId
            else -> {
                launchTtnDeposit.value = ""
            }
        }
    }
}