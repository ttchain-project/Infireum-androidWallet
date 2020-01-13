package com.ttchain.walletproject.model

import java.io.Serializable

class RefreshUiDataBean(b: Boolean, b1: Boolean, b2: Boolean) : Serializable {
    var showLoading = b
    var showRefresh= b1
    var runUpdateRateAndBalanceDataTask = b2
}