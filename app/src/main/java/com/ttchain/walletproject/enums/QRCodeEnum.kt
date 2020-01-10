package com.ttchain.walletproject.enums

import java.io.Serializable

enum class QRCodeEnum(val type: String) : Serializable {
    TYPE_IMPORT("TYPE_IMPORT"),
    TYPE_PERSONAL("TYPE_PERSONAL"),
    TYPE_WALLET("TYPE_WALLET");

    companion object {
        fun map(type: String): QRCodeEnum {
            return values().find {
                it.type == type
            } ?: TYPE_IMPORT
        }
    }
}