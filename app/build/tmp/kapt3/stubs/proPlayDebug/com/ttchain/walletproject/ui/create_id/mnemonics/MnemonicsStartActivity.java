package com.ttchain.walletproject.ui.create_id.mnemonics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/ttchain/walletproject/ui/create_id/mnemonics/MnemonicsStartActivity;", "Lcom/ttchain/walletproject/base/BaseActivity;", "()V", "bundleValue", "Lcom/ttchain/walletproject/model/UserBean;", "getBundleValue", "()Lcom/ttchain/walletproject/model/UserBean;", "bundleValue$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "viewModel", "Lcom/ttchain/walletproject/ui/create_id/mnemonics/MnemonicsStartViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/create_id/mnemonics/MnemonicsStartViewModel;", "viewModel$delegate", "initData", "", "initViews", "onBackUp", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showWarningDialog", "Companion", "app_proPlayDebug"})
public final class MnemonicsStartActivity extends com.ttchain.walletproject.base.BaseActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy bundleValue$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.activity_mnemonics_start;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _ID = "_ID";
    public static final com.ttchain.walletproject.ui.create_id.mnemonics.MnemonicsStartActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.create_id.mnemonics.MnemonicsStartViewModel getViewModel() {
        return null;
    }
    
    private final com.ttchain.walletproject.model.UserBean getBundleValue() {
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
    
    private final void initViews() {
    }
    
    private final void initData() {
    }
    
    private final void onBackUp() {
    }
    
    private final void showWarningDialog() {
    }
    
    public MnemonicsStartActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/create_id/mnemonics/MnemonicsStartActivity$Companion;", "", "()V", "_ID", "", "launch", "", "activity", "Landroid/app/Activity;", "userBean", "Lcom/ttchain/walletproject/model/UserBean;", "app_proPlayDebug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.UserBean userBean) {
        }
        
        private Companion() {
            super();
        }
    }
}