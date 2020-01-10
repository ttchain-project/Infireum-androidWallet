package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = DbConstants.TABLE_CHAT_GROUP)
data class ChatGroupData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.GROUP_ROOM_ID)
    var roomId: String = ""
    @DatabaseField(columnName = DbConstants.GROUP_GROUP_ID)
    var groupId: String = ""
    @DatabaseField(columnName = DbConstants.GROUP_MEMBERS)
    var members: String = ""
    @DatabaseField(columnName = DbConstants.GROUP_IS_PRIVATE)
    var isPrivate: Boolean = false
    @DatabaseField(columnName = DbConstants.GROUP_OWNER_UID)
    var ownerUid: String = ""
}
