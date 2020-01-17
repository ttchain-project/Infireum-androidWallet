package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J$\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J$\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00040\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00040\u0003H\'J.\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\f2\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0001\u0010\u0014\u001a\u00020\bH\'J2\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\f2\b\b\u0001\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\'J$\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00050\u00040\f2\b\b\u0001\u0010\u0014\u001a\u00020\bH\'J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\fH\'JK\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00040\f2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u00182\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\bH\'\u00a2\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\fH\'J\u001a\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00040\fH\'J\u001a\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00040\fH\'J(\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00040\f2\b\b\u0001\u0010)\u001a\u00020\b2\b\b\u0001\u0010*\u001a\u00020\bH\'J(\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00040\f2\b\b\u0001\u0010,\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\bH\'\u00a8\u0006-"}, d2 = {"Lcom/ttchain/walletproject/net/HelperApiCo;", "", "allCoinToCurrency", "Lkotlinx/coroutines/Deferred;", "Lcom/ttchain/walletproject/model/ApiResult;", "", "Lcom/ttchain/walletproject/model/DecimalData;", "currency", "", "crypeToCurrencyQuotes", "Lcom/ttchain/walletproject/model/QuotesData;", "getAllCoinToCurrency", "Lio/reactivex/Observable;", "getCrypeToCurrencyQuotes", "getFiat", "Lcom/ttchain/walletproject/model/ApiFiatData;", "helperCreateAddressBook", "", "units", "Lcom/ttchain/walletproject/model/AddressBookData;", "identityID", "helperDeleteAddressBook", "uuid", "chainType", "", "helperGetAddressBook", "helperGetBTCFee", "Lcom/ttchain/walletproject/model/ApiBTCFeeData;", "helperGetCoin", "Lcom/ttchain/walletproject/model/ApiCoinData;", "defaultOnly", "queryString", "mainCoinID", "(Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/String;)Lio/reactivex/Observable;", "helperGetETHFee", "Lcom/ttchain/walletproject/model/ApiETHFeeData;", "helperGetFiat", "helperGetFiatTable", "Lcom/ttchain/walletproject/model/ApiFiatTableData;", "helperGetLightningTransExchange", "", "fromCoinID", "toCoinID", "helperUpdateAddressBook", "unit", "app_proPlayDebug"})
public abstract interface HelperApiCo {
    
    /**
     * 取得地址本地址
     *
     * @param identityID The identity identifier. (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "AddressBook")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.AddressBookData>>> helperGetAddressBook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "identityID")
    java.lang.String identityID);
    
    /**
     * 創建地址本地址
     *
     * @param units The units. (required)
     * @param identityID The identity identifier. (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "AddressBook")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.Boolean>> helperCreateAddressBook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.List<com.ttchain.walletproject.model.AddressBookData> units, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "identityID")
    java.lang.String identityID);
    
    /**
     * 更新地址本地址
     *
     * @param unit The unit. (required)
     * @param identityID The identity identifier. (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "AddressBook")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.Boolean>> helperUpdateAddressBook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.AddressBookData unit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "identityID")
    java.lang.String identityID);
    
    /**
     * 刪除地址本地址
     *
     * @param identityID identityID (required)
     * @param uuid uuid (required)
     * @param chainType chainType (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "AddressBook")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.Boolean>> helperDeleteAddressBook(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "identityID")
    java.lang.String identityID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "uuid")
    java.lang.String uuid, @retrofit2.http.Query(value = "chainType")
    int chainType);
    
    /**
     * 取得系統支援虛擬貨幣清單
     *
     * @param defaultOnly If is true, api should return only default coins. (optional)
     * @param queryString Optional, keywords search name / fullname / contract. (optional)
     * @param chainType chainType (optional)
     * @param mainCoinID The main coin identifier. (optional)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "coins")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ApiCoinData>>> helperGetCoin(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "defaultOnly")
    java.lang.Boolean defaultOnly, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "queryString")
    java.lang.String queryString, @retrofit2.http.Query(value = "chainType")
    int chainType, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "mainCoinID")
    java.lang.String mainCoinID);
    
    /**
     * 取得系統支援法幣清單
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Fiats")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ApiFiatData>>> helperGetFiat();
    
    /**
     * 取得系統支援法幣清單
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Fiats")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ApiFiatData>>> getFiat();
    
    /**
     * 取得以美金為基準的法幣兌換匯率表
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Rate/FiatTable")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ApiFiatTableData>>> helperGetFiatTable();
    
    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Fee/BTC")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.ApiBTCFeeData>> helperGetBTCFee();
    
    /**
     * 取得 ETH 轉帳建議鍊費
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Fee/ETH")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.ApiETHFeeData>> helperGetETHFee();
    
    /**
     * 取得閃電轉帳中幣組的兌換匯率
     *
     * @param fromCoinID From coin identifier. (required)
     * @param toCoinID To coin identifier. (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Rate/LightningTransExchange")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.Double>> helperGetLightningTransExchange(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "fromCoinID")
    java.lang.String fromCoinID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "toCoinID")
    java.lang.String toCoinID);
    
    /**
     * 取得所有虛擬貨幣的指定法幣行情
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Rate/AllCoinToCurrency")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.DecimalData>>> getAllCoinToCurrency(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "currency")
    java.lang.String currency);
    
    /**
     * 取得所有虛擬貨幣的指定法幣行情
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Rate/AllCoinToCurrency")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.DecimalData>>> allCoinToCurrency(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "currency")
    java.lang.String currency);
    
    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "CrypetocurrencyQuotes")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.QuotesData>>> getCrypeToCurrencyQuotes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "currency")
    java.lang.String currency);
    
    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "CrypetocurrencyQuotes")
    public abstract kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.QuotesData>>> crypeToCurrencyQuotes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "currency")
    java.lang.String currency);
}