package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable

@DatabaseTable(tableName = DbConstants.TABLE_IDENTITY)
data class IdentityData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
):Serializable {
    @DatabaseField(columnName = DbConstants.IDENTITY_ID)
    var identityId: String = ""
    @DatabaseField(columnName = DbConstants.NAME)
    var name: String = ""
    @DatabaseField(columnName = DbConstants.FK_PREF_LANG_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var prefLangData: LanguageData = LanguageData()
    @DatabaseField(columnName = DbConstants.FK_PREF_FIAT_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var prefFiatData: FiatData = FiatData()
    @DatabaseField(columnName = DbConstants.PWD)
    var pwd: String = ""
    @DatabaseField(columnName = DbConstants.PWD_HINT)
    var pwdHint: String = ""
}