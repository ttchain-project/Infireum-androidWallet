package com.ttchain.walletproject.model

import java.io.Serializable

data class ReceiptAddressBean(var _Id: Int = -1) : Serializable {
    var walletType: Int = -1
    var walletID: Int = -1
    var coinId: String = ""
    var receiptAddress: String = ""
    var transToCoinMainCoinId: String = ""
}