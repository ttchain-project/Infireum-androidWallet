package com.ttchain.walletproject.model


interface ApiHelper {
    val auth: String

    val lang: String

    val nationId: String

    val ethMinerFeeFromApi: String

    val btcMinerFeeFromApi: String

    fun saveEthMinerFeeFromApi(string: String)

    fun saveBtcMinerFeeFromApi(string: String)
}
