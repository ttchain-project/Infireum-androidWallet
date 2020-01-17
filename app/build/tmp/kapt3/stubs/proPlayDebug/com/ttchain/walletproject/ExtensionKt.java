package com.ttchain.walletproject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000z\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003\u001a\u0006\u0010\r\u001a\u00020\u0003\u001a\u0006\u0010\u000e\u001a\u00020\u0003\u001a\u0006\u0010\u000f\u001a\u00020\u0003\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u001a\u001a\u0010\u0015\u001a\u00020\u0011*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003\u001a\u001a\u0010\u001a\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u001a\u0010\u001a\u001a\u00020\u0011*\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u001a\u0010\u001d\u001a\u00020\u0011*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u001e\u001a\u00020\u0011*\u00020\u0012\u001a\u0012\u0010\u001f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010!\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003\u001a\n\u0010#\u001a\u00020\u0011*\u00020$\u001a\u0012\u0010%\u001a\u00020\u0011*\u00020&2\u0006\u0010%\u001a\u00020\u0003\u001a\n\u0010\'\u001a\u00020(*\u00020)\u001a\u001e\u0010*\u001a\b\u0012\u0004\u0012\u0002H,0+\"\u0004\b\u0000\u0010,*\u00020\u00182\u0006\u0010-\u001a\u00020\u0003\u001a\u0014\u0010.\u001a\u00020\u0011*\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u00101\u001a\u00020\u0011*\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u00102\u001a\u00020\u0001\u001a\u0012\u00103\u001a\u00020\u0011*\u00020/2\u0006\u00100\u001a\u00020\u0003\u001a\u0012\u00104\u001a\u00020\u0011*\u00020\t2\u0006\u00100\u001a\u00020\u0003\u001a\u0012\u00105\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u00106\u001a\u00020\u0011*\u00020\u00122\u0006\u00107\u001a\u000208\u001a\u001e\u00109\u001a\u00020\u0011*\u0002082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00110;\u001a\n\u0010<\u001a\u00020\u0011*\u000208\u001a\u0012\u0010=\u001a\u00020\u0011*\u00020\t2\u0006\u0010>\u001a\u00020\u0003\u001a\u0012\u0010?\u001a\u00020\u0011*\u00020\u00182\u0006\u0010@\u001a\u00020\u0001\u001a\u001c\u0010A\u001a\b\u0012\u0004\u0012\u0002H,0B\"\u0004\b\u0000\u0010,*\b\u0012\u0004\u0012\u0002H,0B\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"clientPort", "", "mainNetHost", "", "serverPort", "showNumber", "testNetHost", "decrypt", "context", "Landroid/content/Context;", "cipherText", "encrypt", "plaintext", "getTtnBalanceHost", "getTtnClientNet", "getTtnServerNet", "add", "", "Lcom/ttchain/walletproject/base/BaseDialogFragment;", "subscription", "Lio/reactivex/disposables/Disposable;", "addDialog", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "addFragment", "Landroidx/appcompat/app/AppCompatActivity;", "container", "changeFragment", "clear", "decryptString", "encryptString", "handleAmount", "coinId", "hideKeyboard", "Landroid/app/Activity;", "html", "Landroid/widget/TextView;", "isZero", "", "Ljava/math/BigDecimal;", "lazy", "Lkotlin/Lazy;", "T", "key", "loadCenterInside", "Landroid/widget/ImageView;", "url", "loadCenterInsideRoundedCorners", "roundingRadius", "loadCoinCenterCrop", "openWebUrl", "performCopyString", "setBehaviorView", "view", "Landroid/view/View;", "setDelayClickListener", "onDelayOnClick", "Lkotlin/Function1;", "showKeyboard", "showToast", "message", "startSettingActivity", "requestCode", "toMain", "Lio/reactivex/Observable;", "app_proPlayDebug"})
public final class ExtensionKt {
    public static final int showNumber = 4;
    
    /**
     * 鏈 host
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String mainNetHost = "http://3.1.196.86";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String testNetHost = "http://13.251.130.190";
    
    /**
     * 鏈 Server Port
     */
    public static final int serverPort = 9998;
    
    /**
     * 鏈 Client Port
     */
    public static final int clientPort = 9997;
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> toMain(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $this$toMain) {
        return null;
    }
    
    public static final void add(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.base.BaseDialogFragment $this$add, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable subscription) {
    }
    
    public static final void clear(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.base.BaseDialogFragment $this$clear) {
    }
    
    public static final void setBehaviorView(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.base.BaseDialogFragment $this$setBehaviorView, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final boolean isZero(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal $this$isZero) {
        return false;
    }
    
    public static final void addDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager $this$addDialog, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public static final void changeFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$changeFragment, int container, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragment, int container, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$addFragment, int container, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    /**
     * Delay click listener
     */
    public static final void setDelayClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setDelayClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onDelayOnClick) {
    }
    
    public static final void loadCoinCenterCrop(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCoinCenterCrop, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void loadCenterInside(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCenterInside, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public static final void loadCenterInsideRoundedCorners(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCenterInsideRoundedCorners, @org.jetbrains.annotations.Nullable()
    java.lang.String url, int roundingRadius) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showToast, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public static final void performCopyString(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$performCopyString, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String plaintext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String cipherText) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String encryptString(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$encryptString, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String decryptString(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$decryptString, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * 外開url
     */
    public static final void openWebUrl(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openWebUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    /**
     * 關閉鍵盤
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard) {
    }
    
    /**
     * 開啟鍵盤
     */
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard) {
    }
    
    /**
     * 載入html文字
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    public static final void html(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$html, @org.jetbrains.annotations.NotNull()
    java.lang.String html) {
    }
    
    /**
     * 統一處理幣種數值
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String handleAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$handleAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTtnServerNet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTtnClientNet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTtnBalanceHost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlin.Lazy<T> lazy(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$lazy, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public static final void startSettingActivity(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$startSettingActivity, int requestCode) {
    }
}