package com.ttchain.walletproject.rx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b6\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/ttchain/walletproject/rx/RxBusTag;", "", "()V", "AGREE_PRIVACY_POLICY", "", "ASSET_FRAGMENT_FINISH", "BACK_UP_IDENTIFY_FLOW_OK", "COMMON_ADDRESS_FINISH", "CT_WALLET_QUERY_API", "CT_WALLET_REFRESH", "EXIT_CHAT_ROOM", "FINISH_SELECT_BACKUP_METHOD_ACTIVITY", "LOAD_CHAT_ROOM_HISTORY_WITH_SOCKET", "LOGIN_ROCKET_CHAT_WITH_SOCKET", "MINER_FEE_EDITOR_DIALOG_DISMISS", "NOTIFY_CHAT_ROOM_UPDATE_WITH_SOCKET", "NOTIFY_CHAT_SECRET_MODE_UPDATE", "OPEN_CHAT_ROOM", "PAYMENT_DETAIL_DIALOG_DISMISS", "PAYMENT_DETAIL_DIALOG_ON_CLICK_MINER_FEE_ITEM", "PAYMENT_DETAIL_DIALOG_ON_CLICK_NEXT_STEP", "PAYMENT_DETAIL_DIALOG_ON_CLICK_PAY_ADDRESS_ITEM", "PAYMENT_DETAIL_DIALOG_ON_CLICK_RECEIPT_ADDRESS_ITEM", "PICK_WALLET_DIALOG_DISMISS", "PICK_WALLET_DIALOG_DISMISS_RESHOW_PAYMENT_DETAIL_DIALOG", "RECEIPT_ADDRESS_PRESS_TOOLBAR_BACK", "RED_ENVELOPE_TRANSACTION_COMPLETE", "REGISTER_SEND_MINER_FEE_EDIT_BEAN", "REVIEW_ADDRESS_FINISH", "SCANNER_ADDRESS_TAG", "SCANNER_AMOUNT_TAG", "SEARCH_COIN_FRAGMENT_FINISH", "SECRET_CHAT_MODE_CHANGE", "SELECT_ADDRESS_OK", "SELECT_COIN_OK", "SELECT_THUNDER_ADDRESS_OK", "SELECT_THUNDER_WALLET_OK", "SELECT_WALLET_OK", "SEND_COIN_REQUEST", "SEND_MESSAGE_REQUEST", "SEND_MINER_FEE_EDIT_BEAN", "SET_AUTH_OK", "SET_RESULT_OK", "SET_WALLET_ID_RESULT_OK", "SOCKET_FAILURE", "TRANSFER_COIN_ACTION_OK", "UPDATE_CHAT_ROOM_LIST", "UPDATE_CONTACT_LIST", "UPDATE_CREATE_GROUP_MEMBER_LIST", "UPDATE_ME_INFO", "UPDATE_MINER_FEE_EDIT_BEAN_OK", "UPDATE_PAYMENT_DETAIL_DIALOG_ADDRESS_OK", "UPDATE_PAYMENT_DETAIL_DIALOG_INPUT_COMMENT", "UPDATE_RECEIPT_ADDRESS_OK", "UPDATE_RECEIPT_ADDRESS_UI_IN_THUNDER", "UPDATE_THUNDER_RECORD_LIST", "UPDATE_USER_INFO", "UPDATE_WALLET_NAME_OK", "app_proPlayDebug"})
public final class RxBusTag {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SET_RESULT_OK = "RESULT_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCANNER_ADDRESS_TAG = "SCANNER_ADDRESS_TAG";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SCANNER_AMOUNT_TAG = "SCANNER_AMOUNT_TAG";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SET_AUTH_OK = "AUTH_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SET_WALLET_ID_RESULT_OK = "SET_WALLET_ID_RESULT_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_WALLET_NAME_OK = "UPDATE_WALLET_NAME_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT_ADDRESS_OK = "SELECT_ADDRESS_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT_WALLET_OK = "SELECT_WALLET_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT_COIN_OK = "SELECT_COIN_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_MINER_FEE_EDIT_BEAN_OK = "UPDATE_MINER_FEE_EDIT_BEAN_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_RECEIPT_ADDRESS_OK = "UPDATE_RECEIPT_ADDRESS_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_RECEIPT_ADDRESS_UI_IN_THUNDER = "UPDATE_RECEIPT_ADDRESS_UI_IN_THUNDER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BACK_UP_IDENTIFY_FLOW_OK = "BACK_UP_IDENTIFY_FLOW_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECEIPT_ADDRESS_PRESS_TOOLBAR_BACK = "RECEIPT_ADDRESS_PRESS_TOOLBAR_BACK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT_THUNDER_ADDRESS_OK = "SELECT_THUNDER_ADDRESS_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT_THUNDER_WALLET_OK = "SELECT_THUNDER_WALLET_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TRANSFER_COIN_ACTION_OK = "TRANSFER_COIN_ACTION_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ASSET_FRAGMENT_FINISH = "ASSET_FRAGMENT_FINISH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_COIN_FRAGMENT_FINISH = "SEARCH_COIN_FRAGMENT_FINISH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMON_ADDRESS_FINISH = "COMMON_ADDRESS_FINISH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REVIEW_ADDRESS_FINISH = "REVIEW_ADDRESS_FINISH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_DETAIL_DIALOG_ON_CLICK_RECEIPT_ADDRESS_ITEM = "PAYMENT_DETAIL_DIALOG_ON_CLICK_RECEIPT_ADDRESS_ITEM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_DETAIL_DIALOG_ON_CLICK_PAY_ADDRESS_ITEM = "PAYMENT_DETAIL_DIALOG_ON_CLICK_PAY_ADDRESS_ITEM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_DETAIL_DIALOG_ON_CLICK_MINER_FEE_ITEM = "PAYMENT_DETAIL_DIALOG_ON_CLICK_MINER_FEE_ITEM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_DETAIL_DIALOG_ON_CLICK_NEXT_STEP = "PAYMENT_DETAIL_DIALOG_ON_CLICK_NEXT_STEP";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PAYMENT_DETAIL_DIALOG_DISMISS = "PAYMENT_DETAIL_DIALOG_DISMISS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PICK_WALLET_DIALOG_DISMISS = "PICK_WALLET_DIALOG_DISMISS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PICK_WALLET_DIALOG_DISMISS_RESHOW_PAYMENT_DETAIL_DIALOG = "PICK_WALLET_DIALOG_DISMISS_RESHOW_PAYMENT_DETAIL_DIALOG";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MINER_FEE_EDITOR_DIALOG_DISMISS = "MINER_FEE_EDITOR_DIALOG_DISMISS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGISTER_SEND_MINER_FEE_EDIT_BEAN = "REGISTER_SEND_MINER_FEE_EDIT_BEAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEND_MINER_FEE_EDIT_BEAN = "SEND_MINER_FEE_EDIT_BEAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PAYMENT_DETAIL_DIALOG_ADDRESS_OK = "UPDATE_PAYMENT_DETAIL_DIALOG_ADDRESS_OK";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PAYMENT_DETAIL_DIALOG_INPUT_COMMENT = "UPDATE_PAYMENT_DETAIL_DIALOG_INPUT_COMMENT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_THUNDER_RECORD_LIST = "UPDATE_THUNDER_RECORD_LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_CREATE_GROUP_MEMBER_LIST = "UPDATE_CREATE_GROUP_MEMBER_LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SECRET_CHAT_MODE_CHANGE = "SECRET_CHAT_MODE_CHANGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_USER_INFO = "UPDATE_USER_INFO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXIT_CHAT_ROOM = "EXIT_CHAT_ROOM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_CONTACT_LIST = "UPDATE_CONTACT_LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_CHAT_ROOM_LIST = "UPDATE_CHAT_ROOM_LIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEND_MESSAGE_REQUEST = "SEND_MESSAGE_REQUEST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEND_COIN_REQUEST = "SEND_COIN_REQUEST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPEN_CHAT_ROOM = "OPEN_CHAT_ROOM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOAD_CHAT_ROOM_HISTORY_WITH_SOCKET = "LOAD_CHAT_ROOM_HISTORY_WITH_SOCKET";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFY_CHAT_ROOM_UPDATE_WITH_SOCKET = "NOTIFY_CHAT_ROOM_UPDATE_WITH_SOCKET";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_ROCKET_CHAT_WITH_SOCKET = "LOGIN_ROCKET_CHAT_WITH_SOCKET";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SOCKET_FAILURE = "SOCKET_FAILURE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NOTIFY_CHAT_SECRET_MODE_UPDATE = "NOTIFY_CHAT_SECRET_MODE_UPDATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CT_WALLET_REFRESH = "CT_WALLET_REFRESH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CT_WALLET_QUERY_API = "CT_WALLET_QUERY_API";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RED_ENVELOPE_TRANSACTION_COMPLETE = "RED_ENVELOPE_TRANSACTION_COMPLETE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_ME_INFO = "UPDATE_ME_INFO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AGREE_PRIVACY_POLICY = "AGREE_PRIVACY_POLICY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FINISH_SELECT_BACKUP_METHOD_ACTIVITY = "FINISH_SELECT_BACKUP_METHOD_ACTIVITY";
    public static final com.ttchain.walletproject.rx.RxBusTag INSTANCE = null;
    
    private RxBusTag() {
        super();
    }
}