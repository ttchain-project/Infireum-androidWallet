package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\\\u001a\u00020\u000fH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u001a\u0010,\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001a\u0010/\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0011\"\u0004\b1\u0010\u0013R\u001a\u00102\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u0010\u0013R\u001a\u00105\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\u0004R\u001a\u00108\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\u0004R\u001a\u0010;\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R\u001a\u0010>\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u0010\u0013R\u001a\u0010A\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R\u001a\u0010D\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0011\"\u0004\bF\u0010\u0013R\u001a\u0010G\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010\rR\u001a\u0010J\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0011\"\u0004\bL\u0010\u0013R\u001a\u0010M\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0011\"\u0004\bO\u0010\u0013R\u001a\u0010P\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0011\"\u0004\bR\u0010\u0013R\u001a\u0010S\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0011\"\u0004\bU\u0010\u0013\u00a8\u0006]"}, d2 = {"Lcom/ttchain/walletproject/model/CoinTransferBean;", "", "_id", "", "(I)V", "get_id", "()I", "set_id", "transCoinAmount", "Ljava/math/BigDecimal;", "getTransCoinAmount", "()Ljava/math/BigDecimal;", "setTransCoinAmount", "(Ljava/math/BigDecimal;)V", "transCoinChainName", "", "getTransCoinChainName", "()Ljava/lang/String;", "setTransCoinChainName", "(Ljava/lang/String;)V", "transCoinDigit", "getTransCoinDigit", "setTransCoinDigit", "transCoinId", "getTransCoinId", "setTransCoinId", "transCoinName", "getTransCoinName", "setTransCoinName", "transCoinToCoinRate", "getTransCoinToCoinRate", "setTransCoinToCoinRate", "transCoinToFiatAmount", "getTransCoinToFiatAmount", "setTransCoinToFiatAmount", "transCoinToFiatRate", "getTransCoinToFiatRate", "setTransCoinToFiatRate", "transComment", "getTransComment", "setTransComment", "transMinerFeeAmount", "getTransMinerFeeAmount", "setTransMinerFeeAmount", "transMinerFeeToFiatAmount", "getTransMinerFeeToFiatAmount", "setTransMinerFeeToFiatAmount", "transPayAddress", "getTransPayAddress", "setTransPayAddress", "transReceiptAddress", "getTransReceiptAddress", "setTransReceiptAddress", "transThunderReceiptWalletID", "getTransThunderReceiptWalletID", "setTransThunderReceiptWalletID", "transThunderReceiptWalletType", "getTransThunderReceiptWalletType", "setTransThunderReceiptWalletType", "transToCoinChainName", "getTransToCoinChainName", "setTransToCoinChainName", "transToCoinId", "getTransToCoinId", "setTransToCoinId", "transToCoinName", "getTransToCoinName", "setTransToCoinName", "transToPrefFiatSymbol", "getTransToPrefFiatSymbol", "setTransToPrefFiatSymbol", "transWalletCoinRemindAmount", "getTransWalletCoinRemindAmount", "setTransWalletCoinRemindAmount", "viewCoinRemindAmount", "getViewCoinRemindAmount", "setViewCoinRemindAmount", "viewTitleName", "getViewTitleName", "setViewTitleName", "viewTransMinerFeeToFiatAmount", "getViewTransMinerFeeToFiatAmount", "setViewTransMinerFeeToFiatAmount", "viewTransPayWalletName", "getViewTransPayWalletName", "setViewTransPayWalletName", "component1", "copy", "equals", "", "other", "hashCode", "toString", "app_proPlayDebug"})
public final class CoinTransferBean {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String viewTitleName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String viewCoinRemindAmount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String viewTransPayWalletName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String viewTransMinerFeeToFiatAmount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transCoinId;
    private int transCoinDigit;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transCoinName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transCoinChainName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transToPrefFiatSymbol;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transPayAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transReceiptAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transComment;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transWalletCoinRemindAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transCoinToFiatAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transCoinToFiatRate;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transCoinAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transMinerFeeToFiatAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transMinerFeeAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal transCoinToCoinRate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transToCoinId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transToCoinName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transToCoinChainName;
    private int transThunderReceiptWalletID;
    private int transThunderReceiptWalletType;
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getViewTitleName() {
        return null;
    }
    
    public final void setViewTitleName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getViewCoinRemindAmount() {
        return null;
    }
    
    public final void setViewCoinRemindAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getViewTransPayWalletName() {
        return null;
    }
    
    public final void setViewTransPayWalletName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getViewTransMinerFeeToFiatAmount() {
        return null;
    }
    
    public final void setViewTransMinerFeeToFiatAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransCoinId() {
        return null;
    }
    
    public final void setTransCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTransCoinDigit() {
        return 0;
    }
    
    public final void setTransCoinDigit(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransCoinName() {
        return null;
    }
    
    public final void setTransCoinName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransCoinChainName() {
        return null;
    }
    
    public final void setTransCoinChainName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransToPrefFiatSymbol() {
        return null;
    }
    
    public final void setTransToPrefFiatSymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransPayAddress() {
        return null;
    }
    
    public final void setTransPayAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransReceiptAddress() {
        return null;
    }
    
    public final void setTransReceiptAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransComment() {
        return null;
    }
    
    public final void setTransComment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransWalletCoinRemindAmount() {
        return null;
    }
    
    public final void setTransWalletCoinRemindAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransCoinToFiatAmount() {
        return null;
    }
    
    public final void setTransCoinToFiatAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransCoinToFiatRate() {
        return null;
    }
    
    public final void setTransCoinToFiatRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransCoinAmount() {
        return null;
    }
    
    public final void setTransCoinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransMinerFeeToFiatAmount() {
        return null;
    }
    
    public final void setTransMinerFeeToFiatAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransMinerFeeAmount() {
        return null;
    }
    
    public final void setTransMinerFeeAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTransCoinToCoinRate() {
        return null;
    }
    
    public final void setTransCoinToCoinRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransToCoinId() {
        return null;
    }
    
    public final void setTransToCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransToCoinName() {
        return null;
    }
    
    public final void setTransToCoinName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransToCoinChainName() {
        return null;
    }
    
    public final void setTransToCoinChainName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTransThunderReceiptWalletID() {
        return 0;
    }
    
    public final void setTransThunderReceiptWalletID(int p0) {
    }
    
    public final int getTransThunderReceiptWalletType() {
        return 0;
    }
    
    public final void setTransThunderReceiptWalletType(int p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public CoinTransferBean(int _id) {
        super();
    }
    
    public CoinTransferBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinTransferBean copy(int _id) {
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