package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.dao.ForeignCollection
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.field.ForeignCollectionField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = DbConstants.TABLE_WALLET)
data class WalletData(
    @DatabaseField(generatedId = true, columnName = DbConstants._ID)
    var _id: Int = -1
) : Serializable {
    @DatabaseField(
        columnName = DbConstants.FK_IDENTITY_ID,
        foreign = true,
        foreignAutoRefresh = true,
        canBeNull = false
    )
    var identityData: IdentityData = IdentityData()
    @DatabaseField(columnName = DbConstants.EP_KEY)
    var epKey: String = ""
    @DatabaseField(columnName = DbConstants.CHAIN_TYPE)
    var chainType: Int = -1
    @DatabaseField(columnName = DbConstants.MNEMONIC)
    var mnemonic: String? = null
    @DatabaseField(columnName = DbConstants.PWD)
    var pwd: String = ""
    @DatabaseField(columnName = DbConstants.PWD_HINT)
    var pwdHint: String = ""
    @DatabaseField(columnName = DbConstants.NAME)
    var name: String = ""
    @DatabaseField(columnName = DbConstants.ADDRESS)
    var address: String = ""
    @DatabaseField(columnName = DbConstants.IS_FROM_SYSTEM)
    var isFromSystem: Boolean = false
    @DatabaseField(columnName = DbConstants.MAIN_COIN_ID)
    var mainCoinId: String = ""

    @ForeignCollectionField(eager = false)
    var coinSelectionList: ForeignCollection<CoinSelectionData>? = null
    @ForeignCollectionField(eager = false)
    var coinAssetList: ForeignCollection<AssetData>? = null
}