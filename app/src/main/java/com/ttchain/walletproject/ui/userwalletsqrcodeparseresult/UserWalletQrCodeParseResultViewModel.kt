package com.ttchain.walletproject.ui.userwalletsqrcodeparseresult

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.AssetData
import com.ttchain.walletproject.database.data.CoinSelectionData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.ImRepositoryCo
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.utils.Utility
import com.ttchain.walletproject.utils.Utils
import timber.log.Timber
import java.math.BigDecimal
import java.util.*

class UserWalletQrCodeParseResultViewModel(
    private val dbHelper: DbHelper,
    private val context: Context,
    private val userHelper: UserHelper,
    private val verifyRepository: VerifyRepository,
    private val imRepositoryCo: ImRepositoryCo
) : BaseViewModel() {

    var userBean = UserBean()
    private var qrCodeImageBean: UserWalletQrCodeImageBean? = null

    var getQrCodeImageWalletsLiveData = MutableLiveData<Boolean>()

    fun getQrCodeImageWallets(bean: UserWalletQrCodeImageBean?) {
        if (bean == null) {
            return
        }
        qrCodeImageBean = bean
        Timber.e("qrCodeImageBean: ${Gson().toJson(qrCodeImageBean)}")
        viewModelLaunch {
            //            val responseUserIdentity = BitcoinjNew.init(bean.content.system.mnemonic)
//            Timber.e("responseUserIdentity: ${Gson().toJson(responseUserIdentity)}")
//            val walletContents = bean.content.system.wallets
//            for (walletContent in walletContents) {
//                when (walletContent.mainCoinID) {
//                    CoinEnum.ETH.coinId -> {
//                        walletContent.address = responseUserIdentity.ethereum?.address.orEmpty()
//                        walletContent.privateKey =
//                            responseUserIdentity.ethereum?.privateKey.orEmpty()
//                    }
//                    CoinEnum.BTC.coinId -> {
//                        walletContent.address = responseUserIdentity.bitcoin?.address.orEmpty()
//                        walletContent.privateKey =
//                            responseUserIdentity.bitcoin?.privateKey.orEmpty()
//                    }
//                    else -> {
//                        walletContent.address = responseUserIdentity.noprefix?.address.orEmpty()
//                        walletContent.privateKey =
//                            responseUserIdentity.noprefix?.privateKey.orEmpty()
//                    }
//                }
//            }
            getQrCodeImageWalletsLiveData.value = true
            val request = PreLoginRequest().apply {
                userID = Utility.hashIdentityIdFromMnemonic(bean.content.system.mnemonic)
                deviceID = Utils.getDeviceId(context)
            }
            val preLoginResult = imRepositoryCo.preLogin(request)
            val date = preLoginResult.data
            when (date?.status) {
                ImRepositoryCo.USER_EXIST -> getUserInfo(date.uid)
//                        else -> preLoginLiveData.value = true
            }
        }
    }

    fun isExistWalletAddress(importWalletAddress: String): Boolean {
        val walletDataList = dbHelper.getWalletDataList()
        for (data in walletDataList) {
            if (data.address == importWalletAddress) {
                return true
            }
        }
        return false
    }

    var userName = ""

    private fun getUserInfo(uuid: String) {
        viewModelLaunch {
            val result = imRepositoryCo.iMGetUserData(UUID.fromString(uuid))
            val data = result.data
            userName = data?.nickName ?: ""
        }
    }

    val onCreateClickLiveData = MutableLiveData<Boolean>()
    val onCreateClickErrorLiveData = MutableLiveData<Throwable>()

    fun onCreateClick(pwd: String?, note: String?) {
        val mUserBean = UserBean().apply {
            this.name = userName
            this.pwd = pwd ?: ""
            this.note = note ?: ""
            pwdEncrypt = verifyRepository.encryptString(pwd ?: "")
        }
        if (qrCodeImageBean != null) {
            if (qrCodeImageBean?.content?.system?.mnemonic?.isEmpty() != false) {
                return
            }
            mUserBean.mnemonic = qrCodeImageBean?.content?.system?.mnemonic ?: ""
        }
        userBean = mUserBean
        //restore mode
        viewModelLaunch({
            val rowId = createUser()
            val createCoinSelectionStatus = if (rowId != -1 && createWalletDataList()) {
                createCoinSelectionDataList()
                true
            } else {
                false
            }
            val initAssetStatus = if (createCoinSelectionStatus) {
                initAssetDataList()
                true
            } else {
                false
            }
            onCreateClickLiveData.value = initAssetStatus
        }, {
            onCreateClickErrorLiveData.value = it
        })
    }

    private fun createUser(): Int {
        val identityData = IdentityData().apply {
            identityId = Utility.hashIdentityIdFromMnemonic(userBean.mnemonic)
            name = userBean.name
            val fiatDataList = dbHelper.getFiatDataList()
            if (fiatDataList.isNotEmpty()) {
                prefFiatData = fiatDataList[0]
            }
            val languageDataList = dbHelper.getLanguageDataList()
            if (languageDataList.isNotEmpty()) {
                prefLangData = languageDataList[0]
            }
            pwd = userBean.pwdEncrypt
            pwdHint = userBean.note
        }
        val rowId = dbHelper.addIdentityData(identityData)
        userHelper.identityID = rowId
        return rowId
    }


    private fun createWalletDataList(): Boolean {
        val systemList = getWalletDataList(true)
        val importedList = getWalletDataList(false)
        val list = ArrayList<WalletData>()
        list.addAll(systemList)
        list.addAll(importedList)
        if (list.isEmpty()) {
            return false
        }
        val data = dbHelper.getIdentityData(userHelper.identityID)
        if (data != null) {
            for (item in list) {
                item.identityData = data
            }
        }
        dbHelper.setWalletDataList(list)
        val walletData = dbHelper.getDefaultSelectedWalletDataByIdentityID(userHelper.identityID)
        if (walletData != null && walletData._id != -1) {
            userHelper.selectedWalletID = walletData._id
            return true
        }

        return false
    }

    private fun getWalletDataList(isFromSystem: Boolean): List<WalletData> {
        val list = ArrayList<WalletData>()
        val walletContents: List<UserWalletQrCodeImageBean.WalletContent> = if (isFromSystem) {
            qrCodeImageBean?.content?.system?.wallets ?: arrayListOf()
        } else {
            qrCodeImageBean?.content?.imported ?: arrayListOf()
        }
        for (walletContent in walletContents) {
            val data = WalletData().apply {
                name = walletContent.name
                when (walletContent.mainCoinID) {
                    CoinEnum.ETH.coinId -> chainType = ChainType.ETH.value
                    CoinEnum.BTC.coinId -> chainType = ChainType.BTC.value
                    CoinEnum.TTN.coinId -> chainType = ChainType.TTN.value
                }
                this.isFromSystem = isFromSystem
                pwd = userBean.pwdEncrypt
                pwdHint = userBean.note
                mnemonic =
                    Utility.encryptPrivateKey(
                        qrCodeImageBean?.content?.system?.mnemonic ?: "",
                        userBean.pwd
                    )
                mainCoinId = walletContent.mainCoinID
                address = walletContent.address
                epKey = Utility.encryptPrivateKey(walletContent.privateKey, userBean.pwd)
            }
            if (!isExistWalletAddress(walletContent.address)) {
                list.add(data)
            }
        }
        return list
    }

    private fun createCoinSelectionDataList() {
        val list: MutableList<CoinSelectionData> = arrayListOf()
        val coinList = dbHelper.getCoinDataListByDefaultIsDefaultSelected()
        for (coinData in coinList) {
            val walletType = coinData.chainType
            val walletList = dbHelper.getWalletDataListByWalletType(walletType)
            for (walletData in walletList) {
                val coinSelectionData = CoinSelectionData().apply {
                    isSelected = true
                    this.coinData = coinData
                    this.walletData = walletData
                }
                list.add(coinSelectionData)
            }
        }
        dbHelper.setCoinSelectionDataList(list)
    }

    private fun initAssetDataList() {
        val assetDataList: MutableList<AssetData> = arrayListOf()
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

}