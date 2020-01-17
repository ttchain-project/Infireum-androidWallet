package com.ttchain.walletproject.repository

import android.content.Context
import android.text.TextUtils
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.decryptString
import com.ttchain.walletproject.encryptString
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.utils.Utility

class VerifyRepository(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper,
    private val context: Context
) : BaseRepository() {

    fun getIdentityData(): IdentityData {
        return dbHelper.getIdentityData(userHelper.identityID) ?: IdentityData()
    }

    fun verifyIdentityPwdHint(): String {
        val identityData = dbHelper.getIdentityData(userHelper.identityID)
        return identityData?.pwdHint ?: ""
    }

    fun verifyIdentityPwd(pwd: String): Boolean {
        val data = dbHelper.getIdentityData(userHelper.identityID)
        return if (data != null) {
            data.pwd == encryptString(pwd)
        } else false
    }

    fun verifyWalletPwd(walletID: Int, pwd: String): Boolean {
        val data = dbHelper.getWalletData(walletID)
        return if (data != null) {
            data.pwd == encryptString(pwd)
        } else false
    }

    fun encryptString(string: String): String {
        return string.encryptString(context)
    }

    fun getWalletEpKey(walletID: Int): String {
        val data = dbHelper.getWalletData(walletID)
        return if (data != null && !TextUtils.isEmpty(data.epKey) && !TextUtils.isEmpty(data.pwd)) {
            Utility.decryptPrivateKey(data.epKey, decryptString(data.pwd))
        } else ""
    }

    fun decryptString(string: String): String {
        return string.decryptString(context)
    }
}