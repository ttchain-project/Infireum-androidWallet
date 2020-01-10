package com.ttchain.walletproject.ui.me.userwalletsqrcode

import android.content.Context
import android.graphics.Bitmap
import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.getScreenWidth
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserWalletQrCodeImageBean
import com.ttchain.walletproject.model.UserWalletQrCodeInputBean
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.utils.BarCodeUtil
import com.ttchain.walletproject.utils.FileUtils
import com.ttchain.walletproject.utils.Gzip
import com.ttchain.walletproject.utils.Utility
import kotlinx.coroutines.*
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.*
import kotlin.coroutines.resume

class UserWalletQrCodeViewModel(
    private val context: Context,
    private val dbHelper: DbHelper,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    var pwd = ""
    var qrCodeGeneratedTimeStamp = 0L
    var imageBeanJsonString = ""

    private fun setQrCodeGeneratedTimeStamp() {
        qrCodeGeneratedTimeStamp = Calendar.getInstance().timeInMillis
    }

    private fun getMnemonic(): String {
        val walletDataList = dbHelper.getDefaultWalletDataList()
        if (walletDataList.isNotEmpty()) {
            val walletData = walletDataList[0]
            if (walletData.mnemonic != null) {
                val mnemonicRaw =
                    Utility.decryptPrivateKey(
                        walletData.mnemonic ?: "",
                        verifyRepository.decryptString(walletData.pwd)
                    )
                return Utility.encryptPrivateKey(mnemonicRaw, pwd)
            }
            return ""
        } else {
            return ""
        }
    }

    private fun getSystemWalletContent(): List<UserWalletQrCodeImageBean.WalletContent> {
        val walletDataList = dbHelper.getDefaultWalletDataList().toMutableList()
        val it = walletDataList.iterator()
        while (it.hasNext()) {
            val walletData = it.next()
            if (walletData.chainType != ChainType.BTC.value &&
                walletData.chainType != ChainType.ETH.value &&
                walletData.chainType != ChainType.TTN.value
            ) {
                it.remove()
            }
        }
        return convertSystemWalletDataToWalletContent(walletDataList)
    }

    private fun convertSystemWalletDataToWalletContent(walletDataList: List<WalletData>): List<UserWalletQrCodeImageBean.WalletContent> {
        val beans = ArrayList<UserWalletQrCodeImageBean.WalletContent>()
        for (walletData in walletDataList) {
            var mainCoinId = ""
            if (TextUtils.isEmpty(walletData.mainCoinId)) {
                when (walletData.chainType) {
                    0 -> mainCoinId = CoinEnum.BTC.coinId
                    1 -> mainCoinId = CoinEnum.ETH.coinId
                    2 -> if (walletData.address.startsWith("c")) {
                        mainCoinId = CoinRepository.COIN_CIC_IDENTIFIER
                    } else if (walletData.address.startsWith("g")) {
                        mainCoinId = CoinRepository.COIN_GUC_IDENTIFIER
                    }
                    3 -> mainCoinId = CoinRepository.COIN_GUC_IDENTIFIER
                }
            } else {
                mainCoinId = walletData.mainCoinId
            }
            val bean = UserWalletQrCodeImageBean.WalletContent(mainCoinId, walletData.name, "", "")
            beans.add(bean)
        }
        return beans
    }


    private fun getImportedWalletContent(): List<UserWalletQrCodeImageBean.WalletContent> {
        val walletDataList = dbHelper.getImportWalletDataList()
        return convertWalletDataToWalletContent(walletDataList)
    }

    private fun convertWalletDataToWalletContent(
        walletDataList: List<WalletData>
    ): List<UserWalletQrCodeImageBean.WalletContent> {
        val beans = ArrayList<UserWalletQrCodeImageBean.WalletContent>()
        for (walletData in walletDataList) {
            var ep = ""
            var mainCoinId = ""
            if (!TextUtils.isEmpty(walletData.epKey) && !TextUtils.isEmpty(walletData.pwd)) {
                val epRaw = Utility.decryptPrivateKey(
                    walletData.epKey,
                    verifyRepository.decryptString(walletData.pwd)
                )
                ep = Utility.encryptPrivateKey(epRaw, pwd)
            }
            if (TextUtils.isEmpty(walletData.mainCoinId)) {
                when (walletData.chainType) {
                    0 -> mainCoinId = CoinEnum.BTC.coinId
                    1 -> mainCoinId = CoinEnum.ETH.coinId
                    2 -> if (walletData.address.startsWith("c")) {
                        mainCoinId = CoinRepository.COIN_CIC_IDENTIFIER
                    } else if (walletData.address.startsWith("g")) {
                        mainCoinId = CoinRepository.COIN_GUC_IDENTIFIER
                    }
                    3 -> mainCoinId = CoinRepository.COIN_GUC_IDENTIFIER
                }
            } else {
                mainCoinId = walletData.mainCoinId
            }
            val bean = UserWalletQrCodeImageBean.WalletContent(
                mainCoinId,
                walletData.name,
                ep,
                walletData.address
            )
            beans.add(bean)
        }
        return beans
    }

    fun generatedQrCode(bean: UserWalletQrCodeInputBean, pwd: String) {
        this.pwd = pwd
        setQrCodeGeneratedTimeStamp()
        val hint = bean.hint
        val mnemonic = getMnemonic()
        val wallets = getSystemWalletContent()
        val system = UserWalletQrCodeImageBean.System(mnemonic, wallets)
        val imported = getImportedWalletContent()
        val content = UserWalletQrCodeImageBean.Content(system, imported)
        val imageBean = UserWalletQrCodeImageBean(hint, qrCodeGeneratedTimeStamp, content)
        imageBeanJsonString = Gson().toJson(imageBean)
        performGetQrCodeBitmap()
    }

    private fun getImageBeanJsonStringCompress(): String {
        return Gzip.compress(imageBeanJsonString)
        //        return imageBeanJsonString;
    }

    val performGetQrCodeBitmapLiveData = MutableLiveData<Bitmap>()

    fun performGetQrCodeBitmap() {
        viewModelLaunch {
            val qrCodeContent = getImageBeanJsonStringCompress()
            val bitMap = BarCodeUtil.onQrCodeGenAsync(
                context,
                context.getScreenWidth() * 0.6f,
                context.getScreenWidth() * 0.6f,
                qrCodeContent
            )
            performGetQrCodeBitmapLiveData.value = bitMap
        }
    }

    var storeQrCodeLiveData = MutableLiveData<String>()
    var storeQrCodeErrorLiveData = MutableLiveData<Throwable>()

    fun storeQrCode() {
        viewModelLaunch {
            val string = getImageBeanJsonStringCompress()
            val bitmap = BarCodeUtil.onQrCodeGenAsync(context, 512f, 512f, string)
            val result = suspendCancellableCoroutine<String> {
                val cal = Calendar.getInstance(Locale.getDefault())
                cal.timeInMillis = qrCodeGeneratedTimeStamp
                val sdf = SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault())
                val fileName = "TTChain_" + sdf.format(cal.time) + ".png"
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
                it.resume(FileUtils.saveQrCodeFolder.absolutePath)
            }
            storeQrCodeLiveData.value = result
        }
    }
}