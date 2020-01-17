package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0006R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0006R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0006\u00a8\u0006&"}, d2 = {"Lcom/ttchain/walletproject/model/TtnTransactionData;", "Ljava/io/Serializable;", "()V", "balance", "", "getBalance", "()Ljava/lang/String;", "blockHash", "getBlockHash", "fee", "getFee", "from", "getFrom", "input", "getInput", "nonce", "getNonce", "out", "Ljava/util/ArrayList;", "Lcom/ttchain/walletproject/model/TtnTransactionOutData;", "getOut", "()Ljava/util/ArrayList;", "setOut", "(Ljava/util/ArrayList;)V", "publicKey", "getPublicKey", "sign", "getSign", "timestamp", "", "getTimestamp", "()D", "to", "getTo", "tx", "getTx", "type", "getType", "app_proPlayDebug"})
public final class TtnTransactionData implements java.io.Serializable {
    
    /**
     * Transaction:[
     * {
     * "blockHash": "35b1c92c1e6f23cfc2a413b1a4c6fd9533fef76c54c39b0c99ee68ed2d9283ef",
     * "tx": "035d4386a88eeb3eac4ddad5f6125a840a8db04e5bf400dcc6d63cbea9e7baa8",
     * "version": "sDAGraph",
     * "from": "c12a90a88b2fd5862f8496f98bbdd7cbcb3dfe73",
     * "to": "217b30f8540aa96fbe9ce319f057e9d46fb1880c",
     * "balance": "10000",
     * "out": null,
     * "nonce": 0,
     * "fee": "0",
     * "type": "ttn",
     * "input": "",
     * "sign": "32313738333232353033383635303035303039323336303135303438303631353839333738343838373533313339323332383436343438343536373834313535323039373331313134383232783437343634323739313539373338353537393430373230313739313830393137343836393432323339373631333337393434323838303431323434303637303933373539303333393033383135",
     * "crypto": "cic",
     * "publicKey": "04125d3ea3de826f81690b06472fd555e068459e375bab482486a420181c32315b7fc1b807213267f6ea82538310e4d317544ffaab8350e84ad5a0a61a6a2007fa",
     * "protocol": null,
     * "timeLock": {
     * "type": "",
     * "amount": "",
     * "time": "1970-01-01T08:00:00+08:00",
     * "endTime": "1970-01-01T08:00:00+08:00",
     * "unlockAmount": "0",
     * "intervalTime": 0
     * },
     * "timestamp": 1555912684
     * }]
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nonce")
    private final java.lang.String nonce = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "publicKey")
    private final java.lang.String publicKey = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fee")
    private final java.lang.String fee = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "type")
    private final java.lang.String type = null;
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    private final double timestamp = 0.0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "input")
    private final java.lang.String input = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "from")
    private final java.lang.String from = "";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sign")
    private final java.lang.String sign = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "out")
    private java.util.ArrayList<com.ttchain.walletproject.model.TtnTransactionOutData> out;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "to")
    private final java.lang.String to = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tx")
    private final java.lang.String tx = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "balance")
    private final java.lang.String balance = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "blockHash")
    private final java.lang.String blockHash = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNonce() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublicKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFee() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final double getTimestamp() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSign() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ttchain.walletproject.model.TtnTransactionOutData> getOut() {
        return null;
    }
    
    public final void setOut(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ttchain.walletproject.model.TtnTransactionOutData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTx() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockHash() {
        return null;
    }
    
    public TtnTransactionData() {
        super();
    }
}