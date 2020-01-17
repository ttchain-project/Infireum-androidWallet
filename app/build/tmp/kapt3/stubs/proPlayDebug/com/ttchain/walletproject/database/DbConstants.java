package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/ttchain/walletproject/database/DbConstants;", "Landroid/provider/BaseColumns;", "Companion", "app_proPlayDebug"})
public abstract interface DbConstants extends android.provider.BaseColumns {
    public static final com.ttchain.walletproject.database.DbConstants.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WALLET_DB_NAME = "wallet_db";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_IDENTITY = "table_identity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_WALLET = "table_wallet";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_COIN = "table_coin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TALE_COIN_SELECTION = "table_coin_selection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_ASSET = "table_asset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_ADDRESS = "table_address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_FIAT = "table_fiat";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_LANGUAGE = "table_language";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_COIN_TO_COIN_RATE = "table_coin_to_coin_rate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_COIN_TO_FIAT_RATE = "table_coin_to_fiat_rate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_FIAT_TO_FIAT_RATE = "table_fiat_to_fiat_rate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_TRANS_RECORD = "table_trans_record";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_LIGHTNING_TRANS_RECORD = "table_lightning_trans_record";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_USDT_TRANS_RECORD = "table_usdt_trans_record";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_CHAT_ROOM = "table_chat_room";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_CHAT_MSG = "table_chat_msg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_CHAT_COMMUNICATION = "table_chat_communication";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_CHAT_GROUP = "table_chat_group";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _ID = "_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IDENTITY_ID = "identity_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_PREF_LANG_ID = "fk_pref_lang_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_PREF_FIAT_ID = "fk_pref_fiat_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PWD = "pwd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PWD_HINT = "pwd_hint";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EP_KEY = "ep_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WALLET_TYPE = "wallet_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MNEMONIC = "mnemonic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS = "address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_FROM_SYSTEM = "is_from_system";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_ID = "coin_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTRACT = "contract";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FULL_NAME = "full_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ICON = "icon";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIGIT = "digit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ICON_PATH = "icon_path";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_DEFAULT = "is_default";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_DEFAULT_SELECTED = "is_default_selected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_ACTIVE = "is_active";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_WALLET_ID = "fk_wallet_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_COIN_ID = "fk_coin_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_SELECTED = "is_selected";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AMOUNT = "amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_IDENTITY_ID = "fk_identity_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTE = "note";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIAT_ID = "fiat_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SYMBOL = "symbol";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE_ID = "language_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_FROM_COIN_ID = "fk_from_coin_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_TO_COIN_ID = "fk_to_coin_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RATE = "rate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SYNC_DATE = "sync_date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_TO_FIAT_ID = "fk_to_fiat_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_FROM_FIAT_ID = "fk_from_fiat_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TX_ID = "tx_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATUS = "status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_AMOUNT = "from_amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_ADDRESS = "from_address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TO_AMOUNT = "to_amount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TO_ADDRESS = "to_address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_FEE_COIN_ID = "fk_fee_coin_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEE_AMT = "fee_Amt";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEE_RATE = "fee_rate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOTAL_FEE = "total_fee";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATE = "date";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLOCK = "block";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UUID = "uuid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAIN_COIN_ID = "main_coin_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHAIN_TYPE = "chain_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHAIN_NAME = "chain_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISPLAY_NAME = "display_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_ID = "room_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_NAME = "room_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_IMG_URL = "room_img_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_TYPE = "room_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROOM_RECEIVE_UID = "room_receive_uid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_ID = "msg_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FK_ROOM_ID = "fk_room_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG = "msg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_TYPE = "msg_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_TIME = "msg_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_USER_ID = "msg_user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_USER_USER_NAME = "msg_user_user_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MSG_USER_NAME = "msg_user_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_DISPLAY_NAME = "comm_display_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_LAST_MSG = "comm_last_msg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_ROOM_ID = "comm_room_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_UPDATE_TS = "comm_update_ts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_IMG_URL = "comm_img_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_ROOM_TYPE = "comm_room_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_LAST_MSG_ID = "comm_last_msg_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMM_PRIVATE_MESSAGE_TARGET_UID = "comm_private_message_target_uid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_ROOM_ID = "group_room_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_GROUP_ID = "group_group_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_MEMBERS = "group_members";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_IS_PRIVATE = "group_is_private";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_OWNER_UID = "group_owner_uid";
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bb\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lcom/ttchain/walletproject/database/DbConstants$Companion;", "", "()V", "ADDRESS", "", "AMOUNT", "BLOCK", "CHAIN_NAME", "CHAIN_TYPE", "COIN_ID", "COMM_DISPLAY_NAME", "COMM_IMG_URL", "COMM_LAST_MSG", "COMM_LAST_MSG_ID", "COMM_PRIVATE_MESSAGE_TARGET_UID", "COMM_ROOM_ID", "COMM_ROOM_TYPE", "COMM_UPDATE_TS", "CONTRACT", "DATE", "DIGIT", "DISPLAY_NAME", "EP_KEY", "FEE_AMT", "FEE_RATE", "FIAT_ID", "FK_COIN_ID", "FK_FEE_COIN_ID", "FK_FROM_COIN_ID", "FK_FROM_FIAT_ID", "FK_IDENTITY_ID", "FK_PREF_FIAT_ID", "FK_PREF_LANG_ID", "FK_ROOM_ID", "FK_TO_COIN_ID", "FK_TO_FIAT_ID", "FK_WALLET_ID", "FROM_ADDRESS", "FROM_AMOUNT", "FULL_NAME", "GROUP_GROUP_ID", "GROUP_IS_PRIVATE", "GROUP_MEMBERS", "GROUP_OWNER_UID", "GROUP_ROOM_ID", "ICON", "ICON_PATH", "IDENTITY_ID", "IS_ACTIVE", "IS_DEFAULT", "IS_DEFAULT_SELECTED", "IS_FROM_SYSTEM", "IS_SELECTED", "LANGUAGE_ID", "MAIN_COIN_ID", "MNEMONIC", "MSG", "MSG_ID", "MSG_TIME", "MSG_TYPE", "MSG_USER_ID", "MSG_USER_NAME", "MSG_USER_USER_NAME", "NAME", "NOTE", "PWD", "PWD_HINT", "RATE", "ROOM_ID", "ROOM_IMG_URL", "ROOM_NAME", "ROOM_RECEIVE_UID", "ROOM_TYPE", "STATUS", "SYMBOL", "SYNC_DATE", "TABLE_ADDRESS", "TABLE_ASSET", "TABLE_CHAT_COMMUNICATION", "TABLE_CHAT_GROUP", "TABLE_CHAT_MSG", "TABLE_CHAT_ROOM", "TABLE_COIN", "TABLE_COIN_TO_COIN_RATE", "TABLE_COIN_TO_FIAT_RATE", "TABLE_FIAT", "TABLE_FIAT_TO_FIAT_RATE", "TABLE_IDENTITY", "TABLE_LANGUAGE", "TABLE_LIGHTNING_TRANS_RECORD", "TABLE_TRANS_RECORD", "TABLE_USDT_TRANS_RECORD", "TABLE_WALLET", "TALE_COIN_SELECTION", "TOTAL_FEE", "TO_ADDRESS", "TO_AMOUNT", "TX_ID", "UUID", "WALLET_DB_NAME", "WALLET_TYPE", "_ID", "app_proPlayDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WALLET_DB_NAME = "wallet_db";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_IDENTITY = "table_identity";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_WALLET = "table_wallet";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_COIN = "table_coin";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TALE_COIN_SELECTION = "table_coin_selection";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_ASSET = "table_asset";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_ADDRESS = "table_address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_FIAT = "table_fiat";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_LANGUAGE = "table_language";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_COIN_TO_COIN_RATE = "table_coin_to_coin_rate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_COIN_TO_FIAT_RATE = "table_coin_to_fiat_rate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_FIAT_TO_FIAT_RATE = "table_fiat_to_fiat_rate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_TRANS_RECORD = "table_trans_record";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_LIGHTNING_TRANS_RECORD = "table_lightning_trans_record";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_USDT_TRANS_RECORD = "table_usdt_trans_record";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_CHAT_ROOM = "table_chat_room";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_CHAT_MSG = "table_chat_msg";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_CHAT_COMMUNICATION = "table_chat_communication";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_CHAT_GROUP = "table_chat_group";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String _ID = "_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IDENTITY_ID = "identity_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NAME = "name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_PREF_LANG_ID = "fk_pref_lang_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_PREF_FIAT_ID = "fk_pref_fiat_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PWD = "pwd";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PWD_HINT = "pwd_hint";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EP_KEY = "ep_key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WALLET_TYPE = "wallet_type";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MNEMONIC = "mnemonic";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ADDRESS = "address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_FROM_SYSTEM = "is_from_system";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COIN_ID = "coin_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CONTRACT = "contract";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FULL_NAME = "full_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ICON = "icon";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DIGIT = "digit";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ICON_PATH = "icon_path";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_DEFAULT = "is_default";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_DEFAULT_SELECTED = "is_default_selected";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_ACTIVE = "is_active";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_WALLET_ID = "fk_wallet_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_COIN_ID = "fk_coin_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_SELECTED = "is_selected";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String AMOUNT = "amount";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_IDENTITY_ID = "fk_identity_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NOTE = "note";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FIAT_ID = "fiat_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SYMBOL = "symbol";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANGUAGE_ID = "language_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_FROM_COIN_ID = "fk_from_coin_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_TO_COIN_ID = "fk_to_coin_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RATE = "rate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SYNC_DATE = "sync_date";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_TO_FIAT_ID = "fk_to_fiat_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_FROM_FIAT_ID = "fk_from_fiat_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TX_ID = "tx_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String STATUS = "status";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FROM_AMOUNT = "from_amount";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FROM_ADDRESS = "from_address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TO_AMOUNT = "to_amount";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TO_ADDRESS = "to_address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_FEE_COIN_ID = "fk_fee_coin_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FEE_AMT = "fee_Amt";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FEE_RATE = "fee_rate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TOTAL_FEE = "total_fee";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DATE = "date";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BLOCK = "block";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UUID = "uuid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MAIN_COIN_ID = "main_coin_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CHAIN_TYPE = "chain_type";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CHAIN_NAME = "chain_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DISPLAY_NAME = "display_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ROOM_ID = "room_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ROOM_NAME = "room_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ROOM_IMG_URL = "room_img_url";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ROOM_TYPE = "room_type";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ROOM_RECEIVE_UID = "room_receive_uid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG_ID = "msg_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FK_ROOM_ID = "fk_room_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG = "msg";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG_TYPE = "msg_type";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG_TIME = "msg_time";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG_USER_ID = "msg_user_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG_USER_USER_NAME = "msg_user_user_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MSG_USER_NAME = "msg_user_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_DISPLAY_NAME = "comm_display_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_LAST_MSG = "comm_last_msg";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_ROOM_ID = "comm_room_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_UPDATE_TS = "comm_update_ts";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_IMG_URL = "comm_img_url";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_ROOM_TYPE = "comm_room_type";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_LAST_MSG_ID = "comm_last_msg_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMM_PRIVATE_MESSAGE_TARGET_UID = "comm_private_message_target_uid";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GROUP_ROOM_ID = "group_room_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GROUP_GROUP_ID = "group_group_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GROUP_MEMBERS = "group_members";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GROUP_IS_PRIVATE = "group_is_private";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GROUP_OWNER_UID = "group_owner_uid";
        
        private Companion() {
            super();
        }
    }
}