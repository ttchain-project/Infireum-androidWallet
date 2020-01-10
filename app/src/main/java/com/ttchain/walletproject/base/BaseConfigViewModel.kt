package com.ttchain.walletproject.base

import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.VerifyRepository

open class BaseConfigViewModel(
    private val userHelper: UserHelper,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    fun isEnableTouchId(): Boolean {
        return userHelper.userTouchId
    }

    fun getRawPwd(): String {
        return verifyRepository.decryptString(verifyRepository.getIdentityData().pwd)
    }
}