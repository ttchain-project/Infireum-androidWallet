package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UsdtTransactionRecordModel(
        @SerializedName("addr")
        var addr: String = "",
        @SerializedName("page")
        var page: String = "1"
) : Serializable