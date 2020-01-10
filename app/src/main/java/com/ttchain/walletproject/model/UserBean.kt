package com.ttchain.walletproject.model

import com.ttchain.walletproject.enums.MainCoinType
import java.io.Serializable

data class UserBean(var _id: Int = -1) : Serializable {
    var mnemonic = ""
    var name: String = ""
    var pwd: String = ""
    var pwdEncrypt: String = ""
    var note: String = ""
    var walletEpKey = ""
    var importWalletAddress = ""
    var mainCoinType: MainCoinType = MainCoinType.NONE
}
