package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010F\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010HH\u00d6\u0003J\t\u0010I\u001a\u00020\u0003H\u00d6\u0001J\t\u0010J\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u0011\u0010,\u001a\u00020-8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010.R\u001a\u0010/\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u001a\u00102\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\u0004R\u001a\u00105\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\u0004R\u001a\u00108\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000b\"\u0004\b:\u0010\rR\u001a\u0010;\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0006\"\u0004\b=\u0010\u0004R\u001a\u0010>\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR\u001c\u0010A\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\r\u00a8\u0006K"}, d2 = {"Lcom/ttchain/walletproject/model/RecordBean;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "amount", "Ljava/math/BigDecimal;", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "amountText", "getAmountText", "setAmountText", "block", "getBlock", "setBlock", "coinDisplayName", "getCoinDisplayName", "setCoinDisplayName", "coinToCoinText", "getCoinToCoinText", "setCoinToCoinText", "comment", "getComment", "setComment", "date", "getDate", "setDate", "detailText", "getDetailText", "setDetailText", "fromAddress", "getFromAddress", "setFromAddress", "isPadding", "", "()Z", "minerFeeText", "getMinerFeeText", "setMinerFeeText", "status", "getStatus", "setStatus", "statusIcon", "getStatusIcon", "setStatusIcon", "superLinkUrl", "getSuperLinkUrl", "setSuperLinkUrl", "textColorRes", "getTextColorRes", "setTextColorRes", "toAddress", "getToAddress", "setToAddress", "txid", "getTxid", "setTxid", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
public final class RecordBean implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String detailText;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal amount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String amountText;
    private int status;
    private int statusIcon;
    private int textColorRes;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String coinToCoinText;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minerFeeText;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String superLinkUrl;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String comment;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromAddress;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String block;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String txid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String coinDisplayName;
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetailText() {
        return null;
    }
    
    public final void setDetailText(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    public final void setAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmountText() {
        return null;
    }
    
    public final void setAmountText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    public final int getStatusIcon() {
        return 0;
    }
    
    public final void setStatusIcon(int p0) {
    }
    
    public final int getTextColorRes() {
        return 0;
    }
    
    public final void setTextColorRes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinToCoinText() {
        return null;
    }
    
    public final void setCoinToCoinText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinerFeeText() {
        return null;
    }
    
    public final void setMinerFeeText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSuperLinkUrl() {
        return null;
    }
    
    public final void setSuperLinkUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToAddress() {
        return null;
    }
    
    public final void setToAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromAddress() {
        return null;
    }
    
    public final void setFromAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlock() {
        return null;
    }
    
    public final void setBlock(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isPadding() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTxid() {
        return null;
    }
    
    public final void setTxid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCoinDisplayName() {
        return null;
    }
    
    public final void setCoinDisplayName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public RecordBean(int _id) {
        super();
    }
    
    public RecordBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.RecordBean copy(int _id) {
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