package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class OutModel : Serializable {
    @SerializedName("token")
    var token: String? = null
    @SerializedName("balance")
    var balance: String? = null
}
