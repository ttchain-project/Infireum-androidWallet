package com.ttchain.walletproject.repository


import android.content.Context
import android.net.Uri
import android.text.TextUtils
import androidx.core.content.FileProvider
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.decryptString
import com.ttchain.walletproject.encryptString
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.ApiHelper
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utility
import java.io.File
import java.math.BigDecimal

open class BaseMainModel(
    protected val mApiHelper: ApiHelper,
    protected val mUserHelper: UserHelper,
    val mDbHelper: DbHelper
) {

    val lang: String
        get() = mApiHelper.lang

    open val identityId: String
        get() {
            val identityData = mDbHelper.getIdentityData(mUserHelper.identityID)
            return identityData?.identityId ?: ""
        }

    val identityData: IdentityData
        get() {
            val identityData = mDbHelper.getIdentityData(mUserHelper.identityID)
            return identityData ?: IdentityData()
        }

    val selectedWalletID: Int
        get() = mUserHelper.selectedWalletID

    open val ttnWalletID: Int
        get() {
            for (walletData in mDbHelper.getDefaultWalletDataList()) {
                if (walletData.mainCoinId == CoinEnum.TTN.coinId) {
                    return walletData._id
                }
            }
            return -1
        }

    open val ttnWalletData: WalletData
        get() {
            for (walletData in mDbHelper.getDefaultWalletDataList()) {
                if (walletData.mainCoinId == CoinEnum.TTN.coinId) {
                    return walletData
                }
            }
            return WalletData()
        }

    val selectedWalletData: WalletData
        get() {
            val data = mDbHelper.getWalletData(selectedWalletID)
            return data ?: WalletData()
        }

    val rocketChatUid: String
        get() = mUserHelper.rocketChatUid

    val rocketChatUserId: String
        get() = mUserHelper.rocketChatUserId

    val rocketChatAuthToken: String
        get() = mUserHelper.rocketChatAuthToken

    val selectionWalletCategory: String
        get() = mUserHelper.selectedWalletCategory

    val jPushRegistrationId: String
        get() = mUserHelper.jPushRegistrationId

    val jPushExtras: String
        get() = mUserHelper.jPushExtras

    open val saveTmpFileName: String
        get() = GlobalConstant.TMP_SCREENSHOT_IMAGE_NAME

    fun verifyIdentityPwd(context: Context, pwd: String): Boolean {
        val data = mDbHelper.getIdentityData(mUserHelper.identityID)
        return if (data != null) {
            data.pwd == encryptString(context, pwd)
        } else false
    }

    fun verifyWalletPwd(context: Context, walletID: Int, pwd: String): Boolean {
        val data = mDbHelper.getWalletData(walletID)
        return if (data != null) {
            data.pwd == encryptString(context, pwd)
        } else false
    }

    fun encryptString(context: Context, string: String): String {
        return string.encryptString(context)
    }

    fun decryptString(context: Context, string: String): String {
        return string.decryptString(context)
    }

    fun getRawPwd(mContext: Context): String {
        return decryptString(mContext, identityData.pwd)
    }

    fun getWalletEpKey(context: Context, walletID: Int): String {
        val data = mDbHelper.getWalletData(walletID)
        return if (data != null && !TextUtils.isEmpty(data.epKey) && !TextUtils.isEmpty(data.pwd)) {
            Utility.decryptPrivateKey(data.epKey, decryptString(context, data.pwd))
        } else ""
    }

    fun getWalletTitleNameByAddress(address: String): String {
        return RuleUtils.getDefaultWalletTitle(address)
    }

    fun getCoinIDByCoinId(coinId: String): Int {
        val (_id) = mDbHelper.getCoinDataByCoinId(coinId)
        return _id
    }

    open fun getCoinDataByCoinID(coinID: Int): CoinData {
        return mDbHelper.getCoinData(coinID)
    }

    open fun getCoinDataByCoinId(coinId: String): CoinData {
        return mDbHelper.getCoinDataByCoinId(coinId)
    }

//    fun getMainCoinDataByAddress(chainType: Int): CoinData {
//        val coinDataList = mDbHelper.getCoinDataListByWalletTypeId(chainType)
//        for (item in coinDataList) {
//            if (item.coinId == item.mainCoinId) {
//                return item
//            }
//        }
//        return CoinData()
//    }

    fun getMainCoinDataByAddress(address: String): CoinData {
        val coinId = RuleUtils.getMainCoinId(address)
        return mDbHelper.getCoinDataByCoinId(coinId)
    }

    fun clearJPushExtras() {
        mUserHelper.clearJPushExtras()
    }

    fun getFiat(coinId: String, amount: String): String {
        var totalPrice = BigDecimal("0")

        val (_id) = identityData.prefFiatData
        val usdFiatData = mDbHelper.getFiatDataByName(GlobalConstant.DEFAULT_USD_FIAT_NAME)
        val fiatToFiatRateData =
            mDbHelper.getFiatToFiatRateDataByFromFiatIDToFiatID(_id, usdFiatData._id)

        val rate = mDbHelper.getCoinToFiatRateDataFromCoinIDToFiatId(
            getCoinIDByCoinId(coinId),
            usdFiatData.fiatId
        )
        val item = BigDecimal(
            NumberUtils.showFiat(
                NumberUtils.valueOf(amount).multiply(rate.rate).multiply(fiatToFiatRateData.rate)
            )
        )
        totalPrice = totalPrice.add(item)

        return NumberUtils.showFiat(totalPrice)
    }

    open fun getExternalFilesDir(context: Context): File? {
        return context.getExternalFilesDir("")
    }

    open fun getSaveTmpFileUri(context: Context): Uri {
        return FileProvider.getUriForFile(
            context,
            context.applicationContext.packageName + ".provider",
            context.getExternalFilesDir(GlobalConstant.TMP_SCREENSHOT_IMAGE_NAME)!!
        )
    }
}
