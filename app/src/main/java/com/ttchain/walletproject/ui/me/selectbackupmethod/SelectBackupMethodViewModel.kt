package com.ttchain.walletproject.ui.me.selectbackupmethod

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.model.UserWalletQrCodeInputBean
import com.ttchain.walletproject.repository.VerifyRepository

class SelectBackupMethodViewModel(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    private fun getRawPwd(): String {
        return verifyRepository.decryptString(getIdentityData().pwd)
    }

    private fun getIdentityData(): IdentityData {
        return dbHelper.getIdentityData(userHelper.identityID) ?: IdentityData()
    }

    var launchUserWalletQrCodeActivityLiveData = MutableLiveData<UserWalletQrCodeInputBean>()

    fun launchUserWalletQrCodeActivity() {
        val pwd = getRawPwd()
        val hint = getIdentityData().pwdHint
        viewModelLaunch{
            val result = UserWalletQrCodeInputBean(pwd, hint)
            launchUserWalletQrCodeActivityLiveData.value = result
        }
    }
}