package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

/**
 * 取得所有虛擬貨幣的指定法幣行情 data class
 */
data class DecimalData(
    val coinName: String,
    val identifier: String,
    val rate: Double
)

/**
 * SignETHOrSignETHContract data class
 */
data class SignETHBodyRequest(
    @SerializedName("contractAddress")
    var contractAddress: String? = null,
    @SerializedName("encry")
    var encry: Boolean = false,
    @SerializedName("privateKey")
    var privateKey: String = "",
    @SerializedName("token")
    var token: String = ""
)

/**
 * SignBTCOrSignBTCRelay data class
 */
data class SignBTCBodyData(
    @SerializedName("compressed")
    var compressed: Boolean = false,
    @SerializedName("tx")
    var tx: List<TxData>? = null,
    @SerializedName("unspend")
    var unspend: List<UnspendData>? = null,
    @SerializedName("privatekey")
    var privatekey: String = "",
    @SerializedName("token")
    var token: String = "",
    @SerializedName("encry")
    var encry: Boolean = false,
    @SerializedName("cicAddress")
    var cicAddress: String = ""
)

data class TxData(
    @SerializedName("address")
    var address: String = "",
    @SerializedName("value")
    var value: Double = 0.toDouble()
)

data class UnspendData(
    @SerializedName("txid")
    var txid: String = "",
    @SerializedName("value")
    var value: Double = 0.toDouble()

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