package com.ttchain.walletproject.model

import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utility

object WalletFactory {

    fun createData(userBean: UserBean): WalletData {
        return WalletData().apply {
            isFromSystem = true
            chainType = RuleUtils.getChainType(userBean.importWalletAddress).value
            name = RuleUtils.getDefaultWalletName(userBean.importWalletAddress)
            mainCoinId = RuleUtils.getMainCoinId(userBean.importWalletAddress)
            epKey = Utility.encryptPrivateKey(userBean.walletEpKey, userBean.pwd)
            mnemonic = Utility.encryptPrivateKey(userBean.mnemonic, userBean.pwd)
            pwd = userBean.pwdEncrypt
            pwdHint = userBean.note
            address = userBean.importWalletAddress
        }
    }
}