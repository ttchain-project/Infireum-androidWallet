package com.ttchain.walletproject.ui.me

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.model.ApiVersionData
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.SystemHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.InfoRepositoryCo
import com.ttchain.walletproject.repository.VerifyRepository

class MeViewModel(
    private val userHelp: UserHelper,
    private val dbHelper: DbHelper,
    private val systemHelper: SystemHelper,
    private val verifyRepository: VerifyRepository,
    private val infoRepositoryCo: InfoRepositoryCo
) : BaseViewModel() {

    var performGetVersionLiveData = MutableLiveData<ApiVersionData>()
    fun performGetVersion() {
        viewModelLaunch {
            val result = infoRepositoryCo.getVersion()
            performGetVersionLiveData.value = result.data
        }
    }

    fun getIdentityData(): IdentityData {
        val identityData = dbHelper.getIdentityData(userHelp.identityID)
        return identityData ?: IdentityData()
    }

    private fun removeUserIdentityData() {
        systemHelper.removeUserIdentityPreferences(userHelp.identityID)
        userHelp.removeUserTouchId()
        userHelp.removeIdentityID()
        userHelp.removeSelectedWalletID()
        dbHelper.clearUserIdentityRelativeTables()
        userHelp.removeRocketChatData()
    }

    var onClickExitIdentityConfirmLiveData = MutableLiveData<Boolean>()

    fun onClickExitIdentityConfirm() {
        viewModelLaunch({
            removeUserIdentityData()
            onClickExitIdentityConfirmLiveData.value = true
        }, {
            onClickExitIdentityConfirmLiveData.value = false
        })
    }

    var getVerifyIdentityPwdObservableLiveData = MutableLiveData<Boolean>()

    fun getVerifyIdentityPwdObservable(pwd: String) {
        viewModelLaunch({
            val result = verifyRepository.verifyIdentityPwd(pwd)
            getVerifyIdentityPwdObservableLiveData.value = result
        }, {

        })
    }
}