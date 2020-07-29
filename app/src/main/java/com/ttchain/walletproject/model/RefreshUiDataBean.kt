package com.ttchain.walletproject.model

import java.io.Serializable

class RefreshUiDataBean(loading: Boolean, refresh: Boolean, updateBalance: Boolean) : Serializable {
    var showLoading = loading
    var showRefresh= refresh
    var runUpdateRateAndBalanceDataTask = updateBalance
}