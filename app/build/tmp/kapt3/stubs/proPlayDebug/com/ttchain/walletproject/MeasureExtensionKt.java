package com.ttchain.walletproject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002\u00a8\u0006\u0011"}, d2 = {"checkDeviceHasNavigationBar", "", "Landroid/content/Context;", "dp2px", "", "", "context", "getNavigationBar", "getScreenDensity", "getScreenHeight", "getScreenSize", "Landroid/graphics/Point;", "getScreenWidth", "getStatusBarHeight", "px2dp", "px2sp", "sp2px", "app_proPlayDebug"})
public final class MeasureExtensionKt {
    
    /**
     * Dp to px
     * @receiver Float Dp float
     * @param context Context context
     * @return Int = px
     */
    public static final int dp2px(float $this$dp2px, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * Sp to px
     * @receiver Float Sp Float
     * @param context Context context
     * @return Int = px
     */
    public static final int sp2px(float $this$sp2px, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * Px to dp
     * @receiver Float Px float
     * @param context Context context
     * @return Float = dp
     */
    public static final float px2dp(float $this$px2dp, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0.0F;
    }
    
    /**
     * Px to sp
     * @receiver Float Px float
     * @param context Context context
     * @return Float = sp
     */
    public static final float px2sp(float $this$px2sp, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0.0F;
    }
    
    /**
     * Get screen width
     * @receiver Context context
     * @return Int = screen width
     */
    public static final int getScreenWidth(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getScreenWidth) {
        return 0;
    }
    
    /**
     * Get screen height
     * @receiver Context context
     * @return Int = Screen height
     */
    public static final int getScreenHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getScreenHeight) {
        return 0;
    }
    
    /**
     * 取得 NavigationBar 高度
     * @receiver Context
     * @return Int = NavigationBar Height
     */
    public static final int getNavigationBar(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getNavigationBar) {
        return 0;
    }
    
    /**
     * 取得 status Bar 高度
     * @receiver Context
     * @return Int = StatusBar Height
     */
    public static final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getStatusBarHeight) {
        return 0;
    }
    
    /**
     * Check Device Has NavigationBar
     * @receiver Context
     * @return Boolean = hasNavigationBar?
     */
    @android.annotation.SuppressLint(value = {"PrivateApi"})
    public static final boolean checkDeviceHasNavigationBar(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$checkDeviceHasNavigationBar) {
        return false;
    }
    
    /**
     * 取得螢幕尺寸
     * @receiver context context
     * @return point point
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Point getScreenSize(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getScreenSize) {
        return null;
    }
    
    /**
     * 取得螢幕解析度
     * @receiver Context
     * @return Float = 螢幕解析度
     */
    public static final float getScreenDensity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getScreenDensity) {
        return 0.0F;
    }
}