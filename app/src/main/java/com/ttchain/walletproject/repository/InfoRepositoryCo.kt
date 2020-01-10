package com.ttchain.walletproject.repository

import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.net.InfoApiCo
import com.ttchain.walletproject.utils.Utils

class InfoRepositoryCo(
    private val infoApiCo: InfoApiCo
) : BaseRepository() {

    /**
     * 取得市場頁面資訊
     */
    suspend fun getMarketTest(): RepositoryResult<ExplorerNewsResponseModel> =
        checkDeferred(
            infoApiCo.getMarketTest(Utils.getYuiApiLanguageQuery())
        )

    /**
     * 取得虛擬幣漲跌幅資訊
     */
    suspend fun getCrypetoCurrencyQuotes(): RepositoryResult<List<ExplorerQuotesResponseModel.Trend>> =
        checkDeferred(
            infoApiCo.getCrypetoCurrencyQuotes(Utils.getYuiApiLanguageQuery())
        )

    /**
     * 取得APP版本
     */
    suspend fun getVersion(): RepositoryResult<ApiVersionData> =
        checkDeferred(
            infoApiCo.getVersion(Utils.getYuiApiLanguageQuery())
        )

    /**
     * 取得隱私權資訊
     */
    suspend fun getPrivatePolicy(): RepositoryResult<GetPrivatePolicyData> =
        checkDeferred(
            infoApiCo.getPrivatePolicy(Utils.getYuiApiLanguageQuery())
        )

    /**
     * 取得系統支援虛擬貨幣清單
     */
    suspend fun getCoinTest(): RepositoryResult<List<ApiCoinData>> =
        checkDeferred(
            infoApiCo.getCoinTest(Utils.getYuiApiLanguageQuery())
        )
}