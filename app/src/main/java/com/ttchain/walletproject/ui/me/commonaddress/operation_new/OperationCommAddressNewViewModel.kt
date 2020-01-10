package com.ttchain.walletproject.ui.me.commonaddress.operation_new

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.git4u.tt_wallet_android.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.AddressData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.model.AddressBookData
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.repository.HelperRepository
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.RuleUtils
import io.reactivex.Observable
import java.util.*

class OperationCommAddressNewViewModel(
    private val context: Context,
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val baseMainModel: BaseMainModel,
    private val helperRepository: HelperRepository
) : BaseViewModel() {


    var address = ""
    private var addressID = -1
    var setAddressIDRxLiveData = MutableLiveData<Int>()

    var getAddressDataLiveData = MutableLiveData<AddressData>()

    fun setAddressIDRx(addressID: Int) {
        this.addressID = addressID
        Observable.just(this.addressID)
            .subscribe {
                setAddressIDRxLiveData.value = it
            }
        if (addressID != -1) {
            val data = getAddressData(addressID)
            Observable.just(data)
                .subscribe {
                    getAddressDataLiveData.value = it
                }
        }
    }

    var getWalletNameListLiveData = MutableLiveData<List<String>>()

    fun getWalletNameListRx() {
        add(
            Observable.just(getWalletNameList())
                .subscribe {
                    getWalletNameListLiveData.value = it
                }
        )
    }

    private fun getWalletNameList(): List<String> {
        val coinNameList = ArrayList<String>()

        for (data in getWalletDataList()) {
            coinNameList.add(baseMainModel.getWalletTitleNameByAddress(data.address))
        }

        return coinNameList
    }

    private fun getWalletDataList(): List<WalletData> {
        return dbHelper.getDefaultWalletDataList()
    }


    var nameErrorLiveData = MutableLiveData<String>()
    var onShowMessageDialogLiveData = MutableLiveData<String>()
    var performPostAddressBookDataListLiveData = MutableLiveData<Boolean>()
    var performPutAddressBookDataLiveData = MutableLiveData<Boolean>()

    fun onSaveClick(name: String, note: String, address: String) {
        var isCorrect = true

        if (name.isEmpty()) {
            nameErrorLiveData.value = context.getString(R.string.g_e_emptyform)
            isCorrect = false
        } else {
            nameErrorLiveData.value = ""
        }

        if (address.isEmpty()) {
            return
        }

        when (RuleUtils.getChainType(address)) {
            ChainType.BTC -> {

            }
            ChainType.ETH -> {

            }
            ChainType.TTN -> {

            }
            ChainType.CIC -> {

            }
            else -> {
                onShowMessageDialogLiveData.value = context.getString(
                    R.string.error_invalid_address_type_retry_p, ""
                )
                return
            }
        }

        if (isCorrect) {
            if (addressID == -1) {
                val list = getAddressBookModelList(name, note, address)
                add(
                    helperRepository.performPostAddressBookDataList(baseMainModel.identityId, list)
                        .map {
                            return@map it.data
                        }
                        .toMain()
                        .compose(loadingView())
                        .doFinally {
                            addAddressData(
                                name,
                                note,
                                address,
                                list[0].id
                            )
                            RxBus.getInstance().post(RxBusTag.COMMON_ADDRESS_FINISH, true)
                            performPostAddressBookDataListLiveData.value = true
                        }
                        .subscribe({ }, { })
                )
            } else {
                val model = getAddressBookingModel(addressID).apply {
                    this.address = address
                    this.note = note
                    this.name = name
                }
                val identityId = baseMainModel.identityId
                add(
                    helperRepository.performPutAddressBookData(identityId, model)
                        .map { it.data }
                        .toMain()
                        .compose(loadingView())
                        .subscribe({ result ->
                            if (result != null && result) {
                                updateAddressData(
                                    addressID,
                                    name,
                                    note,
                                    address
                                )
                            }
                            RxBus.getInstance().post(RxBusTag.REVIEW_ADDRESS_FINISH, true)
                            RxBus.getInstance().post(RxBusTag.COMMON_ADDRESS_FINISH, true)
                            performPutAddressBookDataLiveData.value = true
                        }, {
                            onShowMessageDialogLiveData.value =
                                context.getString(R.string.g_a_network_error)
                        })
                )
            }
        }
    }

    private fun getAddressBookModelList(
        name: String,
        note: String,
        address: String
    ): List<AddressBookData> {
        return ArrayList<AddressBookData>().apply {
            add(AddressBookData().apply {
                this.address = address
                this.name = name
                this.note = note
                id = UUID.randomUUID().toString()
                chainType = RuleUtils.getChainType(address).value
                mainCoinID = RuleUtils.getMainCoinId(address)
            })
        }
    }

    private fun addAddressData(
        name: String,
        note: String,
        address: String,
        uuId: String
    ) {
        val id = userHelper.identityID
        dbHelper.addAddressData(AddressData().apply {
            identityData = dbHelper.getIdentityData(id) ?: IdentityData()
            //        data.setWalletData(list.get(index));
            this.address = address
            this.name = name
            this.note = note
            this.uuId = uuId
            mainCoinId = RuleUtils.getMainCoinId(address)

        })
    }

    private fun getAddressBookingModel(_id: Int): AddressBookData {
        var data = AddressData()
        if (_id != -1) {
            data = dbHelper.getAddressData(_id)
        }
        return AddressBookData().apply {
            id = data.uuId
            chainType = RuleUtils.getChainType(data.address).value
            note = data.note
            name = data.name
            address = data.address
            mainCoinID = data.mainCoinId
        }
    }

    private fun updateAddressData(
        _id: Int,
        name: String,
        note: String,
        address: String
    ) {
        dbHelper.updateAddressData(getAddressData(_id).apply {
            this.name = name
            this.note = note
            this.address = address
            mainCoinId = RuleUtils.getMainCoinId(address)
        })
    }

    fun getAddressData(_id: Int) = if (_id != -1) {
        dbHelper.getAddressData(_id)
    } else {
        AddressData()
    }

}