package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ttchain/walletproject/repository/TtnServerApiRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "api", "Lcom/ttchain/walletproject/net/TtnServerApi;", "(Lcom/ttchain/walletproject/net/TtnServerApi;)V", "performGetTtnBalanceWithContractAddress", "Lio/reactivex/Observable;", "Lcom/ttchain/walletproject/model/ApiTtnBalanceResponse;", "address", "", "performPostTtnBroadcast", "model", "Lcom/ttchain/walletproject/model/SignTtnTransResultData;", "app_proPlayDebug"})
public final class TtnServerApiRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.net.TtnServerApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.model.ApiTtnBalanceResponse> performGetTtnBalanceWithContractAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> performPostTtnBroadcast(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignTtnTransResultData model) {
        return null;
    }
    
    public TtnServerApiRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.net.TtnServerApi api) {
        super();
    }
}