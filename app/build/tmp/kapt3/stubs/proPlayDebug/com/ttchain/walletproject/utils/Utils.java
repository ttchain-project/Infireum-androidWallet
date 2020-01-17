package com.ttchain.walletproject.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010 \u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010!\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010\"\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010#\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010$\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010%\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010&\u001a\u00020\f2\u0006\u0010\'\u001a\u00020(H\u0007J\u000e\u0010)\u001a\u00020*2\u0006\u0010\'\u001a\u00020(J\u000e\u0010+\u001a\u00020\f2\u0006\u0010\'\u001a\u00020(J\u0010\u0010,\u001a\u0004\u0018\u00010\u001f2\u0006\u0010-\u001a\u00020\fJ\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010\'\u001a\u00020(J\u0010\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\fJ\u000e\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\fJ\u0016\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/ttchain/walletproject/utils/Utils;", "", "()V", "DATE_TIME_LAST_DAY", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_TIME_LAST_MINS", "DATE_TIME_LAST_SECS", "DATE_TIME_LAST_SECS_AM_PM", "DATE_TIME_LAST_SECS_AM_PM_US", "DATE_TIME_LAST_SECS_WITH_LOCALE", "IV", "", "hexArray", "", "MD5Encoding", "s", "bytesToHex", "bytes", "", "createBitmapFromView", "Landroid/graphics/Bitmap;", "v", "Landroid/view/View;", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decryptPrivateKey", "epKey", "pwd", "formatDateTime", "dateTimeFormatter", "offsetDateTime", "Lorg/threeten/bp/OffsetDateTime;", "formatDateTimeDay", "formatDateTimeMins", "formatDateTimeSecs", "formatDateTimeSecsAmPm", "formatDateTimeSecsAmPmUs", "formatDateTimeSecsWithLocale", "getDeviceId", "context", "Landroid/content/Context;", "getInternetStatus", "", "getMikeApiLanguageQuery", "getOffsetDateTime", "dateTime", "getPrefLocal", "Ljava/util/Locale;", "language", "getYuiApiLanguageQuery", "hexToString", "hex", "isAppVersionDeprecated", "apiResponseAppVersionName", "appVersionName", "app_proPlayDebug"})
public final class Utils {
    private static final java.lang.String IV = "walletofflinegib";
    private static final char[] hexArray = null;
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_LAST_SECS_AM_PM = null;
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_LAST_SECS_AM_PM_US = null;
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_LAST_DAY = null;
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_LAST_MINS = null;
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_LAST_SECS = null;
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_LAST_SECS_WITH_LOCALE = null;
    public static final com.ttchain.walletproject.utils.Utils INSTANCE = null;
    
    /**
     * 確認網路目前狀態
     *
     * @param context
     * @return true 可以使用網路, false 無法使用網路
     */
    public final boolean getInternetStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * When device app version name that first bit and second bit is lower than
     * api header, 'X-Android-Version', android version, enforce user to update app version.
     *
     * @param apiResponseAppVersionName four bit version name from api header
     * @param appVersionName            BuildConfig.VERSION_NAME
     * @return default: false, true if device app version lower api app version .
     */
    public final boolean isAppVersionDeprecated(@org.jetbrains.annotations.NotNull()
    java.lang.String apiResponseAppVersionName, @org.jetbrains.annotations.NotNull()
    java.lang.String appVersionName) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateTimeDay(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateTimeMins(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateTimeSecs(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateTimeSecsWithLocale(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateTimeSecsAmPm(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDateTimeSecsAmPmUs(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.threeten.bp.OffsetDateTime getOffsetDateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String dateTime) {
        return null;
    }
    
    private final java.lang.String formatDateTime(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter, org.threeten.bp.OffsetDateTime offsetDateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String MD5Encoding(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Locale getPrefLocal(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Locale getPrefLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMikeApiLanguageQuery(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYuiApiLanguageQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createBitmapFromView(@org.jetbrains.annotations.NotNull()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.graphics.Bitmap> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String decryptPrivateKey(@org.jetbrains.annotations.NotNull()
    java.lang.String epKey, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    public final java.lang.String getDeviceId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String hexToString(@org.jetbrains.annotations.NotNull()
    java.lang.String hex) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String bytesToHex(@org.jetbrains.annotations.NotNull()
    byte[] bytes) {
        return null;
    }
    
    private Utils() {
        super();
    }
}