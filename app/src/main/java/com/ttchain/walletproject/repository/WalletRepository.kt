package com.ttchain.walletproject.repository

import android.content.Context
import com.ttchain.walletproject.R
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper
import com.ttchain.walletproject.model.WalletBean
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utils

class WalletRepository(
    private val context: Context,
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper
) : BaseRepository() {

    fun getUserSelectedWalletData(): WalletData {
        val id = userHelper.selectedWalletID
        return dbHelper.getWalletData(id) ?: WalletData()
    }

    fun getDefaultWalletBeanList(): List<WalletBean> {
        val result = java.util.ArrayList<WalletBean>()
        val list = dbHelper.getDefaultWalletDataList()
        for (data in list) {
            result.add(createWalletBean(context, data))
        }
        return result
    }

    fun getImportWalletBeanList(): List<WalletBean> {
        val result = java.util.ArrayList<WalletBean>()
        val list = dbHelper.getImportWalletDataList()
        for (data in list) {
            result.add(createWalletBean(context, data))
        }
        return result
    }

    fun createWalletBean(context: Context, data: WalletData?): WalletBean {
        if (data != null) {
            val bean = WalletBean(data._id)
            bean.chainType = data.chainType
            bean.name = data.name
            bean.address = data.address
            bean.online = Utils.getInternetStatus(context)
            val mainCoinType = RuleUtils.getMainCoinType(data.address)
            when {
                mainCoinType === MainCoinType.ETH -> bean.bgDrawableId =
                    R.mipmap.bg_eth_wallet_color
                mainCoinType === MainCoinType.BTC -> bean.bgDrawableId =
                    R.mipmap.bg_btc_wallet_color
                mainCoinType === MainCoinType.CIC -> bean.bgDrawableId =
                    R.mipmap.bg_cic_wallet_color
                mainCoinType === MainCoinType.GUC -> bean.bgDrawableId =
                    R.mipmap.bg_guc_wallet_color
                else -> bean.bgDrawableId = R.mipmap.bg_eth_wallet_color
            }
            return bean
        } else {
            val bean = WalletBean(-1)
            bean.name = "None"
            bean.address = "None"
            bean.online = true
            bean.bgDrawableId = R.mipmap.bg_eth_wallet_color
            bean.online = false
            return bean
        }
    }

    fun deleteWalletData(walletID: Int): Boolean {
        val walletData = dbHelper.getWalletData(walletID)
        if (walletData == null || walletData._id < 0) {
            return false
        }
        val id = dbHelper.deleteWalletData(walletData._id)
        return id > 0
    }

    fun getWalletData(walletID: Int): WalletData {
        return dbHelper.getWalletData(walletID) ?: WalletData()
    }

    fun getIdentityData(): IdentityData {
        return dbHelper.getIdentityData(userHelper.identityID) ?: IdentityData()
    }
}