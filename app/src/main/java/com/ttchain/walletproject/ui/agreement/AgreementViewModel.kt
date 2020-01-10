package com.ttchain.walletproject.ui.agreement

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.ExplorerNewsResponseModel
import com.ttchain.walletproject.repository.InfoRepositoryCo

class AgreementViewModel(
    private val context: Context,
    private val infoRepository: InfoRepositoryCo
) : BaseViewModel() {

    var getDataLiveData = MutableLiveData<ExplorerNewsResponseModel>()

    var getDataErrorLivaData = MutableLiveData<String>()

    fun getData() {
        viewModelLaunch({
            val result = infoRepository.getMarketTest()
            getDataLiveData.value = result.data
        }, {
            getDataErrorLivaData.value = load()
        })
    }

    fun load(): String {
        val fileName = "policy.txt"
        return context.assets.open(fileName).bufferedReader().use {
            it.readText()
        }
    }
}