package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.ChatRoomData
import java.sql.SQLException

class ChatRoomDao(context : Context) : BaseDao<ChatRoomData, Int>(context, ChatRoomData::class.java) {
    fun getChatRoomByRoomId(roomId: String): ChatRoomData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.ROOM_ID, roomId)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return ChatRoomData()
    }
}