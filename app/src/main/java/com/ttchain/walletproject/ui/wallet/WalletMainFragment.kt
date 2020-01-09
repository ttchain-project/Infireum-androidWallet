package com.ttchain.walletproject.ui.wallet

import android.os.Bundle
import android.view.View
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class WalletMainFragment : BaseFragment() {

    companion object {
        fun newInstance() = WalletMainFragment()
    }

    private val viewModel by viewModel<WalletMainViewModel>()

    override val layoutId = R.layout.fragment_wallet_main

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