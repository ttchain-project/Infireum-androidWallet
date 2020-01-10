package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.math.BigDecimal

@DatabaseTable(tableName = DbConstants.TABLE_USDT_TRANS_RECORD)
data class UsdtTransRecordData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID) var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.TX_ID)
    var txId: String = ""
    @DatabaseField(columnName = DbConstants.STATUS)
    var status: Int = -1
    @DatabaseField(columnName = DbConstants.FK_FROM_COIN_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var fromCoinData: CoinData = CoinData()
    @DatabaseField(columnName = DbConstants.FROM_AMOUNT)
    var fromAmount: BigDecimal = BigDecimal("0")
    @DatabaseField(columnName = DbConstants.FROM_ADDRESS)
    var fromAddress: String = ""
    @DatabaseField(columnName = DbConstants.FK_TO_COIN_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var toCoinData: CoinData = CoinData()
    @DatabaseField(columnName = DbConstants.TO_AMOUNT)
    var toAmount: BigDecimal = BigDecimal("0")
    @DatabaseField(columnName = DbConstants.TO_ADDRESS)
    var toAddress: String = ""
    @DatabaseField(columnName = DbConstants.FK_FEE_COIN_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var feeCoinData: CoinData = CoinData()
    @DatabaseField(columnName = DbConstants.FEE_AMT)
    var feeAmount: BigDecimal = BigDecimal("0")
    @DatabaseField(columnName = DbConstants.FEE_RATE)
    var feeRate: BigDecimal = BigDecimal("0")
    @DatabaseField(columnName = DbConstants.TOTAL_FEE)
    var totalFee: BigDecimal = BigDecimal("0")
    @DatabaseField(columnName = DbConstants.DATE)
    var date: String = ""
    @DatabaseField(columnName = DbConstants.SYNC_DATE)
    var syncDate: String = ""
    @DatabaseField(columnName = DbConstants.BLOCK)
    var block: String? = null
    @DatabaseField(columnName = DbConstants.NOTE)
    var note: String? = null
}