package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class TtnTransactionOutData : Serializable {

    /**
     * "out": [
     * {
     * "token":"btcn",
     * "balance":"1000",
     * "vout":0
     * }
     * ]
     */

    @SerializedName("token")
    var token = ""
    @SerializedName("balance")
    var balance = ""
    @SerializedName("vout")
    var vout = 0
}
