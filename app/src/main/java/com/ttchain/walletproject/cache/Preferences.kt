package com.ttchain.walletproject.cache

import android.content.Context
import android.content.SharedPreferences

import com.scottyab.aescrypt.AESCrypt
import com.ttchain.walletproject.R

class Preferences(private val preferences: SharedPreferences) {

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

    fun removePfeData() {
    }
}
