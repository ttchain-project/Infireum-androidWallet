package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\t\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/ttchain/walletproject/net/TtnServerApi;", "", "getAccount", "Lio/reactivex/Observable;", "Lcom/ttchain/walletproject/model/ApiTtnBalanceResponse;", "address", "", "postSignTtnTransaction", "Lcom/ttchain/walletproject/model/ApiPostSignTtnTransResponse;", "model", "Lcom/ttchain/walletproject/model/TtnTransactionModel;", "postTtnBroadcast", "Lcom/ttchain/walletproject/model/SignTtnTransResultData;", "app_proPlayDebug"})
public abstract interface TtnServerApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/getAccount")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiTtnBalanceResponse> getAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "address")
    java.lang.String address);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/signTransaction")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiPostSignTtnTransResponse> postSignTtnTransaction(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.TtnTransactionModel model);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/broadcast")
    public abstract io.reactivex.Observable<java.lang.String> postTtnBroadcast(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.SignTtnTransResultData model);
}