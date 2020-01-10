package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = DbConstants.TABLE_CHAT_MSG)
data class ChatMessageData(
        @DatabaseField(generatedId = true, columnName = DbConstants._ID)
        var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.FK_ROOM_ID, foreign = true, foreignAutoRefresh = true, canBeNull = false)
    var chatRoomData: ChatRoomData = ChatRoomData()
    @DatabaseField(columnName = DbConstants.MSG_ID)
    var msgId: String = ""
    @DatabaseField(columnName = DbConstants.MSG)
    var msg: String = ""
    @DatabaseField(columnName = DbConstants.MSG_TYPE)
    var msgType: String = ""
    @DatabaseField(columnName = DbConstants.MSG_TIME)
    var msgTime: Long = 0
    @DatabaseField(columnName = DbConstants.MSG_USER_ID)
    var msgUserId: String = ""
    @DatabaseField(columnName = DbConstants.MSG_USER_USER_NAME)
    var msgUserUserName: String = ""
    @DatabaseField(columnName = DbConstants.MSG_USER_NAME)
    var msgUserName: String = ""
}