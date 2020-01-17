package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * 取得 ETH 轉帳建議鍊費 data class
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/ttchain/walletproject/model/ApiETHFeeData;", "", "suggestGasPrice", "", "minGasPrice", "maxGasPrice", "(DDD)V", "getMaxGasPrice", "()D", "getMinGasPrice", "getSuggestGasPrice", "setSuggestGasPrice", "(D)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_proPlayDebug"})
public final class ApiETHFeeData {
    @com.google.gson.annotations.SerializedName(value = "suggestGasPrice")
    private double suggestGasPrice;
    @com.google.gson.annotations.SerializedName(value = "minGasPrice")
    private final double minGasPrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "maxGasPrice")
    private final double maxGasPrice = 0.0;
    
    public final double getSuggestGasPrice() {
        return 0.0;
    }
    
    public final void setSuggestGasPrice(double p0) {
    }
    
    public final double getMinGasPrice() {
        return 0.0;
    }
    
    public final double getMaxGasPrice() {
        return 0.0;
    }
    
    public ApiETHFeeData(double suggestGasPrice, double minGasPrice, double maxGasPrice) {
        super();
    }
    
    public ApiETHFeeData() {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    /**
     * 取得 ETH 轉帳建議鍊費 data class
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.ApiETHFeeData copy(double suggestGasPrice, double minGasPrice, double maxGasPrice) {
        return null;
    }
    
    /**
     * 取得 ETH 轉帳建議鍊費 data class
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * 取得 ETH 轉帳建議鍊費 data class
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 取得 ETH 轉帳建議鍊費 data class
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}