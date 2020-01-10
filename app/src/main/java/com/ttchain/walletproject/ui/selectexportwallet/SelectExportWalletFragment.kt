package com.ttchain.walletproject.ui.selectexportwallet

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.lazy
import com.ttchain.walletproject.ui.wallet.exportkey.ExportKeyActivity
import kotlinx.android.synthetic.main.fragment_select_export_wallet.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SelectExportWalletFragment : BaseFragment() {

    companion object {
        fun newInstance(coinType: CoinEnum) = SelectExportWalletFragment().apply {
            arguments = bundleOf(SelectExportWalletActivity.BUNDLE_COIN_TYPE to coinType)
        }
    }

    private val viewModel by viewModel<SelectExportWalletViewModel>()

    private val bundleValueCoinType: CoinEnum by lazy(SelectExportWalletActivity.BUNDLE_COIN_TYPE)

    override val layoutId = R.layout.fragment_select_export_wallet

    private val selectExportWalletAdapter = SelectExportWalletAdapter()

    private var walletData: WalletData? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        when (bundleValueCoinType) {
            CoinEnum.BTC -> requireActivity().title =
                getString(R.string.select_export_wallet_title_btc)
            CoinEnum.ETH -> requireActivity().title =
                getString(R.string.select_export_wallet_title_eth)
            else -> requireActivity().title =
                getString(R.string.select_export_wallet_title_btc)
        }
        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = selectExportWalletAdapter
        }
        selectExportWalletAdapter.setOnSelectExportWalletClickListener { data ->
            walletData = data
            showVerifyDialog()
        }
    }

    private fun initData() {
        viewModel.apply {
            getWalletData(bundleValueCoinType)
            getWalletDataLivaData.observe(requireActivity()) {
                selectExportWalletAdapter.setCoinEnum(bundleValueCoinType)
                selectExportWalletAdapter.updateData(it)
            }
            getVerifyIdentityPwdObservableLiveData.observe(requireActivity()) {
                if (it) {
                    ExportKeyActivity.launch(requireActivity(), walletData?._id ?: -1)
                } else {
                    // if error
                    onShowMessageDialog(
                        getString(R.string.fail_verify_pwd_and_reinput_p),
                        getString(R.string.g_ok)
                    ) {
                        showVerifyDialog()
                    }
                }
            }
        }
    }

    private fun showVerifyDialog() {
        val hint = viewModel.getIdentityData().pwdHint
        showAuthenticationDialog(hint,
            pwdListener = {
                checkPwd(it, hint)
            },
            bioListener = {
                checkPwd(it, hint)
            })
    }

    private fun checkPwd(it: String, hint: String) {
        if (it.isEmpty()) {
            showToast(getString(R.string.set_password_and_hint_empty))
            return
        }
        if (it == hint) {
            showToast(getString(R.string.set_password_and_hint_error))
            return
        }
        viewModel.getVerifyIdentityPwdObservable(it)
    }


}