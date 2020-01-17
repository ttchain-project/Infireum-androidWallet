package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/net/BlockExplorerApi;", "", "getBtcBalance", "Lio/reactivex/Observable;", "", "address", "getBtcTransaction", "", "Lcom/ttchain/walletproject/model/ApiBtcTransactionData;", "getBtcTransactionRecord", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse;", "app_proPlayDebug"})
public abstract interface BlockExplorerApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/addr/{address}/utxo")
    public abstract io.reactivex.Observable<java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionData>> getBtcTransaction(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "address")
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/rawaddr/{address}")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse> getBtcTransactionRecord(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "address")
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/balance")
    public abstract io.reactivex.Observable<java.lang.String> getBtcBalance(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "active")
    java.lang.String address);
}