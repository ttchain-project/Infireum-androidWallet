package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.*
import io.reactivex.Observable
import retrofit2.http.*

interface HelperApi {

    /**
     * 取得地址本地址
     *
     * @param identityID The identity identifier. (required)
     */
    @GET("AddressBook")
    fun helperGetAddressBook(
        @Query("identityID") identityID: String
    ): Observable<ApiResult<List<AddressBookData>>>

    /**
     * 創建地址本地址
     *
     * @param units The units. (required)
     * @param identityID The identity identifier. (required)
     */
    @Headers("Content-Type:application/json")
    @POST("AddressBook")
    fun helperCreateAddressBook(
        @Body units: List<AddressBookData>, @Query("identityID") identityID: String
    ): Observable<ApiResult<Boolean>>

    /**
     * 更新地址本地址
     *
     * @param unit The unit. (required)
     * @param identityID The identity identifier. (required)
     */
    @Headers("Content-Type:application/json")
    @PUT("AddressBook")
    fun helperUpdateAddressBook(
        @Body unit: AddressBookData, @Query("identityID") identityID: String
    ): Observable<ApiResult<Boolean>>

    /**
     * 刪除地址本地址
     *
     * @param identityID identityID (required)
     * @param uuid uuid (required)
     * @param chainType chainType (required)
     */
    @DELETE("AddressBook")
    fun helperDeleteAddressBook(
        @Query("identityID") identityID: String, @Query("uuid") uuid: String,
        @Query("chainType") chainType: Int
    ): Observable<ApiResult<Boolean>>

    /**
     * 取得系統支援虛擬貨幣清單
     *
     * @param defaultOnly If is true, api should return only default coins. (optional)
     * @param queryString Optional, keywords search name / fullname / contract. (optional)
     * @param chainType chainType (optional)
     * @param mainCoinID The main coin identifier. (optional)
     */
    @GET("coins")
    fun helperGetCoin(
        @Query("defaultOnly") defaultOnly: Boolean?, @Query("queryString") queryString: String,
        @Query("chainType") chainType: Int, @Query("mainCoinID") mainCoinID: String?
    ): Observable<ApiResult<List<ApiCoinData>>>

    /**
     * 取得系統支援法幣清單
     */
    @GET("Fiats")
    fun helperGetFiat(): Observable<ApiResult<List<ApiFiatData>>>

    /**
     * 取得以美金為基準的法幣兌換匯率表
     */
    @GET("Rate/FiatTable")
    fun helperGetFiatTable(): Observable<ApiResult<List<ApiFiatTableData>>>

    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority)
     */
    @GET("Fee/BTC")
    fun helperGetBTCFee(): Observable<ApiResult<ApiBTCFeeData>>

    /**
     * 取得 ETH 轉帳建議鍊費
     */
    @GET("Fee/ETH")
    fun helperGetETHFee(): Observable<ApiResult<ApiETHFeeData>>

    /**
     * 取得閃電轉帳中幣組的兌換匯率
     *
     * @param fromCoinID From coin identifier. (required)
     * @param toCoinID To coin identifier. (required)
     */
    @GET("Rate/LightningTransExchange")
    fun helperGetLightningTransExchange(
        @Query("fromCoinID") fromCoinID: String, @Query("toCoinID") toCoinID: String
    ): Observable<ApiResult<Double>>

    /**
     * 取得所有虛擬貨幣的指定法幣行情
     */
    @GET("Rate/AllCoinToCurrency")
    fun getAllCoinToCurrency(
        @Query("currency") currency: String
    ): Observable<ApiResult<List<DecimalData>>>


    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @GET("CrypetocurrencyQuotes")
    fun getCrypeToCurrencyQuotes(
        @Query("currency") currency: String
    ): Observable<ApiResult<List<QuotesData>>>


}