package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u0013\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00104\u001a\u00020\'2\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u00020\u0003H\u00d6\u0001J\t\u00108\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0004R\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u0004R\u001e\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001e\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR \u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR \u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\'8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001e\u0010-\u001a\u00020\'8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001e\u0010/\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\r\u00a8\u00069"}, d2 = {"Lcom/ttchain/walletproject/database/data/CoinData;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "chainName", "", "getChainName", "()Ljava/lang/String;", "setChainName", "(Ljava/lang/String;)V", "chainType", "getChainType", "setChainType", "coinId", "getCoinId", "setCoinId", "contract", "getContract", "setContract", "digit", "getDigit", "setDigit", "displayName", "getDisplayName", "setDisplayName", "fullName", "getFullName", "setFullName", "icon", "getIcon", "setIcon", "iconPath", "getIconPath", "setIconPath", "isActive", "", "()Z", "setActive", "(Z)V", "isDefault", "setDefault", "isDefaultSelected", "setDefaultSelected", "mainCoinId", "getMainCoinId", "setMainCoinId", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_coin")
public final class CoinData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "coin_id")
    private java.lang.String coinId;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.DatabaseField(columnName = "contract")
    private java.lang.String contract;
    @com.j256.ormlite.field.DatabaseField(columnName = "chain_type")
    private int chainType;
    @com.j256.ormlite.field.DatabaseField(columnName = "digit")
    private int digit;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "chain_name")
    private java.lang.String chainName;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "full_name")
    private java.lang.String fullName;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.DatabaseField(columnName = "icon")
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.DatabaseField(columnName = "icon_path")
    private java.lang.String iconPath;
    @com.j256.ormlite.field.DatabaseField(columnName = "is_default")
    private boolean isDefault;
    @com.j256.ormlite.field.DatabaseField(columnName = "is_default_selected")
    private boolean isDefaultSelected;
    @com.j256.ormlite.field.DatabaseField(columnName = "is_active")
    private boolean isActive;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "display_name")
    private java.lang.String displayName;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "main_coin_id")
    private java.lang.String mainCoinId;
    @com.j256.ormlite.field.DatabaseField(generatedId = true, columnName = "_id")
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinId() {
        return null;
    }
    
    public final void setCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContract() {
        return null;
    }
    
    public final void setContract(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getChainType() {
        return 0;
    }
    
    public final void setChainType(int p0) {
    }
    
    public final int getDigit() {
        return 0;
    }
    
    public final void setDigit(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChainName() {
        return null;
    }
    
    public final void setChainName(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIconPath() {
        return null;
    }
    
    public final void setIconPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isDefault() {
        return false;
    }
    
    public final void setDefault(boolean p0) {
    }
    
    public final boolean isDefaultSelected() {
        return false;
    }
    
    public final void setDefaultSelected(boolean p0) {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMainCoinId() {
        return null;
    }
    
    public final void setMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public CoinData(int _id) {
        super();
    }
    
    public CoinData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData copy(int _id) {
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