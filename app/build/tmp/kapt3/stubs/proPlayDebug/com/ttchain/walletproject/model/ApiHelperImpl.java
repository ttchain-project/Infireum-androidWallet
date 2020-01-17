package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/model/ApiHelperImpl;", "Lcom/ttchain/walletproject/model/ApiHelper;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "auth", "", "getAuth", "()Ljava/lang/String;", "btcMinerFeeFromApi", "getBtcMinerFeeFromApi", "ethMinerFeeFromApi", "getEthMinerFeeFromApi", "lang", "getLang", "nationId", "getNationId", "saveBtcMinerFeeFromApi", "", "string", "saveEthMinerFeeFromApi", "Companion", "app_proPlayDebug"})
public final class ApiHelperImpl implements com.ttchain.walletproject.model.ApiHelper {
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DATA_PREFS = "api_data_prefs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MINER_FEE_ETH = "MINER_FEE_ETH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MINER_FEE_BTC = "MINER_FEE_BTC";
    public static final com.ttchain.walletproject.model.ApiHelperImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getEthMinerFeeFromApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getBtcMinerFeeFromApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLang() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getNationId() {
        return null;
    }
    
    @java.lang.Override()
    public void saveEthMinerFeeFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @java.lang.Override()
    public void saveBtcMinerFeeFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    public ApiHelperImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ttchain/walletproject/model/ApiHelperImpl$Companion;", "", "()V", "API_DATA_PREFS", "", "MINER_FEE_BTC", "MINER_FEE_ETH", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}