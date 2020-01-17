package com.ttchain.walletproject.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\"\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007J\u001a\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"J\u0016\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0004J\u001d\u0010\'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u0004\u00a2\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0017J\u001c\u0010,\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010-\u001a\u00020\u001bH\u0007J\u0015\u0010.\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010/J\u0015\u00100\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010/J\u0015\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u00020\u001b\u00a2\u0006\u0002\u00103J\u0016\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0004J\u0015\u00105\u001a\u0004\u0018\u0001062\u0006\u00102\u001a\u00020\u001b\u00a2\u0006\u0002\u00107J\u0016\u00105\u001a\u0002062\u0006\u00102\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0004J\u0016\u00108\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u00109\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u0016\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0004J\u001a\u0010<\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\"2\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007J\u000e\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u0017J\u0016\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\"J\u001a\u0010?\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\"2\b\b\u0002\u0010\u001c\u001a\u00020\u0004H\u0007J\u001c\u0010@\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010-\u001a\u00020\u001bH\u0007J\u000e\u0010A\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\"J\u000e\u0010A\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\u0017J\u001e\u0010B\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u001bJ\u0016\u0010C\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020\"J\u0016\u0010D\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010D\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0017J\u000e\u0010D\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u001bJ\u0016\u0010D\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006F"}, d2 = {"Lcom/ttchain/walletproject/utils/NumberUtils;", "", "()V", "DEF_DIV_SCALE", "", "DIGIT_BTC", "getDIGIT_BTC", "()I", "DIGIT_COIN_DEFAULT", "getDIGIT_COIN_DEFAULT", "DIGIT_ETH", "getDIGIT_ETH", "decimalFormat_8", "Ljava/text/DecimalFormat;", "getDecimalFormat_8", "()Ljava/text/DecimalFormat;", "decimalFormat_common_8", "getDecimalFormat_common_8", "df_pound_2", "getDf_pound_2", "df_zero_4", "getDf_zero_4", "add", "", "value1", "value2", "createPoundFormatString", "", "digit", "div", "scale", "equalTo", "", "b1", "Ljava/math/BigDecimal;", "b2", "formatAmount", "bigDecimal", "formatAmountBig", "formatDigitNew", "value", "(Ljava/lang/Double;I)Ljava/lang/String;", "formatFloorDouble", "val", "formatInputAmount", "replace", "formatPound2Down", "(Ljava/lang/Double;)Ljava/lang/String;", "formatZero4Up", "hexToInteger", "input", "(Ljava/lang/String;)Ljava/lang/Integer;", "def", "hexToLong", "", "(Ljava/lang/String;)Ljava/lang/Long;", "isEqualsAmount", "mul", "round", "v", "show", "amount", "showFiat", "showNew", "showNonZero", "showRate", "showZeroReplaceNew", "sub", "valueOf", "decimal", "app_proPlayDebug"})
public final class NumberUtils {
    private static final int DIGIT_COIN_DEFAULT = 4;
    private static final int DIGIT_BTC = 8;
    private static final int DIGIT_ETH = 18;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat decimalFormat_8 = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat decimalFormat_common_8 = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat df_pound_2 = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.DecimalFormat df_zero_4 = null;
    private static final int DEF_DIV_SCALE = 32;
    public static final com.ttchain.walletproject.utils.NumberUtils INSTANCE = null;
    
    public final int getDIGIT_COIN_DEFAULT() {
        return 0;
    }
    
    public final int getDIGIT_BTC() {
        return 0;
    }
    
    public final int getDIGIT_ETH() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.DecimalFormat getDecimalFormat_8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.DecimalFormat getDecimalFormat_common_8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.DecimalFormat getDf_pound_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.DecimalFormat getDf_zero_4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showFiat(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showNew(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal, int digit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showNew(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showZeroReplaceNew(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal, int digit, @org.jetbrains.annotations.NotNull()
    java.lang.String replace) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createPoundFormatString(int digit) {
        return null;
    }
    
    public final boolean isEqualsAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String value1, @org.jetbrains.annotations.NotNull()
    java.lang.String value2) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDigitNew(@org.jetbrains.annotations.Nullable()
    java.lang.Double value, int digit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatPound2Down(@org.jetbrains.annotations.Nullable()
    java.lang.Double value) {
        return null;
    }
    
    /**
     * Show amount format in default at app system.
     * Format rounding mode is [RoundingMode].UP.
     *
     * @param value amount of double type
     * @return the amount format 0.0000
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatZero4Up(@org.jetbrains.annotations.Nullable()
    java.lang.Double value) {
        return null;
    }
    
    /**
     * Show all coin amount in app. And the scale default is 8.
     *
     * @param amount
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String show(double amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String show(double amount, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String show(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String show(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showRate(double amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showRate(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showNonZero(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal bigDecimal, @org.jetbrains.annotations.NotNull()
    java.lang.String replace) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showNonZero(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatInputAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal bigDecimal, @org.jetbrains.annotations.NotNull()
    java.lang.String replace) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatInputAmount(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal bigDecimal) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal formatAmountBig(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal bigDecimal, int scale) {
        return null;
    }
    
    public final double valueOf(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal decimal) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal valueOf(double val) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal valueOf(@org.jetbrains.annotations.NotNull()
    java.lang.String val) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal valueOf(@org.jetbrains.annotations.NotNull()
    java.lang.String val, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal valueOf(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal val, int scale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatFloorDouble(double val) {
        return null;
    }
    
    /**
     * 精確加法
     */
    public final double add(double value1, double value2) {
        return 0.0;
    }
    
    /**
     * 精確減法
     */
    public final double sub(double value1, double value2) {
        return 0.0;
    }
    
    /**
     * 精確乘法
     */
    public final double mul(double value1, double value2) {
        return 0.0;
    }
    
    /**
     * 精確除法
     *
     * @param scale 精度
     */
    public final double div(double value1, double value2, int scale) throws java.lang.IllegalAccessException {
        return 0.0;
    }
    
    /**
     * 精確除法
     *
     * @param scale 精度
     */
    public final double div(double value1, double value2) throws java.lang.IllegalAccessException {
        return 0.0;
    }
    
    /**
     * 四捨五入
     *
     * @param scale 小數點後保留幾位
     */
    public final double round(double v, int scale) throws java.lang.IllegalAccessException {
        return 0.0;
    }
    
    /**
     * 比較大小
     */
    public final boolean equalTo(@org.jetbrains.annotations.Nullable()
    java.math.BigDecimal b1, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal b2) {
        return false;
    }
    
    public final long hexToLong(@org.jetbrains.annotations.NotNull()
    java.lang.String input, int def) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long hexToLong(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    public final int hexToInteger(@org.jetbrains.annotations.NotNull()
    java.lang.String input, int def) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer hexToInteger(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    private NumberUtils() {
        super();
    }
}