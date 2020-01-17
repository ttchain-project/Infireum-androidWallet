package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010;\u001a\u00020&2\b\u0010<\u001a\u0004\u0018\u00010=H\u00d6\u0003J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\t\u0010?\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0004R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001e\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR \u0010-\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR\u001e\u00100\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u001e\u00103\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\u001e\u00106\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\r\u00a8\u0006@"}, d2 = {"Lcom/ttchain/walletproject/database/data/WalletData;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "chainType", "getChainType", "setChainType", "coinAssetList", "Lcom/j256/ormlite/dao/ForeignCollection;", "Lcom/ttchain/walletproject/database/data/AssetData;", "getCoinAssetList", "()Lcom/j256/ormlite/dao/ForeignCollection;", "setCoinAssetList", "(Lcom/j256/ormlite/dao/ForeignCollection;)V", "coinSelectionList", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "getCoinSelectionList", "setCoinSelectionList", "epKey", "getEpKey", "setEpKey", "identityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getIdentityData", "()Lcom/ttchain/walletproject/database/data/IdentityData;", "setIdentityData", "(Lcom/ttchain/walletproject/database/data/IdentityData;)V", "isFromSystem", "", "()Z", "setFromSystem", "(Z)V", "mainCoinId", "getMainCoinId", "setMainCoinId", "mnemonic", "getMnemonic", "setMnemonic", "name", "getName", "setName", "pwd", "getPwd", "setPwd", "pwdHint", "getPwdHint", "setPwdHint", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_wallet")
public final class WalletData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_identity_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.IdentityData identityData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "ep_key")
    private java.lang.String epKey;
    @com.j256.ormlite.field.DatabaseField(columnName = "chain_type")
    private int chainType;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.DatabaseField(columnName = "mnemonic")
    private java.lang.String mnemonic;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "pwd")
    private java.lang.String pwd;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "pwd_hint")
    private java.lang.String pwdHint;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "address")
    private java.lang.String address;
    @com.j256.ormlite.field.DatabaseField(columnName = "is_from_system")
    private boolean isFromSystem;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "main_coin_id")
    private java.lang.String mainCoinId;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.ForeignCollectionField(eager = false)
    private com.j256.ormlite.dao.ForeignCollection<com.ttchain.walletproject.database.data.CoinSelectionData> coinSelectionList;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.ForeignCollectionField(eager = false)
    private com.j256.ormlite.dao.ForeignCollection<com.ttchain.walletproject.database.data.AssetData> coinAssetList;
    @com.j256.ormlite.field.DatabaseField(generatedId = true, columnName = "_id")
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
    }
    
    public final void setIdentityData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.IdentityData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEpKey() {
        return null;
    }
    
    public final void setEpKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getChainType() {
        return 0;
    }
    
    public final void setChainType(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMnemonic() {
        return null;
    }
    
    public final void setMnemonic(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPwd() {
        return null;
    }
    
    public final void setPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPwdHint() {
        return null;
    }
    
    public final void setPwdHint(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    public final boolean isFromSystem() {
        return false;
    }
    
    public final void setFromSystem(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMainCoinId() {
        return null;
    }
    
    public final void setMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.j256.ormlite.dao.ForeignCollection<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionList() {
        return null;
    }
    
    public final void setCoinSelectionList(@org.jetbrains.annotations.Nullable()
    com.j256.ormlite.dao.ForeignCollection<com.ttchain.walletproject.database.data.CoinSelectionData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.j256.ormlite.dao.ForeignCollection<com.ttchain.walletproject.database.data.AssetData> getCoinAssetList() {
        return null;
    }
    
    public final void setCoinAssetList(@org.jetbrains.annotations.Nullable()
    com.j256.ormlite.dao.ForeignCollection<com.ttchain.walletproject.database.data.AssetData> p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public WalletData(int _id) {
        super();
    }
    
    public WalletData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData copy(int _id) {
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