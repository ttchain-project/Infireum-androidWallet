package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\b\u00102\u001a\u000203H&J\b\u00104\u001a\u000203H&J\b\u00105\u001a\u000203H&J\b\u00106\u001a\u000203H&J\b\u00107\u001a\u000203H&J\b\u00108\u001a\u000203H&J\b\u00109\u001a\u000203H&J\b\u0010:\u001a\u000203H&J\b\u0010;\u001a\u000203H&J\b\u0010<\u001a\u000203H&J\b\u0010=\u001a\u000203H&J\u0017\u0010>\u001a\u0002032\b\u0010?\u001a\u0004\u0018\u00010\u0018H&\u00a2\u0006\u0002\u0010@R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0018\u0010\u0014\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u0018\u0010\u0017\u001a\u00020\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u0018\u0010 \u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u0018\u0010#\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u0018\u0010&\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR\u0018\u0010,\u001a\u00020\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u0018\u0010/\u001a\u00020\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001c\u00a8\u0006A"}, d2 = {"Lcom/ttchain/walletproject/model/UserHelper;", "", "createAccountResponse", "", "getCreateAccountResponse", "()Ljava/lang/String;", "setCreateAccountResponse", "(Ljava/lang/String;)V", "identityID", "", "getIdentityID", "()I", "setIdentityID", "(I)V", "imageCropFileName", "getImageCropFileName", "jPushExtras", "getJPushExtras", "jPushRegistrationId", "getJPushRegistrationId", "preferLanguage", "getPreferLanguage", "setPreferLanguage", "privacyMode", "", "getPrivacyMode", "()Z", "setPrivacyMode", "(Z)V", "rocketChatAuthToken", "getRocketChatAuthToken", "setRocketChatAuthToken", "rocketChatUid", "getRocketChatUid", "setRocketChatUid", "rocketChatUserId", "getRocketChatUserId", "setRocketChatUserId", "selectedWalletCategory", "getSelectedWalletCategory", "setSelectedWalletCategory", "selectedWalletID", "getSelectedWalletID", "setSelectedWalletID", "settingChanged", "getSettingChanged", "setSettingChanged", "userTouchId", "getUserTouchId", "setUserTouchId", "clearImageCropFileName", "", "clearJPushExtras", "removeCreateAccountResponse", "removeIdentityID", "removePreferLanguage", "removePrivacyMode", "removeRocketChatData", "removeSelectedWalletCategory", "removeSelectedWalletID", "removeSettingChanged", "removeUserTouchId", "setNotificationSwitchOn", "SwitchOn", "(Ljava/lang/Boolean;)V", "app_proPlayDebug"})
public abstract interface UserHelper {
    
    public abstract int getSelectedWalletID();
    
    public abstract void setSelectedWalletID(int p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSelectedWalletCategory();
    
    public abstract void setSelectedWalletCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract int getIdentityID();
    
    public abstract void setIdentityID(int p0);
    
    public abstract boolean getUserTouchId();
    
    public abstract void setUserTouchId(boolean p0);
    
    public abstract boolean getPrivacyMode();
    
    public abstract void setPrivacyMode(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPreferLanguage();
    
    public abstract void setPreferLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCreateAccountResponse();
    
    public abstract void setCreateAccountResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract boolean getSettingChanged();
    
    public abstract void setSettingChanged(boolean p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRocketChatUid();
    
    public abstract void setRocketChatUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRocketChatUserId();
    
    public abstract void setRocketChatUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRocketChatAuthToken();
    
    public abstract void setRocketChatAuthToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getJPushRegistrationId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getJPushExtras();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getImageCropFileName();
    
    public abstract void removeSelectedWalletID();
    
    public abstract void removeSelectedWalletCategory();
    
    public abstract void removeIdentityID();
    
    public abstract void removeUserTouchId();
    
    public abstract void removePrivacyMode();
    
    public abstract void removePreferLanguage();
    
    public abstract void removeCreateAccountResponse();
    
    public abstract void removeSettingChanged();
    
    public abstract void removeRocketChatData();
    
    public abstract void clearJPushExtras();
    
    public abstract void setNotificationSwitchOn(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean SwitchOn);
    
    public abstract void clearImageCropFileName();
}