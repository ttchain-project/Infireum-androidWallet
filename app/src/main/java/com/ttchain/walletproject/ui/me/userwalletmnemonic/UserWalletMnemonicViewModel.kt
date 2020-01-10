package com.ttchain.walletproject.ui.me.userwalletmnemonic

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.utils.Utility

class UserWalletMnemonicViewModel(
    private val dbHelper: DbHelper,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    val getMnemonicRxLiveData = MutableLiveData<String>()

    fun getMnemonicRx() {
        viewModelLaunch {
            val walletData = dbHelper.getDefaultWalletDataList()[0]
            getMnemonicRxLiveData.value = Utility.decryptPrivateKey(
                walletData.mnemonic ?: "",
                verifyRepository.decryptString(walletData.pwd)
            )
        }
    }
}