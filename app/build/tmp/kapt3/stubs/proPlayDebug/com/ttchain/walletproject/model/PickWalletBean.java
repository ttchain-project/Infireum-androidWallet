package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\u0004\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/model/PickWalletBean;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "coinId", "", "getCoinId", "()Ljava/lang/String;", "setCoinId", "(Ljava/lang/String;)V", "requestShowFromPaymentDetailDialog", "", "getRequestShowFromPaymentDetailDialog", "()Z", "setRequestShowFromPaymentDetailDialog", "(Z)V", "transCoinAmount", "Ljava/math/BigDecimal;", "getTransCoinAmount", "()Ljava/math/BigDecimal;", "setTransCoinAmount", "(Ljava/math/BigDecimal;)V", "wallet_Id", "getWallet_Id", "setWallet_Id", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
public final class PickWalletBean implements java.io.Serializable {
    private int wallet_Id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String coinId;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transCoinAmount;
    private boolean requestShowFromPaymentDetailDialog;
    private int _id;
    
    public final int getWallet_Id() {
        return 0;
    }
    
    public final void setWallet_Id(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinId() {
        return null;
    }
    
    public final void setCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransCoinAmount() {
        return null;
    }
    
    public final void setTransCoinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final boolean getRequestShowFromPaymentDetailDialog() {
        return false;
    }
    
    public final void setRequestShowFromPaymentDetailDialog(boolean p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public PickWalletBean(int _id) {
        super();
    }
    
    public PickWalletBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.PickWalletBean copy(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}