package com.ttchain.walletproject.model

/**
 * 取得所有虛擬貨幣的指定法幣行情 data class
 */
data class DecimalData(
    val coinName: String,
    val identifier: String,
    val rate: Double
)

data class ExplorerDappBean(
    var name: String,
    var url: String = "",
    var icon: String = ""
)

data class ExplorerBean(
    var title: String = "",
    var content: String = "",
    var url: String = "",
    var img: String = "",

    var price: String = "",
    var change: String = ""
)