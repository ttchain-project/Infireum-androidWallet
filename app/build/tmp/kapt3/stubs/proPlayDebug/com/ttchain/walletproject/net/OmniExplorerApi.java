package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/net/OmniExplorerApi;", "", "postUsdtBalance", "Lio/reactivex/Observable;", "Lcom/git4u/tt_wallet_android/net/api/response/ApiUsdtBalanceResponse;", "body", "Lokhttp3/RequestBody;", "postUsdtTransactionRecord", "Lcom/ttchain/walletproject/model/ApiUsdtTransactionRecordResponse;", "app_proPlayDebug"})
public abstract interface OmniExplorerApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v1/transaction/address")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse> postUsdtTransactionRecord(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v1/address/addr")
    public abstract io.reactivex.Observable<com.git4u.tt_wallet_android.net.api.response.ApiUsdtBalanceResponse> postUsdtBalance(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody body);
}