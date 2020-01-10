package com.ttchain.walletproject.ui.me.commonaddress

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.ttchain.walletproject.R
import com.ttchain.walletproject.model.AddressEntity
import java.util.*

class CommonAddressAdapter : BaseMultiItemQuickAdapter<AddressEntity, BaseViewHolder>(ArrayList()) {
    init {
        addItemType(AddressEntity.NORMAL, R.layout.view_item_common_address)
    }

    override fun convert(helper: BaseViewHolder, iItem: AddressEntity?) {
        if (iItem != null) {
            val aB = iItem.data
            helper
                .setText(R.id.name, aB.name)
                .setText(R.id.coin_name, aB.coinName + ": ")
                .setText(R.id.address, aB.address)
                .setImageResource(R.id.icon, aB.icon)
        }
    }
}
