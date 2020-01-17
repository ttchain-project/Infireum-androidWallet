package com.ttchain.walletproject.ui.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0003J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0014J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0004H\u0003J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0003J\b\u0010\'\u001a\u00020\u0019H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0003J\u001c\u0010+\u001a\u00020\u00192\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010.\u001a\u00020\u0004H\u0003J\u0018\u0010/\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0004H\u0003J\u001a\u00100\u001a\u00020\u00192\u0006\u0010%\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u000201H\u0003R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00067"}, d2 = {"Lcom/ttchain/walletproject/ui/webview/WebViewFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "()V", "bundleValue", "", "getBundleValue", "()Ljava/lang/String;", "bundleValue$delegate", "Lkotlin/Lazy;", "isInjected", "", "jsInjectorClient", "Lcom/ttchain/walletproject/ui/webview/JsInjectorClient;", "layoutId", "", "getLayoutId", "()I", "lock", "", "viewModel", "Lcom/ttchain/walletproject/ui/webview/WebViewViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/webview/WebViewViewModel;", "viewModel$delegate", "callbackToJS", "", "callbackId", "", "function", "param", "destroyWebView", "getSuccessFunction", "initData", "initView", "initWebView", "ethAddress", "injectScriptFile", "view", "Landroid/webkit/WebView;", "onDestroy", "onSignCancel", "transaction", "Lcom/ttchain/walletproject/model/Transaction;", "onSignMessageSuccessful", "message", "Lcom/ttchain/walletproject/model/Message;", "signHex", "onSignTransactionSuccessful", "onViewCreated", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showPopupMenu", "menuItemView", "Companion", "app_proPlayDebug"})
public final class WebViewFragment extends com.ttchain.walletproject.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.lang.Object lock = null;
    private boolean isInjected;
    private com.ttchain.walletproject.ui.webview.JsInjectorClient jsInjectorClient;
    private final kotlin.Lazy bundleValue$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_web_view;
    private static final java.lang.String JS_PROTOCOL_CANCELLED = "cancelled";
    private static final java.lang.String JS_PROTOCOL_ON_SUCCESSFUL = "onSignSuccessful(%1$s, \"%2$s\")";
    private static final java.lang.String JS_PROTOCOL_ON_FAILURE = "onSignError(%1$s, \"%2$s\")";
    public static final com.ttchain.walletproject.ui.webview.WebViewFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.webview.WebViewViewModel getViewModel() {
        return null;
    }
    
    private final java.lang.String getBundleValue() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * Wait for zoom control to fade away.
     * https://code.google.com/p/android/issues/detail?id=15694
     * http://stackoverflow.com/a/5966151/1797648
     */
    private final void destroyWebView() {
    }
    
    private final void initData() {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    private final void initWebView(java.lang.String ethAddress) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void showPopupMenu(android.view.View menuItemView) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void onSignCancel(com.ttchain.walletproject.model.Transaction transaction) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void callbackToJS(long callbackId, java.lang.String function, java.lang.String param) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void onSignTransactionSuccessful(com.ttchain.walletproject.model.Transaction transaction, java.lang.String signHex) {
    }
    
    private final java.lang.String getSuccessFunction(java.lang.String param) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void onSignMessageSuccessful(com.ttchain.walletproject.model.Message<?> message, java.lang.String signHex) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    private final void injectScriptFile(android.webkit.WebView view) {
    }
    
    public WebViewFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/ttchain/walletproject/ui/webview/WebViewFragment$Companion;", "", "()V", "JS_PROTOCOL_CANCELLED", "", "JS_PROTOCOL_ON_FAILURE", "JS_PROTOCOL_ON_SUCCESSFUL", "newInstance", "Lcom/ttchain/walletproject/ui/webview/WebViewFragment;", "url", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.webview.WebViewFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}