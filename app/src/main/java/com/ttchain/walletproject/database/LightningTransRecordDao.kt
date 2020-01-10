package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.LightningTransRecordData
import java.util.*

class LightningTransRecordDao(context: Context) : BaseDao<LightningTransRecordData, Int>(context, LightningTransRecordData::class.java) {

    fun getLightningTransRecordDataListByCoinId(coin_Id: Int): List<LightningTransRecordData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_FROM_COIN_ID, coin_Id)
                        .query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getLightningTransRecordDataByTxId(txId: String): LightningTransRecordData {
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
        return LightningTransRecordData()
    }

    fun getLightningTransRecordDataListByAddress(address: String): List<LightningTransRecordData> {
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

    fun getAll(
            page: Int = 1,
            limit: Long = GlobalConstant.PAGE_LIMIT_NORMAL.toLong()
    ): List<LightningTransRecordData> {
        try {
            dao?.let {
                return if (page > 0 && limit > 0) {
                    dao.queryBuilder().offset((page - 1) * limit).limit(limit).orderBy(DbConstants.DATE, false).query()
                } else {
                    dao.queryBuilder().orderBy(DbConstants.DATE, false).query()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }
}