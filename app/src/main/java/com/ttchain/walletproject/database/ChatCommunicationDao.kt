package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.ChatCommunicationData
import java.sql.SQLException
import java.util.*

class ChatCommunicationDao(context : Context) : BaseDao<ChatCommunicationData, Int>(context, ChatCommunicationData::class.java) {
    fun getChatCommunicationDataList(): List<ChatCommunicationData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .orderBy(DbConstants.COMM_UPDATE_TS, false)
                        .query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }
    fun getChatCommunicationByRoomId(roomId: String): ChatCommunicationData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.COMM_ROOM_ID, roomId)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return ChatCommunicationData()
    }
}