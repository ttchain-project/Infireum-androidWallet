package com.ttchain.walletproject.repository

import android.content.Context
import com.ttchain.walletproject.R
import com.ttchain.walletproject.database.data.AssetData
import com.ttchain.walletproject.database.data.CoinSelectionData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserBean
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.model.WalletFactory
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utility
import java.math.BigDecimal
import java.util.ArrayList

class RestoreRepository(private val dbHelper: DbHelper, private val userHelper: UserHelper) :
    BaseRepository() {

    fun getRestoreTitleByMainCoinType(context: Context, mainCoinType: Int): String {
        return when (mainCoinType) {
            MainCoinType.NONE.value -> context.getString(R.string.restore_identity)
            MainCoinType.ETH.value -> context.getString(R.string.import_etherum_wallet)
            MainCoinType.BTC.value -> context.getString(R.string.import_bitcoin_wallet)
            MainCoinType.CIC.value -> context.getString(R.string.import_cic_wallet)
            MainCoinType.GUC.value -> context.getString(R.string.import_guc_wallet)
            else -> context.getString(R.string.restore_identity)
        }
    }

    fun isExistWalletAddress(bean: UserBean): Boolean {
        val walletDataList = dbHelper.getWalletDataList()
        for (data in walletDataList) {
            if (data.address == bean.importWalletAddress) {
                return true
            }
        }
        return false
    }

    fun createWalletData(bean: UserBean): Int {
        return createWalletData(bean, "")
    }

    fun createWalletData(bean: UserBean, walletName: String): Int {
        val data = WalletData()
        data.address = bean.importWalletAddress
        data.chainType = RuleUtils.getChainType(bean.importWalletAddress).value
        data.mainCoinId = RuleUtils.getMainCoinId(bean.importWalletAddress)
        data.isFromSystem = false
        data.pwdHint = bean.note
        data.epKey = Utility.encryptPrivateKey(bean.walletEpKey, bean.pwd)
        data.pwd = bean.pwdEncrypt
        if (bean.mnemonic.isNotEmpty()) {
            data.mnemonic = Utility.encryptPrivateKey(bean.mnemonic, bean.pwd)
        }

        var count = 0
        val walletDataList = dbHelper.getWalletDataList()
        for (item in walletDataList) {
            if (RuleUtils.getMainCoinType(item.address) === bean.mainCoinType) {
                count++
            }
        }

        count++

        if (walletName.isEmpty()) {
            data.name = RuleUtils.getDefaultWalletName(bean.importWalletAddress) + " - " + count
        } else {
            data.name = walletName
        }

        val identityData = dbHelper.getIdentityData(userHelper.identityID)
        if (identityData != null) {
            data.identityData = identityData
            val walletRow = dbHelper.addWalletData(data)
            if (walletRow != -1) {
                // create wallet with coin's coin selection data
                val list = ArrayList<CoinSelectionData>()
                val coinList = dbHelper.getCoinDataListByDefaultIsDefaultSelected()
                for (coinData in coinList) {
                    if (RuleUtils.getMainCoinId(data.address) == coinData.mainCoinId) {
                        val coinSelectionData = CoinSelectionData()
                        coinSelectionData.isSelected = true
                        coinSelectionData.coinData = coinData
                        coinSelectionData.walletData = data
                        list.add(coinSelectionData)
                    }
                }
                dbHelper.setCoinSelectionDataList(list)

                // create wallet with coin's asset data
                val assetDataList = ArrayList<AssetData>()
                for (selectionData in list) {
                    val assetData = AssetData()
                    assetData.coinData = selectionData.coinData
                    assetData.walletData = selectionData.walletData
                    assetData.amount = BigDecimal("0")
                    assetDataList.add(assetData)
                }
                dbHelper.setAssetDataList(assetDataList)

                return walletRow
            }
        }

        return -1
    }

    fun deleteWalletData(id: Int): Int {
        return dbHelper.deleteWalletData(id)
    }

    fun createUser(userBean: UserBean?): Int {
        var rowId = -1

        if (userBean != null) {
            val identityData = IdentityData()
            identityData.identityId = Utility.hashIdentityIdFromMnemonic(userBean.mnemonic)
            if (userBean.name.isNotEmpty()) {
                identityData.name = userBean.name
            } else {
                identityData.name = "Name"
            }
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

            rowId = dbHelper.addIdentityData(identityData)

            userHelper.identityID = rowId

        }

        return rowId
    }

    fun createRestoreWalletData(bean: UserBean): Int {
        val walletData = WalletFactory.createData(bean)
        val data = dbHelper.getIdentityData(userHelper.identityID)
        if (data != null) {
            walletData.identityData = data
            return dbHelper.addWalletData(walletData)
        }
        return -1
    }

    fun createCoinSelectionDataList() {
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
                    val coinSelectionData = CoinSelectionData()
                    coinSelectionData.isSelected = true
                    coinSelectionData.coinData = coinData
                    coinSelectionData.walletData = walletData
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
            val assetData = AssetData()
            assetData.coinData = selectionData.coinData
            assetData.walletData = selectionData.walletData
            assetData.amount = BigDecimal("0")
            assetDataList.add(assetData)
        }

        dbHelper.setAssetDataList(assetDataList)
    }

    fun setSelectedWalletID(): Boolean {
        val walletData =
            dbHelper.getDefaultSelectedWalletDataByIdentityID(userHelper.identityID)
        if (walletData != null && walletData._id != -1) {
            userHelper.selectedWalletID = walletData._id
            return true
        }
        return false
    }
}