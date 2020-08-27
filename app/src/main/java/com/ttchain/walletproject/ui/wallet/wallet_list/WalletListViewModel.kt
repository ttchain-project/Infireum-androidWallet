package com.ttchain.walletproject.ui.wallet.wallet_list

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.handleAmount
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

class WalletListViewModel(
    private val context: Context,
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val coinRepository: CoinRepository,
    private val helperRepository: HelperRepositoryCo,
    private val verifyRepository: VerifyRepository,
    private val broadcastRepository: BroadcastRepository,
    private val ttnRepository: TtnRepository,
    private val ttnServerApiRepository: TtnServerApiRepository
) : BaseViewModel() {


    var category = ""
    private var fiatSymbol = coinRepository.getUserPrefFiatSymbol()

    val getRateAndWalletDataErrorLiveData = MutableLiveData<Boolean>()

    fun getRateAndWalletData() {
        total = BigDecimal("0")
        viewModelScope.launch(customExceptionHandler {
            getWalletData()
            getRateAndWalletDataErrorLiveData.value = true
        }) {
            val result =
                helperRepository.allCoinToCurrency(coinRepository.getUserPrefFiatName())
            fiatSymbol = coinRepository.getUserPrefFiatSymbol()
            rateList = result.data.orEmpty()
            getWalletData()
        }
    }

    fun getIdentityData(): IdentityData {
        val identityData = dbHelper.getIdentityData(userHelper.identityID)
        return identityData ?: IdentityData()
    }

    fun onClickMainChain() {
        category = CoinRepository.COIN_MAIN_CHAIN_IDENTIFIER
        getRateAndWalletData()
    }

    fun onClickStableCoin() {
        category = CoinRepository.COIN_FIAT_IDENTIFIER
        getRateAndWalletData()
    }

    val totalAssetAmountLiveData = MutableLiveData<String>()

    private val usdtChainName = "${CoinEnum.USDT.coinName}-omni"

    val fiatNameLiveData = MutableLiveData<String>()

    fun getWalletData() {
        viewModelScope.launch {
            withContext(Dispatchers.Main) {
                fiatNameLiveData.value = getIdentityData().prefFiatData.name
                if (category == CoinRepository.COIN_MAIN_CHAIN_IDENTIFIER) {
                    getMainData()
                } else if (category == CoinRepository.COIN_FIAT_IDENTIFIER) {
                    getStableData()
                }
                getTotalAssetAmount()
            }
        }
    }

    val mainDataLiveData = MutableLiveData<List<ExpandableListBean>>()

    var btc = ExpandableListBean()
    var eth = ExpandableListBean()
    var ttn = ExpandableListBean()
    var ifr = ExpandableListBean()

    private var ethAddress = ""

    private fun getMainData() {
        //BTC
        var btcAmount = BigDecimal("0")
        val btcCoinID = getCoinIDByCoinId(CoinEnum.BTC.coinId)
        val btcIcon = getIconPathByCoinId(btcCoinID)
        for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(btcCoinID))) {
            btcAmount = btcAmount.add(assetData.amount)
        }
        btc = ExpandableListBean(
            -1,
            CoinEnum.BTC.coinName,
            NumberUtils.show(btcAmount),
            getFiatRateText(CoinEnum.BTC.coinId, btcAmount, fiatSymbol),
            btcIcon
        )
        //ETH
        var ethAmount = BigDecimal("0")
        val ethCoinID = getCoinIDByCoinId(CoinEnum.ETH.coinId)
        val ethIcon = getIconPathByCoinId(ethCoinID)
        for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(ethCoinID))) {
            ethAmount = ethAmount.add(assetData.amount)
        }
        eth = ExpandableListBean(
            -1,
            CoinEnum.ETH.coinName,
            NumberUtils.show(ethAmount),
            getFiatRateText(CoinEnum.ETH.coinId, ethAmount, fiatSymbol),
            ethIcon
        )


        val btcList = ArrayList<ExpandableListBean>()
        val ethList = ArrayList<ExpandableListBean>()
        for (walletData in getWalletDataList()) {
            when (walletData.mainCoinId) {
                CoinEnum.BTC.coinId -> {
                    val amount =
                        dbHelper.getAssetDataByWalletIDAndCoinID(walletData._id, btcCoinID).amount
                    btcList.add(
                        ExpandableListBean(
                            walletData._id,
                            walletData.name,
                            NumberUtils.show(amount),
                            getFiatRateText(CoinEnum.BTC.coinId, amount, fiatSymbol),
                            "",
                            arrayListOf(),
                            walletData.isFromSystem
                        )
                    )
                }
                CoinEnum.ETH.coinId -> {
                    if (walletData.isFromSystem)
                        ethAddress = walletData.address
                    val amount =
                        dbHelper.getAssetDataByWalletIDAndCoinID(walletData._id, ethCoinID).amount
                    ethList.add(
                        ExpandableListBean(
                            walletData._id,
                            walletData.name,
                            NumberUtils.show(amount),
                            getFiatRateText(CoinEnum.ETH.coinId, amount, fiatSymbol),
                            ""
                        )
                    )
                }
            }
        }
        // 依照 isFromSystem 以及 Uncompress 排序
        btcList.sortWith(
            compareBy({ it.isFromSystem },
                { it.name.contains("Uncompress", true) })
        )
        btc.childData = btcList.asReversed()
        eth.childData = ethList
        getBalance()
        performGetErc20Balance(ethAddress, CoinEnum.IFR.coinId, CoinEnum.IFR.coinId)
    }

    private fun getStableData() {
        //USDT
        var usdtAmount = BigDecimal("0")
        val usdtCoinID = getCoinIDByCoinId(CoinEnum.USDT.coinId)
        val usdtIcon = getIconPathByCoinId(usdtCoinID)
        for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(usdtCoinID))) {
            usdtAmount = usdtAmount.add(assetData.amount)
        }
        val usdt = ExpandableListBean(
            -1,
            usdtChainName,
            NumberUtils.show(usdtAmount),
            getFiatRateText(CoinEnum.USDT.coinId, usdtAmount, fiatSymbol),
            usdtIcon
        )
        val usdtList = ArrayList<ExpandableListBean>()
        for (walletData in getWalletDataList()) {
            if (walletData.mainCoinId == CoinEnum.BTC.coinId) {
                val amount =
                    dbHelper.getAssetDataByWalletIDAndCoinID(walletData._id, usdtCoinID).amount
                usdtList.add(
                    ExpandableListBean(
                        walletData._id,
                        walletData.name,
                        NumberUtils.show(amount),
                        getFiatRateText(CoinEnum.USDT.coinId, amount, fiatSymbol),
                        ""
                    )
                )
            }
        }
        usdt.childData = usdtList
        mainDataLiveData.value = listOf(usdt)
    }

    private fun getWalletDataList(): List<WalletData> {
        return dbHelper.getWalletDataList()
    }

    private fun getCoinIDByCoinId(coinId: String): Int {
        val data = dbHelper.getCoinDataByCoinId(coinId)
        return data._id
    }

    private fun getIconPathByCoinId(id: Int): String {
        return dbHelper.getCoinData(id).iconPath.orEmpty()
    }

    var total = BigDecimal("0")


    private fun getTotalAssetAmount() {
        if (category == CoinRepository.COIN_MAIN_CHAIN_IDENTIFIER) {
            total = BigDecimal("0")
            //BTC
            var btcAmount = BigDecimal("0")
            val btcCoinID = getCoinIDByCoinId(CoinEnum.BTC.coinId)
            for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(btcCoinID))) {
                btcAmount = btcAmount.add(assetData.amount)
            }
            total = total.add(getFiatRate(CoinEnum.BTC.coinId, btcAmount))
            //ETH
            var ethAmount = BigDecimal("0")
            val ethCoinID = getCoinIDByCoinId(CoinEnum.ETH.coinId)
            for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(ethCoinID))) {
                ethAmount = ethAmount.add(assetData.amount)
            }
            total = total.add(getFiatRate(CoinEnum.ETH.coinId, ethAmount))
            totalAssetAmountLiveData.value = NumberUtils.showFiat(total)

        } else if (category == CoinRepository.COIN_FIAT_IDENTIFIER) {
            //USDT
            var usdtAmount = BigDecimal("0")
            val usdtCoinID = getCoinIDByCoinId(CoinEnum.USDT.coinId)
            for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(usdtCoinID))) {
                usdtAmount = usdtAmount.add(assetData.amount)
            }
            total = total.add(getFiatRate(CoinEnum.USDT.coinId, usdtAmount))
            totalAssetAmountLiveData.value = NumberUtils.showFiat(total)
        }
    }


    val launchCoinRecordLiveData = MutableLiveData<String>()
    val launchTtnCoinRecordLiveData = MutableLiveData<String>()
    val launchAssetListActivityLiveData = MutableLiveData<Boolean>()
    val launchIfcCoinRecordLiveData = MutableLiveData<String>()

    fun launchAssetListActivity(expandableData: ExpandableListBean, childPosition: Int) {
        val walletID = expandableData.childData[childPosition].walletID
        val chainName = expandableData.name
        userHelper.selectedWalletID = walletID
        when (chainName) {
            CoinEnum.BTC.coinName -> {
                userHelper.selectedWalletCategory = CoinEnum.BTC.coinId
                launchCoinRecordLiveData.value = CoinEnum.BTC.coinId
                return
            }
            CoinEnum.ETH.coinName -> {
                userHelper.removeSelectedWalletCategory()
            }
            usdtChainName -> {
                userHelper.selectedWalletCategory = CoinRepository.COIN_FIAT_IDENTIFIER
                launchCoinRecordLiveData.value = CoinEnum.USDT.coinId
                return
            }
            CoinEnum.TTN.coinName -> {
                launchTtnCoinRecordLiveData.value = CoinEnum.TTN.coinId
                return
            }
            CoinEnum.IFR.coinName -> {
                launchIfcCoinRecordLiveData.value = CoinEnum.IFR.coinId
                return
            }
        }
        launchAssetListActivityLiveData.value = true
    }

    fun getDefaultWalletBeanList(): List<WalletBean> {
        val result = ArrayList<WalletBean>()
        val list = dbHelper.getDefaultWalletDataList()
        for (data in list) {
            result.add(createWalletBean(context, data))
        }
        return result
    }

    fun getWalletData(walletID: Int): WalletData {
        return dbHelper.getWalletData(walletID) ?: WalletData()
    }

    private fun createWalletBean(context: Context, data: WalletData?): WalletBean {
        if (data != null) {
            return WalletBean(data._id).apply {
                chainType = data.chainType
                name = data.name
                address = data.address
                online = Utils.getInternetStatus(context)
                val mainCoinType = RuleUtils.getMainCoinType(data.address)
                bgDrawableId = when {
                    mainCoinType === MainCoinType.ETH -> R.mipmap.bg_eth_wallet_color
                    mainCoinType === MainCoinType.BTC -> R.mipmap.bg_btc_wallet_color
                    mainCoinType === MainCoinType.CIC -> R.mipmap.bg_cic_wallet_color
                    mainCoinType === MainCoinType.GUC -> R.mipmap.bg_guc_wallet_color
                    else -> R.mipmap.bg_eth_wallet_color
                }
            }
        } else {
            return WalletBean(-1).apply {
                name = "None"
                address = "None"
                online = true
                bgDrawableId = R.mipmap.bg_eth_wallet_color
                online = false
            }
        }
    }

    fun createWalletData(mnemonic: String, privateKey: String, address: String): Int {
        return createRestoreWalletData(
            UserBean().apply {
                this.mnemonic = mnemonic
                walletEpKey = privateKey
                importWalletAddress = address
            }
        )
    }

    private fun createRestoreWalletData(bean: UserBean): Int {
        val data = dbHelper.getIdentityData(userHelper.identityID)
        if (data != null && data._id > 0) {
            if (bean.pwd.isEmpty()) {
                bean.pwd = verifyRepository.decryptString(data.pwd)
            }
            if (bean.pwdEncrypt.isEmpty()) {
                bean.pwdEncrypt = data.pwd
            }
            if (bean.note.isEmpty()) {
                bean.note = data.pwdHint
            }
            val walletData = WalletFactory.createData(bean)
            walletData.identityData = data
            return dbHelper.addWalletData(walletData)
        }


        return -1
    }

    var ttnAddress = ttnRepository.getTtnWalletData().address

    fun getBalance() {
        add(
            ttnServerApiRepository.performGetTtnBalanceWithContractAddress(ttnAddress)
                .toMain()
                .subscribe({
                    //TTN
                    var ttnAmount = BigDecimal(it.balance.handleAmount(CoinEnum.TTN.coinId))
                    total = total.add(getFiatRate(CoinEnum.TTN.coinId, ttnAmount))
                    totalAssetAmountLiveData.value = NumberUtils.showFiat(total)
                    val ttnCoinID = getCoinIDByCoinId(CoinEnum.TTN.coinId)
                    val ttnIcon = getIconPathByCoinId(ttnCoinID)
                    for (assetData in dbHelper.getAssetDataListByCoinIDs(listOf(ttnCoinID))) {
                        ttnAmount = ttnAmount.add(assetData.amount)
                    }
                    ttn = ExpandableListBean(
                        -1,
                        CoinEnum.TTN.coinName,
                        NumberUtils.show(ttnAmount),
                        getFiatRateText(CoinEnum.TTN.coinId, ttnAmount, fiatSymbol),
                        ttnIcon
                    )

                    val ttnList = ArrayList<ExpandableListBean>()

                    val amount = it.balance.handleAmount(CoinEnum.TTN.coinId)
                    for (walletData in getWalletDataList()) {
                        if (walletData.mainCoinId == CoinEnum.TTN.coinId) {
                            ttnList.add(
                                ExpandableListBean(
                                    walletData._id,
                                    walletData.name,
                                    NumberUtils.show(BigDecimal(amount)),
                                    getFiatRateText(
                                        CoinEnum.TTN.coinId,
                                        BigDecimal(amount),
                                        fiatSymbol
                                    ),
                                    ""
                                )
                            )
                        }
                    }

                    ttn.childData = ttnList
//                    val groupList = listOf(btc, eth, ttn)
//                    mainDataLiveData.value = groupList
                }, {
                })
        )
    }

    private fun performGetErc20Balance(address: String, contract: String?, coinId: String) {
        val model =
            if (contract != null)
                BaseCoinTransferRepository.getInfuraErc20BalanceModel(address, contract)
            else BaseCoinTransferRepository.getInfuraEthBalanceModel(address)

        add(
            broadcastRepository.performMainnetInfuraRequest(model)
                .map {
                    val balance = BigInteger(it.data?.replace("0x", ""), 16)
                    balance.toString()
                }
                .subscribe({ balance ->
                    val coinData = dbHelper.getCoinDataByCoinId(coinId)
//                    val picAmount = BigDecimal(balance.handleAmount(CoinEnum.IFR.coinId))
                    val picAmount = BigDecimal(balance).multiply(BigDecimal("1E-" + coinData.digit))
                    val picCoinID = getCoinIDByCoinId(CoinEnum.IFR.coinId)
                    val picIcon = getIconPathByCoinId(picCoinID)
                    total = total.add(getFiatRate(CoinEnum.IFR.coinId, picAmount))
                    totalAssetAmountLiveData.value = NumberUtils.showFiat(total)
                    ifr = ExpandableListBean(
                        -1,
                        CoinEnum.IFR.coinName,
                        NumberUtils.show(picAmount),
                        getFiatRateText(CoinEnum.IFR.coinId, picAmount, fiatSymbol),
                        picIcon
                    )

                    val list = ArrayList<ExpandableListBean>()
                    list.clear()
                    for (walletData in getWalletDataList()) {
                        if (walletData.mainCoinId == CoinEnum.ETH.coinId) {
                            if (walletData.isFromSystem) {
                                list.add(
                                    ExpandableListBean(
                                        walletData._id,
                                        walletData.name,
                                        NumberUtils.show(picAmount),
                                        getFiatRateText(CoinEnum.IFR.coinId, picAmount, fiatSymbol),
                                        ""
                                    )
                                )
                            }
                        }
                    }

                    ifr.childData = list
                    val groupList = listOf(btc, eth, ttn, ifr)
                    mainDataLiveData.value = groupList
                }, { })
        )
    }
}