package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.*
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path

interface InfoApiCo {

    /**
     * 取得市場頁面資訊
     */
    @GET("/{lang}/GetMarketInfo")
    fun getMarketTest(
        @Path("lang") lang: String
    ): Deferred<ApiResult<ExplorerNewsResponseModel>>

    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @GET("/{lang}/CrypetocurrencyQuotes")
    fun getCrypetoCurrencyQuotes(
        @Path("lang") lang: String
    ): Deferred<ApiResult<List<ExplorerQuotesResponseModel.Trend>>>

    /**
     * 取得APP版本
     */
    @GET("/{lang}/Version")
    fun getVersion(
        @Path("lang") lang: String
    ): Deferred<ApiResult<ApiVersionData>>

    /**
     * 取得隱私權資訊
     */
    @GET("/{lang}/GetPrivatepolicy")
    fun getPrivatePolicy(
        @Path("lang") lang: String
    ): Deferred<ApiResult<GetPrivatePolicyData>>

    /**
     * 取得系統支援虛擬貨幣清單
     */
    @GET("/{lang}/coins")
    fun getCoinTest(
        @Path("lang") lang: String
    ): Deferred<ApiResult<List<ApiCoinData>>>

}