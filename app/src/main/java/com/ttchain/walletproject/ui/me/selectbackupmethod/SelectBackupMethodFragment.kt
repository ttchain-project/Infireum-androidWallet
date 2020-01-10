package com.ttchain.walletproject.ui.me.selectbackupmethod

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.me.userwalletmnemonic.UserWalletMnemonicActivity
import com.ttchain.walletproject.ui.me.userwalletsqrcode.UserWalletQrCodeActivity
import kotlinx.android.synthetic.main.fragment_select_backup_method.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SelectBackupMethodFragment : BaseFragment() {

    companion object {
        fun newInstance() = SelectBackupMethodFragment()
    }

    private val viewModel by viewModel<SelectBackupMethodViewModel>()

    override val layoutId = R.layout.fragment_select_backup_method

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        requireActivity().title = getString(R.string.setting_backup_account)
        qrcode_container.setDelayClickListener {
            viewModel.launchUserWalletQrCodeActivity()
        }
        mnemonics_container.setDelayClickListener {
            UserWalletMnemonicActivity.launch(requireActivity())
        }
    }

    private fun initData() {
        viewModel.apply {
            launchUserWalletQrCodeActivityLiveData.observe(requireActivity()) { bean ->
                UserWalletQrCodeActivity.launch(requireActivity(), bean)
            }
        }
    }
}