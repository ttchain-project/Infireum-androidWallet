package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/ttchain/walletproject/model/ApiHelper;", "", "auth", "", "getAuth", "()Ljava/lang/String;", "btcMinerFeeFromApi", "getBtcMinerFeeFromApi", "ethMinerFeeFromApi", "getEthMinerFeeFromApi", "lang", "getLang", "nationId", "getNationId", "saveBtcMinerFeeFromApi", "", "string", "saveEthMinerFeeFromApi", "app_proPlayDebug"})
public abstract interface ApiHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getAuth();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLang();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getNationId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEthMinerFeeFromApi();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getBtcMinerFeeFromApi();
    
    public abstract void saveEthMinerFeeFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String string);
    
    public abstract void saveBtcMinerFeeFromApi(@org.jetbrains.annotations.NotNull()
    java.lang.String string);
}