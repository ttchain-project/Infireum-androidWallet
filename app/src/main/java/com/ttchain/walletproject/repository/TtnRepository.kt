package com.ttchain.walletproject.repository

import com.ttchain.walletproject.database.data.FiatData
import com.ttchain.walletproject.database.data.IdentityData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.UserHelper

class TtnRepository(
    private val dbHelper: DbHelper,
    private val userHelper: UserHelper
) : BaseRepository() {

    fun getTtnWalletData(): WalletData {
        for (walletData in dbHelper.getDefaultWalletDataList()) {
            if (walletData.mainCoinId == CoinEnum.TTN.coinId) {
                return walletData
            }
        }
        return WalletData()
    }

    fun getPrefFiatData(): FiatData {
        val identityData = dbHelper.getIdentityData(userHelper.identityID) ?: IdentityData()
        return identityData.prefFiatData
    }
}