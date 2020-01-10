package com.ttchain.walletproject.repository

import com.git4u.tt_wallet_android.model.bean.*
import com.git4u.tt_wallet_android.net.api.swagger.HelperApiCo
import io.reactivex.Observable

class HelperRepositoryCo(
    private val api: HelperApiCo
) : BaseRepository() {

    /**
     * 取得地址本地址
     */
    fun performGetAddressBookDataList(identityId: String): Observable<RepositoryResult<List<AddressBookData>>> {
        return getApi(api.helperGetAddressBook(identityId))
            .map { checkResultRepository(it) }
    }

    /**
     * 創建地址本地址
     */
    fun performPostAddressBookDataList(
        identityId: String,
        modelList: List<AddressBookData>
    ): Observable<RepositoryResult<Boolean>> {
        return getApi(api.helperCreateAddressBook(modelList, identityId))
            .map { checkResultRepository(it) }
    }

    /**
     * 更新地址本地址
     */
    fun performPutAddressBookData(
        identityId: String,
        model: AddressBookData
    ): Observable<RepositoryResult<Boolean>> {
        return getApi(api.helperUpdateAddressBook(model, identityId))
            .map { checkResultRepository(it) }
    }

    /**
     * 刪除地址本地址
     */
    fun performDeleteAddressBookData(
        identityId: String,
        uuid: String,
        walletType: Int
    ): Observable<RepositoryResult<Boolean>> {
        return getApi(api.helperDeleteAddressBook(identityId, uuid, walletType))
            .map { checkResultRepository(it) }
    }

    /**
     * 取得系統支援虛擬貨幣清單
     */
    fun performGetCoinDataList(
        isDefaultOnly: Boolean?,
        queryString: String,
        chainType: Int,
        mainCoinId: String?
    ): Observable<RepositoryResult<List<ApiCoinData>>> {
        return getApi(api.helperGetCoin(isDefaultOnly, queryString, chainType, mainCoinId))
            .map { checkResultRepository(it) }
    }

    /**
     * 取得系統支援法幣清單
     */
    fun performGetFiatDataList(): Observable<RepositoryResult<List<ApiFiatData>>> {
        return getApi(api.helperGetFiat())
            .map { checkResultRepository(it) }
    }

    /**
     * 取得以美金為基準的法幣兌換匯率表
     */
    fun performGetFiatIdToUsdRateDataList(): Observable<RepositoryResult<List<ApiFiatTableData>>> {
        return getApi(api.helperGetFiatTable())
            .map { checkResultRepository(it) }
    }

    /**
     * 取得 BTC 轉帳建議鍊費 (regular/priority)
     */
    fun performGetBtcFee(): Observable<RepositoryResult<ApiBTCFeeData>> {
        return getApi(api.helperGetBTCFee())
            .map { checkResultRepository(it) }
    }

    /**
     * 取得 ETH 轉帳建議鍊費
     */
    fun performGetEthFee(): Observable<RepositoryResult<ApiETHFeeData>> {
        return getApi(api.helperGetETHFee())
            .map { checkResultRepository(it) }
    }

    /**
     * 取得閃電轉帳中幣組的兌換匯率
     *
     * @param fromCoinID From coin identifier. (required)
     * @param toCoinID To coin identifier. (required)
     * @return Call&lt;ApiResponseDecimal&gt;
     */
    fun helperGetLightningTransExchange(
        fromCoinID: String,
        toCoinID: String
    ): Observable<RepositoryResult<Double>> {
        return getApi(api.helperGetLightningTransExchange(fromCoinID, toCoinID))
            .map { checkResultRepository(it) }
    }

    /**
     * 取得所有虛擬貨幣的指定法幣行情
     */
    fun getAllCoinToCurrency(
        currency: String
    ): Observable<RepositoryResult<List<DecimalData>>> {
        return getApi(api.getAllCoinToCurrency(currency))
            .map { checkResultRepository(it) }
    }

    /**
     * 取得虛擬幣漲跌幅資訊
     */
    fun getCrypeToCurrencyQuotes(
        currency: String
    ): Observable<RepositoryResult<List<QuotesData>>> {
        return getApi(api.getCrypeToCurrencyQuotes(currency))
            .map {
                checkResultRepository(it)
            }
    }

    /**
     * 取得虛擬幣漲跌幅資訊
     */
    suspend fun crypeToCurrencyQuotes(
        currency: String
    ): RepositoryResult<List<QuotesData>> {
        return checkDeferred(api.crypeToCurrencyQuotes(currency))
    }
}