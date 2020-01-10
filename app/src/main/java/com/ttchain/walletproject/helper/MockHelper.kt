package com.ttchain.walletproject.helper

import com.ttchain.walletproject.database.data.*

interface MockHelper {

    val mockDataTag: String

    val mockCoinDataList: List<CoinData>

    val mockWalletDataList: List<WalletData>

    val mockCoinSelectionDataList: List<CoinSelectionData>

    val mockAssetDataList: List<AssetData>

    val mockIdentityDataList: List<IdentityData>

    val mockAddressDataList: List<AddressData>

    val mockLanguageDataList: List<LanguageData>

    val mockFiatDataList: List<FiatData>

    val mockCoinToCoinRateDataList: List<CoinToCoinRateData>

    val mockCoinToFiatRateDataList: List<CoinToFiatRateData>

    val mockFiatToFiatRateDataList: List<FiatToFiatRateData>
    fun needUpdateMockData(): Boolean

    fun updateMockDataTag()
}
