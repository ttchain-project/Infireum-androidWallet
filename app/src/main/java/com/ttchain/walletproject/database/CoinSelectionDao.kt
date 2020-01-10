package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.CoinSelectionData
import java.sql.SQLException
import java.util.*

class CoinSelectionDao(context: Context) : BaseDao<CoinSelectionData, Int>(context, CoinSelectionData::class.java) {

    fun getCoinSelectionDataListByWalletID(_id: Int): List<CoinSelectionData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_WALLET_ID, _id)
                        .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getIsSelectedCoinSelectionDataListByWalletID(walletId: Int, status: Boolean): List<CoinSelectionData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_WALLET_ID, walletId)
                        .and()
                        .eq(DbConstants.IS_SELECTED, status)
                        .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }
}