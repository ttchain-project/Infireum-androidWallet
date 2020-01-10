package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable
import java.math.BigDecimal

@DatabaseTable(tableName = DbConstants.TABLE_ASSET)
data class AssetData(
    @DatabaseField(generatedId = true, columnName = DbConstants._ID)
    var _id: Int = -1
) : Serializable {
    @DatabaseField(
        columnName = DbConstants.FK_WALLET_ID,
        foreign = true,
        foreignAutoRefresh = true,
        canBeNull = false
    )
    var walletData: WalletData = WalletData()
    @DatabaseField(
        columnName = DbConstants.FK_COIN_ID,
        foreign = true,
        foreignAutoRefresh = true,
        canBeNull = false
    )
    var coinData: CoinData = CoinData()
    @DatabaseField(columnName = DbConstants.AMOUNT)
    var amount: BigDecimal = BigDecimal(0)
}