package com.ttchain.walletproject.enums

enum class ManageBeanIdType(val type: Int) {
    DEFAULT(-1),
    HIDE_ZERO_ASSET(0),
    AMOUNT(1),
    NAME(2),
    REMOVE(3),
}