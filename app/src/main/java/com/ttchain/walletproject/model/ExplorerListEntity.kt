package com.ttchain.walletproject.model

import androidx.annotation.IntDef

class ExplorerListEntity : BaseEntity {

    var data: ExplorerBean? = null
    var list: List<ExplorerBean>? = null

    init {
        itemType = NORMAL
    }

    constructor(@AddressType type: Int, data: ExplorerBean) : super() {
        this.itemType = type
        this.data = data
    }

    constructor(@AddressType type: Int, list: List<ExplorerBean>) : super() {
        this.itemType = type
        this.list = list
    }

    companion object {

        const val NORMAL = 0x01
        const val BANNER = 0x02

        @IntDef(NORMAL, BANNER)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        annotation class AddressType

    }
}
