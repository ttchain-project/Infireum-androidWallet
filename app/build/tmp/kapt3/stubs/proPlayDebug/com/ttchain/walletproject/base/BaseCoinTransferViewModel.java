package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001dJ\u000e\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001dJ\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001dJ\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0,2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001dJ\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u000201H\u0002J\u000e\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001dJ\u0014\u00104\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J\u0006\u00105\u001a\u00020\u001aR\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/ttchain/walletproject/base/BaseCoinTransferViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepository;", "minerFeeRepository", "Lcom/ttchain/walletproject/repository/MinerFeeRepository;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "baseCoinTransferRepository", "Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/HelperRepository;Lcom/ttchain/walletproject/repository/MinerFeeRepository;Lcom/ttchain/walletproject/repository/BroadcastRepository;Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;)V", "baseCoinTransferModel", "getBaseCoinTransferModel", "()Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;", "setBaseCoinTransferModel", "(Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;)V", "minerFeeModel", "getMinerFeeModel", "()Lcom/ttchain/walletproject/repository/MinerFeeRepository;", "setMinerFeeModel", "(Lcom/ttchain/walletproject/repository/MinerFeeRepository;)V", "isValidTransactionInputThenShowDialog", "", "performBtcBroadcastRequest", "signText", "", "performBtcSignRequest", "list", "", "Lcom/ttchain/walletproject/model/ResponseBTCTransactionData;", "isBtcToRelay", "", "performEthBroadcastRequest", "performEthSignRequest", "nonce", "performGetBtcTransactionRequest", "address", "performGetEthNonceRequest", "performGetMinerFee", "performPostTxIdCommentRequest", "Lio/reactivex/Observable;", "txId", "comment", "performSetMinerFeeToView", "chainType", "", "performTransactionSucceed", "txid", "performUSDTSignRequest", "verifyUserInputPwdSuccess", "app_proPlayDebug"})
public class BaseCoinTransferViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.repository.MinerFeeRepository minerFeeModel;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.repository.BaseCoinTransferRepository baseCoinTransferModel;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.HelperRepository helperRepository = null;
    private final com.ttchain.walletproject.repository.MinerFeeRepository minerFeeRepository = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    private final com.ttchain.walletproject.repository.BaseCoinTransferRepository baseCoinTransferRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.repository.MinerFeeRepository getMinerFeeModel() {
        return null;
    }
    
    public final void setMinerFeeModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.MinerFeeRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.repository.BaseCoinTransferRepository getBaseCoinTransferModel() {
        return null;
    }
    
    public final void setBaseCoinTransferModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseCoinTransferRepository p0) {
    }
    
    public final void performGetMinerFee(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final void performSetMinerFeeToView(int chainType) {
    }
    
    public final void verifyUserInputPwdSuccess() {
    }
    
    public final void performGetEthNonceRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public final void performEthSignRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String nonce) {
    }
    
    public final void performEthBroadcastRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String signText) {
    }
    
    public final void performGetBtcTransactionRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public final void performBtcSignRequest(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> list, boolean isBtcToRelay) {
    }
    
    public final void performUSDTSignRequest(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> list) {
    }
    
    public final void performBtcBroadcastRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String signText) {
    }
    
    public final void isValidTransactionInputThenShowDialog() {
    }
    
    public final void performTransactionSucceed(@org.jetbrains.annotations.NotNull()
    java.lang.String txid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Boolean> performPostTxIdCommentRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String txId, @org.jetbrains.annotations.NotNull()
    java.lang.String comment) {
        return null;
    }
    
    public BaseCoinTransferViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepository helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.MinerFeeRepository minerFeeRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseCoinTransferRepository baseCoinTransferRepository) {
        super();
    }
}