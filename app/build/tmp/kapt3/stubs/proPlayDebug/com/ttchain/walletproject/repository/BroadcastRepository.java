package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\t\u001a\u00020\rJ\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00070\u00062\u0006\u0010\u0016\u001a\u00020\bJ \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00070\u00062\u0006\u0010\t\u001a\u00020\u0019J\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00070\u00062\u0006\u0010\t\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ttchain/walletproject/repository/BroadcastRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "api", "Lcom/ttchain/walletproject/net/BroadcastApi;", "(Lcom/ttchain/walletproject/net/BroadcastApi;)V", "performBlockExplorerRequest", "Lio/reactivex/Observable;", "Lcom/ttchain/walletproject/repository/RepositoryResult;", "", "model", "Lcom/ttchain/walletproject/model/BlockExplorerRequest;", "performBtcSignRequest", "Lcom/ttchain/walletproject/model/ResponseSignBTCData;", "Lcom/ttchain/walletproject/model/SignBTCBodyData;", "performEthSignRequest", "Lcom/ttchain/walletproject/model/ResponseSignETHData;", "Lcom/ttchain/walletproject/model/SignETHBodyRequest;", "signEthQueryModel", "Lcom/ttchain/walletproject/model/SignEthQueryModel;", "performGetBtcTransactionRequest", "", "Lcom/ttchain/walletproject/model/ResponseBTCTransactionData;", "address", "performGetCommentsRequest", "Lcom/ttchain/walletproject/model/CustomCommentsData;", "Lcom/ttchain/walletproject/model/TransactionData;", "performMainnetInfuraRequest", "Lcom/ttchain/walletproject/model/MainnetInfuraRequest;", "performPostCommentRequest", "", "app_proPlayDebug"})
public final class BroadcastRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.net.BroadcastApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.String>> performMainnetInfuraRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MainnetInfuraRequest model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.String>> performBlockExplorerRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.BlockExplorerRequest model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.ResponseSignETHData>> performEthSignRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignETHBodyRequest model, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignEthQueryModel signEthQueryModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData>>> performGetBtcTransactionRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.ResponseSignBTCData>> performBtcSignRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignBTCBodyData model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.CustomCommentsData>>> performGetCommentsRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.TransactionData model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.Boolean>> performPostCommentRequest(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.CustomCommentsData model) {
        return null;
    }
    
    public BroadcastRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.net.BroadcastApi api) {
        super();
    }
}