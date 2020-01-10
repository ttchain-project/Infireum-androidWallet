package com.ttchain.walletproject.model

import androidx.annotation.IntDef

class AddressEntity(@AddressType type: Int, val data: AddressBean) : BaseEntity() {

    init {
        itemType = type
        itemSpanSize = getSpanSize(type)
    }

    private fun getSpanSize(type: Int): Int {
        return when (type) {
            NORMAL -> NORMAL_SPAN_SIZE
            else -> NORMAL_SPAN_SIZE
        }
    }

    companion object {

        const val NORMAL = 0x01

        const val NORMAL_SPAN_SIZE = 1

        @IntDef(NORMAL)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        annotation class AddressType
    }
}
