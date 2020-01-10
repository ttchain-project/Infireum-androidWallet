package com.ttchain.walletproject.ui.enter_password

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.blockchain.BitcoinjNew
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.UserWalletQrCodeImageBean
import com.ttchain.walletproject.utils.Utility

class EnterPasswordViewModel : BaseViewModel() {

    var qrCodeImageBean: UserWalletQrCodeImageBean? = null
    var qrCodeImagePwd = ""
    var qrCodeImageBeanLiveData = MutableLiveData<UserWalletQrCodeImageBean>()
    var qrCodeImageBeanError = MutableLiveData<Throwable>()

    fun getInput(password: String) {
        viewModelLaunch({
            qrCodeImagePwd = password
            val mnemonicRaw = qrCodeImageBean?.content?.system?.mnemonic.orEmpty()
            val mnemonicDecrypt = Utility.decryptPrivateKey(mnemonicRaw, password)
            qrCodeImageBean?.content?.system?.mnemonic = mnemonicDecrypt
            val responseUserIdentitySet = BitcoinjNew.systemWalletInit(mnemonicDecrypt)
            val systemWalletSets = arrayListOf<UserWalletQrCodeImageBean.WalletContent>()
            systemWalletSets.add(
                UserWalletQrCodeImageBean.WalletContent(
                    CoinEnum.BTC.coinId,
                    GlobalConstant.DEFAULT_WALLET_NAME_BTC,
                    responseUserIdentitySet.bitcoin?.privateKey.orEmpty(),
                    responseUserIdentitySet.bitcoin?.address.orEmpty()
                )
            )
            systemWalletSets.add(
                UserWalletQrCodeImageBean.WalletContent(
                    CoinEnum.ETH.coinId,
                    GlobalConstant.DEFAULT_WALLET_NAME_ETH,
                    responseUserIdentitySet.ethereum?.privateKey.orEmpty(),
                    responseUserIdentitySet.ethereum?.address.orEmpty()
                )
            )
            systemWalletSets.add(
                UserWalletQrCodeImageBean.WalletContent(
                    CoinEnum.TTN.coinId,
                    GlobalConstant.DEFAULT_WALLET_NAME_TTN,
                    responseUserIdentitySet.noprefix?.privateKey.orEmpty(),
                    responseUserIdentitySet.noprefix?.address.orEmpty()
                )
            )
            val systemAddressList = arrayListOf<String>()
            for (data in systemWalletSets) {
                systemAddressList.add(data.address)
            }
            val walletList = arrayListOf<UserWalletQrCodeImageBean.WalletContent>()
            for (walletContent in qrCodeImageBean?.content?.imported ?: arrayListOf()) {
                if (walletContent.address.isNotEmpty() && !systemAddressList.contains(walletContent.address))
                    walletList.add(walletContent)
            }
            qrCodeImageBean?.content?.system?.wallets = systemWalletSets
            qrCodeImageBean?.content?.imported = walletList
            qrCodeImageBeanLiveData.value = qrCodeImageBean
        }, {
            qrCodeImageBeanError.value = it
        })
    }
}