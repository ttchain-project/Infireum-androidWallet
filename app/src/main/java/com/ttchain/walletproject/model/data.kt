package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName
import com.ttchain.walletproject.enums.ManageBeanIdType
import java.io.Serializable
import java.math.BigDecimal
import com.ttchain.walletproject.enums.ApiCodeEnum
import java.util.*

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
 * Im get user data
 */
data class PersonalInfo(
    var nickName: String = "",
    var introduction: String = "",
    var headImg: HeadImage = HeadImage(),
    // 狀態。0:未建立 1:已開通 2:停權
    val status: Int = 0
) : Serializable

data class HeadImage(
    var original: String = "",
    var small: String = "",
    var medium: String = ""
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


/**
 * 預登入取得使用帳號 (Orange) data class
 */
data class PreLoginData(
    @SerializedName("userID")
    var userID: String = "",
    @SerializedName("deviceID")
    val deviceID: String = ""
)

data class RegisterUserData(
    @SerializedName("uid")
    var uid: String = "",
    // 狀態。0: 不存在 1:存在 2:Device ID不符 3:密碼錯誤
    @SerializedName("status")
    val status: Int = 0,
    @SerializedName("isSetRecoveryKey")
    val isSetRecoveryKey: Boolean = false
)


/**
 * 預登入取得使用帳號 (Orange) data class
 */
data class PreLoginRequest(
    @SerializedName("userID")
    var userID: String = "",
    @SerializedName("deviceID")
    var deviceID: String = ""
)


/**
 * 更新使用者資訊 (Orange) data class
 */
data class UpdateUserInfoRequest(
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("deviceID")
    val deviceID: String = "",
    @SerializedName("recoveryKey")
    val recoveryKey: String = "",
    @SerializedName("nickName")
    var nickName: String = "",
    @SerializedName("introduction")
    val introduction: String = "",
    @SerializedName("headImg")
    val headImg: String = ""
)


/**
 * 取得他人個人信息(Albert) data class
 */
data class QueryUserResponse(
    @SerializedName("uid")
    var uid: String = "",
    @SerializedName("nickname")
    val nickname: String = "",
    @SerializedName("headImg")
    val headImg: HeadImage = HeadImage(),
    @SerializedName("isFriend")
    val isFriend: Boolean = false,
    @SerializedName("isBlock")
    val isBlock: Boolean = false
)

/**
 * 設置 Recovery Key (Orange) data class
 */
data class RecoveryKeyRequest(
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("recoveryKey")
    var recoveryKey: String = ""
)

/**
 * 封鎖/解除封鎖好友(Albert) data class
 */
data class FriendshipBlockRequest(
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("blockedUid")
    var blockedUid: UUID? = null,
    @SerializedName("action")
    var action: String = ""
)

/**
 * 發送好友邀請(Albert) data class
 */
data class FriendshipRequest(
    @SerializedName("inviterUID")
    var inviterUID: UUID? = null,
    @SerializedName("inviteeUID")
    var inviteeUID: UUID? = null,
    @SerializedName("invitationMessage")
    var invitationMessage: String = ""
)


/**
 * 群組資訊 AddGroupModel data class
 */
data class AddGroupData(
    @SerializedName("groupOwnerUID")
    var groupOwnerUID: UUID? = null,
    @SerializedName("groupName")
    var groupName: String = "",
    @SerializedName("isPrivate")
    var isPrivate: Boolean = false,
    @SerializedName("isPostMsg")
    var isPostMsg: Boolean = false,
    @SerializedName("introduction")
    var introduction: String = "",
    @SerializedName("authToken")
    var authToken: String = "",
    @SerializedName("rocketChatUserId")
    var rocketChatUserId: String = "",
    @SerializedName("headImg")
    var headImg: String = ""
)

/**
 * 群組資訊 data class
 */
data class GroupInfoData(
    @SerializedName("groupID")
    var groupID: String = "",
    @SerializedName("imGroupID")
    val imGroupID: String = "",
    @SerializedName("groupOwnerUID")
    val groupOwnerUID: String = "",
    @SerializedName("ownerName")
    val ownerName: String = "",
    @SerializedName("isPrivate")
    val isPrivate: Boolean = false,
    @SerializedName("invitationMembers")
    val invitationMembers: List<GroupMemberData> = arrayListOf(),
    @SerializedName("members")
    val members: List<GroupMemberData> = arrayListOf(),
    @SerializedName("blockList")
    val blockList: List<GroupMemberData> = arrayListOf(),
    @SerializedName("status")
    val status: Int = 0,
    @SerializedName("groupName")
    val groupName: String = "",
    @SerializedName("isPostMsg")
    val isPostMsg: Boolean = false,
    @SerializedName("headImg")
    var headImg: HeadImage = HeadImage(),
    @SerializedName("introduction")
    val introduction: String = ""
)

data class GroupMemberData(
    @SerializedName("uid")
    var uid: String = "",
    @SerializedName("nickName")
    val nickName: String = "",
    @SerializedName("headImg")
    val headImg: HeadImage = HeadImage(),
    @SerializedName("isFriend")
    val isFriend: Boolean = false,
    @SerializedName("isBlock")
    val isBlock: Boolean = false,
    @SerializedName("status")
    val status: Int = 0
)


/**
 * 回覆群組邀請 (Orange)
 * 退出群組請送 Status&#x3D;2
 * Request
 * */
data class GroupMemberInviteRequest(
    @SerializedName("groupID")
    var groupID: UUID? = null,
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("status")
    var status: Int = 0,
    @SerializedName("authToken")
    var authToken: String = "",
    @SerializedName("rocketChatUserId")
    var rocketChatUserId: String = ""
)


/**
 * 取得使用者關閉提醒的聊天室Id清單 data class
 */
data class MuteRoomData(
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("roomId")
    val roomId: String = ""
)

/**
 * 刪除群組成員請求 data class
 */
data class GroupDeleteRequest(
    @SerializedName("groupID")
    var groupID: UUID? = null,
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("authToken")
    var authToken: String = "",
    @SerializedName("rocketChatUserId")
    var rocketChatUserId: String = ""
)

/**
 * 更新群組資訊 (Orange)data class
 */
data class UpdateGroupInfoData(
    @SerializedName("groupID")
    var groupID: UUID? = null,
    @SerializedName("groupName")
    var groupName: String = "",
    @SerializedName("isPostMsg")
    var isPostMsg: Boolean = false,
    @SerializedName("introduction")
    var introduction: String = "",
    @SerializedName("headImg")
    var headImg: String = ""
)

/**
 * 設定使用者聊天室訊息提醒 data class
 */
data class ChatRoomNotificationSetting(
    @SerializedName("uid")
    var uid: UUID? = null,
    @SerializedName("roomId")
    var roomId: String = "",
    @SerializedName("isNotificaitonActive")
    var isNotificaitonActive: Boolean = false
)
