package com.ttchain.walletproject.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/utils/BiometricUtil;", "", "()V", "hasBiometricEnrolled", "", "context", "Landroid/content/Context;", "isHardwareAvailable", "isSdkVersionSupported", "app_proPlayDebug"})
public final class BiometricUtil {
    public static final com.ttchain.walletproject.utils.BiometricUtil INSTANCE = null;
    
    public final boolean isSdkVersionSupported() {
        return false;
    }
    
    public final boolean isHardwareAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean hasBiometricEnrolled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private BiometricUtil() {
        super();
    }
}