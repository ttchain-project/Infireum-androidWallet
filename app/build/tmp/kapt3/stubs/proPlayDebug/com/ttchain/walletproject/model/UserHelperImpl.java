package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u0000 O2\u00020\u0001:\u0001OB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020AH\u0016J\b\u0010C\u001a\u00020AH\u0016J\b\u0010D\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020AH\u0016J\b\u0010F\u001a\u00020AH\u0016J\b\u0010G\u001a\u00020AH\u0016J\b\u0010H\u001a\u00020AH\u0016J\b\u0010I\u001a\u00020AH\u0016J\b\u0010J\u001a\u00020AH\u0016J\b\u0010K\u001a\u00020AH\u0016J\u0017\u0010L\u001a\u00020A2\b\u0010M\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0002\u0010NR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR$\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010\'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR$\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\t\"\u0004\b,\u0010\u000bR$\u0010-\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u0010\u0011R$\u00100\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R#\u00103\u001a\n 5*\u0004\u0018\u000104048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u00109\u001a\u0004\b6\u00107R#\u0010:\u001a\n 5*\u0004\u0018\u000104048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u00109\u001a\u0004\b;\u00107R$\u0010=\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010 \u00a8\u0006P"}, d2 = {"Lcom/ttchain/walletproject/model/UserHelperImpl;", "Lcom/ttchain/walletproject/model/UserHelper;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "", "createAccountResponse", "getCreateAccountResponse", "()Ljava/lang/String;", "setCreateAccountResponse", "(Ljava/lang/String;)V", "", "identityID", "getIdentityID", "()I", "setIdentityID", "(I)V", "imageCropFileName", "getImageCropFileName", "jPushExtras", "getJPushExtras", "jPushRegistrationId", "getJPushRegistrationId", "preferLanguage", "getPreferLanguage", "setPreferLanguage", "", "privacyMode", "getPrivacyMode", "()Z", "setPrivacyMode", "(Z)V", "rocketChatAuthToken", "getRocketChatAuthToken", "setRocketChatAuthToken", "rocketChatUid", "getRocketChatUid", "setRocketChatUid", "rocketChatUserId", "getRocketChatUserId", "setRocketChatUserId", "selectedWalletCategory", "getSelectedWalletCategory", "setSelectedWalletCategory", "selectedWalletID", "getSelectedWalletID", "setSelectedWalletID", "settingChanged", "getSettingChanged", "setSettingChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "userSharedPreferences", "getUserSharedPreferences", "userSharedPreferences$delegate", "userTouchId", "getUserTouchId", "setUserTouchId", "clearImageCropFileName", "", "clearJPushExtras", "removeCreateAccountResponse", "removeIdentityID", "removePreferLanguage", "removePrivacyMode", "removeRocketChatData", "removeSelectedWalletCategory", "removeSelectedWalletID", "removeSettingChanged", "removeUserTouchId", "setNotificationSwitchOn", "SwitchOn", "(Ljava/lang/Boolean;)V", "Companion", "app_proPlayDebug"})
public final class UserHelperImpl implements com.ttchain.walletproject.model.UserHelper {
    private final kotlin.Lazy sharedPreferences$delegate = null;
    private final kotlin.Lazy userSharedPreferences$delegate = null;
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_PREFS = "user_prefs";
    private static final java.lang.String SELECTED_WALLET_ID = "selected_wallet_id";
    private static final java.lang.String SELECTED_WALLET_CATEGORY = "selected_wallet_category";
    private static final java.lang.String IDENTITY_ID = "IDENTITY_ID";
    private static final java.lang.String TOUCH_ID = "TOUCH_ID";
    private static final java.lang.String PRIVACY_MODE = "PRIVACY_MODE";
    private static final java.lang.String PREF_LANGUAGE_MODE = "PREF_LANGUAGE_MODE";
    private static final java.lang.String CREATE_RESPONSE = "CREATE_RESPONSE";
    private static final java.lang.String SETTING_CHANGED = "SETTING_CHANGED";
    
    /**
     * Rocket Chat
     */
    private static final java.lang.String ROCKET_CHAT_UID = "ROCKET_CHAT_UID";
    private static final java.lang.String ROCKET_CHAT_AUTH_TOKEN = "ROCKET_CHAT_AUTH_TOKEN";
    private static final java.lang.String ROCKET_CHAT_USER_ID = "ROCKET_CHAT_USER_ID";
    private static final java.lang.String J_PUSH_REGISTRATION_ID = "J_PUSH_REGISTRATION_ID";
    private static final java.lang.String J_PUSH_EXTRAS = "J_PUSH_EXTRAS";
    private static final java.lang.String NOTIFICATION_SWITCH_ON = "NOTIFICATION_SWITCH_ON";
    private static final java.lang.String IMAGE_CROP_FILE_NAME = "IMAGE_CROP_FILE_NAME";
    public static final com.ttchain.walletproject.model.UserHelperImpl.Companion Companion = null;
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final android.content.SharedPreferences getUserSharedPreferences() {
        return null;
    }
    
    @java.lang.Override()
    public int getSelectedWalletID() {
        return 0;
    }
    
    @java.lang.Override()
    public void setSelectedWalletID(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSelectedWalletCategory() {
        return null;
    }
    
    @java.lang.Override()
    public void setSelectedWalletCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public int getIdentityID() {
        return 0;
    }
    
    @java.lang.Override()
    public void setIdentityID(int value) {
    }
    
    @java.lang.Override()
    public boolean getUserTouchId() {
        return false;
    }
    
    @java.lang.Override()
    public void setUserTouchId(boolean value) {
    }
    
    @java.lang.Override()
    public boolean getPrivacyMode() {
        return false;
    }
    
    @java.lang.Override()
    public void setPrivacyMode(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPreferLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public void setPreferLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCreateAccountResponse() {
        return null;
    }
    
    @java.lang.Override()
    public void setCreateAccountResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @java.lang.Override()
    public boolean getSettingChanged() {
        return false;
    }
    
    @java.lang.Override()
    public void setSettingChanged(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRocketChatUid() {
        return null;
    }
    
    @java.lang.Override()
    public void setRocketChatUid(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRocketChatUserId() {
        return null;
    }
    
    @java.lang.Override()
    public void setRocketChatUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRocketChatAuthToken() {
        return null;
    }
    
    @java.lang.Override()
    public void setRocketChatAuthToken(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getJPushRegistrationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getJPushExtras() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getImageCropFileName() {
        return null;
    }
    
    @java.lang.Override()
    public void removeSelectedWalletID() {
    }
    
    @java.lang.Override()
    public void removeSelectedWalletCategory() {
    }
    
    @java.lang.Override()
    public void removeIdentityID() {
    }
    
    @java.lang.Override()
    public void removeUserTouchId() {
    }
    
    @java.lang.Override()
    public void removePrivacyMode() {
    }
    
    @java.lang.Override()
    public void removePreferLanguage() {
    }
    
    @java.lang.Override()
    public void removeCreateAccountResponse() {
    }
    
    @java.lang.Override()
    public void removeSettingChanged() {
    }
    
    @java.lang.Override()
    public void removeRocketChatData() {
    }
    
    @java.lang.Override()
    public void clearJPushExtras() {
    }
    
    @java.lang.Override()
    public void setNotificationSwitchOn(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean SwitchOn) {
    }
    
    @java.lang.Override()
    public void clearImageCropFileName() {
    }
    
    public UserHelperImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ttchain/walletproject/model/UserHelperImpl$Companion;", "", "()V", "CREATE_RESPONSE", "", "IDENTITY_ID", "IMAGE_CROP_FILE_NAME", "J_PUSH_EXTRAS", "J_PUSH_REGISTRATION_ID", "NOTIFICATION_SWITCH_ON", "PREF_LANGUAGE_MODE", "PRIVACY_MODE", "ROCKET_CHAT_AUTH_TOKEN", "ROCKET_CHAT_UID", "ROCKET_CHAT_USER_ID", "SELECTED_WALLET_CATEGORY", "SELECTED_WALLET_ID", "SETTING_CHANGED", "TOUCH_ID", "USER_PREFS", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}