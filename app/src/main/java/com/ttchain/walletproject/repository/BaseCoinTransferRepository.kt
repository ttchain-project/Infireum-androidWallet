package com.ttchain.walletproject.repository

import android.content.Context
import com.ttchain.walletproject.App
import com.ttchain.walletproject.R
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.*
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.isZero
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.TimeUtils
import com.ttchain.walletproject.utils.Utility
import java.math.BigDecimal
import java.util.*

class BaseCoinTransferRepository(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val verifyRepository: VerifyRepository
) : BaseRepository() {

    var transCoinId: String = ""

    var walletSelectedId: Int = -1
        set(value) {
            field = value
            coinTransferBean?.let {
                updateWalletID(value, transCoinId, it)
            }
        }

    var coinTransferBean: CoinTransferBean? = null

    var nonceResult: String = ""

    var isSendAllBtcAmount: Boolean = false

    init {
        walletSelectedId = userHelper.selectedWalletID
    }

    fun getSelectedWalletData(): WalletData {
        return dbHelper.getWalletData(walletSelectedId) ?: WalletData()
    }

    fun getTransWalletAddress(): String {
        val walletData = getSelectedWalletData()
        if (walletData._id > 0) {
            return walletData.address
        }
        return ""
    }

    fun getTransWalletChainType(): Int {
        val walletData = getSelectedWalletData()
        if (walletData._id > 0) {
            return walletData.chainType
        }
        return -1
    }

    fun getChainType(): ChainType {
        return RuleUtils.getChainType(getTransWalletChainType())
    }

    fun isEthTransType(): Boolean {
        return RuleUtils.isChainType(getTransWalletChainType(), ChainType.ETH)
    }

    fun isBtcTransType(): Boolean {
        return RuleUtils.isChainType(getTransWalletChainType(), ChainType.BTC)
    }

    fun isEthMainCoinType(): Boolean {
        return RuleUtils.isMainCoinType(getTransWalletAddress(), MainCoinType.ETH)
    }

    fun isBtcMainCoinType(): Boolean {
        return RuleUtils.isMainCoinType(getTransWalletAddress(), MainCoinType.BTC)
    }

    fun getBaseCoinTransferBean(): CoinTransferBean {
        if (coinTransferBean == null) {
            coinTransferBean = createBaseCoinTransferBean(walletSelectedId, transCoinId)
        }
        return coinTransferBean!!
    }

    fun getReceiptAddressBean(walletID: Int = -1): ReceiptAddressBean {
        val bean = ReceiptAddressBean()
        coinTransferBean?.let {
            bean.coinId = it.transToCoinId
            bean.receiptAddress = it.transReceiptAddress
            val coinData = dbHelper.getCoinDataByCoinId(it.transToCoinId)
            coinData.let {
                bean.walletType = it.chainType
                bean.transToCoinMainCoinId = it.mainCoinId
            }
            bean.walletID = walletID
        }
        return bean
    }

    private fun updateWalletID(walletID: Int, coinId: String, bean: CoinTransferBean) {
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val assetData = dbHelper.getAssetDataByWalletIDAndCoinID(walletID, coinData._id)
        val walletData = dbHelper.getWalletData(walletID)

        bean.viewCoinRemindAmount =
            "( ${coinData.displayName} %s : ${NumberUtils.showNew(
                assetData.amount,
                coinData.digit
            )} )"
        bean.transWalletCoinRemindAmount = assetData.amount

        walletData?.let {
            bean.viewTransPayWalletName = "(${walletData.name})"
            bean.transPayAddress = walletData.address
        }
    }

    private fun createBaseCoinTransferBean(walletID: Int, coinId: String): CoinTransferBean {
        val coinData = dbHelper.getCoinDataByCoinId(coinId)
        val assetData = dbHelper.getAssetDataByWalletIDAndCoinID(walletID, coinData._id)

        val identityId = userHelper.identityID
        val identityData = dbHelper.getIdentityData(identityId)

        val bean = CoinTransferBean()

        bean.viewTitleName = coinData.displayName

        bean.transCoinId = coinData.coinId
        bean.transCoinDigit = coinData.digit

        bean.transCoinName = coinData.displayName
        bean.transCoinChainName = coinData.chainName

        bean.transWalletCoinRemindAmount = assetData.amount

        identityData?.prefFiatData?.let {
            bean.transToPrefFiatSymbol = "≈ ${it.symbol}"
        }

        updateWalletID(walletID, coinId, bean)

        return bean
    }

    fun createPickWalletBean(status: Boolean): PickWalletBean {
        val bean = PickWalletBean()
        bean.wallet_Id = walletSelectedId
        bean.coinId = transCoinId
        bean.requestShowFromPaymentDetailDialog = status
        coinTransferBean?.let {
            bean.transCoinAmount = it.transCoinAmount
        }
        return bean
    }

//    fun createPaymentDetailBean(
//        @PaymentDetailDialogFragment.Companion.PaymentType type: Int, minerBean: MinerFeeEditBean
//    ): PaymentDetailBean {
//        val bean = PaymentDetailBean(type)
//        bean.isZeroFee = minerBean.isZeroFee
//        bean.walletID = walletSelectedId
//        bean.chainType = minerBean.chainType
//        bean.transCoinId = transCoinId
//
//        if (coinTransferBean != null) {
//            bean.transComment = coinTransferBean!!.transComment
//        }
//
//        when (type) {
//            PaymentDetailDialogFragment.NORMAL -> {
//
//                coinTransferBean?.let {
//                    bean.transAmount = NumberUtils.showNonZero(it.transCoinAmount)
//                    bean.receiptAddress = it.transReceiptAddress
//                }
//            }
//
//            PaymentDetailDialogFragment.THUNDER -> {
//                coinTransferBean?.let {
//                    bean.transFromCoinId = it.transCoinId
//                    bean.transFromCoinName = it.transCoinName
//
//                    bean.transFromCoinAmount = NumberUtils.showNonZero(it.transCoinAmount)
//                    bean.receiptAddress = it.transReceiptAddress
//
//                    bean.transToCoinId = it.transToCoinId
//                    bean.transToCoinName = it.transToCoinName
//                    bean.transToCoinAmount = NumberUtils.showNonZero(
//                        it.transCoinToCoinRate.multiply(it.transCoinAmount),
//                        "0"
//                    )
//
//                    bean.transRate = NumberUtils.showNonZero(it.transCoinToCoinRate, "0")
//                }
//            }
//            else -> {
//            }
//        }
//
//        if (isBtcTransType()) {
//            when {
//                minerBean.isRegularPriceBtcChecked -> bean.minerFeeCoinAmountText =
//                    NumberUtils.showNonZero(minerBean.regularPriceBtc, "0") + " sat/b"
//                minerBean.isPriorityPriceBtcChecked -> bean.minerFeeCoinAmountText =
//                    NumberUtils.showNonZero(minerBean.priorityPriceBtc, "0") + " sat/b"
//                minerBean.isCustomPriceBtcChecked -> bean.minerFeeCoinAmountText =
//                    NumberUtils.showNonZero(minerBean.customPriceBtc, "0") + " sat/b"
//            }
//        } else {
//            val gasPrice = if (minerBean.isAdvanced) {
//                NumberUtils.showNonZero(minerBean.customGasPriceEth, "0")
//            } else {
//                NumberUtils.showNonZero(minerBean.userSeekGasPriceEth, "0")
//            }
//            val feeAmount = if (minerBean.isAdvanced) {
//                minerBean.minerFeeCustomCoinAmount
//            } else {
//                minerBean.minerFeeCoinAmount
//            }
//            val gas = if (minerBean.isAdvanced) {
//                NumberUtils.showNonZero(minerBean.customGasEth, "0")
//            } else {
//                if (transCoinId == CoinEnum.ETH.coinId) {
//                    NumberUtils.showNonZero(minerBean.defaultGasEth, "0")
//                } else {
//                    NumberUtils.showNonZero(minerBean.defaultGasNonEth, "0")
//                }
//            }
//
//            bean.minerFeeCoinAmountText = if (minerBean.isZeroFee) {
//                "0 " + minerBean.minerFeeCoinShortName
//            } else {
//                NumberUtils.showNonZero(feeAmount) + " " + minerBean.minerFeeCoinShortName
//            }
//
//            bean.minerFeeFormulaText = "= Gas($gas) * Gas Price($gasPrice gwei)"
//        }
//
//        return bean
//    }

    fun getWalletAddress(walletID: Int): String {
        return dbHelper.getWalletData(walletID)?.address!!
    }

    fun getAssetData(walletData: WalletData): AssetData {
        walletData.coinAssetList?.let { list ->
            for (data in list) {
                if (data.coinData.coinId == transCoinId) {
                    return data
                }
            }
        }
        return AssetData()
    }

    fun isEnough(): Boolean {
        coinTransferBean?.let {
            val transCoinAmount = coinTransferBean!!.transCoinAmount
            val assetData = getAssetData(getSelectedWalletData())
            val usefulAmount = assetData.amount
            return usefulAmount.subtract(transCoinAmount).toDouble() >= 0
        }
        return false
    }

    fun isEnoughInThunder(): Boolean {
        coinTransferBean?.let {
            val transCoinId = coinTransferBean!!.transCoinId
            val transCoinAmount = coinTransferBean!!.transCoinAmount

            val assetList = dbHelper.getAssetDataListByWalletID(walletSelectedId)
            for (asset in assetList) {
                if (asset.coinData.coinId == transCoinId && asset.walletData._id == walletSelectedId) {
                    return asset.amount.subtract(transCoinAmount).toDouble() >= 0.0
                }
            }
        }
        return false
    }

    fun isAssetDataExistInThunder(): Boolean {
        coinTransferBean?.let {
            val transCoinId = coinTransferBean!!.transCoinId
            val transCoinAmount = coinTransferBean!!.transCoinAmount

            val assetList = dbHelper.getAssetDataListByWalletID(walletSelectedId)
            for (asset in assetList) {
                if (asset.coinData.coinId == transCoinId && asset.walletData._id == walletSelectedId) {
                    return true
                }
            }
        }
        return false
    }

    fun getCoinAssetInWallet(): AssetData {
        coinTransferBean?.let {
            val transCoinId = coinTransferBean!!.transCoinId
            val transCoinAmount = coinTransferBean!!.transCoinAmount

            val assetList = dbHelper.getAssetDataListByWalletID(walletSelectedId)
            for (asset in assetList) {
                if (asset.coinData.coinId == transCoinId && asset.walletData._id == walletSelectedId) {
                    return asset
                }
            }
        }
        return AssetData()
    }

    fun getCoinAssetInWallet(walletId: Int = walletSelectedId, coinId: String): AssetData {
        coinTransferBean?.let {
            val transCoinId = coinId
            val transCoinAmount = coinTransferBean!!.transCoinAmount

            val assetList = dbHelper.getAssetDataListByWalletID(walletId)
            for (asset in assetList) {
                if (asset.coinData.coinId == transCoinId && asset.walletData._id == walletId) {
                    return asset
                }
            }
        }
        return AssetData()
    }

    fun getBtcTransactionModel(
        context: Context,
        list: List<ResponseBTCTransactionData>,
        bean: MinerFeeEditBean
    ): BtcTransactionModel {
        val model = BtcTransactionModel()
        model.token = "btc"
        model.privatekey = Utility.encryptWith32ByteKey(
            getWalletEpKey(walletSelectedId), Utility.MD5Encoding(
                Utility.KEY
            )
        )
        model.compressed = false
        model.encry = true

        getBaseCoinTransferBean().let {
            val transCoinAmount = it.transCoinAmount
            val transReceiptAddress = it.transReceiptAddress

            var transMinerFeeAmount: BigDecimal = if (bean.isAdvanced) {
                bean.customPriceBtc
            } else {
                BigDecimal("0")
            }

            if (transMinerFeeAmount.isZero()) {
                transMinerFeeAmount = when {
                    bean.isRegularPriceBtcChecked -> bean.regularPriceBtc
                    bean.isPriorityPriceBtcChecked -> bean.priorityPriceBtc
                    bean.isCustomPriceBtcChecked -> bean.customPriceBtc
                    else -> bean.regularPriceBtc
                }
            }
            // 轉出的數量, 對方收到的數量+礦工費, 單位:btc
            val totalOutAmount =
                transCoinAmount.plus(transMinerFeeAmount.multiply(BigDecimal("1E-8")))

//            model.unspend = getCanUseUnSpendBeanList(list, totalOutAmount)

            // 足夠支付的Unspend數量, 單位:btc
            val unSpendAmount = getCanUseUnSpendAmount(list, totalOutAmount)
            // 找零的數量, 單位:btc
            val backSelfAmount = unSpendAmount.subtract(totalOutAmount)

            val listTx = ArrayList<BtcTxBean>()

            val value = NumberUtils.showNew(transCoinAmount.multiply(BigDecimal("1E+8")), 0)
            val txBean = BtcTxBean(transReceiptAddress, value.toDouble())

            listTx.add(txBean)

            val selfAddress = getSelectedWalletData().address
            val selfAmount = NumberUtils.showNew(backSelfAmount.multiply(BigDecimal("1E+8")), 0)
            val selfTxBean = BtcTxBean(selfAddress, selfAmount.toDouble())

            listTx.add(selfTxBean)

            model.tx = listTx
        }

        return model
    }

    fun getBtcToBtrTransactionModel(
        context: Context,
        list: List<ApiBtcTransactionData>,
        bean: MinerFeeEditBean
    ): BtcToBtrTransactionModel {
        val model = BtcToBtrTransactionModel()
        model.token = "btcrelay"
        model.privatekey = Utility.encryptWith32ByteKey(
            getWalletEpKey(walletSelectedId), Utility.MD5Encoding(
                Utility.KEY
            )
        )
        model.encry = true

        if (getBaseCoinTransferBean().transReceiptAddress.startsWith("cx")) {
            model.cicAddress = getBaseCoinTransferBean().transReceiptAddress.substring(2)
        }

        model.compressed = false

        getBaseCoinTransferBean().let {
            val transCoinAmount = it.transCoinAmount
            val transReceiptAddress =
                "1Pi1Spap6vdfAWJPfMkYUCtG4EYM5fPWeR"  //Company BTC Wallet Address

            var transMinerFeeAmount: BigDecimal = if (bean.isAdvanced) {
                bean.customPriceBtc
            } else {
                BigDecimal("0")
            }

            if (transMinerFeeAmount.isZero()) {
                transMinerFeeAmount = when {
                    bean.isRegularPriceBtcChecked -> bean.regularPriceBtc
                    bean.isPriorityPriceBtcChecked -> bean.priorityPriceBtc
                    bean.isCustomPriceBtcChecked -> bean.customPriceBtc
                    else -> bean.regularPriceBtc
                }
            }
            // 轉出的數量, 對方收到的數量+礦工費, 單位:btc
            val totalOutAmount =
                transCoinAmount.plus(transMinerFeeAmount.multiply(BigDecimal("1E-8")))

//            model.unspend = getCanUseUnSpendBeanList(list, totalOutAmount)

            // 足夠支付的Unspend數量, 單位:btc
//            val unSpendAmount = getCanUseUnSpendAmount(list, totalOutAmount)
            // 找零的數量, 單位:btc
//            val backSelfAmount = unSpendAmount.subtract(totalOutAmount)

            val listTx = ArrayList<BtcTxBean>()

            val value = NumberUtils.showNew(transCoinAmount.multiply(BigDecimal("1E+8")), 0)
            val txBean = BtcTxBean(transReceiptAddress, value.toDouble())

            listTx.add(txBean)

            val selfAddress = getSelectedWalletData().address
//            val selfAmount = NumberUtils.showNew(backSelfAmount.multiply(BigDecimal("1E+8")), 0)
//            val selfTxBean = BtcTxBean(selfAddress, selfAmount.toDouble())

//            listTx.add(selfTxBean)

            model.tx = listTx
        }

        return model
    }

    companion object {
        fun getMainnetInfuraEthBroadcastModel(
            signText: String,
            comment: String = ""
        ): MainnetInfuraRequest {
            val model = MainnetInfuraRequest()
            model.jsonrpc = "2.0"// hard code
            model.method = "eth_sendRawTransaction"// hard code
            model.id = 1 //random id
            model.addParamsItem("0x$signText") // prefix add '0x'
            if (comment.isNotEmpty()) {
                model.comments = comment
            }
            return model
        }

        fun getMainnetInfuraEthNonceModel(address: String): MainnetInfuraRequest {
            val model = MainnetInfuraRequest()
            model.jsonrpc = "2.0"// hard code
            model.method = "eth_getTransactionCount"// hard code
            model.id = 1 //random id
            model.addParamsItem(address)
            model.addParamsItem("latest")// hard code
            return model
        }

        fun getSignEthBodyModel(
            encryptPrivateKey: String,
            contractAddress: String? = null
        ): SignETHBodyRequest {
            val model = SignETHBodyRequest()
            model.encry = true
            model.privateKey = encryptPrivateKey
            model.token = "eth"
            if (contractAddress != null && contractAddress.isNotEmpty()) {
                model.contractAddress = contractAddress
            }
            return model
        }

        fun getSignEthUrlModel(
            needPayload: Boolean,
            nonce: String,
            bean: MinerFeeEditBean,
            transferBean: CoinTransferBean
        ): SignEthQueryModel {
            val model = SignEthQueryModel()

            val gasLimit = if (bean.isAdvanced) {
                bean.customGasEth
            } else {
                if (transferBean.transCoinId == CoinEnum.ETH.coinId) {
                    if(needPayload) {
                        bean.payloadGasEth
                    } else {
                        bean.defaultGasEth
                    }
                } else {
                    bean.defaultGasNonEth
                }
            }

            // gwei
            val gasPrice = if (bean.isAdvanced) {
                bean.customGasPriceEth.multiply(BigDecimal("1E+9"))
            } else {
                bean.userSeekGasPriceEth.multiply(BigDecimal("1E+9"))
            }
            model.gasPrice = NumberUtils.show(gasPrice, 0) // wei

            model.gasLimit = gasLimit.toString()
            model.nonce = nonce

            model.to = transferBean.transReceiptAddress

            val value =
                transferBean.transCoinAmount.multiply(BigDecimal("1E+" + transferBean.transCoinDigit))

            model.value = NumberUtils.show(value, 0)

            return model
        }

        fun getCanUseUnSpendAmount(
            sourceList: List<ResponseBTCTransactionData>,
            totalOutAmount: BigDecimal
        ): BigDecimal {
            var usefulAmount = BigDecimal("0")
            var index = 0
            while (usefulAmount.subtract(totalOutAmount).toDouble() < 0) {
                val amount = sourceList[index].amount
                usefulAmount = usefulAmount.plus(BigDecimal(amount.toString()))
                index++
            }
            return usefulAmount
        }

        fun getCanUseUnSpendBeanList(
            sourceList: List<ResponseBTCTransactionData>,
            totalOutAmount: BigDecimal
        ): List<UnspendData> {
            val unspendBeanList = ArrayList<UnspendData>()

            var usefulAmount = BigDecimal("0")

            if (sourceList.isEmpty()) {
                throw BtcTransferException()
            }

            var index = 0
            while (usefulAmount.subtract(totalOutAmount).toDouble() < 0) {
                val amount = sourceList[index].amount
                usefulAmount = usefulAmount.plus(BigDecimal(amount.toString()))

                val bean = UnspendData()
                bean.value = sourceList[index].vout.toDouble()
                bean.txid = sourceList[index].txid
                unspendBeanList.add(bean)


                if (usefulAmount.compareTo(totalOutAmount) != -1) {
                    break
                }

                index++

                if (index == sourceList.size) {
                    throw Exception(App.context.getString(R.string.not_enough_mone_fee))
                }
            }

            return unspendBeanList
        }

        fun getSignBtcBodyModel(
            address: String,
            encryptPrivateKey: String,
            list: List<ResponseBTCTransactionData>,
            bean: MinerFeeEditBean,
            transferBean: CoinTransferBean,
            isToBtcRelay: Boolean = false,
            isSendAllAmount: Boolean = false,
            isCompressed: Boolean = true
        ): SignBTCBodyData {
            val model = SignBTCBodyData()
            model.token = if (isToBtcRelay) {
                "btcrelay"
            } else {
                "btc"
            }
            model.privatekey = encryptPrivateKey
            model.compressed = isCompressed
            model.encry = true

            transferBean.transReceiptAddress.apply {
                if (isToBtcRelay && RuleUtils.isChainType(this, ChainType.CIC)) {
                    model.cicAddress = this.substring(2)
                }
            }

            val transCoinAmount = transferBean.transCoinAmount
            val transReceiptAddress = if (isToBtcRelay) {
                App.btcRelayAddress
            } else {
                transferBean.transReceiptAddress
            }

            var transMinerFeeAmount: BigDecimal = if (bean.isAdvanced) {
                bean.customPriceBtc
            } else {
                BigDecimal("0")
            }


            if (transMinerFeeAmount.isZero()) {
                transMinerFeeAmount = when {
                    bean.isRegularPriceBtcChecked -> bean.regularPriceBtc
                    bean.isPriorityPriceBtcChecked -> bean.priorityPriceBtc
                    bean.isCustomPriceBtcChecked -> bean.customPriceBtc
                    else -> bean.regularPriceBtc
                }
            }

            // 轉出的數量, 對方收到的數量+礦工費, 單位:btc
            val totalOutAmount =
                transCoinAmount.plus(transMinerFeeAmount.multiply(BigDecimal("1E-8")))

            model.unspend = getCanUseUnSpendBeanList(list, totalOutAmount)


            // 足夠支付的Unspend數量, 單位:btc
            val unSpendAmount = getCanUseUnSpendAmount(list, totalOutAmount)
            // 找零的數量, 單位:btc
            val backSelfAmount = unSpendAmount.subtract(totalOutAmount)

            val listTx = ArrayList<TxData>()

            val value = NumberUtils.showNew(transCoinAmount.multiply(BigDecimal("1E+8")), 0)
            val txBean = TxData()
            txBean.address = transReceiptAddress
            txBean.value = value.toDouble()

            listTx.add(txBean)

            if (!isSendAllAmount) {
                val selfAddress = address
                val selfAmount = NumberUtils.showNew(backSelfAmount.multiply(BigDecimal("1E+8")), 0)
                val selfTxBean = TxData()
                selfTxBean.address = selfAddress
                selfTxBean.value = selfAmount.toDouble()

                listTx.add(selfTxBean)
            }

            model.tx = listTx

            return model
        }

        fun getSignUSDTBodyModel(
            address: String,
            encryptPrivateKey: String,
            list: List<ResponseBTCTransactionData>,
            bean: MinerFeeEditBean,
            transferBean: CoinTransferBean,
            isCompressed: Boolean = true
        ): SignBTCBodyData {
            val model = SignBTCBodyData()
            model.token = "usdt"
            model.privatekey = encryptPrivateKey
            model.compressed = isCompressed
            model.encry = true
            val transCoinAmount = transferBean.transCoinAmount
            val transReceiptAddress = transferBean.transReceiptAddress

            var transMinerFeeAmount: BigDecimal = if (bean.isAdvanced) {
                bean.customPriceBtc
            } else {
                BigDecimal("0")
            }


            if (transMinerFeeAmount.isZero()) {
                transMinerFeeAmount = when {
                    bean.isRegularPriceBtcChecked -> bean.regularPriceBtc
                    bean.isPriorityPriceBtcChecked -> bean.priorityPriceBtc
                    bean.isCustomPriceBtcChecked -> bean.customPriceBtc
                    else -> bean.regularPriceBtc
                }
            }

            // 轉出的數量, 礦工費+546satoshi, 單位:btc
            val totalOutAmount = transMinerFeeAmount.multiply(BigDecimal("1E-8")).add(
                BigDecimal.valueOf(546).multiply(
                    BigDecimal("1E-8")
                )
            )

            model.unspend = getCanUseUnSpendBeanList(list, totalOutAmount)


//            // 足夠支付的Unspend數量, 單位:btc
            val unSpendAmount = getCanUseUnSpendAmount(list, totalOutAmount)
            // 找零的數量, 單位:btc   btc總額-礦工費-546satoshi
            val backSelfAmount = unSpendAmount.subtract(totalOutAmount)

            val listTx = ArrayList<TxData>()

            val value = NumberUtils.showNew(transCoinAmount.multiply(BigDecimal("1E+8")), 0)
            val txBean = TxData()
            txBean.address = transReceiptAddress
//            txBean.value = value.toDouble()
            txBean.value = BigDecimal.valueOf(546).toDouble()

            listTx.add(txBean)

            val selfAddress = address
            val selfAmount = NumberUtils.showNew(backSelfAmount.multiply(BigDecimal("1E+8")), 0)
            val selfTxBean = TxData()
            selfTxBean.address = selfAddress
            selfTxBean.value = selfAmount.toDouble()

            listTx.add(selfTxBean)

            model.tx = listTx

            return model
        }

        fun getSignUsdtLightenBodyModel(
            address: String,
            encryptPrivateKey: String,
            list: List<ResponseBTCTransactionData>,
            bean: MinerFeeEditBean,
            transferBean: CoinTransferBean,
            isCompressed: Boolean = true
        ): SignBTCBodyData {
            val model = SignBTCBodyData()
            model.token = "usdt"
            model.privatekey = encryptPrivateKey
            model.compressed = isCompressed
            model.encry = true
            val transCoinAmount = transferBean.transCoinAmount
            val transReceiptAddress = transferBean.transReceiptAddress

            var transMinerFeeAmount: BigDecimal = if (bean.isAdvanced) {
                bean.customPriceBtc
            } else {
                BigDecimal("0")
            }


            if (transMinerFeeAmount.isZero()) {
                transMinerFeeAmount = when {
                    bean.isRegularPriceBtcChecked -> bean.regularPriceBtc
                    bean.isPriorityPriceBtcChecked -> bean.priorityPriceBtc
                    bean.isCustomPriceBtcChecked -> bean.customPriceBtc
                    else -> bean.regularPriceBtc
                }
            }

            // 轉出的數量, 礦工費+546satoshi, 單位:btc
            val totalOutAmount = transMinerFeeAmount.multiply(BigDecimal("1E-8")).add(
                BigDecimal.valueOf(1092).multiply(
                    BigDecimal("1E-8")
                )
            )  //546+546 = usdt -> usdt-n

            model.unspend = getCanUseUnSpendBeanList(list, totalOutAmount)


//            // 足夠支付的Unspend數量, 單位:btc
            val unSpendAmount = getCanUseUnSpendAmount(list, totalOutAmount)
            // 找零的數量, 單位:btc   btc總額-礦工費-546satoshi
            val backSelfAmount = unSpendAmount.subtract(totalOutAmount)

            val listTx = ArrayList<TxData>()

            val selfAddress = address
            val selfAmount = NumberUtils.showNew(backSelfAmount.multiply(BigDecimal("1E+8")), 0)
            val selfTxBean = TxData()
            selfTxBean.address = selfAddress
            selfTxBean.value = selfAmount.toDouble()

            listTx.add(selfTxBean)

            val value = NumberUtils.showNew(BigDecimal.valueOf(546), 0)
            val txBean = TxData()
            txBean.address = transReceiptAddress
            txBean.value = value.toDouble()

            listTx.add(txBean)

            model.tx = listTx

            return model
        }
    }

    fun getBlockExplorerBroadcaseModel(
        signText: String,
        comment: String = ""
    ): BlockExplorerRequest {
        val model = BlockExplorerRequest()
        model.rawtx = signText
        if (comment.isNotEmpty()) {
            model.comments = comment
        }
        return model
    }

    fun getNonceStruct(bean: MinerFeeEditBean): String {
        val urlModel = SignEthQueryModel()

        val gasLimit = if (bean.isAdvanced) {
            bean.customGasEth
        } else {
            if (getBaseCoinTransferBean().transCoinId == CoinEnum.ETH.coinId) {
                bean.defaultGasEth
            } else {
                bean.defaultGasNonEth
            }
        }

        // gwei
        val gasPrice = if (bean.isAdvanced) {
            bean.customGasPriceEth.multiply(BigDecimal("1E+9"))
        } else {
            bean.userSeekGasPriceEth.multiply(BigDecimal("1E+9"))
        }

        urlModel.gasLimit = gasLimit.toString()
        urlModel.nonce = nonceResult

        getBaseCoinTransferBean().let {
            urlModel.gasPrice = NumberUtils.showNew(gasPrice, 0) // wei

            urlModel.to = it.transReceiptAddress

            val value = it.transCoinAmount.multiply(BigDecimal("1E+18"))

            urlModel.value = NumberUtils.showNew(value, 0)
        }

        return urlModel.toString()
    }

    fun getEthTransactionModel(context: Context): EthTransactionModel {
        val model = EthTransactionModel()
        model.privateKey = Utility.encryptWith32ByteKey(
            getWalletEpKey(walletSelectedId), Utility.MD5Encoding(
                Utility.KEY
            )
        )
        model.contractAddress = if (transCoinId != CoinEnum.ETH.coinId) {
            dbHelper.getCoinDataByCoinId(transCoinId).contract
        } else {
            null
        }
        model.token = "eth"
        model.encry = true
        return model
    }

    fun addLightningTransRecordData(data: LightningTransRecordData) {
        dbHelper.addLightningTransRecordData(data)
    }

    fun getCoinData(coinId: String): CoinData {
        return dbHelper.getCoinDataByCoinId(coinId)
    }

    fun addTransferRecordData(
        txId: String,
        transferBean: CoinTransferBean,
        minerFeeEditBean: MinerFeeEditBean
    ): Int {
        val data = TransRecordData()
        data.txId = txId

        data.status = GlobalConstant.TRANSACTION_STATE_OUTCOME

        val transCoinData = getCoinData(transferBean.transCoinId)

        if (transCoinData.coinId == CoinEnum.BTC.coinId) {
            when {
                minerFeeEditBean.isRegularPriceBtcChecked -> data.totalFee =
                    minerFeeEditBean.regularPriceBtc.multiply(
                        BigDecimal("1E-8")
                    )
                minerFeeEditBean.isPriorityPriceBtcChecked -> data.totalFee =
                    minerFeeEditBean.priorityPriceBtc.multiply(
                        BigDecimal("1E-8")
                    )
                minerFeeEditBean.isCustomPriceBtcChecked -> data.totalFee =
                    minerFeeEditBean.customPriceBtc.multiply(
                        BigDecimal("1E-8")
                    )
                else -> data.totalFee =
                    minerFeeEditBean.regularPriceBtc.multiply(BigDecimal("1E-8"))
            }
        } else {
            if (minerFeeEditBean.isAdvanced) {
                data.feeAmount = minerFeeEditBean.customGasEth
                data.feeRate = minerFeeEditBean.customGasPriceEth
            } else {
                if (transCoinData.coinId == CoinEnum.ETH.coinId) {
                    data.feeAmount = minerFeeEditBean.defaultGasEth
                } else {
                    data.feeAmount = minerFeeEditBean.defaultGasNonEth
                }
                data.feeRate = minerFeeEditBean.userSeekGasPriceEth
            }

            data.totalFee = if (minerFeeEditBean.isAdvanced) {
                minerFeeEditBean.minerFeeCustomCoinAmount
            } else {
                minerFeeEditBean.minerFeeCoinAmount
            }
        }

        data.fromCoinData = transCoinData
        data.fromAddress = transferBean.transPayAddress

        data.toCoinData = transCoinData
        data.toAddress = transferBean.transReceiptAddress

        if (transCoinData.coinId == CoinEnum.BTC.coinId) {
            data.fromAmount = transferBean.transCoinAmount.plus(data.totalFee)
        } else {
            data.fromAmount = transferBean.transCoinAmount
        }
        data.toAmount = transferBean.transCoinAmount

        data.feeCoinData = getCoinData(minerFeeEditBean.minerFeeCoinId)

        data.date = TimeUtils.getNowTimestamp().toString()
        data.syncDate = TimeUtils.getNowTimestamp().toString()

        data.note = transferBean.transComment

        return dbHelper.addTransRecordData(data)
    }

    fun addUsdtTransferRecordData(
        txId: String,
        transferBean: CoinTransferBean,
        minerFeeEditBean: MinerFeeEditBean
    ): Int {
        val data = UsdtTransRecordData()
        data.txId = txId

        data.status = GlobalConstant.TRANSACTION_STATE_OUTCOME

        val transCoinData = getCoinData(transferBean.transCoinId)

        if (transCoinData.coinId == CoinEnum.BTC.coinId) {
            when {
                minerFeeEditBean.isRegularPriceBtcChecked -> data.totalFee =
                    minerFeeEditBean.regularPriceBtc.multiply(
                        BigDecimal("1E-8")
                    )
                minerFeeEditBean.isPriorityPriceBtcChecked -> data.totalFee =
                    minerFeeEditBean.priorityPriceBtc.multiply(
                        BigDecimal("1E-8")
                    )
                minerFeeEditBean.isCustomPriceBtcChecked -> data.totalFee =
                    minerFeeEditBean.customPriceBtc.multiply(
                        BigDecimal("1E-8")
                    )
                else -> data.totalFee =
                    minerFeeEditBean.regularPriceBtc.multiply(BigDecimal("1E-8"))
            }
        } else {
            if (minerFeeEditBean.isAdvanced) {
                data.feeAmount = minerFeeEditBean.customGasEth
                data.feeRate = minerFeeEditBean.customGasPriceEth
            } else {
                if (transCoinData.coinId == CoinEnum.ETH.coinId) {
                    data.feeAmount = minerFeeEditBean.defaultGasEth
                } else {
                    data.feeAmount = minerFeeEditBean.defaultGasNonEth
                }
                data.feeRate = minerFeeEditBean.userSeekGasPriceEth
            }

            data.totalFee = if (minerFeeEditBean.isAdvanced) {
                minerFeeEditBean.minerFeeCustomCoinAmount
            } else {
                minerFeeEditBean.minerFeeCoinAmount
            }
        }

        data.fromCoinData = transCoinData
        data.fromAddress = transferBean.transPayAddress

        data.toCoinData = transCoinData
        data.toAddress = transferBean.transReceiptAddress

        if (transCoinData.coinId == CoinEnum.BTC.coinId) {
            data.fromAmount = transferBean.transCoinAmount.plus(data.totalFee)
        } else {
            data.fromAmount = transferBean.transCoinAmount
        }
        data.toAmount = transferBean.transCoinAmount

        data.feeCoinData = getCoinData(minerFeeEditBean.minerFeeCoinId)

        data.date = TimeUtils.getNowTimestamp().toString()
        data.syncDate = TimeUtils.getNowTimestamp().toString()

        data.note = transferBean.transComment

        return dbHelper.addUsdtTransRecordData(data)
    }

    fun getAssetDataByCoinId(walletData: WalletData, coinId: String): AssetData {
        walletData.coinAssetList?.let { list ->
            for (data in list) {
                if (data.coinData.coinId == coinId) {
                    return data
                }
            }
        }
        return AssetData()
    }

    fun getWalletEpKey(walletID: Int): String {
        return verifyRepository.getWalletEpKey(walletID)
    }
}