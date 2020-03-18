package com.ttchain.walletproject.ui.wallet_setting

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.dialog.WarningDialog
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.wallet.exportkey.ExportKeyActivity
import com.ttchain.walletproject.ui.wallet_setting.walletpasswordhint.WalletPasswordHintActivity
import kotlinx.android.synthetic.main.fragment_wallet_setting.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class WalletSettingFragment : BaseFragment() {

    companion object {

        private const val KEY_EXPORT_WALLET = "KEY_EXPORT_WALLET"
        private const val KEY_DELETE_WALLET = "KEY_DELETE_WALLET"

        fun newInstance() = WalletSettingFragment()
    }

    private val viewModel by viewModel<WalletSettingViewModel>()
    override val layoutId: Int = R.layout.fragment_wallet_setting

    private var walletData: WalletData? = null
    private var passwordTag = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        requireActivity().title = getString(R.string.wallet_setting_title)
        // 更改錢包名稱
//        textViewChangeWalletName.setDelayClickListener {
//            ChangeWalletNameActivity.launch(requireActivity(), walletData ?: WalletData())
//        }
        // 錢包密碼提示
        textViewWalletPasswordHint.setDelayClickListener {
            WalletPasswordHintActivity.launch(requireActivity(), walletData?.pwdHint ?: "")
        }
        // 導出錢包
        textViewExportWallet.setDelayClickListener {
            passwordTag = KEY_EXPORT_WALLET
            showVerifyDialog()
        }
        // 刪除錢包
        textViewDeleteWallet.setDelayClickListener {
            passwordTag = KEY_DELETE_WALLET
            showVerifyDialog()
        }
    }

    private fun initData() {
        viewModel.apply {
            getSelectWalletData()
            getSelectWalletDataLiveData.observe(viewLifecycleOwner) {
                walletData = it
                when {
                    it.isFromSystem -> {
                        textViewDeleteWallet.visibility = View.GONE
                        textViewChangeWalletName.visibility = View.GONE
                    }
                    else -> {
                        textViewDeleteWallet.visibility = View.VISIBLE
                        textViewChangeWalletName.visibility = View.VISIBLE
                    }
                }
            }
            getVerifyIdentityPwdObservableLiveData.observe(viewLifecycleOwner) {
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
            getVerifyIdentityPwdDeleteLiveData.observe(viewLifecycleOwner) {
                if (it) {
                    showDeleteDialog()
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
            deleteWalletDataRxLiveData.observe(viewLifecycleOwner) { s ->
                if (s) {
                    RxBus.getInstance().post(RxBusTag.UPDATE_WALLET_NAME_OK, true)
                    finishActivity()
                }
            }
        }
    }

    private fun showVerifyDialog() {
        val hint = walletData?.pwdHint ?: ""
        showAuthenticationDialog(hint,
            pwdListener = {
                checkPwd(it, hint)
            },
            bioListener = {
                checkPwd(it, hint)
            }
        )
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
        when (passwordTag) {
            KEY_EXPORT_WALLET -> {
                viewModel.getVerifyIdentityPwdObservable(walletData?._id ?: -1, it)
            }
            KEY_DELETE_WALLET -> {
                viewModel.getVerifyIdentityPwdDelete(walletData?._id ?: -1, it)
            }
        }
    }

    private fun showDeleteDialog() {
        val dialog = WarningDialog()
            .setTitle(getString(R.string.delete_wallet_dialog_title))
            .setContent(getString(R.string.delete_wallet_dialog_message))
            .setBtnText(getString(R.string.g_delete), getString(R.string.g_cancel))
            .setOnRightClickListener {
                viewModel.deleteWalletDataRx(walletData?._id ?: -1)
            }
        childFragmentManager.addDialog(dialog, "deleteWallet")
    }

}