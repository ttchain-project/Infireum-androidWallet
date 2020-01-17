package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/repository/InfoRepositoryCo;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "infoApiCo", "Lcom/ttchain/walletproject/net/InfoApiCo;", "(Lcom/ttchain/walletproject/net/InfoApiCo;)V", "getCoinTest", "Lcom/ttchain/walletproject/repository/RepositoryResult;", "", "Lcom/ttchain/walletproject/model/ApiCoinData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrypetoCurrencyQuotes", "Lcom/ttchain/walletproject/model/ExplorerQuotesResponseModel$Trend;", "Lcom/ttchain/walletproject/model/ExplorerQuotesResponseModel;", "getMarketTest", "Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel;", "getPrivatePolicy", "Lcom/ttchain/walletproject/model/GetPrivatePolicyData;", "getVersion", "Lcom/ttchain/walletproject/model/ApiVersionData;", "app_proPlayDebug"})
public final class InfoRepositoryCo extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.net.InfoApiCo infoApiCo = null;
    
    /**
     * 取得市場頁面資訊
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMarketTest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.ExplorerNewsResponseModel>> p0) {
        return null;
    }
    
    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCrypetoCurrencyQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.ExplorerQuotesResponseModel.Trend>>> p0) {
        return null;
    }
    
    /**
     * 取得APP版本
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVersion(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.ApiVersionData>> p0) {
        return null;
    }
    
    /**
     * 取得隱私權資訊
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrivatePolicy(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.GetPrivatePolicyData>> p0) {
        return null;
    }
    
    /**
     * 取得系統支援虛擬貨幣清單
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCoinTest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.ApiCoinData>>> p0) {
        return null;
    }
    
    public InfoRepositoryCo(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.net.InfoApiCo infoApiCo) {
        super();
    }
}