package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0003\u00a8\u0006\u000f"}, d2 = {"Lcom/ttchain/walletproject/database/ChatMessageDao;", "Lcom/ttchain/walletproject/database/BaseDao;", "Lcom/ttchain/walletproject/database/data/ChatMessageData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deleteMsgByRoomId", "", "roomID", "getChatMessageByMsgId", "msgId", "", "getChatMessageDataListByRoomId", "", "app_proPlayDebug"})
public final class ChatMessageDao extends com.ttchain.walletproject.database.BaseDao<com.ttchain.walletproject.database.data.ChatMessageData, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.ChatMessageData getChatMessageByMsgId(@org.jetbrains.annotations.NotNull()
    java.lang.String msgId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.ChatMessageData> getChatMessageDataListByRoomId(int roomID) {
        return null;
    }
    
    public final void deleteMsgByRoomId(int roomID) {
    }
    
    public ChatMessageDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}