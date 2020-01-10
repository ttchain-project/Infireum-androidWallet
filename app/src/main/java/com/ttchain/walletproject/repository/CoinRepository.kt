package com.ttchain.walletproject.repository

import android.content.Context
import com.git4u.tt_wallet_android.utils.RuleUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ttchain.walletproject.R
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.AssetData
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.CoinSelectionData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.ManageBeanIdType
import com.ttchain.walletproject.enums.ManageBeanType
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.showNumber
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.SortUtils
import java.math.BigDecimal
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.isNotEmpty
import kotlin.collections.set
import kotlin.collections.toMutableList

class CoinRepository(
    private val context: Context,
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val systemHelper: SystemHelper
) :
    BaseRepository() {


    companion object {
        const val COIN_CIC_IDENTIFIER = "0x29dc5ea777ff2bbfe14866f368b5ccc5e9fad99e"

        const val COIN_BTC_RELAY_IDENTIFIER = "Identifier_BTCRelay"
        const val COIN_ETH_RELAY_IDENTIFIER = "Identifier_ETHRelay"
        const val COIN_CRY_IDENTIFIER = "Identifier_CRY"
        const val COIN_GUC_IDENTIFIER =
            "0x43ccb7d0f229f96488b7f963d2cf25434efbe611b9e7c8ff28176e761c5f7944"

        const val COIN_RSC_IDENTIFIER = "Identifier_RSC"
        const val COIN_AIRDROP_IDENTIFIER = "Identifier_AIRDROP"

        const val COIN_MAIN_CHAIN_IDENTIFIER = "Identifier_MAIN"
        const val COIN_FIAT_IDENTIFIER = "Identifier_FIAT"
        const val COIN_STO_IDENTIFIER = "Identifier_STO"
    }

    /**
     * lock coin map is verify coin can add to [CoinSelectionData] in [com.git4u.tt_wallet_android.activity.asset_new.searchcoin.SearchCoinActivity]
     * or change coin selection status with [CoinSelectionData].isSelected in [com.git4u.tt_wallet_android.activity.asset_new.AssetManageActivity]
     * Key String: coinId => coin identifier.
     * Value Boolean: always true because is lock list.
     */
    private var lockCoinMap: MutableMap<String, Boolean>? = null

    fun createCoinBean(data: CoinSelectionData): CoinBean {
        val bean = createCoinBean(data.coinData)
        bean.coinSelectionDataId = data._id
        bean.isSelected = data.isSelected
        return bean
    }

    fun createCoinBean(data: CoinData): CoinBean {
        val bean = CoinBean()
        bean.isDefaultSelected = data.isDefaultSelected
        bean.coinID = data._id
        bean.coinId = data.coinId
        bean.displayName = data.displayName
        bean.fullName = data.fullName
        bean.contract = data.contract
        bean.chainType = data.chainType
        bean.iconPath = data.iconPath
        bean.digit = data.digit
        bean.mainCoinId = data.mainCoinId
        bean.chainName = data.chainName
        return bean
    }

    fun setManageCoinBeanList(list: List<ManageCoinBean>) {
        systemHelper.manageCoinBeanListString = Gson().toJson(list)
    }

    /**
     * Get manage coin bean list from [SystemHelper.manageCoinBeanListString]
     * If BeanListString is empty (means first time),
     * create a default ManageCoinBeanList from [.createManageCoinBeanList],
     * and then set the list data to [.setManageCoinBeanList]
     *
     * @return ManageCoinBean list data
     */
    fun getManageCoinBeanList(): List<ManageCoinBean> {
        val string = systemHelper.manageCoinBeanListString
        if (string.isEmpty()) {
            val list = createManageCoinBeanList()
            setManageCoinBeanList(list)
            return list
        } else {
            val list = Gson().fromJson<List<ManageCoinBean>>(string, object :
                TypeToken<java.util.ArrayList<ManageCoinBean>>() {

            }.type)
            for (bean in list) {
                when (bean.id) {
                    0 -> bean.name = context.getString(R.string.hide_zero_asset)
                    1 -> bean.name = context.getString(R.string.order_by_remain_mount)
                    2 -> bean.name = context.getString(R.string.order_by_alphabet)
                    3 -> bean.name = context.getString(R.string.remove_asset)
                }
                bean.cancelString = context.getString(R.string.g_cancel)
            }
            return list
        }
    }

    fun createManageCoinBeanList(): List<ManageCoinBean> {
        val list = java.util.ArrayList<ManageCoinBean>()
        val bean1 = ManageCoinBean()
        bean1.id = ManageBeanIdType.HIDE_ZERO_ASSET.type
        bean1.name = context.getString(R.string.hide_zero_asset)
        bean1.canSelected = false
        bean1.type = ManageBeanType.ACTION.type

        val bean2 = ManageCoinBean()
        bean2.id = ManageBeanIdType.AMOUNT.type
        bean2.name = context.getString(R.string.order_by_remain_mount)
        bean2.canSelected = true
        bean2.cancelString = context.getString(R.string.g_cancel)
        bean2.type = ManageBeanType.SORT.type

        val bean3 = ManageCoinBean()
        bean3.id = ManageBeanIdType.NAME.type
        bean3.name = context.getString(R.string.order_by_alphabet)
        bean3.canSelected = true
        bean3.cancelString = context.getString(R.string.g_cancel)
        bean3.type = ManageBeanType.SORT.type
        bean3.selected = true

        val bean4 = ManageCoinBean()
        bean4.id = ManageBeanIdType.REMOVE.type
        bean4.name = context.getString(R.string.remove_asset)
        bean4.canSelected = false
        bean4.type = ManageBeanType.ACTION.type

        list.add(bean1)
        list.add(bean2)
        list.add(bean3)
        list.add(bean4)

        return list
    }

    fun addCoinSelectionData(coinId: String) {
        val id = userHelper.selectedWalletID
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val walletData = dbHelper.getWalletData(id)
        if (walletData != null) {
            val selectionData = CoinSelectionData()
            selectionData.coinData = coinData
            selectionData.walletData = walletData
            selectionData.isSelected = true
            dbHelper.addCoinSelectionData(selectionData)
        }
    }

    fun addCoinSelectionData(coinId: String, mainCoinId: String) {
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        var walletData: WalletData? = null
        for (mWalletData in dbHelper.getDefaultWalletDataList()) {
            if (RuleUtils.getMainCoinId(mWalletData.address) == mainCoinId) {
                walletData = mWalletData
                break
            }
        }


        if (walletData != null) {
            val selectionData = CoinSelectionData()
            selectionData.coinData = coinData
            selectionData.walletData = walletData
            selectionData.isSelected = true
            dbHelper.addCoinSelectionData(selectionData)
        }
    }

    fun isCoinSelectionDataExist(coinId: String): Boolean {
        val id = userHelper.selectedWalletID
        val coinData = dbHelper.getCoinDataByCoinId(coinId)

        val list = dbHelper.getCoinSelectionDataListByWalletID(id)
        for (data in list) {
            if (data.coinData.coinId == coinData.coinId) {
                return true
            }
        }
        return false
    }

    fun isCoinAssetDataExist(coinId: String): Boolean {
        val id = userHelper.selectedWalletID
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val list = dbHelper.getAssetDataListByWalletIDAndCoinID(id, coinData._id)
        return list.isNotEmpty()
    }

    fun addCoinAssetData(coinId: String) {
        val walletData = getSelectedWalletData()
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val assetData = AssetData()
        assetData.coinData = coinData
        assetData.walletData = walletData
        assetData.amount = "0".toBigDecimal()
        dbHelper.addAssetData(assetData)
    }

    fun getSelectedWalletData(): WalletData {
        return dbHelper.getWalletData(userHelper.selectedWalletID) ?: WalletData()
    }

    fun addCoinAssetData(coinId: String, mainCoinId: String) {
        val walletData: WalletData? = dbHelper.getDefaultWalletDataList().find {
            RuleUtils.getMainCoinId(it.address) == mainCoinId
        }
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        if (walletData != null) {
            val assetData = AssetData()
            assetData.coinData = coinData
            assetData.walletData = walletData
            assetData.amount = BigDecimal("0")
            dbHelper.addAssetData(assetData)
        }
    }

    fun getCoinSelectionData(coinSelectionID: Int): CoinSelectionData {
        return dbHelper.getCoinSelectionData(coinSelectionID)
    }

    fun updateCoinSelectionSelected(coinSelectionID: Int, selected: Boolean) {
        val data = dbHelper.getCoinSelectionData(coinSelectionID)
        data.isSelected = selected
        dbHelper.updateCoinSelectionData(data)
    }

    fun deleteCoinSelectionData(coinId: String) {
        val id = userHelper.selectedWalletID
        val list = dbHelper.getCoinSelectionDataListByWalletID(id)
        for (data in list) {
            if (data.coinData.coinId == coinId) {
                dbHelper.deleteCoinSelectionData(data._id)
            }
        }
    }

    fun deleteCoinSelectionData(coinSelectedId: Int) {
        dbHelper.deleteCoinSelectionData(coinSelectedId)
    }

    fun deleteAssetData(coinId: String) {
        val id = userHelper.selectedWalletID
        val data = dbHelper.getCoinDataByCoinId(coinId)
        val list = dbHelper.getAssetDataListByWalletIDAndCoinID(id, data._id)
        for (item in list) {
            dbHelper.deleteAssetData(item._id)
        }
    }

    fun unSelectedZeroAmountCoinBeanData() {
        val id = userHelper.selectedWalletID
        val list = dbHelper.getCoinSelectionDataListByWalletID(id)
        val assetList = dbHelper.getAssetDataList()

        for (item in list) {
            for (itemAsset in assetList) {
                if (item.walletData._id == itemAsset.walletData._id) {
                    if (item.coinData._id == itemAsset.coinData._id) {
                        if (itemAsset.amount.toDouble() == 0.0) {
                            item.isSelected = false
                            dbHelper.updateCoinSelectionData(item)
                        }
                    }
                }
            }
        }
    }

    private fun sortCoinBeanList(list: List<CoinBean>): List<CoinBean> {
        var sortList = SortUtils.getCoinBeanDataListByCoinID(list)

        val manageCoinBeans = getManageCoinBeanList()
        for (bean in manageCoinBeans) {
            if (bean.id == ManageBeanIdType.NAME.type && bean.selected) {
                sortList = SortUtils.getCoinBeanDataListByName(sortList)
            } else if (bean.id == ManageBeanIdType.AMOUNT.type && bean.selected) {
                sortList = SortUtils.getCoinBeanDataListByAmount(sortList)
            }
        }

        return sortList
    }

    fun getPickCoinBean(coinID: Int): PickCoinBean {
        val bean = PickCoinBean()
        bean.coinID = coinID
        return bean
    }

    fun getNormalCoinEntityList(identifier: String): List<CoinEntity> {
        val listLock = sortCoinBeanList(getCoinBeanList(CoinEntity.NORMAL, true, identifier))
        val listUnLock = sortCoinBeanList(getCoinBeanList(CoinEntity.NORMAL, false, identifier))
        val coinEntities = java.util.ArrayList<CoinEntity>()
        for (bean in listLock) {
            coinEntities.add(createCoinEntity(CoinEntity.NORMAL, bean))
        }
        for (bean in listUnLock) {
            coinEntities.add(createCoinEntity(CoinEntity.NORMAL, bean))
        }
        return coinEntities
    }

    fun getPickCoinEntityList(coinID: Int): List<CoinEntity> {
        var coinId = coinID
        if (coinId == -1) {
            val id = userHelper.selectedWalletID
            val data = dbHelper.getWalletData(id)
            if (data != null) {
                val coinDataList =
                    dbHelper.getCoinDataListByMainCoinId(RuleUtils.getMainCoinId(data.address))
                if (coinDataList.isNotEmpty()) {
                    coinId = coinDataList[0]._id
                }
            }
        }

        val result = java.util.ArrayList<CoinEntity>()
        val listLock =
            sortCoinBeanList(
                getCoinBeanList(
                    CoinEntity.PICK,
                    true,
                    userHelper.selectedWalletCategory
                )
            )
        val listUnLock =
            sortCoinBeanList(
                getCoinBeanList(
                    CoinEntity.PICK,
                    false,
                    userHelper.selectedWalletCategory
                )
            )
        for (bean in listLock) {
            if (bean.coinID == coinId) {
                bean.isPicked = true
            }
            result.add(createCoinEntity(CoinEntity.PICK, bean))
        }
        for (bean in listUnLock) {
            if (bean.coinID == coinId) {
                bean.isPicked = true
            }
            result.add(createCoinEntity(CoinEntity.PICK, bean))
        }

        return result
    }

    fun getAssetCoinEntityList(): List<CoinEntity> {
        val listLock = sortCoinBeanList(getCoinBeanList(CoinEntity.ASSET, true, ""))
        val listUnLock = sortCoinBeanList(getCoinBeanList(CoinEntity.ASSET, false, ""))
        val result = java.util.ArrayList<CoinEntity>()
        for (bean in listLock) {
            result.add(createCoinEntity(CoinEntity.ASSET, bean))
        }
        for (bean in listUnLock) {
            result.add(createCoinEntity(CoinEntity.ASSET, bean))
        }
        return result
    }

    fun getSearchCoinEntityList(word: String): List<CoinEntity> {
        initLockCoinMap()

        val id = userHelper.selectedWalletID
        val walletData = dbHelper.getWalletData(id)
        if (walletData == null || walletData._id < 0) {
            return java.util.ArrayList()
        }

        val mainCoinId = RuleUtils.getMainCoinId(walletData.address)

        val wordCoinDataList = dbHelper.getCoinDataListByMainCoinIdAndWord(mainCoinId, word)
        val list = wordCoinDataList.toMutableList()

        var coinSelectionDataList: MutableList<CoinSelectionData> = java.util.ArrayList()
        if (walletData.coinSelectionList != null) {
            coinSelectionDataList = ArrayList<CoinSelectionData>(walletData.coinSelectionList!!)
        }

        // Remove is not active coin data
        run {
            var i = list.size - 1
            val j = 0
            while (i >= j) {
                if (!list[i].isActive) {
                    list.removeAt(i)
                }
                i--
            }
        }

        // Remove is not active coin data
        var i = coinSelectionDataList.size - 1
        val j = 0
        while (i >= j) {
            if (!coinSelectionDataList[i].coinData.isActive) {
                coinSelectionDataList.removeAt(i)
            }
            i--
        }

        val result = java.util.ArrayList<CoinEntity>()
        for (coin in wordCoinDataList) {
            val bean = createCoinBean(coin)
            for (selectionData in coinSelectionDataList) {
                if (bean.coinID == selectionData.coinData._id) {
                    bean.searchIsAdded = true
                    bean.isLockSearch = isLockCoin(bean.coinId)
                }
            }
            result.add(createCoinEntity(CoinEntity.SEARCH, bean))
        }

        return result
    }

    fun getDeleteCoinEntityList(): List<CoinEntity> {
        val listLock = sortCoinBeanList(getCoinBeanList(CoinEntity.DELETE, true, ""))
        val listUnLock = sortCoinBeanList(getCoinBeanList(CoinEntity.DELETE, false, ""))
        val result = java.util.ArrayList<CoinEntity>()
        for (bean in listLock) {
            result.add(createCoinEntity(CoinEntity.DELETE, bean))
        }
        for (bean in listUnLock) {
            result.add(createCoinEntity(CoinEntity.DELETE, bean))
        }
        return result
    }

    private fun createCoinEntity(@CoinEntity.Companion.CoinType entityType: Int, bean: CoinBean): CoinEntity {
        return CoinEntity(entityType, bean)
    }

    private fun getCoinBeanList(
        @CoinEntity.Companion.CoinType entityType: Int, isLockCoin: Boolean,
        identifier: String
    ): List<CoinBean> {
        val coinBeanList = getCoinBeanList(entityType, identifier)
        var i = coinBeanList.size - 1
        val j = 0
        while (i >= j) {
            if (isLockCoin) {
                if (!coinBeanList[i].isLockSelection) {
                    coinBeanList.removeAt(i)
                }
            } else {
                if (coinBeanList[i].isLockSelection) {
                    coinBeanList.removeAt(i)
                }
            }
            i--
        }
        return coinBeanList
    }

    private fun getCoinBeanList(@CoinEntity.Companion.CoinType entityType: Int, identifier: String): MutableList<CoinBean> {
        initLockCoinMap()

        val id = userHelper.selectedWalletID
        val walletData = dbHelper.getWalletData(id) ?: return java.util.ArrayList()

        val selectionDataList: MutableList<CoinSelectionData>
        val assetList: List<AssetData>

        selectionDataList = if (walletData.coinSelectionList != null) {
            ArrayList<CoinSelectionData>(walletData.coinSelectionList!!)
        } else {
            java.util.ArrayList()
        }

        assetList = if (walletData.coinAssetList != null) {
            ArrayList<AssetData>(walletData.coinAssetList!!)
        } else {
            java.util.ArrayList()
        }

        if (entityType == CoinEntity.NORMAL || entityType == CoinEntity.PICK) {
            var i = selectionDataList.size - 1
            val j = 0
            while (i >= j) {
                if (!selectionDataList[i].isSelected) {
                    selectionDataList.removeAt(i)
                }
                i--
            }
        }
        // Remove is not active coin data
        var i = selectionDataList.size - 1
        val j = 0
        while (i >= j) {
            if (!selectionDataList[i].coinData.isActive) {
                selectionDataList.removeAt(i)
            }
            i--
        }

        val identityId = userHelper.identityID
        val identityData = dbHelper.getIdentityData(identityId) ?: return java.util.ArrayList()
        val fiatData = identityData.prefFiatData
        val usdFiatData = dbHelper.getFiatDataByName(GlobalConstant.DEFAULT_USD_FIAT_NAME)

        val fiatName = fiatData.name
        val fiatSymbol = fiatData.symbol

        val fiatToFiatRateData =
            dbHelper.getFiatToFiatRateDataByFromFiatIDToFiatID(fiatData._id, usdFiatData._id)

        val coinBeanList = java.util.ArrayList<CoinBean>()

        //DIFFER ETH RSC and Airdrop Category
        val coinSelectionDataList = java.util.ArrayList<CoinSelectionData>()
        if (identifier == COIN_RSC_IDENTIFIER) {
            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains("_RSC")) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        } else if (identifier == COIN_AIRDROP_IDENTIFIER) {
            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains("_AIRDROP")) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        } else if (identifier == COIN_STO_IDENTIFIER) {
            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains("_STO")) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        } else if (identifier == CoinEnum.USDT.coinId) {
            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains(CoinEnum.USDT.coinId)) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        } else if (identifier == CoinEnum.BTC.coinId) {
            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains(CoinEnum.BTC.coinId)) {
                    coinSelectionDataList.add(selectionData)
                }
            }
        } else if (identifier == COIN_FIAT_IDENTIFIER) {

            //            WalletData btcWallet = dbHelper.getWalletDataListByWalletType(0).get(0);
            //            for (CoinSelectionData data : btcWallet.getCoinSelectionList()) {
            //                if (data.getCoinData().getCoinId().contains(COIN_USDT_IDENTIFIER)) {
            //                    coinSelectionDataList.add(data);
            //                    assetList.addAll(btcWallet.getCoinAssetList());
            //                    break;
            //                }
            //            }

            for (selectionData in selectionDataList) {
                if (selectionData.coinData.coinId.contains("_FIAT")) {
                    coinSelectionDataList.add(selectionData)
                } else if (selectionData.coinData.coinId.contains(CoinEnum.USDT.coinId)) {
                    coinSelectionDataList.add(selectionData)
                }
            }

        } else {
            for (selectionData in selectionDataList) {
                //                if (!selectionData.getCoinData().getCoinId().contains("_AIRDROP") &&
                //                        !selectionData.getCoinData().getCoinId().contains("_RSC") &&
                //                        !selectionData.getCoinData().getCoinId().contains("_STO") &&
                //                        !selectionData.getCoinData().getCoinId().contains("_FIAT")) {
                //                    coinSelectionDataList.add(selectionData);
                //                }
                coinSelectionDataList.add(selectionData)
            }
        }


        for (selectionData in coinSelectionDataList) {
            for (assetData in assetList) {
                if (selectionData.coinData._id == assetData.coinData._id) {
                    val bean = createCoinBean(selectionData)
                    if (userHelper.privacyMode) {
                        bean.amount = "****"
                    } else {
                        bean.amount = NumberUtils.showNew(assetData.amount, bean.digit)
                    }
                    bean.amountValue = assetData.amount.toDouble()
                    val rate = dbHelper.getCoinToFiatRateDataFromCoinIDToFiatId(
                        selectionData.coinData._id,
                        usdFiatData.fiatId
                    )

                    val price =
                        assetData.amount.multiply(rate.rate).multiply(fiatToFiatRateData.rate)

                    if (userHelper.privacyMode) {
                        bean.exchange = "$fiatName$fiatSymbol****"
                    } else {
                        //                        if (price.doubleValue() > 0) {
                        bean.exchange = fiatName + fiatSymbol + " " + NumberUtils.showFiat(price)
                        //                        } else {
                        //                            bean.setExchange("-");
                        //                        }
                    }

                    bean.remindAmount =
                        context.getString(R.string.remain) + ":" + NumberUtils.showNew(
                            assetData.amount,
                            bean.digit
                        )

                    bean.isLockSelection = isLockCoin(bean.coinId)

                    bean.isLockDelete = isLockCoin(bean.coinId)

                    bean.isPrivacyMode = userHelper.privacyMode

                    coinBeanList.add(bean)
                }
            }
        }

        return coinBeanList
    }

    fun getCoinRecordBean(coinId: String, rate: BigDecimal): CoinRecordBean {
        val bean = CoinRecordBean()

        val id = userHelper.selectedWalletID
        val walletData = dbHelper.getWalletData(id)
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val assetData = dbHelper.getAssetDataByWalletIDAndCoinID(walletData!!._id, coinData._id)

        val identityData = walletData.identityData
        val fiatData = identityData.prefFiatData

        val fiatName = fiatData.name
        val fiatSymbol = fiatData.symbol

        val price = assetData.amount.multiply(rate)

        bean.title = coinData.displayName
        bean.coinAmount = NumberUtils.showNew(assetData.amount, coinData.digit)
        bean.coinCurrency = "≈$fiatName$fiatSymbol ${NumberUtils.show(price, showNumber)}"

        bean.walletName = "(${walletData.name})"

        return bean
    }

    fun getCoinToPrefFiatRate(coinId: String): BigDecimal {
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val identityId = userHelper.identityID
        val identityData = dbHelper.getIdentityData(identityId)
        if (identityData != null) {
            val fiatData = identityData.prefFiatData

            val usdFiatData = dbHelper.getFiatDataByName(GlobalConstant.DEFAULT_USD_FIAT_NAME)
            val fiatToFiatRateData =
                dbHelper.getFiatToFiatRateDataByFromFiatIDToFiatID(fiatData._id, usdFiatData._id)
            val rate =
                dbHelper.getCoinToFiatRateDataFromCoinIDToFiatId(coinData._id, usdFiatData.fiatId)
            return rate.rate.multiply(fiatToFiatRateData.rate)
        }
        return BigDecimal("0")
    }

    fun getUserPrefFiatName(): String {
        val identityId = userHelper.identityID
        val data = dbHelper.getIdentityData(identityId)
        return data?.prefFiatData?.name ?: ""
    }

    fun getUserPrefFiatSymbol(): String {
        val identityId = userHelper.identityID
        val data = dbHelper.getIdentityData(identityId)
        return data?.prefFiatData?.symbol ?: ""
    }

    fun getTransToCoinBeanList(fromCoinID: Int?): List<CoinBean> {
        val resultList = java.util.ArrayList<CoinBean>()
        val coinDataList = dbHelper.getCoinDataList()
        val filterCoinDataList = java.util.ArrayList<CoinData>()

        var fromCoinData = CoinData()
        for (data in coinDataList) {
            if (data._id == fromCoinID) {
                fromCoinData = data
                break
            }
        }

        val fromCoinId = fromCoinData.coinId
        var toCoinId = ""

        when (fromCoinId) {
            CoinEnum.BTC.coinId -> toCoinId = COIN_BTC_RELAY_IDENTIFIER
            COIN_BTC_RELAY_IDENTIFIER -> toCoinId = COIN_BTC_RELAY_IDENTIFIER
        }

        for (data in coinDataList) {
            if (data.coinId == toCoinId) {
                filterCoinDataList.add(data)
                break
            }
        }

        for (data in filterCoinDataList) {
            resultList.add(createCoinBean(data))
        }

        return resultList
    }

    fun getCoinWalletType(coinID: Int): Int {
        val data = dbHelper.getCoinData(coinID)
        return data.chainType
    }

    private fun initLockCoinMap() {
        if (lockCoinMap == null) {
            lockCoinMap = HashMap<String, Boolean>()
        }

        lockCoinMap?.let {
            it.clear()
            it[CoinEnum.BTC.coinId] = true
            it[CoinEnum.ETH.coinId] = true
        }
    }

    private fun isLockCoin(coinId: String): Boolean {
        if (lockCoinMap != null && lockCoinMap!!.isNotEmpty()) {
            return lockCoinMap!![coinId] ?: false
        }
        return false
    }

    fun updateCoinDataList(apiDataList: List<ApiCoinData>) {
        var i = 0
        val j = apiDataList.size
        while (i < j) {
            val model = apiDataList[i]
            val data = dbHelper.getCoinDataByCoinId(model.identifier)
            data.chainType = model.chainType
            data.chainName = model.chainName
            data.mainCoinId = model.mainCoinID
            data.fullName = model.fullName
            data.displayName = model.displayName
            data.contract = model.contract
            data.digit = model.digit
            data.iconPath = model.icon
            data.coinId = model.identifier
            data.isActive = model.isActive
            data.isDefault = model.isDefault
            data.isDefaultSelected = model.isDefaultSelected
            if (data._id == -1) {
                dbHelper.addCoinData(data)
            } else {
                dbHelper.updateCoinData(data)
            }
            i++
        }
    }
}