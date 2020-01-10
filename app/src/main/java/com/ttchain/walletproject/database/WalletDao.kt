package com.git4u.tt_wallet_android.database

import android.content.Context
import com.git4u.tt_wallet_android.cache.GlobalConstant
import com.ttchain.walletproject.database.DbConstants
import com.ttchain.walletproject.database.data.WalletData
import java.util.*

class WalletDao(context: Context) : BaseDao<WalletData, Int>(context, WalletData::class.java) {

    fun getIsFromSystemWalletListData(status: Boolean): List<WalletData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.IS_FROM_SYSTEM, status)
                        .query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getDefaultSelectedWalletDataByIdentityID(identityID: Int): WalletData? {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.FK_IDENTITY_ID, identityID)
                        .and()
                        .eq(DbConstants.IS_FROM_SYSTEM, true)
                        .and()
                        .eq(DbConstants.CHAIN_TYPE, GlobalConstant.DEFAULT_WALLET_CHAIN_TYPE)
                        .queryForFirst()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return WalletData()
    }

    fun getDefaultWalletTypeWalletData(): WalletData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.IS_FROM_SYSTEM, true)
                        .and()
                        .eq(DbConstants.CHAIN_TYPE, GlobalConstant.DEFAULT_WALLET_CHAIN_TYPE)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return WalletData()
    }

    fun getWalletByName(string: String): WalletData {
        try {
            dao?.let {
                val list = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.NAME, string)
                        .query()
                if (list.isNotEmpty()) {
                    return list[0]
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return WalletData()
    }

    fun getWalletDataListByWalletType(walletType: Int): List<WalletData> {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.CHAIN_TYPE, walletType)
                        .query()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return Collections.emptyList()
    }

    fun getWalletDataListCountByWalletType(walletType: Int): Int {
        try {
            dao?.let {
                return dao.queryBuilder()
                        .where()
                        .eq(DbConstants.CHAIN_TYPE, walletType)
                        .query().size
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return 0
    }

    fun getWalletDataByAddress(address: String): WalletData {
        try {
            dao?.let {
                val data = dao.queryBuilder()
                        .where()
                        .eq(DbConstants.ADDRESS, address)
                        .queryForFirst()
                data?.let {
                    return data
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return WalletData()
    }

}