package com.ttchain.walletproject.ui.ttn.ttnreceipt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020!J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000b\u00a8\u0006&"}, d2 = {"Lcom/ttchain/walletproject/ui/ttn/ttnreceipt/TtnReceiptAssetViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/BaseMainModel;)V", "getTtnWalletDataLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ttchain/walletproject/database/data/WalletData;", "getGetTtnWalletDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetTtnWalletDataLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "performCaptureViewLiveData", "", "getPerformCaptureViewLiveData", "performDownloadQrCodeErrorLiveData", "", "getPerformDownloadQrCodeErrorLiveData", "performDownloadQrCodeLiveData", "", "getPerformDownloadQrCodeLiveData", "performGetQrCodeBitmapLiveData", "Landroid/graphics/Bitmap;", "getPerformGetQrCodeBitmapLiveData", "getExternalFilesDir", "Ljava/io/File;", "getSaveTmpFileName", "getTtnWalletData", "", "performCaptureView", "view", "Landroid/view/View;", "performDownloadQrCode", "rootView", "performGetQrCodeBitmap", "string", "app_proPlayDebug"})
public final class TtnReceiptAssetViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> getTtnWalletDataLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> performDownloadQrCodeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> performDownloadQrCodeErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> performGetQrCodeBitmapLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> performCaptureViewLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> getGetTtnWalletDataLiveData() {
        return null;
    }
    
    public final void setGetTtnWalletDataLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> p0) {
    }
    
    public final void getTtnWalletData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPerformDownloadQrCodeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getPerformDownloadQrCodeErrorLiveData() {
        return null;
    }
    
    public final void performDownloadQrCode(@org.jetbrains.annotations.NotNull()
    android.view.View rootView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getPerformGetQrCodeBitmapLiveData() {
        return null;
    }
    
    public final void performGetQrCodeBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformCaptureViewLiveData() {
        return null;
    }
    
    public final void performCaptureView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final java.io.File getExternalFilesDir(android.content.Context context) {
        return null;
    }
    
    private final java.lang.String getSaveTmpFileName() {
        return null;
    }
    
    public TtnReceiptAssetViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel) {
        super();
    }
}