package com.ttchain.walletproject.ui.me.usinglocker

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.UserHelper

class UsingLockerViewModel(private val userHelper: UserHelper) : BaseViewModel() {

    var touchIdLiveData = MutableLiveData<Boolean>()

    init {
        touchIdLiveData.postValue(userHelper.userTouchId)
    }

    fun updateUserTouchId(enable: Boolean) {
        userHelper.userTouchId = enable
        touchIdLiveData.postValue(enable)
    }
}