package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/repository/EtherscanApiRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "api", "Lcom/ttchain/walletproject/net/EtherscanApi;", "(Lcom/ttchain/walletproject/net/EtherscanApi;)V", "performGetEtherscanApiResult", "Lio/reactivex/Observable;", "Lcom/ttchain/walletproject/model/ApiEtherscanResponse;", "queryMap", "", "", "app_proPlayDebug"})
public final class EtherscanApiRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.net.EtherscanApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.model.ApiEtherscanResponse> performGetEtherscanApiResult(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queryMap) {
        return null;
    }
    
    public EtherscanApiRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.net.EtherscanApi api) {
        super();
    }
}