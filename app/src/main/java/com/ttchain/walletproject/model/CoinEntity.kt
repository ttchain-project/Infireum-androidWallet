package com.ttchain.walletproject.model

import androidx.annotation.IntDef
import com.chad.library.adapter.base.entity.MultiItemEntity

class CoinEntity(@CoinType type: Int, val data: CoinBean) : BaseEntity(), MultiItemEntity {


    init {
        itemType = type
        itemSpanSize = getSpanSize(type)
    }

    private fun getSpanSize(type: Int): Int {
        return when (type) {
            NORMAL, PICK, ASSET -> NORMAL_SPAN_SIZE
            else -> NORMAL_SPAN_SIZE
        }
    }

    companion object {

        const val NORMAL = 0x01
        const val PICK = 0x02
        const val ASSET = 0x03
        const val DELETE = 0x04
        const val SEARCH = 0x05

        const val NORMAL_SPAN_SIZE = 1

        @IntDef(NORMAL, PICK, ASSET, DELETE, SEARCH)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        annotation class CoinType
    }
}
