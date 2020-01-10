package com.git4u.tt_wallet_android.database

import android.content.Context
import com.git4u.tt_wallet_android.cache.GlobalConstant
import com.ttchain.walletproject.database.data.TransRecordData
import com.j256.ormlite.stmt.Where
import com.ttchain.walletproject.database.DbConstants
import java.util.*

class TransRecordDao(context: Context) : BaseDao<TransRecordData, Int>(context, TransRecordData::class.java) {

    fun getTransRecordDataListByCoinID(coinID: Int): List<TransRecordData> {
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
    ): List<TransRecordData> {
        try {
            dao?.let {
                val queryWhere: Where<TransRecordData, Int> = if (page > 0 && limit > 0) {
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

    fun getTransRecordDataByTxId(txId: String): TransRecordData {
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
        return TransRecordData()
    }

    fun getLatestTransRecordDataByAddress(address: String): TransRecordData {
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
        return TransRecordData()
    }

    fun getTransRecordDataListByAddress(address: String): List<TransRecordData> {
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