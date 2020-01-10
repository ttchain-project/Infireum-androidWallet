package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable


@DatabaseTable(tableName = DbConstants.TABLE_LANGUAGE)
data class LanguageData(
    @DatabaseField(generatedId = true, columnName = DbConstants._ID)
    var _id: Int = -1
) : Serializable {
    @DatabaseField(columnName = DbConstants.LANGUAGE_ID)
    var languageId: Int = -1
    @DatabaseField(columnName = DbConstants.NAME)
    var name: String = ""
}