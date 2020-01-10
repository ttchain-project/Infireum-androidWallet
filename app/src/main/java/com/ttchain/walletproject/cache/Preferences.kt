package com.ttchain.walletproject.cache

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

import com.google.gson.Gson
import com.scottyab.aescrypt.AESCrypt
import com.ttchain.walletproject.R
import com.ttchain.walletproject.model.PersonalInfo

class Preferences(private val preferences: SharedPreferences) {

    companion object {
        private const val BOLT_POLICY = "BOLT_POLICY"
        private const val TTN_GUIDE = "TTN_GUIDE"
        private const val KEY_USER_DATA = "KEY_USER_DATA"
    }

    fun encrypt(context: Context, plaintext: String): String {
        return try {
            AESCrypt.encrypt(context.getString(R.string.aeskey), plaintext)
        } catch (e: Exception) {
            e.printStackTrace()
            plaintext
        }
    }

    fun decrypt(context: Context, cipherText: String): String {
        return try {
            AESCrypt.decrypt(context.getString(R.string.aeskey), cipherText)
        } catch (e: Exception) {
            e.printStackTrace()
            cipherText
        }
    }

    /**
     * 是否同意過閃兌交易條款
     */
    var boltPolicy: Boolean
        set(value) = preferences.edit { putBoolean(BOLT_POLICY, value) }
        get() = preferences.getBoolean(BOLT_POLICY, false)

    /**
     * 是否顯示過TTN導覽
     */
    var ttnGuide: Boolean
        set(value) = preferences.edit { putBoolean(TTN_GUIDE, value) }
        get() = preferences.getBoolean(TTN_GUIDE, false)

    /**
     * 儲存使用者資料
     */
    var userData: PersonalInfo?
        set(value) = preferences.edit { putString(KEY_USER_DATA, Gson().toJson(value)) }
        get() {
            val jsonString = preferences.getString(KEY_USER_DATA, "")
            return if (jsonString == null || jsonString.isEmpty()) {
                null
            } else {
                try {
                    Gson().fromJson(jsonString, PersonalInfo::class.java)
                } catch (error: Exception) {
                    null
                }
            }
        }

    fun removePfeData() {
        preferences.edit {
            remove(BOLT_POLICY)
            remove(TTN_GUIDE)
            remove(KEY_USER_DATA)
        }
    }
}
