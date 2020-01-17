package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J(\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\nR\u00020\u000b0\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/ttchain/walletproject/net/InfoApiCo;", "", "getCoinTest", "Lkotlinx/coroutines/Deferred;", "Lcom/ttchain/walletproject/model/ApiResult;", "", "Lcom/ttchain/walletproject/model/ApiCoinData;", "lang", "", "getCrypetoCurrencyQuotes", "Lcom/ttchain/walletproject/model/ExplorerQuotesResponseModel$Trend;", "Lcom/ttchain/walletproject/model/ExplorerQuotesResponseModel;", "getMarketTest", "Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel;", "getPrivatePolicy", "Lcom/ttchain/walletproject/model/GetPrivatePolicyData;", "getVersion", "Lcom/ttchain/walletproject/model/ApiVersionData;", "app_proPlayDebug"})
public abstract interface InfoApiCo {
    
    /**
     * 取得市場頁面資訊
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/{lang}/GetMarketInfo")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.ExplorerNewsResponseModel>> getMarketTest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
    
    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/{lang}/CrypetocurrencyQuotes")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ExplorerQuotesResponseModel.Trend>>> getCrypetoCurrencyQuotes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
    
    /**
     * 取得APP版本
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/{lang}/Version")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.ApiVersionData>> getVersion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
    
    /**
     * 取得隱私權資訊
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/{lang}/GetPrivatepolicy")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.GetPrivatePolicyData>> getPrivatePolicy(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
    
    /**
     * 取得系統支援虛擬貨幣清單
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/{lang}/coins")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ApiCoinData>>> getCoinTest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "lang")
    java.lang.String lang);
}