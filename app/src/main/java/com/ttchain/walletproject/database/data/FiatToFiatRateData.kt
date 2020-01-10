package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.math.BigDecimal

@DatabaseTable(tableName = DbConstants.TABLE_FIAT_TO_FIAT_RATE)
data class FiatToFiatRateData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.FK_FROM_FIAT_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var fromFiatData: FiatData = FiatData()
    @DatabaseField(columnName = DbConstants.FK_TO_FIAT_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var toFiatData: FiatData = FiatData()
    @DatabaseField(columnName = DbConstants.RATE)
    var rate: BigDecimal = BigDecimal(0)
    @DatabaseField(columnName = DbConstants.SYNC_DATE)
    var syncData: String = ""
}