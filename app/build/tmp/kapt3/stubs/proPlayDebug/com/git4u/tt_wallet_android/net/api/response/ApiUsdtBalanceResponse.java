package com.git4u.tt_wallet_android.net.api.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/git4u/tt_wallet_android/net/api/response/ApiUsdtBalanceResponse;", "Ljava/io/Serializable;", "()V", "balances", "", "Lcom/git4u/tt_wallet_android/net/api/response/ApiUsdtBalanceResponse$ItemsBean;", "getBalances", "()Ljava/util/List;", "ItemsBean", "app_proPlayDebug"})
public final class ApiUsdtBalanceResponse implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "balance")
    private final java.util.List<com.git4u.tt_wallet_android.net.api.response.ApiUsdtBalanceResponse.ItemsBean> balances = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.git4u.tt_wallet_android.net.api.response.ApiUsdtBalanceResponse.ItemsBean> getBalances() {
        return null;
    }
    
    public ApiUsdtBalanceResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/git4u/tt_wallet_android/net/api/response/ApiUsdtBalanceResponse$ItemsBean;", "Ljava/io/Serializable;", "()V", "symbol", "", "getSymbol", "()Ljava/lang/String;", "value", "getValue", "app_proPlayDebug"})
    public static final class ItemsBean implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "symbol")
        private final java.lang.String symbol = "";
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "value")
        private final java.lang.String value = "";
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSymbol() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue() {
            return null;
        }
        
        public ItemsBean() {
            super();
        }
    }
}