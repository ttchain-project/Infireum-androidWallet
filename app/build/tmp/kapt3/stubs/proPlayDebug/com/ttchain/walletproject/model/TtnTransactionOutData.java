package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/ttchain/walletproject/model/TtnTransactionOutData;", "Ljava/io/Serializable;", "()V", "balance", "", "getBalance", "()Ljava/lang/String;", "setBalance", "(Ljava/lang/String;)V", "token", "getToken", "setToken", "vout", "", "getVout", "()I", "setVout", "(I)V", "app_proPlayDebug"})
public final class TtnTransactionOutData implements java.io.Serializable {
    
    /**
     * "out": [
     * {
     * "token":"btcn",
     * "balance":"1000",
     * "vout":0
     * }
     * ]
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "token")
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "balance")
    private java.lang.String balance;
    @com.google.gson.annotations.SerializedName(value = "vout")
    private int vout;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBalance() {
        return null;
    }
    
    public final void setBalance(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getVout() {
        return 0;
    }
    
    public final void setVout(int p0) {
    }
    
    public TtnTransactionOutData() {
        super();
    }
}