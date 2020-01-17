package com.ttchain.walletproject.ui.scanner_new;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\"\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u0014H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\u001a\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\'2\u0006\u0010\u0015\u001a\u00020\'H\u0002J\u0018\u00101\u001a\u00020\u00142\u000e\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0016J\b\u00105\u001a\u00020\u0014H\u0002J \u00106\u001a\u00020\u00142\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\'2\u0006\u0010:\u001a\u00020\'H\u0002J\b\u0010;\u001a\u00020\u0014H\u0002J\b\u0010<\u001a\u00020\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/ttchain/walletproject/ui/scanner_new/ScannerFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "Lcom/journeyapps/barcodescanner/BarcodeCallback;", "()V", "bundleTypeValue", "", "getBundleTypeValue", "()I", "bundleTypeValue$delegate", "Lkotlin/Lazy;", "bundleValueQrCodeType", "Lcom/ttchain/walletproject/enums/QRCodeEnum;", "getBundleValueQrCodeType", "()Lcom/ttchain/walletproject/enums/QRCodeEnum;", "bundleValueQrCodeType$delegate", "layoutId", "getLayoutId", "permissionDialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "barcodeResult", "", "result", "Lcom/journeyapps/barcodescanner/BarcodeResult;", "getReadFilePermissionS", "getScannerPermission", "initView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAfterChoosePicture", "scan_type", "cr", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "onBarcodeResult", "type", "", "onDestroy", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "parserScanResultCoinId", "possibleResultPoints", "resultPoints", "", "Lcom/google/zxing/ResultPoint;", "setCamera", "showPermissionDenied", "context", "Landroid/content/Context;", "permissionType", "msg", "startDecode", "startPickImageActionScan", "Companion", "app_proPlayDebug"})
public final class ScannerFragment extends com.ttchain.walletproject.base.BaseFragment implements com.journeyapps.barcodescanner.BarcodeCallback {
    private final kotlin.Lazy bundleTypeValue$delegate = null;
    private final kotlin.Lazy bundleValueQrCodeType$delegate = null;
    private com.afollestad.materialdialogs.MaterialDialog permissionDialog;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_scanner;
    public static final int REQUEST_GET_SINGLE_FILE_SCANNER = 8001;
    public static final int REQUEST_PERMISSION_CAMERA = 101;
    public static final int REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE = 102;
    public static final com.ttchain.walletproject.ui.scanner_new.ScannerFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final int getBundleTypeValue() {
        return 0;
    }
    
    private final com.ttchain.walletproject.enums.QRCodeEnum getBundleValueQrCodeType() {
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void barcodeResult(@org.jetbrains.annotations.Nullable()
    com.journeyapps.barcodescanner.BarcodeResult result) {
    }
    
    @java.lang.Override()
    public void possibleResultPoints(@org.jetbrains.annotations.Nullable()
    java.util.List<com.google.zxing.ResultPoint> resultPoints) {
    }
    
    private final void getScannerPermission() {
    }
    
    private final void setCamera() {
    }
    
    private final void startDecode() {
    }
    
    private final void showPermissionDenied(android.content.Context context, java.lang.String permissionType, java.lang.String msg) {
    }
    
    private final void getReadFilePermissionS() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * Decode 圖片 QrCode
     */
    private final void onAfterChoosePicture(int scan_type, android.content.ContentResolver cr, android.net.Uri uri) {
    }
    
    private final void onBarcodeResult(int type, java.lang.String result) {
    }
    
    private final java.lang.String parserScanResultCoinId(java.lang.String result) {
        return null;
    }
    
    /**
     * 開啟圖片選擇器
     */
    private final void startPickImageActionScan() {
    }
    
    public ScannerFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ttchain/walletproject/ui/scanner_new/ScannerFragment$Companion;", "", "()V", "REQUEST_GET_SINGLE_FILE_SCANNER", "", "REQUEST_PERMISSION_CAMERA", "REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE", "newInstance", "Lcom/ttchain/walletproject/ui/scanner_new/ScannerFragment;", "type", "qrCodeType", "Lcom/ttchain/walletproject/enums/QRCodeEnum;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.scanner_new.ScannerFragment newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.scanner_new.ScannerFragment newInstance(@com.ttchain.walletproject.ui.scanner_new.ScannerActivity.ScanType()
        int type, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.QRCodeEnum qrCodeType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}