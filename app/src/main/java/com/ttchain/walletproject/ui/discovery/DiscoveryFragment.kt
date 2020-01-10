package com.ttchain.walletproject.ui.discovery

import android.os.Bundle
import android.view.View
import com.git4u.tt_wallet_android.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.toMain
import org.koin.androidx.viewmodel.ext.android.viewModel

class DiscoveryFragment : BaseFragment() {

    companion object {

        fun newInstance() = DiscoveryFragment()
    }

    private val viewModel by viewModel<DiscoveryViewModel>()
    private val mTrendAdapter = ExplorerTrendAdapter()
    private val mMediaAdapter = ExplorerDappAdapter()
    private val mDappAdapter = ExplorerDappAdapter()
    private val mBlockChainExplorerAdapter = ExplorerDappAdapter()

    override val layoutId = R.layout.fragment_discovery

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RxBus.getInstance().register<Boolean>(RxBusTag.CT_WALLET_REFRESH)
            .toMain()
            .subscribe { status ->
                if (status) {
//                    viewModel.getQuotes()
                }
            }
        initView()
        initData()
    }

    override fun initView() {

    }

    private fun initData() {

    }
}