package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class TransactionDataEth : Serializable {
    @SerializedName("blockNumber")
    val blockNumber: String? = null
    @SerializedName("timeStamp")
    var timeStamp: String? = null
    @SerializedName("hash")
    val hash: String? = null
    @SerializedName("nonce")
    val nonce: String? = null
    @SerializedName("blockHash")
    val blockHash: String? = null
    @SerializedName("transactionIndex")
    val transactionIndex: String? = null
    @SerializedName("from")
    val from: String? = null
    @SerializedName("to")
    val to: String? = null
    @SerializedName("value")
    val value: String? = null
    @SerializedName("gas")
    val gas: String? = null
    @SerializedName("gasPrice")
    val gasPrice: String? = null
    @SerializedName("isError")
    val isError: String? = null
    @SerializedName("txreceipt_status")
    val txreceipt_status: String? = null
    @SerializedName("input")
    val input: String? = null
    @SerializedName("contractAddress")
    val contractAddress: String? = null
    @SerializedName("cumulativeGasUsed")
    val cumulativeGasUsed: String? = null
    @SerializedName("gasUsed")
    val gasUsed: String? = null
    @SerializedName("confirmations")
    val confirmations: String? = null
    @SerializedName("tokenName")
    val tokenName: String? = null
    @SerializedName("tokenSymbol")
    val tokenSymbol: String? = null
    @SerializedName("tokenDecimal")
    val tokenDecimal: String? = null
}
