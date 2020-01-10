package com.ttchain.walletproject.ui.create_id

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.blockchain.BitcoinjNew
import com.ttchain.walletproject.model.UserBean
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.utils.RuleUtils

class CreateIdViewModel(
    private val context: Context,
    private val userHelper: UserHelper,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    var mUserBean: UserBean? = null

    val buttonEnable = MutableLiveData<Boolean>()
    val nameErrorLiveData = MutableLiveData<String>()
    val pwdErrorLiveData = MutableLiveData<String>()
    val confirmPwdErrorLiveData = MutableLiveData<String>()
    val noteErrorLiveData = MutableLiveData<String>()

    fun setButtonEnable(b: Boolean) {
        buttonEnable.value = b
    }

    fun onCreateClick(name: String, pwd: String, confirmPwd: String, note: String) {
        var isCorrect = true
        when {
            name.isEmpty() -> {
                isCorrect = false
                nameErrorLiveData.value = context.getString(R.string.g_e_emptyform)
            }
            RuleUtils.hasSpaceInStartOrEndOfString(name) -> {
                isCorrect = false
                nameErrorLiveData.value =
                    context.getString(R.string.error_input_with_space_at_start_or_end)
            }
            !RuleUtils.isValidUserNameLength(name) -> {
                isCorrect = false
                nameErrorLiveData.value = context.getString(R.string.error_input_content_too_long)
            }
            else -> nameErrorLiveData.value = ""
        }
        when {
            pwd.isEmpty() -> {
                isCorrect = false
                pwdErrorLiveData.value = context.getString(R.string.g_e_emptyform)
            }
            RuleUtils.hasSpaceInStartOrEndOfString(pwd) -> {
                isCorrect = false
                pwdErrorLiveData.value =
                    context.getString(R.string.error_input_with_space_at_start_or_end)
            }
            !RuleUtils.isValidPwd(pwd) -> {
                isCorrect = false
                pwdErrorLiveData.value = context.getString(R.string.error_pwd_rule)
            }
            else -> pwdErrorLiveData.value = ""
        }
        when {
            confirmPwd.isEmpty() -> {
                isCorrect = false
                confirmPwdErrorLiveData.value = context.getString(R.string.g_e_emptyform)
            }
            pwd != confirmPwd -> {
                isCorrect = false
                confirmPwdErrorLiveData.value = context.getString(R.string.error_pwd_not_equal)
            }
            else -> confirmPwdErrorLiveData.value = ("")
        }
        when {
            note.isEmpty() -> {
                isCorrect = false
                noteErrorLiveData.value = ""
                //                mView.setNoteError(mContext.getString(R.string.g_e_emptyform));
            }
            RuleUtils.hasSpaceInStartOrEndOfString(note) -> {
                isCorrect = false
                noteErrorLiveData.value =
                    context.getString(R.string.error_input_with_space_at_start_or_end)
            }
            !RuleUtils.isValidNoteLength(note) -> {
                isCorrect = false
                noteErrorLiveData.value = context.getString(R.string.error_input_content_too_long)
            }
            else -> noteErrorLiveData.value = ("")
        }
        if (isCorrect) {
            mUserBean = UserBean().apply {
                this.name = name
                this.pwd = pwd
                this.note = note
                pwdEncrypt = verifyRepository.encryptString(pwd)
            }
            performCreateAccountRequest()
        }
    }

    val performCreateAccountRequestLiveData = MutableLiveData<Boolean>()

    private fun performCreateAccountRequest() {
        viewModelLaunch {
            val responseUserIdentity = BitcoinjNew.systemWalletInit()
            val jsonString = Gson().toJson(responseUserIdentity)
            putCreateAccountRequest(jsonString)
            performCreateAccountRequestLiveData.value = true
        }
    }

    private fun putCreateAccountRequest(response: String) {
        userHelper.createAccountResponse = response
    }
}