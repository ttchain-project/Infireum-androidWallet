package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b,\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0006R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0006R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0006R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0006R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0006R\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0006R\u0018\u0010.\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0006\u00a8\u00060"}, d2 = {"Lcom/ttchain/walletproject/model/TransactionDataEth;", "Ljava/io/Serializable;", "()V", "blockHash", "", "getBlockHash", "()Ljava/lang/String;", "blockNumber", "getBlockNumber", "confirmations", "getConfirmations", "contractAddress", "getContractAddress", "cumulativeGasUsed", "getCumulativeGasUsed", "from", "getFrom", "gas", "getGas", "gasPrice", "getGasPrice", "gasUsed", "getGasUsed", "hash", "getHash", "input", "getInput", "isError", "nonce", "getNonce", "timeStamp", "getTimeStamp", "setTimeStamp", "(Ljava/lang/String;)V", "to", "getTo", "tokenDecimal", "getTokenDecimal", "tokenName", "getTokenName", "tokenSymbol", "getTokenSymbol", "transactionIndex", "getTransactionIndex", "txreceipt_status", "getTxreceipt_status", "value", "getValue", "app_proPlayDebug"})
public final class TransactionDataEth implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "blockNumber")
    private final java.lang.String blockNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "timeStamp")
    private java.lang.String timeStamp;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "hash")
    private final java.lang.String hash = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nonce")
    private final java.lang.String nonce = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "blockHash")
    private final java.lang.String blockHash = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "transactionIndex")
    private final java.lang.String transactionIndex = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "from")
    private final java.lang.String from = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "to")
    private final java.lang.String to = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "value")
    private final java.lang.String value = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gas")
    private final java.lang.String gas = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gasPrice")
    private final java.lang.String gasPrice = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isError")
    private final java.lang.String isError = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "txreceipt_status")
    private final java.lang.String txreceipt_status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "input")
    private final java.lang.String input = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "contractAddress")
    private final java.lang.String contractAddress = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cumulativeGasUsed")
    private final java.lang.String cumulativeGasUsed = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gasUsed")
    private final java.lang.String gasUsed = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "confirmations")
    private final java.lang.String confirmations = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tokenName")
    private final java.lang.String tokenName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tokenSymbol")
    private final java.lang.String tokenSymbol = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tokenDecimal")
    private final java.lang.String tokenDecimal = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTimeStamp() {
        return null;
    }
    
    public final void setTimeStamp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHash() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNonce() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlockHash() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTransactionIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGas() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGasPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String isError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTxreceipt_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInput() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContractAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCumulativeGasUsed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGasUsed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConfirmations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenDecimal() {
        return null;
    }
    
    public TransactionDataEth() {
        super();
    }
}