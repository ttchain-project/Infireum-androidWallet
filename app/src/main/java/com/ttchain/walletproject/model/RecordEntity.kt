package com.ttchain.walletproject.model

import androidx.annotation.IntDef

class RecordEntity(
    val data: RecordBean, @RecordType type: Int = NORMAL,
    spanSize: Int = NORMAL_SPAN_SIZE
) : BaseEntity() {
    init {
        itemType = type
        itemSpanSize = spanSize
    }

    companion object {
        @IntDef(NORMAL, THUNDER)
        @Retention(AnnotationRetention.SOURCE)
        annotation class RecordType

        const val NORMAL = 0x01
        const val THUNDER = 0x02

        const val NORMAL_SPAN_SIZE = 1
    }
}