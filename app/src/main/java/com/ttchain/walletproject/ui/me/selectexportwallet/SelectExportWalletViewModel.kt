package com.ttchain.walletproject.ui.me.selectexportwallet

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.VerifyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SelectExportWalletViewModel(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    private val btcWalletList: List<WalletData>
        get() = dbHelper.getWalletDataListByWalletType(ChainType.BTC.value)

    private val ethWalletList: List<WalletData>
        get() = dbHelper.getWalletDataListByWalletType(ChainType.ETH.value)

    var getWalletDataLivaData = MutableLiveData<List<WalletData>>()

    fun getWalletData(coinEnum: CoinEnum) {
        viewModelLaunch {
            getWalletDataLivaData.value = when (coinEnum) {
                CoinEnum.ETH -> {
                    ethWalletList
                }
                CoinEnum.BTC -> {
                    btcWalletList
                }
                else -> {
                    btcWalletList
                }
            }
        }
    }

    fun getIdentityData(): IdentityData {
        val identityData = dbHelper.getIdentityData(userHelper.identityID)
        return identityData ?: IdentityData()
    }

    var getVerifyIdentityPwdObservableLiveData = MutableLiveData<Boolean>()

    fun getVerifyIdentityPwdObservable(pwd: String) {
        viewModelLaunch {
            getVerifyIdentityPwdObservableLiveData.value = withContext(Dispatchers.Default) {
                verifyRepository.verifyIdentityPwd(pwd)
            }
        }
    }

}