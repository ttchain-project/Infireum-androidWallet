package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001a\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\u0018H&J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/ttchain/walletproject/model/SystemHelper;", "", "manageCoinBeanListString", "", "getManageCoinBeanListString", "()Ljava/lang/String;", "setManageCoinBeanListString", "(Ljava/lang/String;)V", "readDayTimeStamp", "getReadDayTimeStamp", "setReadDayTimeStamp", "readVersionCode", "", "getReadVersionCode", "()I", "setReadVersionCode", "(I)V", "showOnlyOncePerDayStatus", "", "getShowOnlyOncePerDayStatus", "()Ljava/lang/Boolean;", "setShowOnlyOncePerDayStatus", "(Ljava/lang/Boolean;)V", "removeAllSharedPreferences", "", "removeReadDayTimeStamp", "removeReadVersionCode", "removeShowOnlyOncePerDayStatus", "removeUserIdentityPreferences", "identityID", "app_proPlayDebug"})
public abstract interface SystemHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getManageCoinBeanListString();
    
    public abstract void setManageCoinBeanListString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Boolean getShowOnlyOncePerDayStatus();
    
    public abstract void setShowOnlyOncePerDayStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getReadDayTimeStamp();
    
    public abstract void setReadDayTimeStamp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract int getReadVersionCode();
    
    public abstract void setReadVersionCode(int p0);
    
    public abstract void removeAllSharedPreferences();
    
    public abstract void removeUserIdentityPreferences(int identityID);
    
    public abstract void removeShowOnlyOncePerDayStatus();
    
    public abstract void removeReadDayTimeStamp();
    
    public abstract void removeReadVersionCode();
}