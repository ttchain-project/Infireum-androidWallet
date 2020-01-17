package com.ttchain.walletproject.ui.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0015H\u0002J\u0018\u0010\'\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0015H\u0002J\u000e\u0010)\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001cJ\u0014\u0010*\u001a\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0,J\u0014\u0010-\u001a\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0,J\u0016\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/ttchain/walletproject/ui/webview/WebViewViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;Lcom/ttchain/walletproject/repository/BroadcastRepository;)V", "onSignMessageSuccessfulLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "", "getOnSignMessageSuccessfulLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setOnSignMessageSuccessfulLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "onSignTransactionSuccessfulLiveData", "getOnSignTransactionSuccessfulLiveData", "setOnSignTransactionSuccessfulLiveData", "onViewCreateLivaData", "", "getOnViewCreateLivaData", "setOnViewCreateLivaData", "signPersonalMessageLiveData", "getSignPersonalMessageLiveData", "setSignPersonalMessageLiveData", "signTxActionLiveData", "Lcom/ttchain/walletproject/model/Transaction;", "getSignTxActionLiveData", "setSignTxActionLiveData", "getEthWalletDataList", "", "Lcom/ttchain/walletproject/database/data/WalletData;", "onViewCreate", "", "performEthBroadcastRequest", "transaction", "signText", "performEthSignRequest", "nonce", "performGetEthNonceRequest", "performSignPersonalMessage", "message", "Lcom/ttchain/walletproject/model/Message;", "signPersonalMessage", "signTxAction", "webView", "Landroid/webkit/WebView;", "app_proPlayDebug"})
public final class WebViewViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> onViewCreateLivaData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.Transaction> signTxActionLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Object[]> onSignTransactionSuccessfulLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Object[]> signPersonalMessageLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Object[]> onSignMessageSuccessfulLiveData;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOnViewCreateLivaData() {
        return null;
    }
    
    public final void setOnViewCreateLivaData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void onViewCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.Transaction> getSignTxActionLiveData() {
        return null;
    }
    
    public final void setSignTxActionLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.Transaction> p0) {
    }
    
    public final void signTxAction(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView webView, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.Transaction transaction) {
    }
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getEthWalletDataList() {
        return null;
    }
    
    public final void performGetEthNonceRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.Transaction transaction) {
    }
    
    private final void performEthSignRequest(com.ttchain.walletproject.model.Transaction transaction, java.lang.String nonce) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object[]> getOnSignTransactionSuccessfulLiveData() {
        return null;
    }
    
    public final void setOnSignTransactionSuccessfulLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Object[]> p0) {
    }
    
    private final void performEthBroadcastRequest(com.ttchain.walletproject.model.Transaction transaction, java.lang.String signText) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object[]> getSignPersonalMessageLiveData() {
        return null;
    }
    
    public final void setSignPersonalMessageLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Object[]> p0) {
    }
    
    public final void signPersonalMessage(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.Message<com.ttchain.walletproject.model.Transaction> message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Object[]> getOnSignMessageSuccessfulLiveData() {
        return null;
    }
    
    public final void setOnSignMessageSuccessfulLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Object[]> p0) {
    }
    
    public final void performSignPersonalMessage(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.Message<com.ttchain.walletproject.model.Transaction> message) {
    }
    
    public WebViewViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository) {
        super();
    }
}