package com.ttchain.walletproject.ui.me.currency

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.FiatData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper

class CurrencyViewModel(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper
) : BaseViewModel() {

    val getCurrencySelectLiveData = MutableLiveData<String>()

    fun getCurrencySelect() {
        viewModelLaunch {
            getCurrencySelectLiveData.value = getIdentityData().prefFiatData.name
        }
    }

    val onSaveClickLiveData = MutableLiveData<Boolean>()

    fun onSaveClick(currency: String) {
        val identityData = getIdentityData()
        for (fiatData in getFiatList()) {
            if (fiatData.name == currency) {
                identityData.prefFiatData = fiatData
                break
            }
        }
        updatePersonalFiatData(identityData)
        userHelper.settingChanged = true
        onSaveClickLiveData.value = true
    }

    private fun getIdentityData(): IdentityData {
        return dbHelper.getIdentityData(userHelper.identityID) ?: IdentityData()
    }

    private fun getFiatList(): List<FiatData> {
        return dbHelper.getFiatDataList()
    }

    private fun updatePersonalFiatData(identityData: IdentityData) {
        dbHelper.updateIdentityData(identityData)
    }
}