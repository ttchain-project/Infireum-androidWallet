package com.ttchain.walletproject.ui.discovery

import android.os.Bundle
import android.view.View
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class DiscoveryFragment : BaseFragment() {

    companion object {

        fun newInstance() = DiscoveryFragment()
    }

    private val viewModel by viewModel<DiscoveryViewModel>()

    override val layoutId = R.layout.fragment_discovery

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {

    }

    private fun initData() {

    }
}