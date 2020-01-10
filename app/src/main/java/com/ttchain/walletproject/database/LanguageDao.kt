package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.LanguageData

class LanguageDao(context: Context) : BaseDao<LanguageData, Int>(context, LanguageData::class.java) {
}