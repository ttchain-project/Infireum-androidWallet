package com.ttchain.walletproject.ui.wallet.exportkey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\rH\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/exportkey/ExportKeyViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "performGetQrCodeBitmapLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getPerformGetQrCodeBitmapLiveData", "()Landroidx/lifecycle/MutableLiveData;", "performGetWalletEpKeyLiveData", "", "getPerformGetWalletEpKeyLiveData", "walletId", "", "getWalletId", "()I", "setWalletId", "(I)V", "getWalletEpKey", "performGetQrCodeBitmap", "", "performGetWalletEpKey", "app_proPlayDebug"})
public final class ExportKeyViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    private int walletId;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> performGetQrCodeBitmapLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> performGetWalletEpKeyLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    
    public final int getWalletId() {
        return 0;
    }
    
    public final void setWalletId(int p0) {
    }
    
    private final java.lang.String getWalletEpKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getPerformGetQrCodeBitmapLiveData() {
        return null;
    }
    
    public final void performGetQrCodeBitmap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPerformGetWalletEpKeyLiveData() {
        return null;
    }
    
    public final void performGetWalletEpKey() {
    }
    
    public ExportKeyViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
}