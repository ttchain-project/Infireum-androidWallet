package com.ttchain.walletproject.ui.restorebymnemonics_new.restoremnemonicswalletlist

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.ui.success_login.SuccessLoginActivity
import kotlinx.android.synthetic.main.fragment_restore_wallet_list.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RestoreWalletListFragment : BaseFragment() {

    companion object {
        fun newInstance() = RestoreWalletListFragment()
    }

    private val viewModel by viewModel<RestoreWalletListViewModel>()
    private val restoreWalletListAdapter = RestoreWalletListAdapter()

    override val layoutId = R.layout.fragment_restore_wallet_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        recyclerViewSystemWallet.apply {
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(requireContext())
            adapter = restoreWalletListAdapter
        }
        next.setOnClickListener {
            finishActivity()
            SuccessLoginActivity.launch(requireActivity())
        }
    }

    private fun initData() {
        viewModel.apply {
            getWalletList()
            getWalletListLiveData.observe(requireActivity()) {
                restoreWalletListAdapter.updateData(it.toMutableList())
            }
        }
    }

}