package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.FiatData
import java.sql.SQLException

class FiatDao(context: Context) : BaseDao<FiatData, Int>(context, FiatData::class.java) {
    fun getByFiatId(fiatId: Int): FiatData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FIAT_ID, fiatId)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return FiatData()
    }

    fun getByName(name: String): FiatData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.NAME, name)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return FiatData()
    }
}