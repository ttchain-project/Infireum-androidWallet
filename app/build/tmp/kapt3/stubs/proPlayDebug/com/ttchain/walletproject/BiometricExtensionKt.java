package com.ttchain.walletproject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"FINGERPRINT_REQUEST_CODE", "", "goToBiometricEnrolledSetting", "", "Landroid/app/Activity;", "isBiometricEnrolled", "", "Landroid/content/Context;", "isSupportBiometric", "app_proPlayDebug"})
public final class BiometricExtensionKt {
    public static final int FINGERPRINT_REQUEST_CODE = 121;
    
    /**
     * 檢查是否支援生物辨識
     * @receiver Context
     * @return Boolean
     */
    public static final boolean isSupportBiometric(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isSupportBiometric) {
        return false;
    }
    
    /**
     * 檢查是否有進行生物辨識登記
     * @receiver Context
     * @return Boolean
     */
    public static final boolean isBiometricEnrolled(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isBiometricEnrolled) {
        return false;
    }
    
    /**
     * 前往設定生物辨識
     * @receiver Activity
     */
    public static final void goToBiometricEnrolledSetting(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$goToBiometricEnrolledSetting) {
    }
}