package com.ttchain.walletproject.ui.receiptasset;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\fH\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010\'\u001a\u00020\u001aH\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aH\u0002J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u001aH\u0002J\u0006\u00100\u001a\u00020+J\u0006\u00101\u001a\u00020+J\u0006\u00102\u001a\u00020+J\u0006\u00103\u001a\u00020+J\u0006\u00104\u001a\u00020+R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/ttchain/walletproject/ui/receiptasset/ReceiptAssetViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "walletRepository", "Lcom/ttchain/walletproject/repository/WalletRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/repository/WalletRepository;)V", "coinId", "", "getCoinId", "()I", "setCoinId", "(I)V", "performCaptureViewLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getPerformCaptureViewLiveData", "()Landroidx/lifecycle/MutableLiveData;", "performGetQrCodeBitmapLiveData", "Landroid/graphics/Bitmap;", "getPerformGetQrCodeBitmapLiveData", "performGetQrCodeTitleNameLiveData", "", "getPerformGetQrCodeTitleNameLiveData", "performGetTitleNameLiveData", "getPerformGetTitleNameLiveData", "performGetUserSelectedWalletLiveData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getPerformGetUserSelectedWalletLiveData", "getCoinDataByCoinID", "Lcom/ttchain/walletproject/database/data/CoinData;", "coinID", "getDefaultCoinDataByMainCoinId", "mainCoinId", "getDefaultWalletTitleName", "getSaveTmpFileName", "getWalletTitleNameByAddress", "address", "performCaptureView", "", "view", "Landroid/view/View;", "performGetQrCodeBitmap", "string", "performGetQrCodeTitleName", "performGetTitleName", "performGetUserSelectedWallet", "performUpdateQrCodeBitmap", "updateCoinID", "app_proPlayDebug"})
public final class ReceiptAssetViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    private int coinId;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> performGetQrCodeTitleNameLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> performGetQrCodeBitmapLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> performGetTitleNameLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> performGetUserSelectedWalletLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> performCaptureViewLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.repository.WalletRepository walletRepository = null;
    
    public final int getCoinId() {
        return 0;
    }
    
    public final void setCoinId(int p0) {
    }
    
    public final void updateCoinID() {
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getDefaultCoinDataByMainCoinId(java.lang.String mainCoinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPerformGetQrCodeTitleNameLiveData() {
        return null;
    }
    
    public final void performGetQrCodeTitleName() {
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getCoinDataByCoinID(int coinID) {
        return null;
    }
    
    public final void performUpdateQrCodeBitmap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getPerformGetQrCodeBitmapLiveData() {
        return null;
    }
    
    private final void performGetQrCodeBitmap(java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPerformGetTitleNameLiveData() {
        return null;
    }
    
    public final void performGetTitleName() {
    }
    
    private final java.lang.String getDefaultWalletTitleName() {
        return null;
    }
    
    private final java.lang.String getWalletTitleNameByAddress(java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> getPerformGetUserSelectedWalletLiveData() {
        return null;
    }
    
    public final void performGetUserSelectedWallet() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformCaptureViewLiveData() {
        return null;
    }
    
    public final void performCaptureView(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final java.lang.String getSaveTmpFileName() {
        return null;
    }
    
    public ReceiptAssetViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.WalletRepository walletRepository) {
        super();
    }
}