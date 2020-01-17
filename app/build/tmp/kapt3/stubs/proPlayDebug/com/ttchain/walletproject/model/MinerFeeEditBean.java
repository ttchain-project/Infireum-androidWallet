package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010`\u001a\u00020!2\b\u0010a\u001a\u0004\u0018\u00010bH\u00d6\u0003J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010d\u001a\u00020;H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R$\u0010(\u001a\u00020!2\u0006\u0010%\u001a\u00020!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R$\u0010*\u001a\u00020!2\u0006\u0010%\u001a\u00020!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010$R\u001c\u0010,\u001a\u00020!8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001c\u0010.\u001a\u00020\f8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R\u001c\u00101\u001a\u00020\f8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\u001c\u00104\u001a\u00020\f8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000e\"\u0004\b6\u0010\u0010R\u001a\u00107\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000e\"\u0004\b9\u0010\u0010R\u001c\u0010:\u001a\u00020;8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u00020;8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001a\u0010C\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u0010\u0010R\u001a\u0010F\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u000e\"\u0004\bH\u0010\u0010R\u001a\u0010I\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u0010\u0010R\u001a\u0010L\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u000e\"\u0004\bN\u0010\u0010R\u001a\u0010O\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\u0004R\u001c\u0010R\u001a\u00020\f8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010\u0010R\u001a\u0010U\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\u001a\u0010X\u001a\u00020;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010=\"\u0004\bZ\u0010?R\u001a\u0010[\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u000e\"\u0004\b]\u0010\u0010\u00a8\u0006e"}, d2 = {"Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "Ljava/io/Serializable;", "_Id", "", "(I)V", "get_Id", "()I", "set_Id", "chainType", "getChainType", "setChainType", "customGasEth", "Ljava/math/BigDecimal;", "getCustomGasEth", "()Ljava/math/BigDecimal;", "setCustomGasEth", "(Ljava/math/BigDecimal;)V", "customGasPriceEth", "getCustomGasPriceEth", "setCustomGasPriceEth", "customPriceBtc", "getCustomPriceBtc", "setCustomPriceBtc", "defaultGasEth", "getDefaultGasEth", "setDefaultGasEth", "defaultGasNonEth", "getDefaultGasNonEth", "setDefaultGasNonEth", "gasRateEth", "getGasRateEth", "setGasRateEth", "isAdvanced", "", "()Z", "setAdvanced", "(Z)V", "value", "isCustomPriceBtcChecked", "setCustomPriceBtcChecked", "isPriorityPriceBtcChecked", "setPriorityPriceBtcChecked", "isRegularPriceBtcChecked", "setRegularPriceBtcChecked", "isZeroFee", "setZeroFee", "maxGasPriceEth", "getMaxGasPriceEth", "setMaxGasPriceEth", "minDefaultGasPriceEth", "getMinDefaultGasPriceEth", "setMinDefaultGasPriceEth", "minGasPriceEth", "getMinGasPriceEth", "setMinGasPriceEth", "minerFeeCoinAmount", "getMinerFeeCoinAmount", "setMinerFeeCoinAmount", "minerFeeCoinId", "", "getMinerFeeCoinId", "()Ljava/lang/String;", "setMinerFeeCoinId", "(Ljava/lang/String;)V", "minerFeeCoinShortName", "getMinerFeeCoinShortName", "setMinerFeeCoinShortName", "minerFeeCustomCoinAmount", "getMinerFeeCustomCoinAmount", "setMinerFeeCustomCoinAmount", "payloadGasEth", "getPayloadGasEth", "setPayloadGasEth", "priorityPriceBtc", "getPriorityPriceBtc", "setPriorityPriceBtc", "regularPriceBtc", "getRegularPriceBtc", "setRegularPriceBtc", "seekProgress", "getSeekProgress", "setSeekProgress", "suggestGasPriceEth", "getSuggestGasPriceEth", "setSuggestGasPriceEth", "transAddress", "getTransAddress", "setTransAddress", "transCoinId", "getTransCoinId", "setTransCoinId", "userSeekGasPriceEth", "getUserSeekGasPriceEth", "setUserSeekGasPriceEth", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
public final class MinerFeeEditBean implements java.io.Serializable {
    private boolean isAdvanced;
    private boolean isZeroFee;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transCoinId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transAddress;
    private int chainType;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal gasRateEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal suggestGasPriceEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal minDefaultGasPriceEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal minGasPriceEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal maxGasPriceEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal defaultGasEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal payloadGasEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal defaultGasNonEth;
    private int seekProgress;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal userSeekGasPriceEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal customGasPriceEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal customGasEth;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal regularPriceBtc;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal priorityPriceBtc;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal customPriceBtc;
    private boolean isRegularPriceBtcChecked;
    private boolean isPriorityPriceBtcChecked;
    private boolean isCustomPriceBtcChecked;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minerFeeCoinId;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal minerFeeCoinAmount;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal minerFeeCustomCoinAmount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minerFeeCoinShortName;
    private int _Id;
    
    public final boolean isAdvanced() {
        return false;
    }
    
    public final void setAdvanced(boolean p0) {
    }
    
    public final boolean isZeroFee() {
        return false;
    }
    
    public final void setZeroFee(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransCoinId() {
        return null;
    }
    
    public final void setTransCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransAddress() {
        return null;
    }
    
    public final void setTransAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getChainType() {
        return 0;
    }
    
    public final void setChainType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getGasRateEth() {
        return null;
    }
    
    public final void setGasRateEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getSuggestGasPriceEth() {
        return null;
    }
    
    public final void setSuggestGasPriceEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMinDefaultGasPriceEth() {
        return null;
    }
    
    public final void setMinDefaultGasPriceEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMinGasPriceEth() {
        return null;
    }
    
    public final void setMinGasPriceEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMaxGasPriceEth() {
        return null;
    }
    
    public final void setMaxGasPriceEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDefaultGasEth() {
        return null;
    }
    
    public final void setDefaultGasEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getPayloadGasEth() {
        return null;
    }
    
    public final void setPayloadGasEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getDefaultGasNonEth() {
        return null;
    }
    
    public final void setDefaultGasNonEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final int getSeekProgress() {
        return 0;
    }
    
    public final void setSeekProgress(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getUserSeekGasPriceEth() {
        return null;
    }
    
    public final void setUserSeekGasPriceEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getCustomGasPriceEth() {
        return null;
    }
    
    public final void setCustomGasPriceEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getCustomGasEth() {
        return null;
    }
    
    public final void setCustomGasEth(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRegularPriceBtc() {
        return null;
    }
    
    public final void setRegularPriceBtc(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getPriorityPriceBtc() {
        return null;
    }
    
    public final void setPriorityPriceBtc(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getCustomPriceBtc() {
        return null;
    }
    
    public final void setCustomPriceBtc(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    public final boolean isRegularPriceBtcChecked() {
        return false;
    }
    
    public final void setRegularPriceBtcChecked(boolean value) {
    }
    
    public final boolean isPriorityPriceBtcChecked() {
        return false;
    }
    
    public final void setPriorityPriceBtcChecked(boolean value) {
    }
    
    public final boolean isCustomPriceBtcChecked() {
        return false;
    }
    
    public final void setCustomPriceBtcChecked(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinerFeeCoinId() {
        return null;
    }
    
    public final void setMinerFeeCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMinerFeeCoinAmount() {
        return null;
    }
    
    public final void setMinerFeeCoinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMinerFeeCustomCoinAmount() {
        return null;
    }
    
    public final void setMinerFeeCustomCoinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinerFeeCoinShortName() {
        return null;
    }
    
    public final void setMinerFeeCoinShortName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int get_Id() {
        return 0;
    }
    
    public final void set_Id(int p0) {
    }
    
    public MinerFeeEditBean(int _Id) {
        super();
    }
    
    public MinerFeeEditBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MinerFeeEditBean copy(int _Id) {
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