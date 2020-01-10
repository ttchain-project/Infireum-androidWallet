package com.ttchain.walletproject.database

import android.provider.BaseColumns

interface DbConstants : BaseColumns {
    companion object {
        // db start version is 11

        // Define database file name
        const val WALLET_DB_NAME = "wallet_db"

        // Database's table names
        const val TABLE_IDENTITY = "table_identity"
        const val TABLE_WALLET = "table_wallet"
        const val TABLE_COIN = "table_coin"
        const val TALE_COIN_SELECTION = "table_coin_selection"
        const val TABLE_ASSET = "table_asset"
        const val TABLE_ADDRESS = "table_address"
        const val TABLE_FIAT = "table_fiat"
        const val TABLE_LANGUAGE = "table_language"
        const val TABLE_COIN_TO_COIN_RATE = "table_coin_to_coin_rate"
        const val TABLE_COIN_TO_FIAT_RATE = "table_coin_to_fiat_rate"
        const val TABLE_FIAT_TO_FIAT_RATE = "table_fiat_to_fiat_rate"
        const val TABLE_TRANS_RECORD = "table_trans_record"
        const val TABLE_LIGHTNING_TRANS_RECORD = "table_lightning_trans_record"
        const val TABLE_USDT_TRANS_RECORD = "table_usdt_trans_record"
        const val TABLE_CHAT_ROOM = "table_chat_room"
        const val TABLE_CHAT_MSG = "table_chat_msg"
        const val TABLE_CHAT_COMMUNICATION = "table_chat_communication"
        const val TABLE_CHAT_GROUP = "table_chat_group"

        // table_identity
        const val _ID = "_id"
        const val IDENTITY_ID = "identity_id"
        const val NAME = "name"
        const val FK_PREF_LANG_ID = "fk_pref_lang_id"
        const val FK_PREF_FIAT_ID = "fk_pref_fiat_id"
        const val PWD = "pwd"
        const val PWD_HINT = "pwd_hint"

        // table_wallet
        const val EP_KEY = "ep_key"
        const val WALLET_TYPE = "wallet_type"
        const val MNEMONIC = "mnemonic"
        const val ADDRESS = "address"
        const val IS_FROM_SYSTEM = "is_from_system"

        // table_coin
        const val COIN_ID = "coin_id"
        const val CONTRACT = "contract"
        const val FULL_NAME = "full_name"
        const val ICON = "icon"
        const val DIGIT = "digit"
        const val ICON_PATH = "icon_path"
        const val IS_DEFAULT = "is_default"
        const val IS_DEFAULT_SELECTED = "is_default_selected"
        const val IS_ACTIVE = "is_active"

        // table_coin_selection
        const val FK_WALLET_ID = "fk_wallet_id"
        const val FK_COIN_ID = "fk_coin_id"
        const val IS_SELECTED = "is_selected"

        // table_asset
        const val AMOUNT = "amount"

        // table_address
        const val FK_IDENTITY_ID = "fk_identity_id"
        const val NOTE = "note"

        // table_fiat
        const val FIAT_ID = "fiat_id"
        const val SYMBOL = "symbol"

        // table_language
        const val LANGUAGE_ID = "language_id"

        // table_coin_rate
        const val FK_FROM_COIN_ID = "fk_from_coin_id"
        const val FK_TO_COIN_ID = "fk_to_coin_id"
        const val RATE = "rate"
        const val SYNC_DATE = "sync_date"

        // table_coin_to_fiat_rate
        const val FK_TO_FIAT_ID = "fk_to_fiat_id"

        // table_fiat_to_fiat_rate
        const val FK_FROM_FIAT_ID = "fk_from_fiat_id"

        // table_trans_record
        const val TX_ID = "tx_id"
        const val STATUS = "status"
        const val FROM_AMOUNT = "from_amount"
        const val FROM_ADDRESS = "from_address"
        const val TO_AMOUNT = "to_amount"
        const val TO_ADDRESS = "to_address"
        const val FK_FEE_COIN_ID = "fk_fee_coin_id"
        const val FEE_AMT = "fee_Amt"
        const val FEE_RATE = "fee_rate"
        const val TOTAL_FEE = "total_fee"
        const val DATE = "date"
        const val BLOCK = "block"

        const val UUID = "uuid"

        // db version 12 added
        const val MAIN_COIN_ID = "main_coin_id"
        const val CHAIN_TYPE = "chain_type"
        const val CHAIN_NAME = "chain_name"
        const val DISPLAY_NAME = "display_name"

        // table_chat_room
        const val ROOM_ID = "room_id"
        const val ROOM_NAME = "room_name"
        const val ROOM_IMG_URL = "room_img_url"
        const val ROOM_TYPE = "room_type"
        const val ROOM_RECEIVE_UID = "room_receive_uid"

        // table_chat_msg
        const val MSG_ID = "msg_id"
        const val FK_ROOM_ID = "fk_room_id"
        const val MSG = "msg"
        const val MSG_TYPE = "msg_type"
        const val MSG_TIME = "msg_time"
        const val MSG_USER_ID = "msg_user_id"
        const val MSG_USER_USER_NAME = "msg_user_user_name"
        const val MSG_USER_NAME = "msg_user_name"

        // table_chat_communication
        const val COMM_DISPLAY_NAME = "comm_display_name"
        const val COMM_LAST_MSG = "comm_last_msg"
        const val COMM_ROOM_ID = "comm_room_id"
        const val COMM_UPDATE_TS = "comm_update_ts"
        const val COMM_IMG_URL = "comm_img_url"
        const val COMM_ROOM_TYPE = "comm_room_type"
        const val COMM_LAST_MSG_ID = "comm_last_msg_id"
        const val COMM_PRIVATE_MESSAGE_TARGET_UID = "comm_private_message_target_uid"

        // table_chat_group
        const val GROUP_ROOM_ID = "group_room_id"
        const val GROUP_GROUP_ID = "group_group_id"
        const val GROUP_MEMBERS = "group_members"
        const val GROUP_IS_PRIVATE = "group_is_private"
        const val GROUP_OWNER_UID = "group_owner_uid"
    }
}