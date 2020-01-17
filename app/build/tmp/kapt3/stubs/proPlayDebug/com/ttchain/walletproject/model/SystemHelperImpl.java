package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lcom/ttchain/walletproject/model/SystemHelperImpl;", "Lcom/ttchain/walletproject/model/SystemHelper;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "manageCoinBeanListString", "getManageCoinBeanListString", "()Ljava/lang/String;", "setManageCoinBeanListString", "(Ljava/lang/String;)V", "readDayTimeStamp", "getReadDayTimeStamp", "setReadDayTimeStamp", "", "readVersionCode", "getReadVersionCode", "()I", "setReadVersionCode", "(I)V", "", "showOnlyOncePerDayStatus", "getShowOnlyOncePerDayStatus", "()Ljava/lang/Boolean;", "setShowOnlyOncePerDayStatus", "(Ljava/lang/Boolean;)V", "removeAllSharedPreferences", "", "removeReadDayTimeStamp", "removeReadVersionCode", "removeShowOnlyOncePerDayStatus", "removeUserIdentityPreferences", "identityID", "Companion", "app_proPlayDebug"})
public final class SystemHelperImpl implements com.ttchain.walletproject.model.SystemHelper {
    private final android.content.Context mContext = null;
    private static final java.lang.String SYSTEM_PREFS = "system_prefs";
    private static final java.lang.String MANAGE_COIN_BEAN_LIST = "MANAGE_COIN_BEAN_LIST";
    private static final java.lang.String AGREEMENT_READ_DAY_TIMESTAMP = "AGREEMENT_READ_DAY_TIMESTAMP";
    private static final java.lang.String AGREEMENT_READ_VERSION_CODE = "AGREEMENT_READ_VERSION_CODE";
    private static final java.lang.String AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS = "AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS";
    public static final com.ttchain.walletproject.model.SystemHelperImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getManageCoinBeanListString() {
        return null;
    }
    
    @java.lang.Override()
    public void setManageCoinBeanListString(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Boolean getShowOnlyOncePerDayStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void setShowOnlyOncePerDayStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getReadDayTimeStamp() {
        return null;
    }
    
    @java.lang.Override()
    public void setReadDayTimeStamp(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public int getReadVersionCode() {
        return 0;
    }
    
    @java.lang.Override()
    public void setReadVersionCode(int value) {
    }
    
    @java.lang.Override()
    public void removeAllSharedPreferences() {
    }
    
    @java.lang.Override()
    public void removeUserIdentityPreferences(int identityID) {
    }
    
    @java.lang.Override()
    public void removeShowOnlyOncePerDayStatus() {
    }
    
    @java.lang.Override()
    public void removeReadDayTimeStamp() {
    }
    
    @java.lang.Override()
    public void removeReadVersionCode() {
    }
    
    public SystemHelperImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/model/SystemHelperImpl$Companion;", "", "()V", "AGREEMENT_READ_DAY_TIMESTAMP", "", "AGREEMENT_READ_VERSION_CODE", "AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS", "MANAGE_COIN_BEAN_LIST", "SYSTEM_PREFS", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}