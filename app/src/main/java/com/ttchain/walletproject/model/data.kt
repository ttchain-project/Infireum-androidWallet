package com.ttchain.walletproject.model

/**
 * 取得所有虛擬貨幣的指定法幣行情 data class
 */
data class DecimalData(
    val coinName: String,
    val identifier: String,
    val rate: Double
)