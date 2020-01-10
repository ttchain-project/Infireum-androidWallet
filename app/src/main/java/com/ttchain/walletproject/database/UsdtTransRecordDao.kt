package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.UsdtTransRecordData
import com.j256.ormlite.stmt.Where
import com.ttchain.walletproject.cache.GlobalConstant
import java.util.*

class UsdtTransRecordDao(context: Context) : BaseDao<UsdtTransRecordData, Int>(context, UsdtTransRecordData::class.java) {

    fun getTransRecordDataListByCoinID(coinID: Int): List<UsdtTransRecordData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_FROM_COIN_ID, coinID)
                        .query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getTransRecordDataListByCondition(
        walletAddress: String,
        coinID: Int = -1,
        state: Int = GlobalConstant.TRANSACTION_STATE_ALL,
        page: Int = 1,
        limit: Long = GlobalConstant.PAGE_LIMIT_NORMAL.toLong()
    ): List<UsdtTransRecordData> {
        try {
            dao?.let {
                val queryWhere: Where<UsdtTransRecordData, Int> = if (page > 0 && limit > 0) {
                    dao.queryBuilder().offset((page - 1) * limit).limit(limit).orderBy(DbConstants.DATE, false).where()
                } else {
                    dao.queryBuilder().orderBy(DbConstants.DATE, false).where()
                }

                queryWhere
                        .or(
                                queryWhere.like(DbConstants.FROM_ADDRESS, "%$walletAddress%"),
                                queryWhere.like(DbConstants.TO_ADDRESS, "%$walletAddress%")
                        )
                if (coinID != -1) {
                    queryWhere.and().eq(DbConstants.FK_FROM_COIN_ID, coinID)
                }
                if (state != GlobalConstant.TRANSACTION_STATE_ALL) {
                    queryWhere.and().eq(DbConstants.STATUS, state)
                }
                return queryWhere.query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getTransRecordDataByTxId(txId: String): UsdtTransRecordData {
        try {
            dao?.let {
                val data = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.TX_ID, txId)
                        .queryForFirst()
                data?.let {
                    return data
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return UsdtTransRecordData()
    }

    fun getLatestTransRecordDataByAddress(address: String): UsdtTransRecordData {
        try {
            dao?.let {
                val queryWhere = dao.queryBuilder().orderBy(DbConstants.DATE, false).where()
                queryWhere
                        .or(
                                queryWhere.like(DbConstants.FROM_ADDRESS, "%$address%"),
                                queryWhere.like(DbConstants.TO_ADDRESS, "%$address%")
                        )
                val data = queryWhere.queryForFirst()
                data?.let {
                    return data
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return UsdtTransRecordData()
    }

    fun getTransRecordDataListByAddress(address: String): List<UsdtTransRecordData> {
        try {
            dao?.let {
                val queryWhere = dao.queryBuilder().orderBy(DbConstants.DATE, false).where()
                queryWhere
                        .or(
                                queryWhere.like(DbConstants.FROM_ADDRESS, "%$address%"),
                                queryWhere.like(DbConstants.TO_ADDRESS, "%$address%")
                        )
                return queryWhere.query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

}