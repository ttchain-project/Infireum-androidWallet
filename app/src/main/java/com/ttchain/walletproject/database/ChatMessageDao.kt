package com.ttchain.walletproject.database

import android.content.Context
import com.ttchain.walletproject.database.data.ChatMessageData
import java.sql.SQLException
import java.util.*


class ChatMessageDao(context : Context) : BaseDao<ChatMessageData, Int>(context, ChatMessageData::class.java) {

    fun getChatMessageByMsgId(msgId: String): ChatMessageData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.MSG_ID, msgId)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        }
        return ChatMessageData()
    }

    fun getChatMessageDataListByRoomId(roomID: Int): List<ChatMessageData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .orderBy(DbConstants.MSG_TIME, false)
                        .where()
                        .eq(DbConstants.FK_ROOM_ID, roomID)
                        .query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun deleteMsgByRoomId(roomID: Int) {
        try {
            dao?.let {
//                it.deleteBuilder().where().eq(DbConstants.FK_ROOM_ID, roomID)
//                it.deleteBuilder().delete()
                val deleteBuilder = dao.deleteBuilder()
                deleteBuilder.where().eq(DbConstants.FK_ROOM_ID, roomID)
                deleteBuilder.delete()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}