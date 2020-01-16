package com.ttchain.walletproject.helper

import android.content.Context
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.*
import com.ttchain.walletproject.enums.CoinEnum
import java.math.BigDecimal
import java.util.*

class MockHelperImpl(private val mContext: Context) : MockHelper {

    override val mockDataTag: String
        get() {
            val prefs = mContext.getSharedPreferences(MOCK_PREFS, Context.MODE_PRIVATE)
            return prefs.getString(DATA, "") ?: ""
        }

    override val mockCoinDataList: List<CoinData>
        get() {
            val list = ArrayList<CoinData>()
            //main coin
            list.add(btcCoinData)
            list.add(ethCoinData)
            list.add(usdtCoinData)
            list.add(usdtTetherCoinData)
            //ttn coin
            list.add(ttnCoinData)
            list.add(btcnCoinData)
            list.add(ethnCoinData)
            list.add(usdtnCoinData)
            list.add(exrCoinData)
            list.add(mccCoinData)
            list.add(dai1CoinData)
            list.add(tusd1CoinData)
            return list
        }

    override val mockWalletDataList: List<WalletData>
        get() {
            val list = ArrayList<WalletData>()
            list.add(ethWalletData)
            list.add(btcWalletData)
            list.add(cicWalletData)
            return list
        }

    override val mockCoinSelectionDataList: List<CoinSelectionData>
        get() {
            return ArrayList<CoinSelectionData>().apply {
                add(coinSelectionSelectedData)
                add(coinSelectionSelectedData)
                add(coinSelectionSelectedData)
            }
        }

    override//        list.add(getZeroAssetData());
    val mockAssetDataList: List<AssetData>
        get() {
            val list = ArrayList<AssetData>()
            list.add(assetData)
            list.add(assetData)
            list.add(zeroAssetData)
            return list
        }

    override//        data.setPrefLangId(1);
    //        data.setPrefFiatId(1);
    val mockIdentityDataList: List<IdentityData>
        get() {
            val list = ArrayList<IdentityData>()
            val data = IdentityData().apply {
                identityId = "12345678"
                name = "Peter"
                pwd = "aaaa1234"
                pwdHint = "Git4u"
            }
            list.add(data)
            return list
        }

    override val mockAddressDataList: List<AddressData>
        get() {
            val list = ArrayList<AddressData>()
            val data = AddressData()
            data.address = "0x0f8148bB3E8DdD3044A5F46ACFf50B13917e861F"
            data.name = "Jack"
            list.add(data)
            return list
        }

    override val mockLanguageDataList: List<LanguageData>
        get() {
            val list = ArrayList<LanguageData>()

            val chData = LanguageData()
            chData.languageId = 0
            chData.name = "簡體中文"

            val zhData = LanguageData()
            zhData.languageId = 1
            zhData.name = "繁體中文"

            val enData = LanguageData()
            enData.languageId = 2
            enData.name = "英文"

            list.add(zhData)
            list.add(chData)
            list.add(enData)

            return list
        }

    override val mockFiatDataList: List<FiatData>
        get() {
            val list = ArrayList<FiatData>()

            val chData = FiatData()
            chData.fiatId = 0
            chData.name = "CNY"
            chData.symbol = "¥"

            val zhData = FiatData()
            zhData.fiatId = 1
            zhData.name = "TWD"
            zhData.symbol = "$"

            val enData = FiatData()
            enData.fiatId = 2
            enData.name = "USD"
            enData.symbol = "$"

            list.add(chData)
            list.add(zhData)
            list.add(enData)

            return list
        }

    override val mockCoinToCoinRateDataList: List<CoinToCoinRateData>
        get() {
            val list = ArrayList<CoinToCoinRateData>()
            list.add(CoinToCoinRateData())
            list.add(CoinToCoinRateData())
            return list
        }

    override val mockCoinToFiatRateDataList: List<CoinToFiatRateData>
        get() {
            val list = ArrayList<CoinToFiatRateData>()
            list.add(CoinToFiatRateData())
            list.add(CoinToFiatRateData())
            list.add(CoinToFiatRateData())
            return list
        }

    override val mockFiatToFiatRateDataList: List<FiatToFiatRateData>
        get() {
            val list = ArrayList<FiatToFiatRateData>()
            list.add(FiatToFiatRateData())
            list.add(FiatToFiatRateData())
            list.add(FiatToFiatRateData())
            return list
        }

    private val zeroAssetData: AssetData
        get() {
            val data = AssetData()
            val amount = 0.0
            data.amount = BigDecimal(amount.toString())
            return data
        }

    private val assetData: AssetData
        get() {
            val data = AssetData()
            val amount = MIN_AMOUNT_UNIT * randomInt
            data.amount = BigDecimal(amount.toString())
            return data
        }

    private val coinSelectionSelectedData: CoinSelectionData
        get() {
            val data = CoinSelectionData()
            data.isSelected = true
            return data
        }

    private val ethWalletData: WalletData
        get() {
            val data = WalletData()
            data.name = GlobalConstant.DEFAULT_WALLET_NAME_ETH
            data.chainType = GlobalConstant.WALLET_TYPE_ETH
            data.address = "0x5f8148bB3E8DdD3044A5F46ACFf50B13917e861F"
            data.isFromSystem = true
            data.epKey = "a183afc8c62c2f8c03c25e6aaccc55911545e6cdc425967ef21856757293c14e"
            data.pwd = "aaaa1234"
            data.pwdHint = "Git4uETH"
            return data
        }

    private val btcWalletData: WalletData
        get() {
            val data = WalletData()
            data.name = GlobalConstant.DEFAULT_WALLET_NAME_BTC
            data.chainType = GlobalConstant.WALLET_TYPE_BTC
            data.address = "0x9f8148bB3E8DdD3044A5F46ACFf50B13917e861F"
            data.isFromSystem = true
            data.epKey = "b283afc8c62c2f8c03c25e6aaccc55911545e6cdc425967ef21856757293c14e"
            data.pwd = "aaaa1234"
            data.pwdHint = "Git4uBTC"
            return data
        }

    private val cicWalletData: WalletData
        get() {
            val data = WalletData()
            data.name = GlobalConstant.DEFAULT_WALLET_NAME_CIC
            data.chainType = GlobalConstant.WALLET_TYPE_CIC
            data.address = "0x1f8148bB3E8DdD3044A5F46ACFf50B13917e861F"
            data.isFromSystem = true
            data.epKey = "c383afc8c62c2f8c03c25e6aaccc55911545e6cdc425967ef21856757293c14e"
            data.pwd = "aaaa1234"
            data.pwdHint = "Git4uCIC"
            return data
        }

    private val btcCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_BTC
            data.coinId = CoinEnum.BTC.coinId
            data.contract = ""
            data.chainName = CoinEnum.BTC.coinName
            data.fullName = "Bitcoin"
            data.digit = 8
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "http://54.64.162.167:3206/topChain/picTest/xxhtoken/wallet_coin_btc.png"
            data.mainCoinId = CoinEnum.BTC.coinId
            data.displayName = CoinEnum.BTC.coinName
            return data
        }

    private val usdtCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_BTC
            data.coinId = CoinEnum.USDT.coinId
            data.contract = ""
            data.chainName = CoinEnum.USDT.coinName
            data.fullName = CoinEnum.USDT.coinName
            data.digit = 8
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "http://54.64.162.167:3206/topChain/picTest/xxhtoken/wallet_coin_usdt.png"
            data.mainCoinId = CoinEnum.BTC.coinId
            data.displayName = CoinEnum.USDT.coinName
            return data
        }

    private val ethCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_ETH
            data.coinId = CoinEnum.ETH.coinId
            data.contract = ""
            data.chainName = CoinEnum.ETH.coinName
            data.fullName = "Ethereum"
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "http://54.64.162.167:3206/topChain/picTest/xxhtoken/wallet_coin_eth.png"
            data.mainCoinId = CoinEnum.ETH.coinId
            data.displayName = CoinEnum.ETH.coinName
            return data
        }

    private val usdtTetherCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_ETH
            data.coinId = CoinEnum.TETHER_USDT.coinId
            data.contract = ""
            data.chainName = CoinEnum.TETHER_USDT.coinName
            data.fullName = "Tether USD"
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "http://54.64.162.167:3206/topChain/picTest/xxhtoken/wallet_coin_usdt.png"
            data.mainCoinId = CoinEnum.ETH.coinId
            data.displayName = CoinEnum.TETHER_USDT.coinName
            return data
        }

    private val ttnCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = 6
            data.coinId = CoinEnum.TTN.coinId
            data.contract = ""
            data.chainName = CoinEnum.TTN.coinName
            data.fullName = CoinEnum.TTN.coinName
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.TTN.coinName
            return data
        }

    private val btcnCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.BTCN.coinId
            data.contract = ""
            data.chainName = CoinEnum.BTCN.coinName
            data.fullName = CoinEnum.BTCN.coinName
            data.digit = 8
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.BTCN.coinName
            return data
        }

    private val usdtnCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.USDTN.coinId
            data.contract = ""
            data.chainName = CoinEnum.USDTN.coinName
            data.fullName = CoinEnum.USDTN.coinName
            data.digit = 8
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.USDTN.coinName
            return data
        }

    private val ethnCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.ETHN.coinId
            data.contract = ""
            data.chainName = CoinEnum.ETHN.coinName
            data.fullName = CoinEnum.ETHN.coinName
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.ETHN.coinName
            return data
        }

    private val exrCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.EXR.coinId
            data.contract = ""
            data.chainName = CoinEnum.EXR.coinName
            data.fullName = CoinEnum.EXR.coinName
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.EXR.coinName
            return data
        }

    private val mccCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.MCC.coinId
            data.contract = ""
            data.chainName = CoinEnum.MCC.coinName
            data.fullName = CoinEnum.MCC.coinName
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.MCC.coinName
            return data
        }

    private val dai1CoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.DAI1.coinId
            data.contract = ""
            data.chainName = CoinEnum.DAI1.coinName
            data.fullName = CoinEnum.DAI1.coinName
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.DAI1.coinName
            return data
        }

    private val tusd1CoinData: CoinData
        get() {
            val data = CoinData()
            data.chainType = GlobalConstant.WALLET_TYPE_GUC
            data.coinId = CoinEnum.TUSD1.coinId
            data.contract = ""
            data.chainName = CoinEnum.TUSD1.coinName
            data.fullName = CoinEnum.TUSD1.coinName
            data.digit = 18
            data.isDefault = true
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "https://hopeseed-api.bibi2u.com/images/Icon/USDT.png"
            data.mainCoinId = CoinEnum.TTN.coinId
            data.displayName = CoinEnum.TUSD1.coinName
            return data
        }

    private val eosCoinData: CoinData
        get() {
            val data = CoinData()
            data.chainName = "EOS"
            data.fullName = "EOS Full Name"
            data.coinId = "0x03"
            data.chainType = GlobalConstant.WALLET_TYPE_ETH
            data.isDefaultSelected = true
            data.isActive = true
            data.iconPath = "/image"
            return data
        }

    override fun updateMockDataTag() {
        val editor = mContext.getSharedPreferences(MOCK_PREFS, Context.MODE_PRIVATE).edit()
        editor.putString(DATA, MOCK_TAG)
        editor.apply()
    }

    override fun needUpdateMockData(): Boolean {
        return mockDataTag != MOCK_TAG
    }

    companion object {

        const val MOCK_PREFS = "mock_prefs"
        const val DATA = "data"
        const val MOCK_TAG = "wethqwaeuh"
        const val MIN_AMOUNT_UNIT = 0.000001

        val randomInt: Int
            get() {
                val r = Random()
                val Low = 1
                val High = 10000000
                return r.nextInt(High - Low) + Low
            }
    }
}
