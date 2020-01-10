package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.ChatGroupData
import java.sql.SQLException

class ChatGroupDao(context : Context) : BaseDao<ChatGroupData, Int>(context, ChatGroupData::class.java) {
    fun getChatGroupDataByRoomId(roomId: String): ChatGroupData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.GROUP_ROOM_ID, roomId)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return ChatGroupData()
    }
}