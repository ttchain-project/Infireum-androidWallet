package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = DbConstants.TABLE_CHAT_COMMUNICATION)
data class ChatCommunicationData(
    @DatabaseField(generatedId = true, columnName = DbConstants._ID)
    var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.COMM_DISPLAY_NAME)
    var displayName: String = ""
    @DatabaseField(columnName = DbConstants.COMM_LAST_MSG)
    var lastMsg: String = ""
    @DatabaseField(columnName = DbConstants.COMM_ROOM_ID)
    var roomId: String = ""
    @DatabaseField(columnName = DbConstants.COMM_UPDATE_TS)
    var updateTs: Long = 0
    @DatabaseField(columnName = DbConstants.COMM_IMG_URL)
    var imgUrl: String = ""
    @DatabaseField(columnName = DbConstants.COMM_ROOM_TYPE)
    var roomType: String = ""
    @DatabaseField(columnName = DbConstants.COMM_LAST_MSG_ID)
    var lastMsgId: String = ""
//    @DatabaseField(columnName = DbConstants.COMM_PRIVATE_MESSAGE_TARGET_UID)
//    var privateMessageTargetUid: String = ""
}
