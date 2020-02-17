package com.ttchain.walletproject.ui.create_id.mnemonics

import android.content.Context
import android.graphics.Bitmap
import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.AssetData
import com.ttchain.walletproject.database.data.CoinSelectionData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.getScreenWidth
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.utils.BarCodeUtil
import com.ttchain.walletproject.utils.FileUtils
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utility
import kotlinx.coroutines.suspendCancellableCoroutine
import timber.log.Timber
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*
import kotlin.coroutines.resume


class MnemonicsStartViewModel(
    private val userHelper: UserHelper,
    private val dbHelper: DbHelper,
    private val context: Context,
    private val verifyRepository: VerifyRepository
) : BaseViewModel() {

    var userBean = UserBean()

    val createUserAndWalletLiveData = MutableLiveData<Boolean>()

    fun createUserAndWallet() {
        viewModelLaunch {
            val rowId = createUser()
            val createWalletDataListStatus = if (rowId != -1 && createWalletDataList()) {
                createCoinSelectionDataList()
                true
            } else {
                false
            }
            val createCoinSelectionStatus = if (createWalletDataListStatus) {
                initAssetDataList()
                true
            } else {
                false
            }
            val initAssetDataStatus = if (createCoinSelectionStatus) {
                removeApiResponseData()
                true
            } else {
                false
            }
            createUserAndWalletLiveData.value = initAssetDataStatus
        }
    }

    private val apiResponseData: ResponseUserIdentity
        get() {
            try {
                val response = userHelper.createAccountResponse
                if (!TextUtils.isEmpty(response)) {
                    val model = Gson().fromJson(response, ResponseUserIdentity::class.java)
                    if (model != null) {
                        return model
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return ResponseUserIdentity()
        }

    val mnemonic: String
        get() {
            val model = apiResponseData
            return if (model.mnemonic != null) {
                model.mnemonic!!
            } else ""
        }

    private fun createUser(): Int {
        val identityData = IdentityData()
        identityData.identityId = Utility.hashIdentityIdFromMnemonic(mnemonic)
        identityData.name = userBean.name
        val fiatDataList = dbHelper.getFiatDataList()
        if (fiatDataList.isNotEmpty()) {
            identityData.prefFiatData = fiatDataList[2]
        }
        val languageDataList = dbHelper.getLanguageDataList()
        if (languageDataList.isNotEmpty()) {
            identityData.prefLangData = languageDataList[0]
        }
        identityData.pwd = userBean.pwdEncrypt
        identityData.pwdHint = userBean.note
        val rowId = dbHelper.addIdentityData(identityData)
        userHelper.identityID = rowId
        return rowId
    }

    private val defaultWalletDataList: List<WalletData>
        get() {
            val list = ArrayList<WalletData>(3)

            userBean.mnemonic = apiResponseData.mnemonic.toString()
            userBean.walletEpKey = apiResponseData.bitcoin?.privateKey ?: ""
            userBean.importWalletAddress = apiResponseData.bitcoin?.address ?: ""
            list.add(WalletFactory.createData(userBean))

            userBean.mnemonic = apiResponseData.mnemonic.toString()
            userBean.walletEpKey = apiResponseData.ethereum?.privateKey ?: ""
            userBean.importWalletAddress = apiResponseData.ethereum?.address ?: ""
            list.add(WalletFactory.createData(userBean))

            userBean.mnemonic = apiResponseData.mnemonic.toString()
            userBean.walletEpKey = apiResponseData.noprefix?.privateKey ?: ""
            userBean.importWalletAddress = apiResponseData.noprefix?.address ?: ""
            list.add(WalletFactory.createData(userBean))
            return list
        }

    private fun createWalletDataList(): Boolean {
        val list = defaultWalletDataList
        val data = dbHelper.getIdentityData(userHelper.identityID)
        if (data != null) {
            for (item in list) {
                item.identityData = data
            }
        }
        dbHelper.setWalletDataList(list)
        val walletData =
            dbHelper.getDefaultSelectedWalletDataByIdentityID(userHelper.identityID)
        if (walletData != null && walletData._id != -1) {
            userHelper.selectedWalletID = walletData._id
            return true
        }
        return false
    }

    private fun createCoinSelectionDataList() {
        val list = ArrayList<CoinSelectionData>()
        val coinList = dbHelper.getCoinDataListByDefaultIsDefaultSelected()
        for (coinData in coinList) {
            val mainCoinId = coinData.mainCoinId
            val walletList = dbHelper.getWalletDataList().toMutableList()
            var i = walletList.size - 1
            val j = 0
            while (i >= j) {
                if (RuleUtils.getMainCoinId(walletList[i].address) != mainCoinId) {
                    walletList.removeAt(i)
                }
                i--
            }

            for (walletData in walletList) {
                if (walletData.isFromSystem) {
                    val coinSelectionData = CoinSelectionData().apply {
                        isSelected = true
                        this.coinData = coinData
                        this.walletData = walletData
                    }
                    list.add(coinSelectionData)
                }
            }
        }
        dbHelper.setCoinSelectionDataList(list)
    }

    fun initAssetDataList() {
        val assetDataList = ArrayList<AssetData>()
        val coinSelectionDataList = dbHelper.getCoinSelectionDataList()
        for (selectionData in coinSelectionDataList) {
            val assetData = AssetData().apply {
                coinData = selectionData.coinData
                walletData = selectionData.walletData
                amount = BigDecimal("0")
            }
            assetDataList.add(assetData)
        }

        dbHelper.setAssetDataList(assetDataList)
    }


    private fun removeApiResponseData() {
        userHelper.removeCreateAccountResponse()
    }

    fun getTwoInput(pwd: String, hint: String) {
        generatedQrCode(UserWalletQrCodeInputBean(pwd, hint))
    }

    var qrCodeGeneratedTimeStamp: Long = 0
        private set

    private fun setQrCodeGeneratedTimeStamp() {
        this.qrCodeGeneratedTimeStamp = Calendar.getInstance().timeInMillis
    }

    fun getMnemonic(pwd: String): String {
        val walletDataList = dbHelper.getDefaultWalletDataList()
        if (walletDataList.isNotEmpty()) {
            val walletData = walletDataList[0]

            if (walletData.mnemonic != null) {
                val mnemonicRaw = Utility.decryptPrivateKey(
                    walletData.mnemonic!!,
                    verifyRepository.decryptString(walletData.pwd)
                )
                return Utility.encryptPrivateKey(mnemonicRaw, pwd)
            }
            return ""
        }
        return ""
    }

    private fun getSystemWalletContent(): List<UserWalletQrCodeImageBean.WalletContent> {
        val walletDataList = dbHelper.getDefaultWalletDataList().toMutableList()
        val it = walletDataList.iterator()
        while (it.hasNext()) {
            val walletData = it.next()
            if (walletData.chainType != ChainType.BTC.value && walletData.chainType != ChainType.ETH.value) {
                it.remove()
            }
        }
        return convertSystemWalletDataToWalletContent(walletDataList)
    }

    private fun convertSystemWalletDataToWalletContent(
        walletDataList: List<WalletData>
    ): List<UserWalletQrCodeImageBean.WalletContent> {
        val beans = ArrayList<UserWalletQrCodeImageBean.WalletContent>()

        for (walletData in walletDataList) {

            //            String ep = "";
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

    var imageBeanJsonString = ""

    private fun generatedQrCode(bean: UserWalletQrCodeInputBean) {
        setQrCodeGeneratedTimeStamp()
        val hint = bean.hint

        val mnemonic = getMnemonic(bean.pwd)
        val wallets = getSystemWalletContent()
        val system = UserWalletQrCodeImageBean.System(mnemonic, wallets)

        val imported = ArrayList<UserWalletQrCodeImageBean.WalletContent>()

        val content = UserWalletQrCodeImageBean.Content(system, imported)
        val imageBean = UserWalletQrCodeImageBean(hint, qrCodeGeneratedTimeStamp, content)

        getSystemWalletContent()
        imageBeanJsonString = Gson().toJson(imageBean)
        performGetQrCodeBitmap()
        storeQrCode()
    }

    var performGetQrCodeBitMapLiveData = MutableLiveData<Bitmap>()

    private fun performGetQrCodeBitmap() {
        viewModelLaunch {
            val bitmap = BarCodeUtil.onQrCodeGenAsync(
                context,
                context.getScreenWidth() * 0.6f,
                context.getScreenWidth() * 0.6f,
                imageBeanJsonString
            )
            performGetQrCodeBitMapLiveData.value = bitmap
        }
    }

    val storeQrCodeLiveData = MutableLiveData<String>()
    val storeQrCodeErrorLiveData = MutableLiveData<Throwable>()

    private fun storeQrCode() {
        viewModelLaunch({
            val bitmap = BarCodeUtil.onQrCodeGenAsync(context, 512f, 512f, imageBeanJsonString)
            val result = suspendCancellableCoroutine<String> {
                val cal = Calendar.getInstance(Locale.getDefault())
                cal.timeInMillis = qrCodeGeneratedTimeStamp
                val sdf = SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault())
                val fileName = "${GlobalConstant.APP_NAME}_${sdf.format(cal.time)}.png"

                val f = File(FileUtils.saveQrCodeFolder.toString() + File.separator + fileName)
                f.createNewFile()

                //Convert bitmap to byte array
                val bos = ByteArrayOutputStream()
                bitmap.compress(Bitmap.CompressFormat.PNG, 0 /*ignored for PNG*/, bos)
                val bitmapdata = bos.toByteArray()
                //write the bytes in file
                val fos = FileOutputStream(f)
                fos.write(bitmapdata)
                fos.flush()
                fos.close()
                it.resume(FileUtils.saveQrCodeFolder.absolutePath)
            }
            storeQrCodeLiveData.value = result
        }, {
            storeQrCodeErrorLiveData.value = it
        })
    }
}