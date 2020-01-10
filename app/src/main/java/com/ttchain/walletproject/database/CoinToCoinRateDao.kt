package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.CoinToCoinRateData
import java.sql.SQLException

class CoinToCoinRateDao(context: Context) : BaseDao<CoinToCoinRateData, Int>(context, CoinToCoinRateData::class.java) {
    fun getCoinToCoinRateDataByCoinID(fromCoinID: Int, toCoinID: Int): CoinToCoinRateData? {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_FROM_COIN_ID, fromCoinID)
                        .and()
                        .eq(DbConstants.FK_TO_COIN_ID, toCoinID)
                        .queryForFirst()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return CoinToCoinRateData()
    }
}