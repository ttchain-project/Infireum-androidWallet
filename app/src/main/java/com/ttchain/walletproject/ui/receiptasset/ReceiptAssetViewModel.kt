package com.ttchain.walletproject.ui.receiptasset

import android.content.Context
import android.graphics.Bitmap
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.getScreenWidth
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.ImTokenReceiptQrCode
import com.ttchain.walletproject.repository.WalletRepository
import com.ttchain.walletproject.utils.BarCodeUtil
import com.ttchain.walletproject.utils.FileUtils
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utils
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import kotlin.coroutines.resume

class ReceiptAssetViewModel(
    private val context: Context,
    private val dbHelper: DbHelper,
    private val walletRepository: WalletRepository
) : BaseViewModel() {

    var coinId = 0

    fun updateCoinID() {
        if (coinId < 0) {
            val walletData = walletRepository.getUserSelectedWalletData()
            if (walletData._id > 0) {
                val coinData =
                    getDefaultCoinDataByMainCoinId(RuleUtils.getMainCoinId(walletData.address))
                if (coinData._id > 0) {
                    coinId = coinData._id
                }
            }
        }
    }

    private fun getDefaultCoinDataByMainCoinId(mainCoinId: String): CoinData {
        val list = dbHelper.getCoinDataListByMainCoinId(mainCoinId)
        return if (list.isNotEmpty()) {
            list[0]
        } else CoinData()
    }

    private fun getCoinDataByCoinID(coinID: Int): CoinData {
        return dbHelper.getCoinData(coinID)
    }

    fun performUpdateQrCodeBitmap() {
        viewModelLaunch {
            val coinData = getCoinDataByCoinID(coinId)
            val walletData = walletRepository.getUserSelectedWalletData()
            when (coinData.coinId) {
                CoinEnum.ETH.coinId -> performGetQrCodeBitmap(
                    ImTokenReceiptQrCode.getEthURL(
                        walletData.address,
                        "0"
                    )
                )
                CoinEnum.BTC.coinId, CoinEnum.USDT.coinId -> performGetQrCodeBitmap(
                    ImTokenReceiptQrCode.getBtcURL(
                        walletData.address,
                        ""
                    )
                )
                else -> performGetQrCodeBitmap(
                    ImTokenReceiptQrCode.getErc20URL(
                        walletData.address,
                        coinData.contract ?: "",
                        "0"
                    )
                )
            }
        }
    }

    val performGetQrCodeBitmapLiveData = MutableLiveData<Bitmap>()

    private fun performGetQrCodeBitmap(string: String) {
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

    val performDownloadQrCodeLiveData = MutableLiveData<File>()
    val performDownloadQrCodeErrorLiveData = MutableLiveData<Throwable>()

    fun performDownloadQrCode(rootView: View) {
        viewModelLaunch({
            val bitmap = Utils.createBitmapFromView(rootView)
            val result = suspendCancellableCoroutine<File> {
                val walletData = walletRepository.getUserSelectedWalletData()
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

    val performGetUserSelectedWalletLiveData = MutableLiveData<WalletData>()

    fun performGetUserSelectedWallet() {
        viewModelLaunch {
            val walletData = walletRepository.getUserSelectedWalletData()
            performGetUserSelectedWalletLiveData.value = walletData
        }
    }

    val performCaptureViewLiveData = MutableLiveData<Boolean>()

    fun performCaptureView(view: View) {
        val file = context.getExternalFilesDir("")
        if (file != null && file.exists()) {
            viewModelLaunch {
                val bitmap = Utils.createBitmapFromView(view)
                FileUtils.saveBitMap(file, getSaveTmpFileName(), bitmap) { status ->
                    performCaptureViewLiveData.value = status
                }
            }
        }
    }

    private fun getSaveTmpFileName(): String {
        return GlobalConstant.TMP_SCREENSHOT_IMAGE_NAME
    }
}