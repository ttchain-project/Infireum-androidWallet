package com.ttchain.walletproject.ui.restorebymnemonics_new

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.blockchain.BitcoinjNew
import com.ttchain.walletproject.model.PersonalInfo
import com.ttchain.walletproject.model.PreLoginRequest
import com.ttchain.walletproject.model.ResponseUserIdentity
import com.ttchain.walletproject.repository.ImRepositoryCo
import com.ttchain.walletproject.utils.Utility
import com.ttchain.walletproject.utils.Utils
import java.util.*


class RestoreByMnemonicsViewModel(
    private val context: Context,
    private val imRepositoryCo: ImRepositoryCo
) : BaseViewModel() {

    var responseUserIdentity: ResponseUserIdentity? = null

    fun setMnemonics(mnemonics: String) {
        viewModelLaunch {
            val result = BitcoinjNew.systemWalletInit(mnemonics)
            responseUserIdentity = result
            val identityId = Utility.hashIdentityIdFromMnemonic(mnemonics)
            val request = PreLoginRequest().apply {
                userID = identityId
                deviceID = Utils.getDeviceId(context)
            }
            val preLoginResult = imRepositoryCo.preLogin(request)
            val data = preLoginResult.data
            when (data?.status) {
                ImRepositoryCo.USER_EXIST -> getUserInfo(data.uid)
                else -> preLoginLiveData.value = true
            }
        }
    }

    var preLoginLiveData = MutableLiveData<Boolean>()

    var getUserInfoLiveData = MutableLiveData<PersonalInfo>()

    private fun getUserInfo(uuid: String) {
        viewModelLaunch {
            val userData = imRepositoryCo.iMGetUserData(UUID.fromString(uuid))
            val data = userData.data
            getUserInfoLiveData.value = data
        }
    }
}