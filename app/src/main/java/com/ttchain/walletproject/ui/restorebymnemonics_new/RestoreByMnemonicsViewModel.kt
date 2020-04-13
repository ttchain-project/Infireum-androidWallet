package com.ttchain.walletproject.ui.restorebymnemonics_new

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.blockchain.BitcoinjNew
import com.ttchain.walletproject.model.ResponseUserIdentity
import com.ttchain.walletproject.utils.MnemonicUtil


class RestoreByMnemonicsViewModel(private val context: Context) : BaseViewModel() {

    var responseUserIdentity: ResponseUserIdentity? = null
    var mnemonicsIsWrong = MutableLiveData<String>()

    fun setMnemonics(mnemonics: String) {
        viewModelLaunch {
            if (!MnemonicUtil.validateMnemonic(mnemonics)) {
                mnemonicsIsWrong.value = context.getString(R.string.wrong_mnemonic)
                return@viewModelLaunch
            }
            val result = BitcoinjNew.systemWalletInit(mnemonics.trim())
            responseUserIdentity = result
            systemWalletInitLiveData.value = true
        }
    }

    var systemWalletInitLiveData = MutableLiveData<Boolean>()

}