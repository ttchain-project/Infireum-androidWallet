package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = DbConstants.TABLE_FIAT)
data class FiatData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
) :Serializable{
    @DatabaseField(columnName = DbConstants.FIAT_ID)
    var fiatId: Int = -1
    @DatabaseField(columnName = DbConstants.NAME)
    var name: String = ""
    @DatabaseField(columnName = DbConstants.SYMBOL)
    var symbol: String = ""
}