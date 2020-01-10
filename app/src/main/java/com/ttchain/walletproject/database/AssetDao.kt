package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.AssetData
import java.sql.SQLException
import java.util.*

class AssetDao(context: Context) : BaseDao<AssetData, Int>(context, AssetData::class.java) {

    fun getAssetDataListByWalletID(walletID: Int): List<AssetData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_WALLET_ID, walletID)
                        .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getAssetDataListByWalletIDAndCoinID(walletID: Int, coinID: Int): List<AssetData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_WALLET_ID, walletID)
                        .and()
                        .eq(DbConstants.FK_COIN_ID, coinID)
                        .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getAssetDataListByCoinIDs(coinIds: List<Int>): List<AssetData> {
        try {
            dao?.let {
                val list = ArrayList<AssetData>()
                for (id in coinIds) {
                    list.addAll(dao.queryBuilder().where()
                            .eq(DbConstants.FK_COIN_ID, id)
                            .query())
                }
                return list
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }
}