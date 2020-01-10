package com.ttchain.walletproject.ui.wallet.exportkey

import android.content.Context
import android.graphics.Bitmap
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.getScreenWidth
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.utils.BarCodeUtil

class ExportKeyViewModel(
    private val context: Context,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {


    var walletId = 0

    private fun getWalletEpKey(): String {
        return verifyRepository.getWalletEpKey(walletId)
    }

    val performGetQrCodeBitmapLiveData = MutableLiveData<Bitmap>()

    fun performGetQrCodeBitmap() {
        viewModelLaunch {
            val bitmap = BarCodeUtil.onQrCodeGenAsync(
                context,
                context.getScreenWidth() * 0.6f,
                context.getScreenWidth() * 0.6f,
                getWalletEpKey()
            )
            performGetQrCodeBitmapLiveData.value = bitmap
        }
    }

    val performGetWalletEpKeyLiveData = MutableLiveData<String>()

    fun performGetWalletEpKey() {
        viewModelLaunch {
            val string = getWalletEpKey()
            performGetWalletEpKeyLiveData.value = string
        }
    }
}
