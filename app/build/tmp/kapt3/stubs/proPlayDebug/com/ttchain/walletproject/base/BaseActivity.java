package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J\u0006\u0010\u0013\u001a\u00020\fJ\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\fH\u0014J\u0006\u0010\u0018\u001a\u00020\fJ\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0014J\u0006\u0010\u001d\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020 J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/ttchain/walletproject/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "layoutId", "", "getLayoutId", "()I", "mProgressDialog", "Lcom/ttchain/walletproject/dialog/ProgressDialog;", "messageDialog", "Lcom/ttchain/walletproject/dialog/MessageDialog;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "closeAllDialog", "displayHomeButton", "isDisplay", "", "finishActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onHideLoading", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "onShowLoading", "onShowMessageDialog", "msg", "", "onShowMessageDialogFinish", "showToast", "message", "lengthLong", "app_proPlayDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.ttchain.walletproject.dialog.ProgressDialog mProgressDialog;
    private com.ttchain.walletproject.dialog.MessageDialog messageDialog;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract int getLayoutId();
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    protected final void displayHomeButton(boolean isDisplay) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void onShowLoading() {
    }
    
    public final void onHideLoading() {
    }
    
    public final void onShowMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void onShowMessageDialogFinish(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    private final void closeAllDialog() {
    }
    
    public final void finishActivity() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int lengthLong) {
    }
    
    public BaseActivity() {
        super();
    }
}