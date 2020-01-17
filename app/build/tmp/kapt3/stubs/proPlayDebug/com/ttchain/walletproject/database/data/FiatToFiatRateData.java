package com.ttchain.walletproject.database.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0015H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/database/data/FiatToFiatRateData;", "", "_id", "", "(I)V", "get_id", "()I", "set_id", "fromFiatData", "Lcom/ttchain/walletproject/database/data/FiatData;", "getFromFiatData", "()Lcom/ttchain/walletproject/database/data/FiatData;", "setFromFiatData", "(Lcom/ttchain/walletproject/database/data/FiatData;)V", "rate", "Ljava/math/BigDecimal;", "getRate", "()Ljava/math/BigDecimal;", "setRate", "(Ljava/math/BigDecimal;)V", "syncData", "", "getSyncData", "()Ljava/lang/String;", "setSyncData", "(Ljava/lang/String;)V", "toFiatData", "getToFiatData", "setToFiatData", "component1", "copy", "equals", "", "other", "hashCode", "toString", "app_proPlayDebug"})
@com.j256.ormlite.table.DatabaseTable(tableName = "table_fiat_to_fiat_rate")
public final class FiatToFiatRateData {
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_from_fiat_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.FiatData fromFiatData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "fk_to_fiat_id", foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private com.ttchain.walletproject.database.data.FiatData toFiatData;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "rate")
    private java.math.BigDecimal rate;
    @org.jetbrains.annotations.NotNull()
    @com.j256.ormlite.field.DatabaseField(columnName = "sync_date")
    private java.lang.String syncData;
    @com.j256.ormlite.field.DatabaseField(generatedId = true, columnName = "_id")
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.FiatData getFromFiatData() {
        return null;
    }
    
    public final void setFromFiatData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.FiatData getToFiatData() {
        return null;
    }
    
    public final void setToFiatData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.FiatData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRate() {
        return null;
    }
    
    public final void setRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSyncData() {
        return null;
    }
    
    public final void setSyncData(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public FiatToFiatRateData(int _id) {
        super();
    }
    
    public FiatToFiatRateData() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.FiatToFiatRateData copy(int _id) {
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