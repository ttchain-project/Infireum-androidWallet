package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0016H$J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\u0006\u0010%\u001a\u00020\u0016J\u0006\u0010&\u001a\u00020\u0016J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)J\u001e\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010+J&\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010+J>\u0010\'\u001a\u00020\u00162\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\u0006\u00100\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010+JF\u0010\'\u001a\u00020\u00162\u0006\u00101\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010+2\u0006\u00100\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010+J\u000e\u00102\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)J\b\u00103\u001a\u00020\u0016H\u0002J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u0016J\b\u00106\u001a\u00020\u0016H\u0002JT\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020)2!\u00109\u001a\u001d\u0012\u0013\u0012\u00110)\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00160:2!\u0010>\u001a\u001d\u0012\u0013\u0012\u00110)\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00160:JV\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020A2!\u0010B\u001a\u001d\u0012\u0013\u0012\u00110A\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00160:2!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110A\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(@\u0012\u0004\u0012\u00020\u00160:H\u0007JA\u0010D\u001a\u00020\u00162\u0006\u00101\u001a\u00020)2\u0006\u0010E\u001a\u00020)2\u0006\u00108\u001a\u00020)2!\u0010F\u001a\u001d\u0012\u0013\u0012\u00110)\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(G\u0012\u0004\u0012\u00020\u00160:J$\u0010H\u001a\u00020\u00162\u0006\u00101\u001a\u00020)2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020)0J2\u0006\u0010K\u001a\u00020LJ\u0018\u0010M\u001a\u00020\u00162\u0006\u00101\u001a\u00020)2\b\u0010E\u001a\u0004\u0018\u00010)J\u0006\u0010N\u001a\u00020\u0016J\u000e\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020)J\u0016\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020)2\u0006\u0010Q\u001a\u00020\u000eJ\u000e\u0010R\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\fJ1\u0010T\u001a\u00020\u00162\u0006\u00108\u001a\u00020)2!\u0010U\u001a\u001d\u0012\u0013\u0012\u00110)\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00160:J\b\u0010V\u001a\u00020\u0016H\u0002J\u0016\u0010W\u001a\u00020\u00162\u0006\u0010X\u001a\u00020)2\u0006\u0010Y\u001a\u00020\u000eR\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lcom/ttchain/walletproject/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "configViewModel", "Lcom/ttchain/walletproject/base/BaseConfigViewModel;", "getConfigViewModel", "()Lcom/ttchain/walletproject/base/BaseConfigViewModel;", "configViewModel$delegate", "Lkotlin/Lazy;", "dappConfirmDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "isAvatar", "", "layoutId", "", "getLayoutId", "()I", "mProgressDialog", "Lcom/git4u/tt_wallet_android/ui/dialog/ProgressTitleDialog;", "messageDialog", "Lcom/ttchain/walletproject/dialog/MessageDialog;", "finishActivity", "", "getCameraPermission", "getReadFilePermission", "getToolbar", "Landroidx/appcompat/widget/Toolbar;", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onHideLoading", "onShowLoading", "onShowMessageDialog", "msg", "", "positiveListener", "Lkotlin/Function0;", "positive", "titleText", "negativeText", "negativeListener", "positiveText", "title", "onShowMessageDialogFinish", "releaseDappConfirmDialog", "releaseProgressDialog", "restartApplication", "setCameraIntent", "showAuthenticationDialog", "hint", "pwdListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "password", "bioListener", "showDappConfirmDialog", "transaction", "Lcom/ttchain/walletproject/model/Transaction;", "onCancelClick", "onConfirmClick", "showInputDialog", "content", "inputCallBack", "input", "showItemListDialog", "items", "", "callback", "Lcom/afollestad/materialdialogs/MaterialDialog$ListCallback;", "showProgressDialog", "showSelectAvatarDialog", "showToast", "message", "lengthLong", "showToolbar", "show", "showVerifyPwdDialog", "listener", "startPickImageAction", "updateProgressDialog", "progress", "progressPercent", "Companion", "app_proPlayDebug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy configViewModel$delegate = null;
    private com.ttchain.walletproject.dialog.MessageDialog messageDialog;
    private final com.git4u.tt_wallet_android.ui.dialog.ProgressTitleDialog mProgressDialog = null;
    private boolean isAvatar;
    private com.afollestad.materialdialogs.MaterialDialog dappConfirmDialog;
    private static final int SELECT_FROM_GALLERY = 0;
    private static final int SELECT_FROM_CAMERA = 1;
    private static final int REQUEST_GET_SINGLE_IMAGE = 9001;
    private static final int REQUEST_IMAGE_CAPTURE = 9002;
    private static final java.lang.String UPLOAD_PNG = "upload.png";
    public static final com.ttchain.walletproject.base.BaseFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract int getLayoutId();
    
    protected abstract void initView();
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.base.BaseConfigViewModel getConfigViewModel() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void showToolbar(boolean show) {
    }
    
    public final void showInputDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> inputCallBack) {
    }
    
    public final void onShowMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveListener) {
    }
    
    public final void onShowMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String titleText, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> negativeListener, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveListener) {
    }
    
    public final void onShowMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> negativeListener, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveListener) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void finishActivity() {
    }
    
    public final void onShowMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void onShowMessageDialogFinish(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void onShowMessageDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String positive, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveListener) {
    }
    
    public final void onShowLoading() {
    }
    
    public final void onHideLoading() {
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String content) {
    }
    
    public final void updateProgressDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String progress, int progressPercent) {
    }
    
    public final void releaseProgressDialog() {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int lengthLong) {
    }
    
    public final void showItemListDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    com.afollestad.materialdialogs.MaterialDialog.ListCallback callback) {
    }
    
    public final void showSelectAvatarDialog() {
    }
    
    public final void getReadFilePermission(boolean isAvatar) {
    }
    
    private final void startPickImageAction() {
    }
    
    public final void getCameraPermission(boolean isAvatar) {
    }
    
    private final void setCameraIntent() {
    }
    
    public final void restartApplication() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void showDappConfirmDialog(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.Transaction transaction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ttchain.walletproject.model.Transaction, kotlin.Unit> onCancelClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ttchain.walletproject.model.Transaction, kotlin.Unit> onConfirmClick) {
    }
    
    private final void releaseDappConfirmDialog() {
    }
    
    public final void showAuthenticationDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> pwdListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> bioListener) {
    }
    
    public final void showVerifyPwdDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String hint, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> listener) {
    }
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/ttchain/walletproject/base/BaseFragment$Companion;", "", "()V", "REQUEST_GET_SINGLE_IMAGE", "", "REQUEST_IMAGE_CAPTURE", "SELECT_FROM_CAMERA", "SELECT_FROM_GALLERY", "UPLOAD_PNG", "", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}