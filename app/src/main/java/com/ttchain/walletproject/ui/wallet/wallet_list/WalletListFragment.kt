package com.ttchain.walletproject.ui.wallet.wallet_list

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class WalletListFragment : BaseFragment() {

    companion object {
        const val _ID = "_ID"
        const val MAIN_COIN = 0
        const val STABLE_COIN = 1

        fun newInstance(): WalletListFragment {
            return WalletListFragment()
        }

        fun newInstance(id: Int) = WalletListFragment().apply {
            arguments = bundleOf(_ID to id)
        }
    }

    private val viewModel by viewModel<WalletListViewModel>()

    override val layoutId = R.layout.fragment_wallet_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {

    }

    private fun initData() {
        viewModel.apply {

        }
    }
}