package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.CoinToFiatRateData
import java.sql.SQLException

class CoinToFiatRateDao(context: Context) : BaseDao<CoinToFiatRateData, Int>(context, CoinToFiatRateData::class.java) {
    fun getDataFromCoinIDToFiatId(coinID: Int, fiatId: Int): CoinToFiatRateData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_FROM_COIN_ID, coinID)
                        .query()

                list.filter { it.toFiatData.fiatId == fiatId }

                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return CoinToFiatRateData()
    }
}