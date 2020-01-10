package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.FiatToFiatRateData
import java.sql.SQLException

class FiatToFiatRateDao(context: Context) : BaseDao<FiatToFiatRateData, Int>(context, FiatToFiatRateData::class.java) {
    fun getByFromFiatIDToFiatID(fromFiatID: Int, toFiatID: Int): FiatToFiatRateData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_FROM_FIAT_ID, fromFiatID)
                        .and()
                        .eq(DbConstants.FK_TO_FIAT_ID, toFiatID)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return FiatToFiatRateData()
    }
}