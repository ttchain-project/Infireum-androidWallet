package com.ttchain.walletproject.ui.login

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.UserWalletQrCodeImageBean
import com.ttchain.walletproject.utils.Gzip
import com.ttchain.walletproject.utils.Utils
import java.lang.Exception

class LoginViewModel(
    private val context: Context
) : BaseViewModel() {

    private var qrCodeImageBean: UserWalletQrCodeImageBean? = null
    var qrCodeImagePwd: String = ""

    val hintErrorLiveData = MutableLiveData<Throwable>()
    val qrCodeParseLiveData = MutableLiveData<UserWalletQrCodeImageBean>()

    fun parseUserWalletQrCode(qrCodeString: String) {
        viewModelLaunch {
            val qRCodeResult = if (qrCodeString.contains(":")) {
                qrCodeString
            } else {
                Gzip.decompress(qrCodeString)
            }
            if (qRCodeResult.isEmpty()) {
                hintErrorLiveData.value = Throwable("Not in GZIP format")
                return@viewModelLaunch
            }
            try {
                val bean = Gson().fromJson(qRCodeResult, UserWalletQrCodeImageBean::class.java)
                qrCodeImageBean = bean
                qrCodeParseLiveData.value = qrCodeImageBean
            } catch (r: Exception) {
                hintErrorLiveData.value = r
            }
        }
    }

    var qrCodeImageBeanLiveData = MutableLiveData<UserWalletQrCodeImageBean>()
    var qrCodeImageBeanError = MutableLiveData<Throwable>()

    fun getInput(input: CharSequence) {
        viewModelLaunch {
            qrCodeImagePwd = input.toString()
            qrCodeImageBeanLiveData.value = qrCodeImageBean
        }
    }

    var languageLiveData = MutableLiveData<String>()
    fun getLanguageText() {
        val languageText: String = when (Utils.getMikeApiLanguageQuery(context)) {
            "zh" -> {
                context.getString(R.string.zh_tw_language)
            }
            "en" -> {
                context.getString(R.string.en_language)
            }
            else -> {
                context.getString(R.string.zh_cn_language)
            }
        }
        languageLiveData.value = languageText
    }
}