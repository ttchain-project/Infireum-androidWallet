package com.ttchain.walletproject.ui.me.languagesetting

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.utils.Utility
import java.util.*

class LanguageSettingViewModel(
    private val userHelper: UserHelper
) : BaseViewModel() {

    var getPrefLanguageLiveData = MutableLiveData<Locale>()

    fun getPrefLanguage() {
        getPrefLanguageLiveData.value = Utility.getPrefLocal(userHelper.preferLanguage)
    }

    var setPrefLanguageLiveData = MutableLiveData<Boolean>()

    fun setPrefLanguage(locale: Locale) {
        viewModelLaunch({
            userHelper.preferLanguage = locale.toString()
            setPrefLanguageLiveData.value = true
        }, {
            setPrefLanguageLiveData.value = false
        })
    }
}