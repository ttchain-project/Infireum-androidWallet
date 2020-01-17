package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * 取得 BTC 轉帳建議鍊費 (regular/priority) data class
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBTCFeeData;", "", "regular", "", "priority", "(DD)V", "getPriority", "()D", "getRegular", "setRegular", "(D)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_proPlayDebug"})
public final class ApiBTCFeeData {
    @com.google.gson.annotations.SerializedName(value = "regular")
    private double regular;
    @com.google.gson.annotations.SerializedName(value = "priority")
    private final double priority = 0.0;
    
    public final double getRegular() {
        return 0.0;
    }
    
    public final void setRegular(double p0) {
    }
    
    public final double getPriority() {
        return 0.0;
    }
    
    public ApiBTCFeeData(double regular, double priority) {
        super();
    }
    
    public ApiBTCFeeData() {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority) data class
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.ApiBTCFeeData copy(double regular, double priority) {
        return null;
    }
    
    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority) data class
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority) data class
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority) data class
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}