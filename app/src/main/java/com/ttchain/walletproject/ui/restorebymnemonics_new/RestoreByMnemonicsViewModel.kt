package com.ttchain.walletproject.ui.restorebymnemonics_new

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.blockchain.BitcoinjNew
import com.ttchain.walletproject.model.ResponseUserIdentity


class RestoreByMnemonicsViewModel : BaseViewModel() {

    var responseUserIdentity: ResponseUserIdentity? = null

    fun setMnemonics(mnemonics: String) {
        viewModelLaunch {
            val result = BitcoinjNew.systemWalletInit(mnemonics)
            responseUserIdentity = result
            systemWalletInitLiveData.value = true
        }
    }

    var systemWalletInitLiveData = MutableLiveData<Boolean>()

}