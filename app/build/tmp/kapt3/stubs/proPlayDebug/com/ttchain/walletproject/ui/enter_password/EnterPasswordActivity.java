package com.ttchain.walletproject.ui.enter_password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/ttchain/walletproject/ui/enter_password/EnterPasswordActivity;", "Lcom/ttchain/walletproject/base/BaseActivity;", "()V", "bundleValueQrCodeData", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "getBundleValueQrCodeData", "()Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "layoutId", "", "getLayoutId", "()I", "viewModel", "Lcom/ttchain/walletproject/ui/enter_password/EnterPasswordViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/enter_password/EnterPasswordViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initData", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_proPlayDebug"})
public final class EnterPasswordActivity extends com.ttchain.walletproject.base.BaseActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.activity_enter_password;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BUNDLE_QR_CODE_DATA = "BUNDLE_QR_CODE_DATA";
    public static final com.ttchain.walletproject.ui.enter_password.EnterPasswordActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.enter_password.EnterPasswordViewModel getViewModel() {
        return null;
    }
    
    private final com.ttchain.walletproject.model.UserWalletQrCodeImageBean getBundleValueQrCodeData() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void initData() {
    }
    
    public EnterPasswordActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/enter_password/EnterPasswordActivity$Companion;", "", "()V", "BUNDLE_QR_CODE_DATA", "", "launch", "", "activity", "Landroid/app/Activity;", "data", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "app_proPlayDebug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.UserWalletQrCodeImageBean data) {
        }
        
        private Companion() {
            super();
        }
    }
}