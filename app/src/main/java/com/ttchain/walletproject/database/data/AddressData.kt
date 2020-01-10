package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = DbConstants.TABLE_ADDRESS)
data class AddressData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.FK_IDENTITY_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var identityData: IdentityData = IdentityData()
    @DatabaseField(columnName = DbConstants.NAME)
    var name: String = ""
    @DatabaseField(columnName = DbConstants.FK_WALLET_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var walletData: WalletData = WalletData()
    @DatabaseField(columnName = DbConstants.ADDRESS)
    var address: String = ""
    @DatabaseField(columnName = DbConstants.NOTE)
    var note: String = ""
    @DatabaseField(columnName = DbConstants.UUID)
    var uuId: String = ""
    @DatabaseField(columnName = DbConstants.MAIN_COIN_ID)
    var mainCoinId: String = ""
}