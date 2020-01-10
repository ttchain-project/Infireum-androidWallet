package com.ttchain.walletproject.repository

import com.git4u.tt_wallet_android.cache.GlobalConstant
import com.git4u.tt_wallet_android.database.data.*
import com.git4u.tt_wallet_android.model.DbHelper
import com.git4u.tt_wallet_android.model.MockHelper
import com.git4u.tt_wallet_android.model.UserHelper
import com.git4u.tt_wallet_android.model.bean.ApiFiatData
import com.git4u.tt_wallet_android.model.bean.ApiFiatTableData
import com.git4u.tt_wallet_android.utils.TimeUtils
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.model.ApiFiatData
import com.ttchain.walletproject.model.ApiFiatTableData
import com.ttchain.walletproject.utils.TimeUtils
import java.math.BigDecimal
import java.util.*

class SplashRepository(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val mockHelper: MockHelper
) : BaseRepository() {

    companion object {
        private const val MIN_AMOUNT_UNIT = 0.000001

        private val randomInt: Int
            get() {
                val r = Random()
                val Low = 1
                val High = 10000000
                return r.nextInt(High - Low) + Low
            }
    }

    fun isCoinDataEmpty(): Boolean {
        return dbHelper.isCoinDataEmpty()
    }

    fun isFiatDataEmpty(): Boolean {
        return dbHelper.isFiatDataEmpty()
    }

    fun isLanguageDataEmpty(): Boolean {
        return dbHelper.isLanguageDataEmpty()
    }

    fun createDefaultCoinDataList(): List<CoinData> {
        return mockHelper.mockCoinDataList
    }

    fun updateDefaultCoinDataList(list: List<CoinData>) {
        if (dbHelper.isCoinDataEmpty()) {
            dbHelper.setCoinDataList(list)
        }
    }

    fun createDefaultFiatDataList(): List<FiatData> {
        return mockHelper.mockFiatDataList
    }

    fun updateDefaultFiatDataList(list: List<FiatData>) {
        if (dbHelper.isFiatDataEmpty()) {
            dbHelper.setFiatDataList(list)
        }
    }

    fun hasUserIdentity(): Boolean {
        return userHelper.identityID != -1
    }

    fun getWalletDataList(): List<WalletData> {
        return dbHelper.getWalletDataList()
    }

    fun getDefaultWalletDataList(): List<WalletData> {
        return dbHelper.getDefaultWalletDataList()
    }

    fun updateWalletData(walletData: WalletData): Int {
        return dbHelper.updateWalletData(walletData)
    }

    fun getCoinDataList(): List<CoinData> {
        return dbHelper.getCoinDataList()
    }

    fun getCoinSelectionDataList(): List<CoinSelectionData> {
        return dbHelper.getCoinSelectionDataList()
    }

    fun getCoinDataListByMainCoinId(mainCoinId: String): List<CoinData> {
        return dbHelper.getCoinDataListByMainCoinId(mainCoinId)
    }

//    fun checkDbFile() {
//        if (dbHelper.isExistDb()) {
//            if (mMockHelper.needUpdateMockData()) {
//                dbHelper.clearAllTableData()
//                userHelper.removeSelectedWalletID()
//                userHelper.removeIdentityID()
//                mSystemHelper.removeAllSharedPreferences()
//            }
//            mMockHelper.updateMockDataTag()
//        }
//    }

//    fun createLanguageMockData() {
//        if (dbHelper.isLanguageDataEmpty()) {
//            dbHelper.setLanguageDataList(mMockHelper.getMockLanguageDataList())
//        }
//    }

    fun createTransMockData() {
        if (userHelper.identityID == -1) {
            return
        }

        if (dbHelper.isExistDb() && dbHelper.isTransRecordDataEmpty()) {
            val walletDataList = dbHelper.getWalletDataList()
            val coinDataList = dbHelper.getCoinDataList()
            val stateDataList = ArrayList<Int>()
            stateDataList.add(GlobalConstant.TRANSACTION_STATE_OUTCOME)
            stateDataList.add(GlobalConstant.TRANSACTION_STATE_INCOME)
            stateDataList.add(GlobalConstant.TRANSACTION_STATE_FAIL)

            val transRecordDataList = ArrayList<TransRecordData>()

            for (state in stateDataList) {
                for (walletData in walletDataList) {
                    for (coinData in coinDataList) {
                        if (walletData.chainType == coinData.chainType) {
                            val data = TransRecordData()
                            data.txId =
                                "0x3749820dfba703d1676ccaec93c8bbfa7af75019b64812fd619df0707517782a"
                            data.status = state
                            data.fromCoinData = coinData
                            val amount =
                                MIN_AMOUNT_UNIT * randomInt
                            data.fromAmount = BigDecimal(amount.toString())
                            if (state == GlobalConstant.TRANSACTION_STATE_OUTCOME || state == GlobalConstant.TRANSACTION_STATE_FAIL) {
                                data.fromAddress = walletData.address
                            } else {
                                data.fromAddress = "0xc94c656CA1D8eAbDb6D3d296Bf626796f4de6BB6"
                            }
                            data.toCoinData = coinData
                            data.toAmount = BigDecimal(amount.toString())
                            if (state == GlobalConstant.TRANSACTION_STATE_INCOME) {
                                data.toAddress = walletData.address
                            } else {
                                data.toAddress = "0x71A8F8Fa5633114b86d96FE39dB4B5Ee0B855584"
                            }
                            data.feeCoinData = coinData
                            data.feeAmount = BigDecimal("33")
                            data.feeRate = BigDecimal("30.28")
                            data.totalFee = BigDecimal("81918.3")
                            data.date = "2018-07-09-18:32:200"
                            data.syncDate = "2018-07-09-18:33:745"
                            transRecordDataList.add(data)
                        }
                    }
                }
            }
            dbHelper.setTransRecordDataList(transRecordDataList)
        }
    }

//    fun createMockData() {
//        if (dbHelper.isExistDb()) {
//            if (dbHelper.isCoinDataEmpty()) {
//                dbHelper.setCoinDataList(mMockHelper.getMockCoinDataList())
//            }
//
//            if (dbHelper.isFiatDataEmpty()) {
//                dbHelper.setFiatDataList(mMockHelper.getMockFiatDataList())
//            }
//
//            if (dbHelper.isLanguageDataEmpty()) {
//                dbHelper.setLanguageDataList(mMockHelper.getMockLanguageDataList())
//            }
//
//            if (dbHelper.isIdentityDataEmpty()) {
//                val list = mMockHelper.getMockIdentityDataList()
//                if (list != null && !list!!.isEmpty()) {
//                    val data = list!!.get(0)
//
//                    val fiatList = dbHelper.getFiatDataList()
//                    if (!fiatList.isEmpty()) {
//                        data.prefFiatData = fiatList.get(0)
//                    }
//                    val langList = dbHelper.getLanguageDataList()
//                    if (!langList.isEmpty()) {
//                        data.prefLangData = langList.get(0)
//                    }
//                    val id = dbHelper.addIdentityData(data)
//                    userHelper.setIdentityID(id)
//                }
//            }
//
//            if (dbHelper.isWalletDataEmpty()) {
//                val list = mMockHelper.getMockWalletDataList()
//                val data = dbHelper.getIdentityData(userHelper.getIdentityID()!!)
//
//                for (item in list) {
//                    item.identityData = data
//                }
//
//                dbHelper.setWalletDataList(list)
//
//                val walletData = dbHelper.getDefaultWalletTypeWalletData()
//                userHelper.setSelectedWalletID(walletData._id)
//            }
//
//            if (dbHelper.isAddressDataEmpty()) {
//                val list = mMockHelper.getMockAddressDataList()
//                val walletList = dbHelper.getWalletDataList()
//                val identityList = dbHelper.getIdentityDataList()
//                if (!walletList.isEmpty() && !identityList.isEmpty()) {
//                    for (item in list) {
//                        item.identityData = identityList.get(0)
//                        //                        item.setWalletData(walletList.get(0));
//                    }
//                }
//                dbHelper.setAddressDataList(list)
//            }
//
//            if (dbHelper.isCoinSelectionDataEmpty()) {
//                val list = ArrayList<CoinSelectionData>()
//                val coinList = dbHelper.getCoinDataListByDefaultIsDefaultSelected()
//                for (coinData in coinList) {
//                    val walletType = coinData.chainType
//                    val walletList = dbHelper.getWalletDataListByWalletType(walletType)
//                    for (walletData in walletList) {
//                        if (walletData.isFromSystem) {
//                            val coinSelectionData = CoinSelectionData()
//                            coinSelectionData.isSelected = true
//                            coinSelectionData.coinData = coinData
//                            coinSelectionData.walletData = walletData
//                            list.add(coinSelectionData)
//                        }
//                    }
//                }
//
//                dbHelper.setCoinSelectionDataList(list)
//            }
//
//            if (dbHelper.isAssetDataEmpty()) {
//                val assetDataList = ArrayList<AssetData>()
//                val coinSelectionDataList = dbHelper.getCoinSelectionDataList()
//                for (selectionData in coinSelectionDataList) {
//                    val assetData = AssetData()
//                    assetData.coinData = selectionData.coinData
//                    assetData.walletData = selectionData.walletData
//                    if (FeatureUtils.isDeveloper()) {
//                        val amount = MockHelperImpl.MIN_AMOUNT_UNIT * MockHelperImpl.getRandomInt()
//                        assetData.amount = BigDecimal(amount.toString())
//                    } else if (FeatureUtils.isRelease()) {
//                        assetData.amount = BigDecimal("0")
//                    } else {
//                        assetData.amount = BigDecimal("0")
//                    }
//                    assetDataList.add(assetData)
//                }
//
//                dbHelper.setAssetDataList(assetDataList)
//            }
//
//            if (dbHelper.isCoinToCoinRateDataEmpty()) {
//                val list = ArrayList<CoinToCoinRateData>()
//                val coinList = dbHelper.getCoinDataList()
//
//                for (i in list.indices) {
//                    list[i].toCoinData = coinList.get(i)
//                    list[i].fromCoinData = coinList.get((i + 1) % list.size)
//                    list[i].rate = BigDecimal(i)
//                }
//
//                dbHelper.setCoinToCoinRateDataList(list)
//            }
//
//            if (dbHelper.isCoinToFiatRateDataEmpty()) {
//                val list = ArrayList<CoinToFiatRateData>()
//                val coinList = dbHelper.getCoinDataList()
//                val fiatList = dbHelper.getFiatDataList()
//
//                var i = 1
//                for (coin in coinList) {
//                    for (fiat in fiatList) {
//                        val item = CoinToFiatRateData()
//                        item.fromCoinData = coin
//                        item.toFiatData = fiat
//                        item.rate = BigDecimal(i.toString() + "00000")
//                        i++
//                        list.add(item)
//                    }
//                }
//
//                dbHelper.setCoinToFiatRateDataList(list)
//            }
//
//            if (dbHelper.isFiatToFiatRateDataEmpty()) {
//                val list = mMockHelper.getMockFiatToFiatRateDataList()
//                val fiatList = dbHelper.getFiatDataList()
//
//                for (i in list.indices) {
//                    list.get(i).toFiatData = fiatList.get(i)
//                    list.get(i).fromFiatData = fiatList.get((i + 1) % list.size)
//                    list.get(i).rate = BigDecimal(i + "00")
//                }
//
//                dbHelper.setFiatToFiatRateDataList(list)
//            }
//
//            if (dbHelper.isLightningTransRecordDataEmpty()) {
//                val coinDataList = dbHelper.getCoinDataList()
//
//                val lightningRecordDataList = ArrayList<LightningTransRecordData>()
//
//                for (i in 0..4) {
//
//                    val data = LightningTransRecordData()
//                    data.txId = "fsjefksejf9398943483"
//                    data.status = 1
//                    data.fromCoinData = coinDataList.get(1)
//                    data.fromAmount = BigDecimal(345.778)
//                    data.fromAddress = "fjsoef494849"
//                    data.toCoinData = coinDataList.get(1)
//                    data.toAmount = BigDecimal(129.35)
//                    data.toAddress = "sfsjoojfsoj"
//                    data.feeCoinData = coinDataList.get(1)
//                    data.feeAmount = BigDecimal(33)
//                    data.feeRate = BigDecimal(30.28)
//                    data.totalFee = BigDecimal(81918.3)
//                    data.date = "2018-07-25-11:44:200"
//                    data.syncDate = "2018-07-25-14:33:745"
//
//                    lightningRecordDataList.add(data)
//
//                }
//
//                dbHelper.setLightningTransRecordDataList(lightningRecordDataList)
//            }
//
//            mMockHelper.updateMockDataTag()
//        }
//    }

    fun updateFiatDataList(apiDataList: List<ApiFiatData>) {
        var i = 0
        val j = apiDataList.size
        while (i < j) {
            val model = apiDataList[i]
            val data = dbHelper.getFiatDataByFiatId(model.id)
            data.name = model.name
            data.fiatId = model.id
            data.symbol = model.symbol

            if (data._id == -1) {
                dbHelper.addFiatData(data)
            } else {
                dbHelper.updateFiatData(data)
            }
            i++
        }
    }

    fun updateFiatIdToUsdRateDataList(apiDataList: List<ApiFiatTableData>) {
        val toUsdFiatData = dbHelper.getFiatDataByName(GlobalConstant.DEFAULT_USD_FIAT_NAME)
        if (toUsdFiatData._id < 0) {
            return
        }

        var i = 0
        val j = apiDataList.size
        while (i < j) {
            val model = apiDataList[i]
            val fromFiatId = model.fiatId
            val fromFiatData = dbHelper.getFiatDataByFiatId(fromFiatId)

            if (fromFiatData._id > 0) {
                val data = dbHelper.getFiatToFiatRateDataByFromFiatIDToFiatID(
                    fromFiatData._id,
                    toUsdFiatData._id
                )
                data.toFiatData = toUsdFiatData
                data.fromFiatData = fromFiatData
                data.rate = BigDecimal(model.toUSDRate.toString())
                val time = TimeUtils.getNowTimestamp().toString()
                data.syncData = time
                if (data._id == -1) {
                    dbHelper.addFiatToFiatRateData(data)
                } else {
                    dbHelper.updateFiatToFiatRateData(data)
                }
            }
            i++
        }
    }
}