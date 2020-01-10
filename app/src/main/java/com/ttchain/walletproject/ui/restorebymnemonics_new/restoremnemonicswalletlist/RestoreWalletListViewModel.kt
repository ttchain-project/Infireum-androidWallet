package com.ttchain.walletproject.ui.restorebymnemonics_new.restoremnemonicswalletlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.model.DbHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RestoreWalletListViewModel(
    private val dbHelper: DbHelper
) : BaseViewModel() {

    val getWalletListLiveData = MutableLiveData<List<WalletData>>()

    fun getWalletList() {
        viewModelScope.launch {
            getWalletListLiveData.value = withContext(Dispatchers.IO) {
                dbHelper.getDefaultWalletDataList()
            }
        }
    }
}