package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = DbConstants.TABLE_COIN)
data class CoinData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
) :Serializable{
    @DatabaseField(columnName = DbConstants.COIN_ID)
    var coinId: String = ""
    @DatabaseField(columnName = DbConstants.CONTRACT)
    var contract: String? = null
    @DatabaseField(columnName = DbConstants.CHAIN_TYPE)
    var chainType: Int = -1
    @DatabaseField(columnName = DbConstants.DIGIT)
    var digit: Int = 0
    @DatabaseField(columnName = DbConstants.CHAIN_NAME)
    var chainName: String = ""
    @DatabaseField(columnName = DbConstants.FULL_NAME)
    var fullName: String = ""
    @DatabaseField(columnName = DbConstants.ICON)
    var icon: String? = null
    @DatabaseField(columnName = DbConstants.ICON_PATH)
    var iconPath: String? = null
    @DatabaseField(columnName = DbConstants.IS_DEFAULT)
    var isDefault: Boolean = false
    @DatabaseField(columnName = DbConstants.IS_DEFAULT_SELECTED)
    var isDefaultSelected: Boolean = false
    @DatabaseField(columnName = DbConstants.IS_ACTIVE)
    var isActive: Boolean = false
    @DatabaseField(columnName = DbConstants.DISPLAY_NAME)
    var displayName: String = ""
    @DatabaseField(columnName = DbConstants.MAIN_COIN_ID)
    var mainCoinId: String = ""
}
