package com.ttchain.walletproject.repository

import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.database.data.UsdtTransRecordData
import com.ttchain.walletproject.model.DbHelper

class BaseCoinRecordRepository(private val dbHelper: DbHelper) {

    fun getTransRecordDataByTxId(txId: String): TransRecordData {
        return dbHelper.getTransRecordDataByTxId(txId)
    }

    fun addTransRecordData(data: TransRecordData) {
        dbHelper.addTransRecordData(data)
    }

    fun updateTransRecordData(data: TransRecordData) {
        dbHelper.updateTransRecordData(data)
    }

    fun getLatestTransRecordDataByAddress(address: String): TransRecordData {
        return dbHelper.getLatestTransRecordDataByAddress(address)
    }

    fun getTransRecordDataListByAddress(address: String): List<TransRecordData> {
        return dbHelper.getTransRecordDataListByAddress(address)
    }

    fun getUsdtTransRecordDataByTxId(txId: String): UsdtTransRecordData {
        return dbHelper.getUsdtTransRecordDataByTxId(txId)
    }

    fun addUsdtTransRecordData(data: UsdtTransRecordData) {
        dbHelper.addUsdtTransRecordData(data)
    }

    fun updateUsdtTransRecordData(data: UsdtTransRecordData) {
        dbHelper.updateUsdtTransRecordData(data)
    }

    fun getLatestUsdtTransRecordDataByAddress(address: String): UsdtTransRecordData {
        return dbHelper.getLatestUsdtTransRecordDataByAddress(address)
    }
}