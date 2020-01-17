package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionData;", "Ljava/io/Serializable;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "amount", "", "getAmount", "()D", "setAmount", "(D)V", "confirmations", "", "getConfirmations", "()I", "setConfirmations", "(I)V", "height", "getHeight", "setHeight", "satoshis", "getSatoshis", "setSatoshis", "scriptPubKey", "getScriptPubKey", "setScriptPubKey", "txid", "getTxid", "setTxid", "vout", "getVout", "setVout", "app_proPlayDebug"})
public final class ApiBtcTransactionData implements java.io.Serializable {
    
    /**
     * address : 3D2oetdNuZUqQHPJmcMDDHYoqkyNVsFk9r
     * txid : 005400e8b2c81a3e774ed4c2143e6dd57253a797e4101e0f485f9850f139bd3c
     * vout : 0
     * scriptPubKey : a9147c6775e20e3e938d2d7e9d79ac310108ba501ddb87
     * amount : 1.0E-4
     * satoshis : 10000
     * height : 452440
     * confirmations : 81298
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address")
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "txid")
    private java.lang.String txid;
    @com.google.gson.annotations.SerializedName(value = "vout")
    private double vout;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "scriptPubKey")
    private java.lang.String scriptPubKey;
    @com.google.gson.annotations.SerializedName(value = "amount")
    private double amount;
    @com.google.gson.annotations.SerializedName(value = "satoshis")
    private double satoshis;
    @com.google.gson.annotations.SerializedName(value = "height")
    private int height;
    @com.google.gson.annotations.SerializedName(value = "confirmations")
    private int confirmations;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTxid() {
        return null;
    }
    
    public final void setTxid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getVout() {
        return 0.0;
    }
    
    public final void setVout(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScriptPubKey() {
        return null;
    }
    
    public final void setScriptPubKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    public final void setAmount(double p0) {
    }
    
    public final double getSatoshis() {
        return 0.0;
    }
    
    public final void setSatoshis(double p0) {
    }
    
    public final int getHeight() {
        return 0;
    }
    
    public final void setHeight(int p0) {
    }
    
    public final int getConfirmations() {
        return 0;
    }
    
    public final void setConfirmations(int p0) {
    }
    
    public ApiBtcTransactionData() {
        super();
    }
}