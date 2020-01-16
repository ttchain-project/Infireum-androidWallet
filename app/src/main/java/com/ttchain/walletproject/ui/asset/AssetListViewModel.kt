package com.ttchain.walletproject.ui.asset

import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecyclerViewViewModel
import com.ttchain.walletproject.database.data.AssetData
import com.ttchain.walletproject.database.data.CoinSelectionData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.RuleUtils
import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import io.reactivex.subjects.BehaviorSubject
import java.math.BigDecimal
import java.util.*

class AssetListViewModel(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val baseMainModel: BaseMainModel,
    private val coinRepository: CoinRepository,
    private val helperRepository: HelperRepositoryCo,
    private val balanceApiRepository: BalanceApiRepository,
    private val balanceRepository: BalanceRepository
) : BaseRecyclerViewViewModel<CoinEntity>() {

    init {
        viewModelLaunch({
            val result = helperRepository.allCoinToCurrency(coinRepository.getUserPrefFiatName())
            rateList = result.data.orEmpty()
        }, {
        })
    }

    val performRefreshUiDataSubject = BehaviorSubject.create<RefreshUiDataBean>()

    fun addSubscribe() {
        add(
            performRefreshUiDataSubject
                .toMain()
                .subscribe({ bean ->
                    performRefreshUiData(
                        bean.showLoading,
                        bean.showRefresh,
                        bean.runUpdateRateAndBalanceDataTask
                    )
                }, {
                })
        )
    }

    var getSelectedWalletIDLiveData = MutableLiveData<Int>()

    fun getSelectedWalletIDRx() {
        Observable.just(baseMainModel.selectedWalletID)
            .subscribe {
                getSelectedWalletIDLiveData.value = it
            }
    }

    fun getSettingChanged(): Boolean {
        return userHelper.settingChanged
    }

    fun setSettingChangedPerformTaskFinish() {
        userHelper.settingChanged = false
    }

    var getSelectedWalletDataRxLiveData = MutableLiveData<WalletData>()

    fun getSelectedWalletDataRx() {
        Observable.just(baseMainModel.selectedWalletData)
            .subscribe {
                getSelectedWalletDataRxLiveData.value = it
            }
    }

    var setTitleLiveData = MutableLiveData<String>()

    fun setTitle() {
        val title: String = when (baseMainModel.selectedWalletData.mainCoinId) {
            CoinEnum.BTC.coinId ->
                when (baseMainModel.selectionWalletCategory) {
                    CoinRepository.COIN_FIAT_IDENTIFIER -> {
                        "${CoinEnum.USDT.coinName}-omni"
                    }
                    else -> {
                        CoinEnum.BTC.coinName
                    }
                }
            CoinEnum.ETH.coinId -> {
                CoinEnum.ETH.coinName
            }
            else -> ""
        }
        Observable.just(title)
            .subscribe {
                setTitleLiveData.value = it
            }
        performUpdateRateAndBalanceDataTask()
    }

    var chainNameLiveData = MutableLiveData<String>()
    var walletNameLiveData = MutableLiveData<String>()
    var fiatAmountLiveData = MutableLiveData<String>()
    var currencySymbolLiveData = MutableLiveData<String>()
    var enableAssetButtonLiveData = MutableLiveData<Boolean>()

    private fun performRefreshUiData(
        showLoading: Boolean,
        showRefresh: Boolean,
        runUpdateRateAndBalanceDataTask: Boolean
    ) {
        val loading: Boolean
        when {
            showLoading -> {
                mRequestStatus = NORMAL_REQUEST
                loading = true
            }
            showRefresh -> {
                mRequestStatus = REFRESH_REQUEST
                loading = true
            }
            else -> {
                mRequestStatus = NORMAL_REQUEST
                loading = false
            }
        }
        add(
            Observable.zip(
                getWalletBeanWithTotalFiatAmountObservable(),
                getCoinEntityListObservable(),
                BiFunction<WalletBean, List<CoinEntity>, BiResponse<*, *>> { response1, response2 ->
                    BiResponse(
                        response1,
                        response2
                    )
                })
                .toMain()
                .compose(loadingRecyclerView(mRequestStatus, loading))
                .subscribe({ result ->
                    val bean = result.response1 as WalletBean

                    val fiatName = baseMainModel.identityData.prefFiatData.name
                    var chainName = " %s"

                    if (baseMainModel.selectedWalletData.mainCoinId == CoinEnum.BTC.coinId) {
                        chainName =
                            when (baseMainModel.selectionWalletCategory) {
                                CoinRepository.COIN_FIAT_IDENTIFIER ->
                                    "${CoinEnum.USDT.coinName}-omni %s"
                                else -> "${CoinEnum.BTC.coinName} %s"
                            }

                    } else if (baseMainModel.selectedWalletData.mainCoinId == CoinEnum.ETH.coinId) {
                        chainName = "Ethereum %s"
                    }
                    chainNameLiveData.value = chainName
                    walletNameLiveData.value = bean.name
                    fiatAmountLiveData.value = bean.totalFiat
                    currencySymbolLiveData.value = fiatName
                    enableAssetButtonLiveData.value =
                        !RuleUtils.isMainCoinType(bean.address, MainCoinType.BTC)
                    val list = result.response2 as List<CoinEntity>

                    onSubscribeComplete(list)

                    if (runUpdateRateAndBalanceDataTask) {
                        performUpdateRateAndBalanceDataTask()
                    }
                }, {
                    onSubscribeError(it)
                })
        )
    }

    private fun getWalletBeanWithTotalFiatAmountObservable(): Observable<WalletBean> {
        return Observable.create { source ->
            try {
                source.onNext(getWalletBeanWithTotalFiatAmount(baseMainModel.selectionWalletCategory))
                source.onComplete()
            } catch (e: Exception) {
                e.printStackTrace()
                source.onError(e)
            }
        }
    }

    private fun getWalletBeanWithTotalFiatAmount(identifier: String): WalletBean {
        val id = userHelper.selectedWalletID
        val walletData = dbHelper.getWalletData(id)

        val bean = WalletBean(walletData!!._id).apply {
            name = walletData.name
            address = walletData.address
            online = true
        }
        val selectionDataList = dbHelper.getCoinSelectionDataListByWalletID(walletData._id)
        val coinSelectionDataList = ArrayList<CoinSelectionData>()
        if (identifier == CoinRepository.COIN_FIAT_IDENTIFIER) {
            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains(CoinEnum.USDT.coinId)) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        } else {
            for (selectionData in selectionDataList) {
                if (!selectionData.coinData.coinId.contains("_AIRDROP") &&
                    !selectionData.coinData.coinId.contains("_RSC") &&
                    !selectionData.coinData.coinId.contains("_STO") &&
                    !selectionData.coinData.coinId.contains("_FIAT")
                ) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        }

        if (walletData.coinAssetList != null) {
            var totalPrice = BigDecimal("0")
            val assetList = ArrayList<AssetData>(walletData.coinAssetList!!)
            for (data in assetList) {
                for (coinSelectionData in coinSelectionDataList) {
                    if (data.coinData._id == coinSelectionData.coinData._id && coinSelectionData.isSelected) {
                        val item = getFiatRate(data.coinData.coinId, data.amount)
                        totalPrice = totalPrice.add(item)
                    }
                }
            }
            if (userHelper.privacyMode) {
                bean.totalFiat = "****"
            } else {
                bean.totalFiat = NumberUtils.showFiat(totalPrice)
            }
        }

        val mainCoinType = RuleUtils.getMainCoinType(walletData.address)
        when {
            mainCoinType === MainCoinType.ETH -> bean.bgDrawableId = R.mipmap.bg_eth_wallet
            mainCoinType === MainCoinType.BTC -> bean.bgDrawableId = R.mipmap.bg_btc_wallet
            mainCoinType === MainCoinType.CIC -> bean.bgDrawableId = R.mipmap.bg_cic_wallet
            mainCoinType === MainCoinType.GUC -> bean.bgDrawableId = R.mipmap.bg_guc_wallet
            else -> bean.bgDrawableId = R.mipmap.bg_eth_wallet
        }
        return bean
    }

    private fun getCoinEntityListObservable(): Observable<List<CoinEntity>> {
        return Observable.create { source ->
            try {
                source.onNext(coinRepository.getNormalCoinEntityList(baseMainModel.selectionWalletCategory))
                source.onComplete()
            } catch (e: Exception) {
                e.printStackTrace()
                source.onError(e)
            }
        }
    }

    private fun performUpdateRateAndBalanceDataTask() {
        performUpdateBalanceByWallet(baseMainModel.selectedWalletData)
    }

    private fun performUpdateBalanceByWallet(walletData: WalletData?) {
        if (walletData == null || walletData._id < 0) {
            return
        }
        if (walletData.coinAssetList != null) {
            val chainType = walletData.chainType
            if (chainType == ChainType.ETH.value || chainType == ChainType.BTC.value) {
                val assetDataList = ArrayList(walletData.coinAssetList ?: arrayListOf())
                for (assetData in assetDataList) {
                    performUpdateBalanceByCoinApiRequest(
                        walletData.address,
                        assetData.coinData.coinId
                    )
                }
            } else {
                val mainCoinData = baseMainModel.getMainCoinDataByAddress(walletData.address)
                if (mainCoinData._id > 0) {
                    performUpdateBalanceByCoinApiRequest(
                        walletData.address,
                        mainCoinData.coinId
                    )
                }
            }
        }
    }

    private fun performUpdateBalanceByCoinApiRequest(address: String, coinId: String) {
        if (TextUtils.isEmpty(address) || TextUtils.isEmpty(coinId)) {
            return
        }
        add(
            balanceApiRepository.performGetBalance(
                address,
                balanceRepository.getBalanceQueryMap(coinId)
            )
                .flatMap {
                    return@flatMap Observable.fromIterable(
                        balanceRepository.getAssetDataList(
                            it, address, coinId
                        )
                    )
                }
                .map {
                    return@map balanceRepository.updateAssetData(it)
                }
                .toMain()
                .subscribe({
                    updateCoinBalanceSubject.onNext(true)
                }, {
                    updateCoinBalanceSubject.onNext(true)
                })
        )
    }

    public override fun refreshRequest() {
        super.refreshRequest()
        setNextPage(-1)
        performRefreshUiDataSubject.onNext(
            RefreshUiDataBean(false, b1 = true, b2 = true)
        )
    }
}