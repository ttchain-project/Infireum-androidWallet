package com.ttchain.walletproject.ui.me.commonaddress

import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecyclerViewViewModel
import com.ttchain.walletproject.database.data.AddressData
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.repository.HelperRepository
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.RuleUtils
import io.reactivex.Observable
import java.util.*

class CommonAddressViewModel(
    private val dbHelper: DbHelper,
    private val userHelp: UserHelper,
    private val baseMainModel: BaseMainModel,
    private val helperRepository: HelperRepository
) : BaseRecyclerViewViewModel<AddressEntity>() {

    var isPicker = false

    fun getAddressList() {
        add(
            helperRepository.performGetAddressBookDataList(getIdentityId())
                .map { apiResponseListAddressBookModel -> apiResponseListAddressBookModel.data }
                .map { response ->
                    updateDbAddressDataList(response)
                    return@map response
                }
                .toMain()
                .compose(loadingRecyclerView(mRequestStatus))
                .doFinally {
                    add(
                        Observable.just(getAddressListEntity())
                            .toMain()
                            .subscribe(
                                { this.onSubscribeComplete(it) },
                                { this.onSubscribeError(it) })
                    )
                }
                .subscribe(
                    { o -> },
                    { throwable -> })
        )
    }

    private fun getIdentityId(): String {
        val identityData = dbHelper.getIdentityData(userHelp.identityID)
        return identityData?.identityId ?: ""
    }

    private fun updateDbAddressDataList(apiList: List<AddressBookData>) {
        val list = dbHelper.getAddressDataList()
        val identityData = dbHelper.getIdentityData(userHelp.identityID)
        for (model in apiList) {
            var isExist = false
            for (data in list) {
                if (data.uuId == model.id) {
                    data.address = model.address
                    data.name = model.name
                    data.note = model.note
                    if (identityData != null) {
                        data.identityData = identityData
                    }

                    dbHelper.updateAddressData(data)
                    isExist = true
                    break
                }
            }
            if (!isExist) {
                val data = AddressData().apply {
                    if (identityData != null) {
                        this.identityData = identityData
                    }
                    note = model.note
                    name = model.name
                    address = model.address
                    uuId = model.id
                }
                dbHelper.addAddressData(data)
            }
        }
    }

    private fun getAddressListEntity(): List<AddressEntity> {
        val addressEntityList = ArrayList<AddressEntity>()
        val list = dbHelper.getAddressDataList()
        for (data in list) {
            val bean = AddressBean()
            val address = data.address
            bean.name = data.name
            val mainCoinData = baseMainModel.getMainCoinDataByAddress(address)
            if (mainCoinData._id > 0) {
                bean.coinName = mainCoinData.displayName.toUpperCase()
            }
            bean.addressID = data._id
            bean.icon = getWalletIconByAddress(address)
            bean.address = address
            addressEntityList.add(AddressEntity(AddressEntity.NORMAL, bean))
        }
        return addressEntityList
    }

    private fun getWalletIconByAddress(address: String): Int {
        val mainCoinType = RuleUtils.getMainCoinType(address)
        return when {
            mainCoinType === MainCoinType.ETH -> R.mipmap.icon_content_eth
            mainCoinType === MainCoinType.BTC -> R.mipmap.icon_funds_bitcoin
            mainCoinType === MainCoinType.CIC -> R.mipmap.icon_list_cic_normal
            mainCoinType === MainCoinType.GUC -> R.mipmap.icon_list_guc_normal
            else -> R.mipmap.wallet_coin_ttn_small
        }
    }

    public override fun refreshRequest() {
        super.refreshRequest()
        setNextPage(-1)
        getAddressList()
    }
}