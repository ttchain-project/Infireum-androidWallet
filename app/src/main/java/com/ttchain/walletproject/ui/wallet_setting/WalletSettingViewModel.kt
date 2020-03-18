package com.ttchain.walletproject.ui.wallet_setting

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.repository.VerifyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import timber.log.Timber

class WalletSettingViewModel(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val baseMainModel: BaseMainModel,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    val getSelectWalletDataLiveData = MutableLiveData<WalletData>()

    fun getSelectWalletData() {
        viewModelScope.launch {
            getSelectWalletDataLiveData.value = withContext(Dispatchers.Default) {
                baseMainModel.selectedWalletData
            }
        }
    }

    fun getIdentityData(): IdentityData {
        val identityData = dbHelper.getIdentityData(userHelper.identityID)
        return identityData ?: IdentityData()
    }

    var getVerifyIdentityPwdObservableLiveData = MutableLiveData<Boolean>()

    fun getVerifyIdentityPwdObservable(walletId: Int, pwd: String) {
        viewModelScope.launch {
            getVerifyIdentityPwdObservableLiveData.value = withContext(Dispatchers.Default) {
                verifyRepository.verifyWalletPwd(walletId, pwd)
            }
        }
    }

    val getVerifyIdentityPwdDeleteLiveData = MutableLiveData<Boolean>()

    fun getVerifyIdentityPwdDelete(walletId: Int, pwd: String) {
        viewModelScope.launch {
            getVerifyIdentityPwdDeleteLiveData.value = withContext(Dispatchers.Default) {
                verifyRepository.verifyWalletPwd(walletId, pwd)
            }
        }
    }

    val deleteWalletDataRxLiveData = MutableLiveData<Boolean>()

    fun deleteWalletDataRx(walletId: Int) {
        viewModelLaunch {
            deleteAllAssetDataByWalletID(walletId)
            deleteAllCoinSelectionDataByWalletID(walletId)
            deleteAllTransRecordDataByWalletID(walletId)
            deleteAllLightningTransRecordDataByWalletID(walletId)
            deleteWalletData(walletId)
            resetSelectedWalletID()
            deleteWalletDataRxLiveData.value = true
        }
//        add(Observable.just(walletId)
//            .map { id ->
//                deleteAllAssetDataByWalletID(id)
//                deleteAllCoinSelectionDataByWalletID(id)
//                deleteAllTransRecordDataByWalletID(id)
//                deleteAllLightningTransRecordDataByWalletID(id)
//                deleteWalletData(id)
//                resetSelectedWalletID()
//                return@map true
//            }
//            .compose(loadingView())
//            .subscribe({ s ->
//                deleteWalletDataRxLiveData.value = s
//            }, {
//                Timber.e(it)
//            })
//        )
    }

    private fun deleteAllAssetDataByWalletID(walletID: Int): Boolean {
        val list = dbHelper.getAssetDataListByWalletID(walletID)
        for (item in list) {
            if (item._id > 0) {
                dbHelper.deleteAssetData(item._id)
            }
        }
        return true
    }

    private fun deleteAllCoinSelectionDataByWalletID(walletID: Int): Boolean {
        val list = dbHelper.getCoinSelectionDataListByWalletID(walletID)
        for (item in list) {
            if (item._id > 0) {
                dbHelper.deleteCoinSelectionData(item._id)
            }
        }
        return true
    }

    private fun deleteAllTransRecordDataByWalletID(walletID: Int): Boolean {
        val walletData = dbHelper.getWalletData(walletID)
        if (walletData == null || walletData._id < 0) {
            return true
        }
        val list = dbHelper.getTransRecordDataListByAddress(walletData.address)
        for (item in list) {
            if (item._id > 0) {
                dbHelper.deleteTransRecordData(item._id)
            }
        }
        return true
    }

    private fun deleteAllLightningTransRecordDataByWalletID(walletID: Int): Boolean {
        val walletData = dbHelper.getWalletData(walletID)
        if (walletData == null || walletData._id < 0) {
            return true
        }
        val list = dbHelper.getLightningTransRecordDataListByAddress(walletData.address)
        for (item in list) {
            if (item._id > 0) {
                dbHelper.deleteLightningTransRecordData(item._id)
            }
        }
        return true
    }

    private fun resetSelectedWalletID(): Boolean {
//        val id = dbHelper.getDefaultSelectedWalletDataByIdentityID(userHelper.identityID)?._id ?: -1
//        val data = dbHelper.getWalletData(id)
//        if (data == null || data._id < 0) {
            val walletDataList = dbHelper.getWalletDataList()
            if (walletDataList.isNotEmpty()) {
                userHelper.selectedWalletID = walletDataList[0]._id
                return true
            }
//        }
        userHelper.selectedWalletID =
            dbHelper.getDefaultSelectedWalletDataByIdentityID(userHelper.identityID)?._id ?: -1
        return false
    }

    fun deleteWalletData(walletID: Int): Boolean {
        val walletData = dbHelper.getWalletData(walletID)
        if (walletData == null || walletData._id < 0) {
            return false
        }
        val id = dbHelper.deleteWalletData(walletData._id)
        return id > 0
    }

}