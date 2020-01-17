package com.ttchain.walletproject.ui.scanner_new;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/ttchain/walletproject/ui/scanner_new/ScannerActivity;", "Lcom/ttchain/walletproject/base/BaseActivity;", "()V", "layoutId", "", "getLayoutId", "()I", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ScanType", "app_proPlayDebug"})
public final class ScannerActivity extends com.ttchain.walletproject.base.BaseActivity {
    private final int layoutId = com.ttchain.walletproject.R.layout.activity_scanner;
    public static final int REQUEST_CODE = 881;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CODE_ADDRESS = "EXTRA_CODE_ADDRESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CODE_AMOUNT = "EXTRA_CODE_AMOUNT";
    public static final int BASIC = 1;
    public static final int ADVANCED = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _ID = "_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QRCODE_TYPE = "QRCODE_TYPE";
    public static final com.ttchain.walletproject.ui.scanner_new.ScannerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    public ScannerActivity() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {1, 2})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/ttchain/walletproject/ui/scanner_new/ScannerActivity$ScanType;", "", "app_proPlayDebug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface ScanType {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/ui/scanner_new/ScannerActivity$Companion;", "", "()V", "ADVANCED", "", "BASIC", "EXTRA_CODE_ADDRESS", "", "EXTRA_CODE_AMOUNT", "QRCODE_TYPE", "REQUEST_CODE", "_ID", "launch", "", "activity", "Landroid/app/Activity;", "type", "qrCodeType", "Lcom/ttchain/walletproject/enums/QRCodeEnum;", "launchForResult", "fragment", "Landroidx/fragment/app/Fragment;", "app_proPlayDebug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @com.ttchain.walletproject.ui.scanner_new.ScannerActivity.ScanType()
        int type, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.QRCodeEnum qrCodeType) {
        }
        
        public final void launchForResult(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @com.ttchain.walletproject.ui.scanner_new.ScannerActivity.ScanType()
        int type, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.QRCodeEnum qrCodeType) {
        }
        
        private Companion() {
            super();
        }
    }
}