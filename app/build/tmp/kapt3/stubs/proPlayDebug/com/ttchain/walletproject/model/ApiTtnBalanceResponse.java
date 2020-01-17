package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/ttchain/walletproject/model/ApiTtnBalanceResponse;", "Ljava/io/Serializable;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "balance", "getBalance", "nonce", "", "getNonce", "()Ljava/lang/Double;", "setNonce", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "token", "Lcom/ttchain/walletproject/model/TtnBalanceData;", "getToken", "()Lcom/ttchain/walletproject/model/TtnBalanceData;", "transactions", "", "Lcom/ttchain/walletproject/model/TtnTransactionData;", "getTransactions", "()Ljava/util/List;", "setTransactions", "(Ljava/util/List;)V", "app_proPlayDebug"})
public final class ApiTtnBalanceResponse implements java.io.Serializable {
    
    /**
     * balance : 8430041199537820
     * code : 0
     * message : json
     * transactions:[]
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Address")
    private final java.lang.String address = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Nonce")
    private java.lang.Double nonce;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Balance")
    private final java.lang.String balance = "";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Token")
    private final com.ttchain.walletproject.model.TtnBalanceData token = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Transaction")
    private java.util.List<com.ttchain.walletproject.model.TtnTransactionData> transactions;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getNonce() {
        return null;
    }
    
    public final void setNonce(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBalance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.TtnBalanceData getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.TtnTransactionData> getTransactions() {
        return null;
    }
    
    public final void setTransactions(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TtnTransactionData> p0) {
    }
    
    public ApiTtnBalanceResponse() {
        super();
    }
}