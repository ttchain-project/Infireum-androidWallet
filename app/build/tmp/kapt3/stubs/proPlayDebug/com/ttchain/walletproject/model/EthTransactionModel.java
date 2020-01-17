package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/model/EthTransactionModel;", "Ljava/io/Serializable;", "()V", "contractAddress", "", "getContractAddress", "()Ljava/lang/String;", "setContractAddress", "(Ljava/lang/String;)V", "encry", "", "getEncry", "()Ljava/lang/Boolean;", "setEncry", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "privateKey", "getPrivateKey", "setPrivateKey", "token", "getToken", "setToken", "app_proPlayDebug"})
public final class EthTransactionModel implements java.io.Serializable {
    
    /**
     * token : eth
     * privateKey : ffea96f4c8910006bdb25eb908b00b4f647b4e3f9ee9571c1f89121e9180f585
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "token")
    private java.lang.String token;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privateKey")
    private java.lang.String privateKey;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "contractAddress")
    private java.lang.String contractAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "encry")
    private java.lang.Boolean encry;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrivateKey() {
        return null;
    }
    
    public final void setPrivateKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContractAddress() {
        return null;
    }
    
    public final void setContractAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEncry() {
        return null;
    }
    
    public final void setEncry(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public EthTransactionModel() {
        super();
    }
}