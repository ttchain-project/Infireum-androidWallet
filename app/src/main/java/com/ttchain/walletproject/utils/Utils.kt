package com.ttchain.walletproject.utils

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.provider.Settings
import android.text.TextUtils
import android.util.Base64
import android.view.View
import com.scottyab.aescrypt.AESCrypt
import com.ttchain.walletproject.App
import com.ttchain.walletproject.model.UserHelperImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.apache.commons.codec.binary.Hex
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.format.DateTimeFormatter
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*
import javax.crypto.spec.SecretKeySpec
import kotlin.experimental.and

object Utils {

    private const val IV = "walletofflinegib"
    private val hexArray = "0123456789abcdef".toCharArray()


    /**
     * 確認網路目前狀態
     *
     * @param context
     * @return true 可以使用網路, false 無法使用網路
     */
    fun getInternetStatus(context: Context): Boolean {
        val mConnectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            mConnectivityManager.getNetworkCapabilities(mConnectivityManager.activeNetwork)?.run {
                return when {
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                    else -> false
                }
            }
        } else {
            val mNetworkInfo = mConnectivityManager.activeNetworkInfo
            // 如果未連線的話，mNetworkInfo會等於null
            if (mNetworkInfo != null) {
                // 網路是否已連線(true or false)
                mNetworkInfo.isConnected
                // 網路連線方式名稱(WIFI or mobile)
                mNetworkInfo.typeName
                // 網路連線狀態(CONNECTED or DISCONNECTED)
                mNetworkInfo.state
                // 網路是否可使用(true or false)
                mNetworkInfo.isAvailable

                val sb = StringBuffer()
                sb.append("isConnected : ").append(mNetworkInfo.isConnected).append("\n")
                sb.append("TypeName : ").append(mNetworkInfo.typeName).append("\n")
                sb.append("State : ").append(mNetworkInfo.state).append("\n")
                sb.append("isAvailable : ").append(mNetworkInfo.isAvailable).append("\n")
                //            Log.d(TAG, "NetworkInfo : \n" + sb.toString());

                return mNetworkInfo.isConnected && mNetworkInfo.isAvailable
            }
        }
        return false
    }

    /**
     * When device app version name that first bit and second bit is lower than
     * api header, 'X-Android-Version', android version, enforce user to update app version.
     *
     * @param apiResponseAppVersionName four bit version name from api header
     * @param appVersionName            BuildConfig.VERSION_NAME
     * @return default: false, true if device app version lower api app version .
     */
    fun isAppVersionDeprecated(apiResponseAppVersionName: String, appVersionName: String): Boolean {
        if (TextUtils.isEmpty(apiResponseAppVersionName)) {
            return false
        }

        var apiVersionNameArray: Array<String>? = null
        if (apiResponseAppVersionName.contains(".")) {
            apiVersionNameArray = apiResponseAppVersionName.split("\\.".toRegex()).toTypedArray()
        }

        if (apiVersionNameArray == null) {
            return false
        }
        //原先有加上 "$-${commit資訊}"
        //        int vIndex = appVersionName.indexOf("-");
        //
        //        appVersionName = appVersionName.substring(0, vIndex);

        val appVersionNameArray = appVersionName.split("\\.".toRegex()).toTypedArray()

        if (apiVersionNameArray.size > 1 && appVersionNameArray.size > 1) {
            try {
                val verNew = Integer.parseInt(apiVersionNameArray[0]) * 10000 + Integer.parseInt(
                    apiVersionNameArray[1]
                ) * 100 + Integer.parseInt(
                    apiVersionNameArray[2]
                )
                val ver = Integer.parseInt(appVersionNameArray[0]) * 10000 + Integer.parseInt(
                    appVersionNameArray[1]
                ) * 100 + Integer.parseInt(appVersionNameArray[2])
                return ver < verNew
            } catch (e: NumberFormatException) {
                e.printStackTrace()
            }
        }
        return false
    }


    private val DATE_TIME_LAST_SECS_AM_PM =
        DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm:ss", Locale.getDefault())
    private val DATE_TIME_LAST_SECS_AM_PM_US =
        DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a", Locale.US)
    private val DATE_TIME_LAST_DAY = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    private val DATE_TIME_LAST_MINS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
    private val DATE_TIME_LAST_SECS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    private val DATE_TIME_LAST_SECS_WITH_LOCALE =
        DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZ").withLocale(Locale.getDefault())

    fun formatDateTimeDay(offsetDateTime: OffsetDateTime?): String {
        return formatDateTime(DATE_TIME_LAST_DAY, offsetDateTime)
    }

    fun formatDateTimeMins(offsetDateTime: OffsetDateTime?): String {
        return formatDateTime(DATE_TIME_LAST_MINS, offsetDateTime)
    }

    fun formatDateTimeSecs(offsetDateTime: OffsetDateTime?): String {
        return formatDateTime(DATE_TIME_LAST_SECS, offsetDateTime)
    }

    fun formatDateTimeSecsWithLocale(offsetDateTime: OffsetDateTime?): String {
        return formatDateTime(DATE_TIME_LAST_SECS_WITH_LOCALE, offsetDateTime)
    }

    fun formatDateTimeSecsAmPm(offsetDateTime: OffsetDateTime?): String {
        return formatDateTime(DATE_TIME_LAST_SECS_AM_PM, offsetDateTime)
    }

    fun formatDateTimeSecsAmPmUs(offsetDateTime: OffsetDateTime?): String {
        return formatDateTime(DATE_TIME_LAST_SECS_AM_PM_US, offsetDateTime)
    }

    fun getOffsetDateTime(dateTime: String): OffsetDateTime? {
        var offsetDateTime: OffsetDateTime? = null
        try {
            offsetDateTime = OffsetDateTime.parse(dateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return offsetDateTime
    }

    private fun formatDateTime(
        dateTimeFormatter: DateTimeFormatter,
        offsetDateTime: OffsetDateTime?
    ): String {
        return if (offsetDateTime == null) {
            ""
        } else offsetDateTime.format(dateTimeFormatter)
    }

    fun MD5Encoding(s: String): String {
        val MD5 = "MD5"
        try {
            // Create MD5 Hash
            val digest = MessageDigest
                .getInstance(MD5)
            digest.update(s.toByteArray())
            val messageDigest = digest.digest()

            // Create Hex String
            val hexString = StringBuilder()
            for (aMessageDigest in messageDigest) {
                var h = Integer.toHexString(0xFF and aMessageDigest.toInt())
                while (h.length < 2)
                    h = "0$h"
                hexString.append(h)
            }
            return hexString.toString()

        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }

        return ""
    }

    fun getPrefLocal(context: Context): Locale? {
        //        String language = new UserHelperImpl(context).getPreferLanguage();
        //        Locale locale = Locale.CHINA;
        //        switch (language) {
        //            case "繁體中文":
        //                locale = Locale.TAIWAN;
        //                break;
        //            case "简体中文":
        //                locale = Locale.CHINA;
        //                break;
        //            case "English":
        //                locale = Locale.ENGLISH;
        //                break;
        //            case "":
        //                String defaultLanguage = Locale.getDefault().getDisplayLanguage();
        //                if (defaultLanguage.equals(Locale.TAIWAN.getDisplayLanguage()) ||
        //                        defaultLanguage.equals(Locale.CHINA.getDisplayLanguage()) ||
        //                        defaultLanguage.equals(Locale.ENGLISH.getDisplayLanguage())) {
        //                    locale = Locale.getDefault();
        //                }
        //                break;
        //        }
        //        return locale;
        return getPrefLocal(UserHelperImpl(context).preferLanguage)
    }

    fun getPrefLocal(language: String): Locale? {
        var locale: Locale? = null
        if (language.contains("zh_TW")) {
            locale = Locale.TAIWAN
        } else if (language.contains("zh_CN")) {
            locale = Locale.CHINA
        } else if (language.contains("en")) {
            locale = Locale.ENGLISH
        } else {
            val defaultLanguage = Locale.getDefault().displayLanguage
            if (defaultLanguage.contains(Locale.TAIWAN.displayLanguage) ||
                defaultLanguage.contains(Locale.CHINA.displayLanguage) ||
                defaultLanguage.contains(Locale.ENGLISH.displayLanguage)
            ) {
                locale = Locale.getDefault()
            }
        }
        return locale
    }

    fun getMikeApiLanguageQuery(context: Context): String {
        val locale = getPrefLocal(context)
        return when {
            locale?.country == Locale.TAIWAN.country -> "zh"
            locale?.displayLanguage == Locale.ENGLISH.displayLanguage -> "en"
            else -> "cs"
        }
    }

    fun getYuiApiLanguageQuery(): String {
        val locale = getPrefLocal(App.app)
        return when {
            locale?.country == Locale.TAIWAN.country -> "zh-tw"
            locale?.displayLanguage == Locale.ENGLISH.displayLanguage -> "en-us"
            else -> "zh-cn"
        }
    }

    suspend fun createBitmapFromView(v: View): Bitmap = withContext(Dispatchers.IO) {
        val bitmap = Bitmap.createBitmap(v.measuredWidth, v.measuredHeight, Bitmap.Config.ARGB_8888)
        val c = Canvas(bitmap)
        v.layout(v.left, v.top, v.right, v.bottom)
        v.draw(c)
        return@withContext bitmap
    }

    fun decryptPrivateKey(epKey: String, pwd: String): String {
        var key = pwd
        try {
            var interval = 16 - key.toByteArray().size
            while (interval != 0) {
                if (interval > 0) {
                    key += key
                } else {
                    key = String(key.toByteArray().copyOfRange(0, 16))
                }
                interval = 16 - key.toByteArray().size
            }
            val keySpec =
                SecretKeySpec(key.toByteArray(), "AES")
            return String(
                AESCrypt.decrypt(
                    keySpec,
                    IV.toByteArray(),
                    Base64.decode(epKey.toByteArray(), Base64.NO_WRAP)
                )
            )
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return pwd
    }


    @SuppressLint("HardwareIds")
    fun getDeviceId(context: Context): String {
        val deviceId: String
        val serial = Build.SERIAL
        val androidId = Settings.Secure.getString(
            context.contentResolver,
            Settings.Secure.ANDROID_ID
        )
        deviceId = if (serial != null && androidId != null) {
            Utility.MD5Encoding(serial + androidId)
        } else if (serial == null && androidId != null) {
            Utility.MD5Encoding(androidId)
        } else if (serial != null) {
            Utility.MD5Encoding(serial)
        } else {
            val manufacturer = Build.MANUFACTURER
            val model = Build.MODEL
            Utility.MD5Encoding(manufacturer + model)
        }
        return deviceId
    }

    fun hexToString(hex: String): String {
        return try {
            val hexString = hex.replace("0x", "")
            val bytes =
                Hex.decodeHex(hexString.toCharArray())
            String(bytes, StandardCharsets.UTF_8)
        } catch (e: java.lang.Exception) {
            ""
        }
    }

    fun bytesToHex(bytes: ByteArray): String? {
        val hexChars = CharArray(bytes.size * 2)
        for (j in bytes.indices) {
            val v: Int = (bytes[j] and 0xFF.toByte()).toInt()
            hexChars[j * 2] = hexArray[v ushr 4]
            hexChars[j * 2 + 1] = hexArray[v and 0x0F]
        }
        return String(hexChars)
    }

}