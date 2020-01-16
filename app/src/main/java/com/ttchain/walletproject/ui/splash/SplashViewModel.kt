package com.ttchain.walletproject.ui.splash

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.App.Companion.app
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.repository.HelperRepositoryCo
import com.ttchain.walletproject.repository.InfoRepositoryCo
import com.ttchain.walletproject.repository.SplashRepository
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utility
import java.util.*

class SplashViewModel(
    private val infoRepositoryCo: InfoRepositoryCo,
    private val helperRepositoryCo: HelperRepositoryCo,
    private val splashRepository: SplashRepository,
    private val coinRepository: CoinRepository,
    private val userHelper: UserHelper
) : BaseViewModel() {
    var firstTaskResult = MutableLiveData<Boolean>()

    var touchIdResult = MutableLiveData<Boolean>()
    var launchMainResult = MutableLiveData<Boolean>()
    var launchLoginResult = MutableLiveData<Boolean>()

    fun performFirstSectionTask() {
        if (Utility.getInternetStatus(app)) {
            performGetCoinListAndFiatList()
        } else {
            performCheckCoinDataAndFiatData()
        }
    }

    fun performSecondSectionTask() {
        performGetRateListAndUpdateWalletData()
    }

    private fun performGetCoinListAndFiatList() {
        viewModelLaunch({
            val result = infoRepositoryCo.getCoinTest()
            val response = result.data
            coinRepository.updateCoinDataList(response.orEmpty())
            val result2 = helperRepositoryCo.getFiatDataList()
            val response2 = result2.data
            splashRepository.updateFiatDataList(response2.orEmpty())
            firstTaskResult.value = true
        }, {
            performCheckCoinDataAndFiatData()
        })
    }

    private fun performCheckCoinDataAndFiatData() {
        viewModelLaunch({
            if (splashRepository.isCoinDataEmpty()) {
                val list = splashRepository.createDefaultCoinDataList()
                splashRepository.updateDefaultCoinDataList(list)
            }
            if (splashRepository.isFiatDataEmpty()) {
                val list = splashRepository.createDefaultFiatDataList()
                splashRepository.updateDefaultFiatDataList(list)
            }
            firstTaskResult.value = true
        }, {
            isPageFinish = true
            throwableMessage.value = it.message
        })
    }

    private fun performGetRateListAndUpdateWalletData() {
        viewModelLaunch({
            val result = helperRepositoryCo.allCoinToCurrency(coinRepository.getUserPrefFiatName())
            rateList = result.data.orEmpty()
            syncCoinDataAndCoinSelectionData(CoinEnum.BTC.coinId)
            syncCoinDataAndCoinSelectionData(CoinEnum.ETH.coinId)
            updateWalletDataDbMainCoinIdAndChainType()
            launchResult()
        }, {
            launchResult()
        })
    }

    private fun launchResult() {
        if (userHelper.identityID != -1) {
            if (userHelper.userTouchId) {
                touchIdResult.value = true
            } else {
                launchMainResult.value = true
            }
        } else {
            launchLoginResult.value = true
        }
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