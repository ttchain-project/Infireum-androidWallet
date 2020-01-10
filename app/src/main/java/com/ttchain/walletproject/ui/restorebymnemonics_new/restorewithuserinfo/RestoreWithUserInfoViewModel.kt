package com.ttchain.walletproject.ui.restorebymnemonics_new.restorewithuserinfo

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.ResponseUserIdentity
import com.ttchain.walletproject.model.UserBean
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.repository.RestoreRepository
import com.ttchain.walletproject.utils.RuleUtils

class RestoreWithUserInfoViewModel(
    private val context: Context,
    private val baseMainModel: BaseMainModel,
    private val restoreRepository: RestoreRepository
) : BaseViewModel() {

    val pwdErrorLiveData = MutableLiveData<String>()
    val confirmPasswordErrorLiveData = MutableLiveData<String>()
    val hintPasswordErrorLiveData = MutableLiveData<String>()

    fun onRestoreClick(
        name: String,
        pwd: String,
        confirmPassword: String,
        note: String
    ) {
        var isCorrect = true

        if (pwd.isEmpty()) {
            isCorrect = false
            pwdErrorLiveData.value = context.getString(R.string.g_e_emptyform)
        } else if (RuleUtils.hasSpaceInStartOrEndOfString(pwd)) {
            isCorrect = false
            pwdErrorLiveData.value =
                context.getString(R.string.error_input_with_space_at_start_or_end)
        } else if (!RuleUtils.isValidPwd(pwd)) {
            isCorrect = false
            pwdErrorLiveData.value = context.getString(R.string.error_pwd_rule)
        } else {
            pwdErrorLiveData.value = ""
        }

        if (confirmPassword.isEmpty()) {
            isCorrect = false
            confirmPasswordErrorLiveData.value = context.getString(R.string.g_e_emptyform)
        } else if (confirmPassword != pwd) {
            isCorrect = false
            confirmPasswordErrorLiveData.value = context.getString(R.string.error_pwd_not_equal)
        } else if (RuleUtils.hasSpaceInStartOrEndOfString(confirmPassword)) {
            isCorrect = false
            confirmPasswordErrorLiveData.value =
                context.getString(R.string.error_input_with_space_at_start_or_end)
        } else if (!RuleUtils.isValidPwd(confirmPassword)) {
            isCorrect = false
            confirmPasswordErrorLiveData.value = context.getString(R.string.error_pwd_rule)
        } else {
            confirmPasswordErrorLiveData.value = ""
        }

        if (note.isEmpty()) {
            isCorrect = false
            hintPasswordErrorLiveData.value = context.getString(R.string.g_e_emptyform)
        } else if (RuleUtils.hasSpaceInStartOrEndOfString(note)) {
            isCorrect = false
            hintPasswordErrorLiveData.value =
                context.getString(R.string.error_input_with_space_at_start_or_end)
        } else if (!RuleUtils.isValidNoteLength(note)) {
            isCorrect = false
            hintPasswordErrorLiveData.value =
                context.getString(R.string.error_input_content_too_long)
        } else {
            hintPasswordErrorLiveData.value = ""
        }

        if (isCorrect) {
            userBean = (UserBean().apply {
                this.name = name
                this.pwd = pwd
                this.note = note
                pwdEncrypt = baseMainModel.encryptString(context, pwd)
            })
            performRestoreIdentity()
        }
    }

    var responseUserIdentity: ResponseUserIdentity? = null
    private var userBean: UserBean? = null

    val performRestoreIdentityLiveData = MutableLiveData<Boolean>()

    private fun performRestoreIdentity() {
        viewModelLaunch {
            if (userBean != null && responseUserIdentity != null) {
                val response = responseUserIdentity ?: ResponseUserIdentity()
                val bean = userBean ?: UserBean()

                bean.mnemonic = response.mnemonic ?: ""
                val result = restoreRepository.createUser(bean)
                val firstStatus = if (result != -1) {
                    bean.walletEpKey = response.bitcoin?.privateKey ?: ""
                    bean.importWalletAddress = response.bitcoin?.address ?: ""
                    val btc = restoreRepository.createRestoreWalletData(bean)

                    bean.walletEpKey = response.ethereum?.privateKey ?: ""
                    bean.importWalletAddress = response.ethereum?.address ?: ""
                    val eth = restoreRepository.createRestoreWalletData(bean)

                    bean.walletEpKey = response.noprefix?.privateKey ?: ""
                    bean.importWalletAddress = response.noprefix?.address ?: ""
                    val ttn = restoreRepository.createRestoreWalletData(bean)

                    if (btc == -1 || eth == -1 || ttn == -1) {
                        if (btc != -1) restoreRepository.deleteWalletData(btc)
                        if (eth != -1) restoreRepository.deleteWalletData(eth)
                        if (ttn != -1) restoreRepository.deleteWalletData(ttn)
                        false
                    } else {
                        restoreRepository.setSelectedWalletID()
                    }
                } else {
                    false
                }
                val createCoinStatus = if (firstStatus) {
                    restoreRepository.createCoinSelectionDataList()
                    true
                } else {
                    false
                }
                val initAssetStatus = if (createCoinStatus) {
                    restoreRepository.initAssetDataList()
                    true
                } else {
                    false
                }
                performRestoreIdentityLiveData.value = initAssetStatus
            }
        }
    }
}