package com.ttchain.walletproject.model

import android.text.TextWatcher
import android.view.View
import com.google.gson.annotations.SerializedName
import com.ttchain.walletproject.enums.ManageBeanIdType
import java.io.Serializable
import java.math.BigDecimal
import com.ttchain.walletproject.enums.ApiCodeEnum
import com.ttchain.walletproject.enums.ChainType

/**
 * 統一 Api Result
 */
data class ApiResult<T>(
    @SerializedName("code")
    val code: ApiCodeEnum = ApiCodeEnum.NUMBER_0,
    val message: String = "",
    val data: T
)

/**
 * 取得所有虛擬貨幣的指定法幣行情 data class
 */
data class DecimalData(
    val coinName: String,
    val identifier: String,
    val rate: Double
)

data class ExplorerDappBean(
    var name: String,
    var url: String = "",
    var icon: String = ""
)

data class ExplorerBean(
    var title: String = "",
    var content: String = "",
    var url: String = "",
    var img: String = "",

    var price: String = "",
    var change: String = ""
)

data class CoinBean(var coinId: String = "") {
    var coinID: Int = -1
    var contract: String? = null
    var displayName: String = ""
    var fullName: String = ""
    var iconPath: String? = null
    var chainType: Int = -1
    var amount: String = ""
    var amountValue: Double = 0.0
    var exchange: String = ""
    var digit: Int = 8
    var isDefaultSelected = false
    var isSelected: Boolean = false
    var coinSelectionDataId: Int = -1
    var searchIsAdded: Boolean = false
    var remindAmount: String = ""
    var isPicked: Boolean = false
    var isLockSelection: Boolean = false
    var isLockSearch: Boolean = false
    var isLockDelete: Boolean = false
    var isPrivacyMode: Boolean = false
    var mainCoinId: String = ""
    var chainName: String = ""
}

data class RecordBean(var _id: Int = -1) : Serializable {
    var detailText: String = ""
    var address: String = ""
    var date: String = ""
    var amount: BigDecimal = BigDecimal("0")
    var amountText: String = ""
    var status: Int = -1
    var statusIcon: Int = -1
    var textColorRes: Int = -1
    var coinToCoinText: String = ""
    var minerFeeText: String = ""
    var superLinkUrl: String = ""
    var comment: String? = ""


    var toAddress: String = ""
    var fromAddress: String = ""

    var block: String? = ""
    val isPadding get() = block.isNullOrEmpty() || (block != null && block!!.toLong() <= 0)

    var txid: String? = ""
    var coinDisplayName: String? = ""
}

data class ManageCoinBean(var id: Int = ManageBeanIdType.DEFAULT.type) : Serializable {
    var name: String = ""
        get() {
            if (canSelected && selected) {
                return "$cancelString$field"
            }
            return field
        }
    var cancelString: String = "取消"
    var canSelected = false
    var selected: Boolean = false
    var type: Int = ManageBeanIdType.DEFAULT.type
}

data class PickCoinBean(var _id: Int = -1) : Serializable {
    var coinID: Int = -1
}

data class CoinRecordBean(var _id: Int = -1) {
    var title: String = ""
    var coinName: String = ""
    var coinAmount: String = ""
    var coinCurrency: String = ""
    var walletName: String = ""
}

/**
 * 取得系統支援虛擬貨幣清單 data class
 */
data class ApiCoinData(
    @SerializedName("mainCoinID")
    var mainCoinID: String = "",
    @SerializedName("chainType")
    val chainType: Int = 0,
    @SerializedName("identifier")
    val identifier: String = "",
    @SerializedName("contract")
    val contract: String = "",
    @SerializedName("chainName")
    val chainName: String = "",
    @SerializedName("displayName")
    val displayName: String = "",
    @SerializedName("fullName")
    val fullName: String = "",
    @SerializedName("digit")
    val digit: Int = 0,
    @SerializedName("isDefault")
    val isDefault: Boolean = false,
    @SerializedName("isDefaultSelected")
    val isDefaultSelected: Boolean = false,
    @SerializedName("isActive")
    val isActive: Boolean = false,
    @SerializedName("icon")
    val icon: String = "",
    @SerializedName("addressRegex")
    val addressRegex: String = ""
)

/**
 * 取得以美金為基準的法幣兌換匯率表 data class
 */
data class ApiFiatTableData(
    @SerializedName("fiatId")
    var fiatId: Int = 0,
    @SerializedName("toUSDRate")
    val toUSDRate: Double = 0.toDouble()
)

/**
 * 取得系統支援法幣清單 data class
 */
data class ApiFiatData(
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("symbol")
    val symbol: String = ""
)

/**
 * 取得地址本地址 data class
 */
data class AddressBookData(
    @SerializedName("id")
    var id: String = "",
    @SerializedName("chainType")
    var chainType: Int = 0,
    @SerializedName("mainCoinID")
    var mainCoinID: String = "",
    @SerializedName("address")
    var address: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("note")
    var note: String = ""
)

/**
 * 取得 BTC 轉帳建議鍊費 (regular/priority) data class
 */
data class ApiBTCFeeData(
    @SerializedName("regular")
    var regular: Double = 0.toDouble(),
    @SerializedName("priority")
    val priority: Double = 0.toDouble()
)

/**
 * 取得 ETH 轉帳建議鍊費 data class
 */
data class ApiETHFeeData(
    @SerializedName("suggestGasPrice")
    var suggestGasPrice: Double = 0.toDouble(),
    @SerializedName("minGasPrice")
    val minGasPrice: Double = 0.toDouble(),
    @SerializedName("maxGasPrice")
    val maxGasPrice: Double = 0.toDouble()
)

/**
 * 取得虛擬幣漲跌幅資訊 data class
 */
data class QuotesData(
    val change: String,
    val img: String,
    val price: String,
    val title: String,
    val url: String
)

data class ApiVersionData(
    @SerializedName("iOS")
    var iOS: IOSData = IOSData(),
    @SerializedName("android")
    val android: AndroidData = AndroidData()
)

data class IOSData(
    @SerializedName("latest")
    var latest: String = "",
    @SerializedName("minimum")
    val minimum: String = ""
)

data class AndroidData(
    @SerializedName("androidLastestVersion")
    var androidLastestVersion: String = "",
    @SerializedName("androidMinVersion")
    val androidMinVersion: String = "",
    @SerializedName("plugin")
    val plugin: String = "",
    @SerializedName("googlePlay")
    val googlePlay: String = ""
)

/**
 * 取得隱私權資訊 data class
 */
data class GetPrivatePolicyData(
    @SerializedName("title")
    var title: String = "",
    @SerializedName("content")
    var content: String = "",
    @SerializedName("url")
    var url: String = "",
    @SerializedName("img")
    var img: String = ""
)

/*-------------------------------- Broadcast Api data --------------------------------*/

/**
 * ETH廣播 data class
 */
data class MainnetInfuraRequest(
    @SerializedName("jsonrpc")
    var jsonrpc: String = "",
    @SerializedName("method")
    var method: String = "",
    @SerializedName("params")
    var params: MutableList<Any> = arrayListOf(),
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("comments")
    var comments: String = ""
) {
    fun addParamsItem(paramsItem: Any): MainnetInfuraRequest {
        params.add(paramsItem)
        return this
    }
}

data class BalanceBody(
    @SerializedName("to")
    var to: String = "",
    @SerializedName("data")
    var data: String = ""
)

/**
 * BTC廣播 data class
 */
data class BlockExplorerRequest(
    @SerializedName("rawtx")
    var rawtx: String = "",
    @SerializedName("comments")
    var comments: String = ""
)

/**
 * SignETHOrSignETHContract data class
 */
data class SignETHBodyRequest(
    @SerializedName("contractAddress")
    var contractAddress: String? = null,
    @SerializedName("encry")
    var encry: Boolean = false,
    @SerializedName("privateKey")
    var privateKey: String = "",
    @SerializedName("token")
    var token: String = ""
)

data class ResponseSignETHData(
    @SerializedName("signText")
    var signText: String = "",
    @SerializedName("tx")
    val tx: ResponseTxData? = null
)

data class ResponseTxData(
    @SerializedName("nonce")
    var nonce: String = "",
    @SerializedName("gasLimit")
    val gasLimit: String = "",
    @SerializedName("to")
    val to: String = "",
    @SerializedName("value")
    val value: String = "",
    @SerializedName("gasPrice")
    val gasPrice: String = ""
)

/**
 * 取得BTC Unspent data class
 */
data class ResponseBTCTransactionData(
    @SerializedName("address")
    var address: String = "",
    @SerializedName("txid")
    val txid: String = "",
    @SerializedName("vout")
    val vout: Long = 0.toLong(),
    @SerializedName("scriptPubKey")
    val scriptPubKey: String = "",
    @SerializedName("amount")
    val amount: Double = 0.toDouble(),
    @SerializedName("satoshis")
    val satoshis: Long = 0.toLong(),
    @SerializedName("height")
    val height: Long = 0.toLong(),
    @SerializedName("confirmations")
    val confirmations: Long = 0.toLong()
)

/**
 * SignBTCOrSignBTCRelay data class
 */
data class SignBTCBodyData(
    @SerializedName("compressed")
    var compressed: Boolean = false,
    @SerializedName("tx")
    var tx: List<TxData>? = null,
    @SerializedName("unspend")
    var unspend: List<UnspendData>? = null,
    @SerializedName("privatekey")
    var privatekey: String = "",
    @SerializedName("token")
    var token: String = "",
    @SerializedName("encry")
    var encry: Boolean = false,
    @SerializedName("cicAddress")
    var cicAddress: String = ""
)

data class TxData(
    @SerializedName("address")
    var address: String = "",
    @SerializedName("value")
    var value: Double = 0.toDouble()
)

data class UnspendData(
    @SerializedName("txid")
    var txid: String = "",
    @SerializedName("value")
    var value: Double = 0.toDouble()
)

data class ResponseSignBTCData(
    @SerializedName("signText")
    var signText: String = ""
)

/**
 * 取得客戶備註 data class
 */
data class TransactionData(
    @SerializedName("txIDs")
    var txIDs: MutableList<String> = arrayListOf()
) {

    fun addTxIDsItem(txIDsItem: String): TransactionData? {
        txIDs.add(txIDsItem)
        return this
    }
}

data class CustomCommentsData(
    @SerializedName("txID")
    var txID: String = "",
    @SerializedName("comments")
    var comments: String = "",
    @SerializedName("toIdentifier")
    var toIdentifier: String = "",
    @SerializedName("toAddress")
    var toAddress: String = ""
)

data class AddressBean(var addressID: Int = -1) : Serializable {
    var name: String = ""
    var coinName: String = ""
    var address: String = ""
    var icon: Int = 0
    var uuid: String = ""
}

data class BalanceBean(var _id: Int = -1) : Serializable {
    var address: String = ""
    var coinId: String = ""
    var balance: String = ""
}

data class WalletBean(var walletID: Int = -1) : Serializable {
    var chainType: Int = ChainType.NONE.value
    var name: String = ""
    var address: String = ""
    var totalFiat: String = ""
    var bgDrawableId: Int = -1
    var online: Boolean = true
    var isPicked: Boolean = false
    var pickedCoinName: String = ""
    var pickedCoinAmount: String = ""
    var pickedCoinAmountDecimal: BigDecimal = BigDecimal(0)
    var enough: Boolean = false
    var isFromSystem: Boolean = true
}

data class CoinTransferBean(var _id: Int = -1) {
    var viewTitleName: String = ""
    var viewCoinRemindAmount: String = ""
    var viewTransPayWalletName: String = ""
    var viewTransMinerFeeToFiatAmount: String = ""

    var transCoinId: String = ""
    var transCoinDigit: Int = 0
    var transCoinName: String = ""
    var transCoinChainName: String = ""

    var transToPrefFiatSymbol: String = ""
    var transPayAddress: String = ""
    var transReceiptAddress: String = ""
    var transComment: String = ""

    var transWalletCoinRemindAmount: BigDecimal = BigDecimal("0")
    var transCoinToFiatAmount: BigDecimal = BigDecimal("0")
    var transCoinToFiatRate: BigDecimal = BigDecimal("0")
    var transCoinAmount: BigDecimal = BigDecimal("0")
    var transMinerFeeToFiatAmount: BigDecimal = BigDecimal("0")
    var transMinerFeeAmount: BigDecimal = BigDecimal("0")

    var transCoinToCoinRate: BigDecimal = BigDecimal("0")
    var transToCoinId: String = ""
    var transToCoinName: String = ""
    var transToCoinChainName: String = ""

    var transThunderReceiptWalletID: Int = -1
    var transThunderReceiptWalletType: Int = -1
}

data class BtcTxBean(
    var address: String = "",
    var value: Double = 0.0
) : Serializable

data class BtcUnSpendBean(
    var txid: String = "",
    var value: Double = 0.0
) : Serializable


data class PickWalletBean(var _id: Int = -1) : Serializable {
    var wallet_Id: Int = -1
    var coinId: String = ""
    var transCoinAmount: BigDecimal = BigDecimal("0")
    var requestShowFromPaymentDetailDialog = false
}

data class TransCoinItemBean(var name: String = "") {
    var hasFiatEquals: Boolean = false
    var subName: String = ""
    var subNameIcon: Int = -1
    var subNameClickable: Boolean = false
    var inputText: String = ""
    var hideInputText: Boolean = false
    var inputTextSize: Float = -1f
    var inputHintText: String = ""
    var inputHideUnderLine: Boolean = false
    var layoutPaddingTop: Int = -1
    var layoutPaddingBottom: Int = -1
    var inputTextChangedListener: TextWatcher? = null
    var subNameCallListener: View.OnClickListener? = null
    var hasFocusedChecked: Boolean = false
    var focusedDrawableRes: Int = -1
    var inputFocusChangedListener: View.OnFocusChangeListener? = null
}