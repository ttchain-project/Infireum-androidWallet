package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0006\"\u0004\b(\u0010\b\u00a8\u0006)"}, d2 = {"Lcom/ttchain/walletproject/model/TtnTransactionModel;", "Ljava/io/Serializable;", "()V", "PrivateKey", "", "getPrivateKey", "()Ljava/lang/String;", "setPrivateKey", "(Ljava/lang/String;)V", "address", "getAddress", "setAddress", "balance", "getBalance", "setBalance", "crypto", "getCrypto", "setCrypto", "fee", "getFee", "setFee", "input", "getInput", "setInput", "nonce", "", "getNonce", "()Ljava/lang/Integer;", "setNonce", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "out", "Ljava/util/ArrayList;", "Lcom/ttchain/walletproject/model/OutModel;", "getOut", "()Ljava/util/ArrayList;", "setOut", "(Ljava/util/ArrayList;)V", "type", "getType", "setType", "app_proPlayDebug"})
public final class TtnTransactionModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "fee")
    private java.lang.String fee;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "address")
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "balance")
    private java.lang.String balance;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nonce")
    private java.lang.Integer nonce;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "input")
    private java.lang.String input;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "PrivateKey")
    private java.lang.String PrivateKey;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "crypto")
    private java.lang.String crypto;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "out")
    private java.util.ArrayList<com.ttchain.walletproject.model.OutModel> out;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFee() {
        return null;
    }
    
    public final void setFee(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBalance() {
        return null;
    }
    
    public final void setBalance(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNonce() {
        return null;
    }
    
    public final void setNonce(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInput() {
        return null;
    }
    
    public final void setInput(@org.jetbrains.annotations.Nullable()
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
    public final java.lang.String getCrypto() {
        return null;
    }
    
    public final void setCrypto(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ttchain.walletproject.model.OutModel> getOut() {
        return null;
    }
    
    public final void setOut(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ttchain.walletproject.model.OutModel> p0) {
    }
    
    public TtnTransactionModel() {
        super();
    }
}