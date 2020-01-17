package com.ttchain.walletproject.ui.userwalletsqrcodeparseresult;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u000bH\u0002J\u0010\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\'\u001a\u00020\u000bH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0002J\u001a\u0010,\u001a\u00020\u001e2\b\u0010-\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/ttchain/walletproject/ui/userwalletsqrcodeparseresult/UserWalletQrCodeParseResultViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "getQrCodeImageWalletsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getGetQrCodeImageWalletsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetQrCodeImageWalletsLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "onCreateClickErrorLiveData", "", "getOnCreateClickErrorLiveData", "onCreateClickLiveData", "getOnCreateClickLiveData", "qrCodeImageBean", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "userBean", "Lcom/ttchain/walletproject/model/UserBean;", "getUserBean", "()Lcom/ttchain/walletproject/model/UserBean;", "setUserBean", "(Lcom/ttchain/walletproject/model/UserBean;)V", "createCoinSelectionDataList", "", "createUser", "", "createWalletDataList", "getQrCodeImageWallets", "bean", "getWalletDataList", "", "Lcom/ttchain/walletproject/database/data/WalletData;", "isFromSystem", "initAssetDataList", "isExistWalletAddress", "importWalletAddress", "", "onCreateClick", "pwd", "note", "app_proPlayDebug"})
public final class UserWalletQrCodeParseResultViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.model.UserBean userBean;
    private com.ttchain.walletproject.model.UserWalletQrCodeImageBean qrCodeImageBean;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> getQrCodeImageWalletsLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> onCreateClickLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> onCreateClickErrorLiveData = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.UserBean getUserBean() {
        return null;
    }
    
    public final void setUserBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGetQrCodeImageWalletsLiveData() {
        return null;
    }
    
    public final void setGetQrCodeImageWalletsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void getQrCodeImageWallets(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.UserWalletQrCodeImageBean bean) {
    }
    
    private final boolean isExistWalletAddress(java.lang.String importWalletAddress) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOnCreateClickLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getOnCreateClickErrorLiveData() {
        return null;
    }
    
    public final void onCreateClick(@org.jetbrains.annotations.Nullable()
    java.lang.String pwd, @org.jetbrains.annotations.Nullable()
    java.lang.String note) {
    }
    
    private final int createUser() {
        return 0;
    }
    
    private final boolean createWalletDataList() {
        return false;
    }
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataList(boolean isFromSystem) {
        return null;
    }
    
    private final void createCoinSelectionDataList() {
    }
    
    private final void initAssetDataList() {
    }
    
    public UserWalletQrCodeParseResultViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
}