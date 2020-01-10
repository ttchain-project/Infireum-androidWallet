package com.ttchain.walletproject.ui.splash

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.App.Companion.app
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.repository.InfoRepositoryCo
import com.ttchain.walletproject.repository.SplashRepository
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utility
import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import io.reactivex.functions.Function3
import io.reactivex.subjects.BehaviorSubject
import java.util.*

class SplashViewModel(
    private val infoRepositoryCo: InfoRepositoryCo,
    private val helperRepository: HelperRepository,
    private val splashRepository: SplashRepository,
    private val coinRepository: CoinRepository,
    private val userHelper: UserHelper
) : BaseViewModel() {
    var firstTaskResult = MutableLiveData<Boolean>()

    var touchIdResult = MutableLiveData<Boolean>()
    var launchMainResult = MutableLiveData<Boolean>()
    var launchLoginResult = MutableLiveData<Boolean>()

    private val firstTaskResultCoinData = BehaviorSubject.create<Boolean>()
    private val firstTaskResultCoinDataFromMike = BehaviorSubject.create<Boolean>()
    private val firstTaskResultFiatData = BehaviorSubject.create<Boolean>()

    private val secondTaskResultCheckCoinToFiatRate = BehaviorSubject.create<Boolean>()
    private val performGetFiatIdToUsdRateDataListSubject = BehaviorSubject.create<Boolean>()


    init {
        add(
            Observable.combineLatest(
                firstTaskResultCoinData,
                firstTaskResultCoinDataFromMike,
                firstTaskResultFiatData,
                Function3<Boolean, Boolean, Boolean, Boolean> { t1, t2, t3 ->
                    return@Function3 t1 && t2 && t3
                })
                .subscribe({
                    if (it) {
                        firstTaskResult.value = it
                    } else {
                        isPageFinish = true
                        throwableMessage.value =
                            app.getString(R.string.error_loading_data_and_try_again)
                    }
                }, {
                    isPageFinish = true
                    throwableMessage.value = it.message
                })
        )

        add(Observable.combineLatest(
            secondTaskResultCheckCoinToFiatRate,
            performGetFiatIdToUsdRateDataListSubject,
            BiFunction<Boolean, Boolean, Boolean> { t1, t2 ->
                return@BiFunction t1 && t2
            })
            .subscribe {
                syncCoinDataAndCoinSelectionData(CoinEnum.BTC.coinId)
                syncCoinDataAndCoinSelectionData(CoinEnum.ETH.coinId)
                updateWalletDataDbMainCoinIdAndChainType()
                if (userHelper.identityID != -1) {
                    if (userHelper.userTouchId) {
                        touchIdResult.value = it
                    } else {
                        launchMainResult.value = it
                    }
                } else {
                    launchLoginResult.value = it
                }
            }
        )
    }

    fun performFirstSectionTask() {
        if (Utility.getInternetStatus(app)) {
            performGetCoinDataList()
            performGetFiatDataList()
        } else {
            performCheckCoinDbData()
            performCheckFiatDbData()
        }
    }

    fun performSecondSectionTask() {
        performCheckCoinToFiatRate()
        performGetFiatIdToUsdRateDataList()
    }

    private fun performCheckCoinDbData() {
        when {
            splashRepository.isCoinDataEmpty() -> performCreateDefaultCoinDataList()
            else -> {
                firstTaskResultCoinData.onNext(true)
                firstTaskResultCoinDataFromMike.onNext(true)
            }
        }
    }

    private fun performCheckFiatDbData() {
        when {
            splashRepository.isFiatDataEmpty() -> performCreateDefaultFiatDataList()
            else -> firstTaskResultFiatData.onNext(true)
        }
    }

    private fun performCreateDefaultCoinDataList() {
        add(Observable.just(splashRepository.createDefaultCoinDataList())
            .map { list ->
                splashRepository.updateDefaultCoinDataList(list)
                true
            }
            .toMain()
            .subscribe({
                performCheckCoinDbData()
            }, {
                isPageFinish = true
                throwableMessage.value = it.message
            })
        )
    }

    private fun performCreateDefaultFiatDataList() {
        add(Observable.just(splashRepository.createDefaultFiatDataList())
            .map { data ->
                splashRepository.updateDefaultFiatDataList(data)
                true
            }
            .toMain()
            .subscribe({
                performCheckFiatDbData()
            }, {
                isPageFinish = true
                throwableMessage.value = it.message
            })
        )
    }

    private fun performGetCoinDataList() {
        viewModelLaunch ({
            val result = infoRepositoryCo.getCoinTest()
            val response = result.data
            coinRepository.updateCoinDataList(response ?: arrayListOf())
            firstTaskResultCoinData.onNext(true)
            firstTaskResultCoinDataFromMike.onNext(true)
        },{
            performCheckCoinDbData()
        })
    }

    private fun performGetFiatDataList() {
        add(helperRepository.performGetFiatDataList()
            .map {
                return@map it.data
            }
            .map {
                splashRepository.updateFiatDataList(it)
                return@map true
            }
            .toMain()
            .subscribe({
                firstTaskResultFiatData.onNext(true)
            }, {
                performCheckFiatDbData()
            })
        )
    }

    private fun performCheckCoinToFiatRate() {
        add(
            helperRepository.getAllCoinToCurrency(coinRepository.getUserPrefFiatName())
                .toMain()
                .subscribe({
                    rateList = it.data ?: arrayListOf()
                    secondTaskResultCheckCoinToFiatRate.onNext(true)
                }, {
                    secondTaskResultCheckCoinToFiatRate.onNext(true)
                })
        )
    }

    private fun performGetFiatIdToUsdRateDataList() {
        add(helperRepository.performGetFiatIdToUsdRateDataList()
            .map {
                return@map it.data
            }
            .map {
                splashRepository.updateFiatIdToUsdRateDataList(it)
                return@map true
            }
            .toMain()
            .subscribe(
                {
                    performGetFiatIdToUsdRateDataListSubject.onNext(true)
                }, {
                    performGetFiatIdToUsdRateDataListSubject.onNext(true)
                })
        )
    }

    private fun syncCoinDataAndCoinSelectionData(mainCoinId: String) {
        val coinDataList = splashRepository.getCoinDataListByMainCoinId(mainCoinId)
        val selectionDataCoinIdList = ArrayList<String>()

        for (selectData in splashRepository.getCoinSelectionDataList()) {
            selectionDataCoinIdList.add(selectData.coinData.coinId)
        }

        for (data in coinDataList) {
            val coinDataId = data.coinId

            if (!selectionDataCoinIdList.contains(coinDataId)) {
                if (!coinRepository.isCoinSelectionDataExist(coinDataId)) {
                    coinRepository.addCoinSelectionData(coinDataId, mainCoinId)
                }
                if (!coinRepository.isCoinAssetDataExist(coinDataId)) {
                    coinRepository.addCoinAssetData(coinDataId, mainCoinId)
                }
            }
        }
    }

    private fun updateWalletDataDbMainCoinIdAndChainType() {
        val list = splashRepository.getWalletDataList()

        for (walletData in list) {
            val address = walletData.address
            walletData.mainCoinId = RuleUtils.getMainCoinId(address)
            walletData.chainType = RuleUtils.getChainType(address).value
            splashRepository.updateWalletData(walletData)
        }
    }
}