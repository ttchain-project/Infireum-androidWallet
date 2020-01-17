package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u000bJ\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u0006JA\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00070\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00070\u0006J\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\b0\u00070\u0006J\u0018\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\b0\u00070\u0006J(\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190\bJ\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/ttchain/walletproject/repository/HelperRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "api", "Lcom/ttchain/walletproject/net/HelperApi;", "(Lcom/ttchain/walletproject/net/HelperApi;)V", "getAllCoinToCurrency", "Lio/reactivex/Observable;", "Lcom/ttchain/walletproject/repository/RepositoryResult;", "", "Lcom/ttchain/walletproject/model/DecimalData;", "currency", "", "getCrypeToCurrencyQuotes", "Lcom/ttchain/walletproject/model/QuotesData;", "helperGetLightningTransExchange", "", "fromCoinID", "toCoinID", "performDeleteAddressBookData", "", "identityId", "uuid", "walletType", "", "performGetAddressBookDataList", "Lcom/ttchain/walletproject/model/AddressBookData;", "performGetBtcFee", "Lcom/ttchain/walletproject/model/ApiBTCFeeData;", "performGetCoinDataList", "Lcom/ttchain/walletproject/model/ApiCoinData;", "isDefaultOnly", "queryString", "chainType", "mainCoinId", "(Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/String;)Lio/reactivex/Observable;", "performGetEthFee", "Lcom/ttchain/walletproject/model/ApiETHFeeData;", "performGetFiatDataList", "Lcom/ttchain/walletproject/model/ApiFiatData;", "performGetFiatIdToUsdRateDataList", "Lcom/ttchain/walletproject/model/ApiFiatTableData;", "performPostAddressBookDataList", "modelList", "performPutAddressBookData", "model", "app_proPlayDebug"})
public final class HelperRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.net.HelperApi api = null;
    
    /**
     * 取得地址本地址
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.AddressBookData>>> performGetAddressBookDataList(@org.jetbrains.annotations.NotNull()
    java.lang.String identityId) {
        return null;
    }
    
    /**
     * 創建地址本地址
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.Boolean>> performPostAddressBookDataList(@org.jetbrains.annotations.NotNull()
    java.lang.String identityId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.AddressBookData> modelList) {
        return null;
    }
    
    /**
     * 更新地址本地址
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.Boolean>> performPutAddressBookData(@org.jetbrains.annotations.NotNull()
    java.lang.String identityId, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.AddressBookData model) {
        return null;
    }
    
    /**
     * 刪除地址本地址
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.Boolean>> performDeleteAddressBookData(@org.jetbrains.annotations.NotNull()
    java.lang.String identityId, @org.jetbrains.annotations.NotNull()
    java.lang.String uuid, int walletType) {
        return null;
    }
    
    /**
     * 取得系統支援虛擬貨幣清單
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.ApiCoinData>>> performGetCoinDataList(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isDefaultOnly, @org.jetbrains.annotations.NotNull()
    java.lang.String queryString, int chainType, @org.jetbrains.annotations.Nullable()
    java.lang.String mainCoinId) {
        return null;
    }
    
    /**
     * 取得系統支援法幣清單
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.ApiFiatData>>> performGetFiatDataList() {
        return null;
    }
    
    /**
     * 取得以美金為基準的法幣兌換匯率表
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.ApiFiatTableData>>> performGetFiatIdToUsdRateDataList() {
        return null;
    }
    
    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority)
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.ApiBTCFeeData>> performGetBtcFee() {
        return null;
    }
    
    /**
     * 取得 ETH 轉帳建議鍊費
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<com.ttchain.walletproject.model.ApiETHFeeData>> performGetEthFee() {
        return null;
    }
    
    /**
     * 取得閃電轉帳中幣組的兌換匯率
     *
     * @param fromCoinID From coin identifier. (required)
     * @param toCoinID To coin identifier. (required)
     * @return Call&lt;ApiResponseDecimal&gt;
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.lang.Double>> helperGetLightningTransExchange(@org.jetbrains.annotations.NotNull()
    java.lang.String fromCoinID, @org.jetbrains.annotations.NotNull()
    java.lang.String toCoinID) {
        return null;
    }
    
    /**
     * 取得所有虛擬貨幣的指定法幣行情
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.DecimalData>>> getAllCoinToCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    /**
     * 取得虛擬幣漲跌幅資訊
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.ttchain.walletproject.repository.RepositoryResult<java.util.List<com.ttchain.walletproject.model.QuotesData>>> getCrypeToCurrencyQuotes(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        return null;
    }
    
    public HelperRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.net.HelperApi api) {
        super();
    }
}