package com.ttchain.walletproject.ui.discovery

import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.repository.HelperRepositoryCo
import com.ttchain.walletproject.repository.InfoRepositoryCo

class DiscoveryViewModel(
    private val helperRepositoryCo: HelperRepositoryCo,
    private val coinRepository: CoinRepository,
    private val infoRepositoryCo: InfoRepositoryCo
) : BaseViewModel() {
}