package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\t\u0010)\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001e\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001e\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006*"}, d2 = {"Lcom/ttchain/walletproject/database/data/ChatCommunicationData;", "", "_id", "", "(I)V", "get_id", "()I", "set_id", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "imgUrl", "getImgUrl", "setImgUrl", "lastMsg", "getLastMsg", "setLastMsg", "lastMsgId", "getLastMsgId", "setLastMsgId", "roomId", "getRoomId", "setRoomId", "roomType", "getRoomType", "setRoomType", "updateTs", "", "getUpdateTs", "()J", "setUpdateTs", "(J)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_chat_communication")
public final class ChatCommunicationData {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_display_name")
    private java.lang.String displayName;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_last_msg")
    private java.lang.String lastMsg;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_room_id")
    private java.lang.String roomId;
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_update_ts")
    private long updateTs;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_img_url")
    private java.lang.String imgUrl;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_room_type")
    private java.lang.String roomType;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "comm_last_msg_id")
    private java.lang.String lastMsgId;
    @com.j256.ormlite.field.DatabaseField(generatedId = true, columnName = "_id")
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastMsg() {
        return null;
    }
    
    public final void setLastMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getUpdateTs() {
        return 0L;
    }
    
    public final void setUpdateTs(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgUrl() {
        return null;
    }
    
    public final void setImgUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomType() {
        return null;
    }
    
    public final void setRoomType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastMsgId() {
        return null;
    }
    
    public final void setLastMsgId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public ChatCommunicationData(int _id) {
        super();
    }
    
    public ChatCommunicationData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.ChatCommunicationData copy(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}