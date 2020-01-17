package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006#"}, d2 = {"Lcom/ttchain/walletproject/database/data/AssetData;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "coinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "setCoinData", "(Lcom/ttchain/walletproject/database/data/CoinData;)V", "walletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getWalletData", "()Lcom/ttchain/walletproject/database/data/WalletData;", "setWalletData", "(Lcom/ttchain/walletproject/database/data/WalletData;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_asset")
public final class AssetData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_wallet_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.WalletData walletData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_coin_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.CoinData coinData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "amount")
    private java.math.BigDecimal amount;
    @com.j256.ormlite.field.DatabaseField(generatedId = true, columnName = "_id")
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getWalletData() {
        return null;
    }
    
    public final void setWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getCoinData() {
        return null;
    }
    
    public final void setCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public AssetData(int _id) {
        super();
    }
    
    public AssetData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.AssetData copy(int _id) {
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