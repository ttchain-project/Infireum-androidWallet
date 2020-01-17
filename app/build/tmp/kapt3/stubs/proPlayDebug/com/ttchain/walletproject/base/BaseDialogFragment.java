package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001cR \u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006%"}, d2 = {"Lcom/ttchain/walletproject/base/BaseDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "mBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getMBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setMBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "mCompositeDisposable$delegate", "Lkotlin/Lazy;", "mExpanded", "", "getMExpanded", "()Z", "setMExpanded", "(Z)V", "mMessageDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getMMessageDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "setMMessageDialog", "(Lcom/afollestad/materialdialogs/MaterialDialog;)V", "mParentClassSimpleName", "", "getMParentClassSimpleName", "()Ljava/lang/String;", "mParentClassSimpleName$delegate", "onDestroy", "", "onStart", "showMessageDialog", "msg", "app_proPlayDebug"})
public class BaseDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.Nullable()
    private com.afollestad.materialdialogs.MaterialDialog mMessageDialog;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.Lazy mParentClassSimpleName$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mCompositeDisposable$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> mBehavior;
    private boolean mExpanded;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.afollestad.materialdialogs.MaterialDialog getMMessageDialog() {
        return null;
    }
    
    public final void setMMessageDialog(@org.jetbrains.annotations.Nullable()
    com.afollestad.materialdialogs.MaterialDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMParentClassSimpleName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getMCompositeDisposable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<?> getMBehavior() {
        return null;
    }
    
    public final void setMBehavior(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomsheet.BottomSheetBehavior<?> p0) {
    }
    
    public final boolean getMExpanded() {
        return false;
    }
    
    public final void setMExpanded(boolean p0) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void showMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public BaseDialogFragment() {
        super();
    }
}