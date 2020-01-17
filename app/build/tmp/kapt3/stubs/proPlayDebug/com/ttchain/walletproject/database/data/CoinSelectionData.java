package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "coinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "setCoinData", "(Lcom/ttchain/walletproject/database/data/CoinData;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "walletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getWalletData", "()Lcom/ttchain/walletproject/database/data/WalletData;", "setWalletData", "(Lcom/ttchain/walletproject/database/data/WalletData;)V", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_coin_selection")
public final class CoinSelectionData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_wallet_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.WalletData walletData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_coin_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.CoinData coinData;
    @com.j256.ormlite.field.DatabaseField(columnName = "is_selected")
    private boolean isSelected;
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
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public CoinSelectionData(int _id) {
        super();
    }
    
    public CoinSelectionData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinSelectionData copy(int _id) {
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