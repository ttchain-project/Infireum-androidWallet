package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.CoinData
import java.sql.SQLException
import java.util.*

class CoinDao(context: Context) : BaseDao<CoinData, Int>(context, CoinData::class.java) {
    fun getCoinByCoinId(string: String): CoinData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                    .where()
                    .eq(DbConstants.COIN_ID, string)
                    .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return CoinData()
    }

    fun getCoinByName(string: String): CoinData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                    .where()
                    .eq(DbConstants.DISPLAY_NAME, string)
                    .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return CoinData()
    }

    fun getCoinListByWalletTypeId(id: Int): List<CoinData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                    .where()
                    .eq(DbConstants.CHAIN_TYPE, id)
                    .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getCoinListByWalletTypeIdAndWord(id: Int, word: String): List<CoinData> {
        try {
            dao?.let {
                val queryWhere = dao.queryBuilder().where()
                queryWhere
                    .or(
                        queryWhere.like(DbConstants.DISPLAY_NAME, "%$word%"),
                        queryWhere.like(DbConstants.FULL_NAME, "%$word%"),
                        queryWhere.like(DbConstants.CONTRACT, "%$word%")
                    )
                queryWhere.and().eq(DbConstants.CHAIN_TYPE, id)
                return queryWhere.query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getCoinListByDefaultIsDefaultSelected(): List<CoinData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                    .where()
                    .eq(DbConstants.IS_DEFAULT_SELECTED, true)
                    .and()
                    .eq(DbConstants.IS_DEFAULT, true)
                    .and()
                    .eq(DbConstants.IS_ACTIVE, true)
                    .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getCoinListByMainCoinId(coinId: String): List<CoinData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                    .where()
                    .eq(DbConstants.MAIN_COIN_ID, coinId)
                    .and()
                    .eq(DbConstants.IS_ACTIVE, true)
                    .query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getCoinListByMainCoinIdAndWord(mainCoinId: String, word: String): List<CoinData> {
        try {
            dao?.let {
                val queryWhere = dao.queryBuilder().where()
                queryWhere
                    .or(
                        queryWhere.like(DbConstants.DISPLAY_NAME, "%$word%"),
                        queryWhere.like(DbConstants.FULL_NAME, "%$word%"),
                        queryWhere.like(DbConstants.CONTRACT, "%$word%")
                    )
                queryWhere
                    .and()
                    .eq(DbConstants.MAIN_COIN_ID, mainCoinId)
                    .and()
                    .eq(DbConstants.IS_ACTIVE, true)
                return queryWhere.query()
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

}