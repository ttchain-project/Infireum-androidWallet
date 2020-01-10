package com.ttchain.walletproject.ui.wallet

import android.os.Bundle
import android.view.View
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_wallet_main.*
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
        add_wallet_btn.setDelayClickListener {
            // todo add wallet button
        }
        val pagerAdapter = WalletMainPagerAdapter(requireContext(), childFragmentManager)
        view_pager.apply {
            offscreenPageLimit = 2
            adapter = pagerAdapter
            currentItem = 0
        }.run {
            tab_layout.setupWithViewPager(this)
        }

    }

    private fun initData() {

    }
}