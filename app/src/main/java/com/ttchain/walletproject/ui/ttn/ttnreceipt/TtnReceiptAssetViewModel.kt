package com.ttchain.walletproject.ui.ttn.ttnreceipt

import android.content.Context
import android.graphics.Bitmap
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.getScreenWidth
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.utils.BarCodeUtil
import com.ttchain.walletproject.utils.FileUtils
import com.ttchain.walletproject.utils.Utils
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import kotlin.coroutines.resume

class
TtnReceiptAssetViewModel(
    private val context: Context,
    private val baseMainModel: BaseMainModel
) : BaseViewModel() {

    var getTtnWalletDataLiveData = MutableLiveData<WalletData>()

    fun getTtnWalletData() {
        viewModelLaunch {
            getTtnWalletDataLiveData.value = baseMainModel.ttnWalletData
        }
    }

    val performDownloadQrCodeLiveData = MutableLiveData<File>()
    val performDownloadQrCodeErrorLiveData = MutableLiveData<Throwable>()

    fun performDownloadQrCode(rootView: View) {
        viewModelLaunch({
            val bitmap = Utils.createBitmapFromView(rootView)
            val result = suspendCancellableCoroutine<File> {
                val walletData = baseMainModel.ttnWalletData
                val walletName = walletData.name.replace(" ", "")
                val fileName = "${GlobalConstant.APP_NAME}_$walletName.png"
                val f = File(FileUtils.saveQrCodeFolder.toString() + File.separator + fileName)
                f.createNewFile()
                //Convert bitmap to byte array
                val bos = ByteArrayOutputStream()
                bitmap.compress(Bitmap.CompressFormat.PNG, 0 /*ignored for PNG*/, bos)
                val bitmapData = bos.toByteArray()
                //write the bytes in file
                val fos = FileOutputStream(f)
                fos.write(bitmapData)
                fos.flush()
                fos.close()
                it.resume(FileUtils.saveQrCodeFolder)
            }
            performDownloadQrCodeLiveData.value = result
        }, {
            performDownloadQrCodeErrorLiveData.value = it
        })
    }

    val performGetQrCodeBitmapLiveData = MutableLiveData<Bitmap>()

    fun performGetQrCodeBitmap(string: String) {
        viewModelLaunch {
            val bitmap = BarCodeUtil.onQrCodeGenAsync(
                context,
                context.getScreenWidth() * 0.6f,
                context.getScreenWidth() * 0.6f,
                string
            )
            performGetQrCodeBitmapLiveData.value = bitmap
        }
    }

    val performCaptureViewLiveData = MutableLiveData<Boolean>()

    fun performCaptureView(view: View) {
        val file = getExternalFilesDir(context)
        if (file != null && file.exists()) {
            viewModelLaunch {
                val bitmap = Utils.createBitmapFromView(view)
                FileUtils.saveBitMap(file, getSaveTmpFileName(), bitmap) { status ->
                    performCaptureViewLiveData.value = status
                }
            }
        }
    }

    private fun getExternalFilesDir(context: Context): File? {
        return context.getExternalFilesDir("")
    }

    private fun getSaveTmpFileName(): String {
        return GlobalConstant.TMP_SCREENSHOT_IMAGE_NAME
    }
}