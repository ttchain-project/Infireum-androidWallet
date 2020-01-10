package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.util.ArrayList

/**
type TransactionJson struct {
BlockHash string           `json:"blockHash"`
Tx        string           `json:"tx"`
Version   string           `json:"version"`
From      string           `json:"from"`
To        string           `json:"to"`
Balance   string           `json:"balance"`
Out       []TransactionOut `json:"out"`
Nonce     int              `json:"nonce"`
Fee       string           `json:"fee"`
Type      string           `json:"type"`
Input     string           `json:"input"`
Sign      string           `json:"sign"`
Crypto    string           `json:"crypto"`
PublicKey string           `json:"publicKey"`
Protocol  interface{}      `json:"protocol"`
TimeLock  TimeLock         `json:"timeLock"`
Timestamp int64            `json:"timestamp"`
Gas       string           `json:"gas"`
}
 */

class SignTtnTransResultData : Serializable {
    @SerializedName("blockHash")
    var blockHash: String? = null
    @SerializedName("tx")
    var tx: String? = null
    @SerializedName("version")
    var version: String? = null
    @SerializedName("from")
    var from: String? = null
    @SerializedName("to")
    var to: String? = null
    @SerializedName("balance")
    var balance: String? = null
    @SerializedName("out")
    var out: ArrayList<TtnTransactionOutData>? = null
    @SerializedName("nonce")
    var nonce: Int? = null
    @SerializedName("fee")
    var fee: String? = null
    @SerializedName("type")
    var type: String? = null
    @SerializedName("input")
    var input: String? = null
    @SerializedName("sign")
    var sign: String? = null
    @SerializedName("crypto")
    var crypto: String? = null
    @SerializedName("publicKey")
    var publicKey: String? = null
}
