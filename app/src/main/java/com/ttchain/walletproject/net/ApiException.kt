package com.ttchain.walletproject.net

import com.google.gson.annotations.SerializedName


class ApiException : Exception {

    @SerializedName("status")
    var status: String = ""

    constructor(msg: String) : super(msg)

    constructor(msg: String, status: String) : super(msg) {
        this.status = status
    }
}
