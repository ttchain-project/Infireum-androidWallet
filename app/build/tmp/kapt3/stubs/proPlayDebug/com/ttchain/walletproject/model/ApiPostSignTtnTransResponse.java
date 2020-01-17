package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/ttchain/walletproject/model/ApiPostSignTtnTransResponse;", "Ljava/io/Serializable;", "()V", "messgae", "", "getMessgae", "()Ljava/lang/String;", "setMessgae", "(Ljava/lang/String;)V", "method", "getMethod", "setMethod", "result", "Lcom/ttchain/walletproject/model/SignTtnTransResultData;", "getResult", "()Lcom/ttchain/walletproject/model/SignTtnTransResultData;", "setResult", "(Lcom/ttchain/walletproject/model/SignTtnTransResultData;)V", "txid", "getTxid", "setTxid", "app_proPlayDebug"})
public final class ApiPostSignTtnTransResponse implements java.io.Serializable {
    
    /**
     * method : sendTransaction
     * result :
     * txid :
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "method")
    private java.lang.String method;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "result")
    private com.ttchain.walletproject.model.SignTtnTransResultData result;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String messgae;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "txid")
    private java.lang.String txid;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMethod() {
        return null;
    }
    
    public final void setMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.SignTtnTransResultData getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.SignTtnTransResultData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessgae() {
        return null;
    }
    
    public final void setMessgae(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTxid() {
        return null;
    }
    
    public final void setTxid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ApiPostSignTtnTransResponse() {
        super();
    }
}