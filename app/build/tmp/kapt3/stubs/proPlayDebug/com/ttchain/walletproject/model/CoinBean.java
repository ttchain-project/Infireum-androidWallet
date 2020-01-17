package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010N\u001a\u0002032\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010P\u001a\u00020\u0013H\u00d6\u0001J\t\u0010Q\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\u0004R\u001a\u0010#\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010&\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0007\"\u0004\b(\u0010\u0004R\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\u0004R\u001a\u0010,\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\u0004R\u001a\u00102\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001a\u00109\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u001a\u0010;\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010=\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001a\u0010?\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u001a\u0010A\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001a\u0010C\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\u0004R\u001a\u0010F\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\u0004R\u001a\u0010I\u001a\u000203X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00104\"\u0004\bK\u00106\u00a8\u0006R"}, d2 = {"Lcom/ttchain/walletproject/model/CoinBean;", "", "coinId", "", "(Ljava/lang/String;)V", "amount", "getAmount", "()Ljava/lang/String;", "setAmount", "amountValue", "", "getAmountValue", "()D", "setAmountValue", "(D)V", "chainName", "getChainName", "setChainName", "chainType", "", "getChainType", "()I", "setChainType", "(I)V", "coinID", "getCoinID", "setCoinID", "getCoinId", "setCoinId", "coinSelectionDataId", "getCoinSelectionDataId", "setCoinSelectionDataId", "contract", "getContract", "setContract", "digit", "getDigit", "setDigit", "displayName", "getDisplayName", "setDisplayName", "exchange", "getExchange", "setExchange", "fullName", "getFullName", "setFullName", "iconPath", "getIconPath", "setIconPath", "isDefaultSelected", "", "()Z", "setDefaultSelected", "(Z)V", "isLockDelete", "setLockDelete", "isLockSearch", "setLockSearch", "isLockSelection", "setLockSelection", "isPicked", "setPicked", "isPrivacyMode", "setPrivacyMode", "isSelected", "setSelected", "mainCoinId", "getMainCoinId", "setMainCoinId", "remindAmount", "getRemindAmount", "setRemindAmount", "searchIsAdded", "getSearchIsAdded", "setSearchIsAdded", "component1", "copy", "equals", "other", "hashCode", "toString", "app_proPlayDebug"})
public final class CoinBean {
    private int coinID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String contract;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fullName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String iconPath;
    private int chainType;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String amount;
    private double amountValue;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String exchange;
    private int digit;
    private boolean isDefaultSelected;
    private boolean isSelected;
    private int coinSelectionDataId;
    private boolean searchIsAdded;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String remindAmount;
    private boolean isPicked;
    private boolean isLockSelection;
    private boolean isLockSearch;
    private boolean isLockDelete;
    private boolean isPrivacyMode;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mainCoinId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String chainName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String coinId;
    
    public final int getCoinID() {
        return 0;
    }
    
    public final void setCoinID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContract() {
        return null;
    }
    
    public final void setContract(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIconPath() {
        return null;
    }
    
    public final void setIconPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getChainType() {
        return 0;
    }
    
    public final void setChainType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getAmountValue() {
        return 0.0;
    }
    
    public final void setAmountValue(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExchange() {
        return null;
    }
    
    public final void setExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getDigit() {
        return 0;
    }
    
    public final void setDigit(int p0) {
    }
    
    public final boolean isDefaultSelected() {
        return false;
    }
    
    public final void setDefaultSelected(boolean p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public final int getCoinSelectionDataId() {
        return 0;
    }
    
    public final void setCoinSelectionDataId(int p0) {
    }
    
    public final boolean getSearchIsAdded() {
        return false;
    }
    
    public final void setSearchIsAdded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemindAmount() {
        return null;
    }
    
    public final void setRemindAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isPicked() {
        return false;
    }
    
    public final void setPicked(boolean p0) {
    }
    
    public final boolean isLockSelection() {
        return false;
    }
    
    public final void setLockSelection(boolean p0) {
    }
    
    public final boolean isLockSearch() {
        return false;
    }
    
    public final void setLockSearch(boolean p0) {
    }
    
    public final boolean isLockDelete() {
        return false;
    }
    
    public final void setLockDelete(boolean p0) {
    }
    
    public final boolean isPrivacyMode() {
        return false;
    }
    
    public final void setPrivacyMode(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMainCoinId() {
        return null;
    }
    
    public final void setMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChainName() {
        return null;
    }
    
    public final void setChainName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinId() {
        return null;
    }
    
    public final void setCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public CoinBean(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        super();
    }
    
    public CoinBean() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinBean copy(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
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