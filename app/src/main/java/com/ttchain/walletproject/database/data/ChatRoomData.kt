package com.ttchain.walletproject.database.data

import com.ttchain.walletproject.database.DbConstants
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable

@DatabaseTable(tableName = DbConstants.TABLE_CHAT_ROOM)
data class ChatRoomData(
    @DatabaseField(generatedId = true, columnName = DbConstants._ID)
    var _id: Int = -1
) {
    @DatabaseField(columnName = DbConstants.ROOM_ID)
    var roomId: String = ""
    @DatabaseField(columnName = DbConstants.ROOM_NAME)
    var roomName: String = ""
    @DatabaseField(columnName = DbConstants.ROOM_IMG_URL)
    var roomImgUrl: String = ""
    @DatabaseField(columnName = DbConstants.ROOM_TYPE)
    var roomType: String = ""
//    @DatabaseField(columnName = DbConstants.ROOM_RECEIVE_UID)
//    var receiveUid:String=""
}


data class RequestCoinData(
    val address: String = "",
    val amount: String = "",
    val coinID: String = ""
)