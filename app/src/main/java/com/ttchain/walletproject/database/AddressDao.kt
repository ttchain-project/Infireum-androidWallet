package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.AddressData

class AddressDao(context: Context) : BaseDao<AddressData, Int>(context, AddressData::class.java) {

}