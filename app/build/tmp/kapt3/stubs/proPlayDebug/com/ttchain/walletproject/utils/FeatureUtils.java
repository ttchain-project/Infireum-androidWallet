package com.ttchain.walletproject.utils;

import java.lang.System;

/**
 * This class is controlling feature enable or not depend on different staff or different situation.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010 \u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0011\u0010!\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u0011\u0010\"\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001aR\u0011\u0010#\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001a\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/utils/FeatureUtils;", "", "()V", "FLAVOR_PRO", "", "getFLAVOR_PRO", "()Ljava/lang/String;", "setFLAVOR_PRO", "(Ljava/lang/String;)V", "PLATFORM_HOCKEY", "getPLATFORM_HOCKEY", "setPLATFORM_HOCKEY", "PLATFORM_PLAY", "getPLATFORM_PLAY", "setPLATFORM_PLAY", "TYPE_DEVELOPER", "getTYPE_DEVELOPER", "setTYPE_DEVELOPER", "TYPE_RELEASE", "getTYPE_RELEASE", "setTYPE_RELEASE", "TYPE_RELEASE_BETA", "getTYPE_RELEASE_BETA", "setTYPE_RELEASE_BETA", "isBeta", "", "()Z", "isDeveloper", "isFabricEnable", "isFlurryEnable", "isGaEnable", "isHockeyPlatform", "isPlayPlatform", "isProApi", "isPublish", "isRelease", "app_proPlayDebug"})
public final class FeatureUtils {
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FLAVOR_PRO;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TYPE_DEVELOPER;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TYPE_RELEASE;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TYPE_RELEASE_BETA;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String PLATFORM_HOCKEY;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String PLATFORM_PLAY;
    public static final com.ttchain.walletproject.utils.FeatureUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFLAVOR_PRO() {
        return null;
    }
    
    public final void setFLAVOR_PRO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTYPE_DEVELOPER() {
        return null;
    }
    
    public final void setTYPE_DEVELOPER(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTYPE_RELEASE() {
        return null;
    }
    
    public final void setTYPE_RELEASE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTYPE_RELEASE_BETA() {
        return null;
    }
    
    public final void setTYPE_RELEASE_BETA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPLATFORM_HOCKEY() {
        return null;
    }
    
    public final void setPLATFORM_HOCKEY(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPLATFORM_PLAY() {
        return null;
    }
    
    public final void setPLATFORM_PLAY(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isProApi() {
        return false;
    }
    
    public final boolean isDeveloper() {
        return false;
    }
    
    public final boolean isRelease() {
        return false;
    }
    
    public final boolean isBeta() {
        return false;
    }
    
    public final boolean isPublish() {
        return false;
    }
    
    public final boolean isGaEnable() {
        return false;
    }
    
    public final boolean isFabricEnable() {
        return false;
    }
    
    public final boolean isHockeyPlatform() {
        return false;
    }
    
    public final boolean isPlayPlatform() {
        return false;
    }
    
    public final boolean isFlurryEnable() {
        return false;
    }
    
    private FeatureUtils() {
        super();
    }
}