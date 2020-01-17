package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ttchain/walletproject/repository/BlockExplorerRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "api", "Lcom/ttchain/walletproject/net/BlockExplorerApi;", "(Lcom/ttchain/walletproject/net/BlockExplorerApi;)V", "getBtcBalance", "Lio/reactivex/Observable;", "", "address", "getBtcTransaction", "", "Lcom/ttchain/walletproject/model/ApiBtcTransactionData;", "getBtcTransactionRecord", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse;", "app_proPlayDebug"})
public final class BlockExplorerRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.net.BlockExplorerApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionData>> getBtcTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse> getBtcTransactionRecord(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> getBtcBalance(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public BlockExplorerRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.net.BlockExplorerApi api) {
        super();
    }
}