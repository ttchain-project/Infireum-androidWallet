package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.IdentityData

class IdentityDao(context: Context) : BaseDao<IdentityData, Int>(context, IdentityData::class.java) {

}