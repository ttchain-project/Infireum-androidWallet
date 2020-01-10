package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class ApiWalletData : Serializable {
    @SerializedName("privateKey")
    var privateKey: String = ""
    @SerializedName("address")
    var address: String = ""
    @SerializedName("UncompressAddress")
    var uncompressAddress: String = ""
}
