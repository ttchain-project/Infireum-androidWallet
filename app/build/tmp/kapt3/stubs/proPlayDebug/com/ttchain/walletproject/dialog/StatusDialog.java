package com.ttchain.walletproject.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u001b\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0000J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010 \u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010!\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/ttchain/walletproject/dialog/StatusDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "contentString", "", "isLeftBtnRed", "", "Ljava/lang/Boolean;", "leftText", "onDismiss", "Landroid/content/DialogInterface$OnDismissListener;", "onLeftClick", "Lkotlin/Function0;", "", "onRightClick", "rightText", "titleString", "onCreateDialog", "Landroidx/appcompat/app/AppCompatDialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setBtnText", "setContentString", "setIdLeftBtnRed", "setLeftBtnRedBg", "setOnDismissListener", "setOnLeftClickListener", "setOnRightClickListener", "setTitle", "app_proPlayDebug"})
public final class StatusDialog extends androidx.fragment.app.DialogFragment {
    private kotlin.jvm.functions.Function0<kotlin.Unit> onRightClick;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onLeftClick;
    private android.content.DialogInterface.OnDismissListener onDismiss;
    private java.lang.String titleString;
    private java.lang.String contentString;
    private java.lang.String rightText;
    private java.lang.String leftText;
    private java.lang.Boolean isLeftBtnRed;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setOnRightClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRightClick) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setOnLeftClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLeftClick) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setOnDismissListener(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnDismissListener onDismiss) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String titleString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setContentString(@org.jetbrains.annotations.NotNull()
    java.lang.String contentString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setIdLeftBtnRed(boolean isLeftBtnRed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setBtnText(@org.jetbrains.annotations.Nullable()
    java.lang.String rightText, @org.jetbrains.annotations.Nullable()
    java.lang.String leftText) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.dialog.StatusDialog setLeftBtnRedBg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public androidx.appcompat.app.AppCompatDialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public StatusDialog() {
        super();
    }
}