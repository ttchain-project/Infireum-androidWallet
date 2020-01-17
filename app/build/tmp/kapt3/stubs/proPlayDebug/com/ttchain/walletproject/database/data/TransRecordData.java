package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\tH\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001e\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001e\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001e\u0010&\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR \u0010)\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001e\u0010,\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\u0004R\u001e\u0010/\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u001e\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000b\"\u0004\b4\u0010\rR\u001e\u00105\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016R\u001e\u00108\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001e\u0010;\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0014\"\u0004\b=\u0010\u0016R\u001e\u0010>\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\r\u00a8\u0006H"}, d2 = {"Lcom/ttchain/walletproject/database/data/TransRecordData;", "", "_id", "", "(I)V", "get_id", "()I", "set_id", "block", "", "getBlock", "()Ljava/lang/String;", "setBlock", "(Ljava/lang/String;)V", "date", "getDate", "setDate", "feeAmount", "Ljava/math/BigDecimal;", "getFeeAmount", "()Ljava/math/BigDecimal;", "setFeeAmount", "(Ljava/math/BigDecimal;)V", "feeCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getFeeCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "setFeeCoinData", "(Lcom/ttchain/walletproject/database/data/CoinData;)V", "feeRate", "getFeeRate", "setFeeRate", "fromAddress", "getFromAddress", "setFromAddress", "fromAmount", "getFromAmount", "setFromAmount", "fromCoinData", "getFromCoinData", "setFromCoinData", "note", "getNote", "setNote", "status", "getStatus", "setStatus", "syncDate", "getSyncDate", "setSyncDate", "toAddress", "getToAddress", "setToAddress", "toAmount", "getToAmount", "setToAmount", "toCoinData", "getToCoinData", "setToCoinData", "totalFee", "getTotalFee", "setTotalFee", "txId", "getTxId", "setTxId", "component1", "copy", "equals", "", "other", "hashCode", "toString", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_trans_record")
public final class TransRecordData {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "tx_id")
    private java.lang.String txId;
    @com.j256.ormlite.field.DatabaseField(columnName = "status")
    private int status;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_from_coin_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.CoinData fromCoinData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "from_amount")
    private java.math.BigDecimal fromAmount;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "from_address")
    private java.lang.String fromAddress;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_to_coin_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.CoinData toCoinData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "to_amount")
    private java.math.BigDecimal toAmount;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "to_address")
    private java.lang.String toAddress;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_fee_coin_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.CoinData feeCoinData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fee_Amt")
    private java.math.BigDecimal feeAmount;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fee_rate")
    private java.math.BigDecimal feeRate;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "total_fee")
    private java.math.BigDecimal totalFee;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "date")
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "sync_date")
    private java.lang.String syncDate;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.DatabaseField(columnName = "block")
    private java.lang.String block;
    @org.jetbrains.annotations.Nullable()
    @com.j256.ormlite.field.DatabaseField(columnName = "note")
    private java.lang.String note;
    @com.j256.ormlite.field.DatabaseField(generatedId = true, columnName = "_id")
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTxId() {
        return null;
    }
    
    public final void setTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getFromCoinData() {
        return null;
    }
    
    public final void setFromCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getFromAmount() {
        return null;
    }
    
    public final void setFromAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromAddress() {
        return null;
    }
    
    public final void setFromAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getToCoinData() {
        return null;
    }
    
    public final void setToCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getToAmount() {
        return null;
    }
    
    public final void setToAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToAddress() {
        return null;
    }
    
    public final void setToAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getFeeCoinData() {
        return null;
    }
    
    public final void setFeeCoinData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getFeeAmount() {
        return null;
    }
    
    public final void setFeeAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getFeeRate() {
        return null;
    }
    
    public final void setFeeRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTotalFee() {
        return null;
    }
    
    public final void setTotalFee(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSyncDate() {
        return null;
    }
    
    public final void setSyncDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlock() {
        return null;
    }
    
    public final void setBlock(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public TransRecordData(int _id) {
        super();
    }
    
    public TransRecordData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.TransRecordData copy(int _id) {
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