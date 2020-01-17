package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u0013\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00105\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\"\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR\u001a\u0010.\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u0004\u00a8\u0006:"}, d2 = {"Lcom/ttchain/walletproject/model/WalletBean;", "Ljava/io/Serializable;", "walletID", "", "(I)V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "bgDrawableId", "getBgDrawableId", "()I", "setBgDrawableId", "chainType", "getChainType", "setChainType", "enough", "", "getEnough", "()Z", "setEnough", "(Z)V", "isFromSystem", "setFromSystem", "isPicked", "setPicked", "name", "getName", "setName", "online", "getOnline", "setOnline", "pickedCoinAmount", "getPickedCoinAmount", "setPickedCoinAmount", "pickedCoinAmountDecimal", "Ljava/math/BigDecimal;", "getPickedCoinAmountDecimal", "()Ljava/math/BigDecimal;", "setPickedCoinAmountDecimal", "(Ljava/math/BigDecimal;)V", "pickedCoinName", "getPickedCoinName", "setPickedCoinName", "totalFiat", "getTotalFiat", "setTotalFiat", "getWalletID", "setWalletID", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
public final class WalletBean implements java.io.Serializable {
    private int chainType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String totalFiat;
    private int bgDrawableId;
    private boolean online;
    private boolean isPicked;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickedCoinName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pickedCoinAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal pickedCoinAmountDecimal;
    private boolean enough;
    private boolean isFromSystem;
    private int walletID;
    
    public final int getChainType() {
        return 0;
    }
    
    public final void setChainType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalFiat() {
        return null;
    }
    
    public final void setTotalFiat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getBgDrawableId() {
        return 0;
    }
    
    public final void setBgDrawableId(int p0) {
    }
    
    public final boolean getOnline() {
        return false;
    }
    
    public final void setOnline(boolean p0) {
    }
    
    public final boolean isPicked() {
        return false;
    }
    
    public final void setPicked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickedCoinName() {
        return null;
    }
    
    public final void setPickedCoinName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPickedCoinAmount() {
        return null;
    }
    
    public final void setPickedCoinAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getPickedCoinAmountDecimal() {
        return null;
    }
    
    public final void setPickedCoinAmountDecimal(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final boolean getEnough() {
        return false;
    }
    
    public final void setEnough(boolean p0) {
    }
    
    public final boolean isFromSystem() {
        return false;
    }
    
    public final void setFromSystem(boolean p0) {
    }
    
    public final int getWalletID() {
        return 0;
    }
    
    public final void setWalletID(int p0) {
    }
    
    public WalletBean(int walletID) {
        super();
    }
    
    public WalletBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.WalletBean copy(int walletID) {
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