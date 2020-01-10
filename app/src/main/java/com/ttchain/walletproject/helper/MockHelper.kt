package com.git4u.tt_wallet_android.model

import com.git4u.tt_wallet_android.database.data.AddressData
import com.git4u.tt_wallet_android.database.data.AssetData
import com.git4u.tt_wallet_android.database.data.CoinData
import com.git4u.tt_wallet_android.database.data.CoinSelectionData
import com.git4u.tt_wallet_android.database.data.CoinToCoinRateData
import com.git4u.tt_wallet_android.database.data.CoinToFiatRateData
import com.git4u.tt_wallet_android.database.data.FiatData
import com.git4u.tt_wallet_android.database.data.FiatToFiatRateData
import com.git4u.tt_wallet_android.database.data.IdentityData
import com.git4u.tt_wallet_android.database.data.LanguageData
import com.git4u.tt_wallet_android.database.data.WalletData

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
