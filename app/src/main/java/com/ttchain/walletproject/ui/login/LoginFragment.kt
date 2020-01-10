package com.ttchain.walletproject.ui.login

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.enums.AgreementEnum
import com.ttchain.walletproject.enums.QRCodeEnum
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.agreement.AgreementActivity
import com.ttchain.walletproject.ui.enter_password.EnterPasswordActivity
import com.ttchain.walletproject.ui.scanner_new.ScannerActivity
import com.ttchain.walletproject.ui.userwalletsqrcodeparseresult.UserWalletQrCodeParseResultActivity
import com.ttchain.walletproject.utils.Utils
import kotlinx.android.synthetic.main.fragment_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

class LoginFragment : BaseFragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private val viewModel by viewModel<LoginViewModel>()

    override val layoutId = R.layout.fragment_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun onResume() {
        super.onResume()
        viewModel.getLanguageText()
    }

    override fun initView() {
        create.setDelayClickListener {
            AgreementActivity.launchForResult(requireActivity(), AgreementEnum.AGREEMENT.type)
        }
        restore_by_qrcode_btn.setDelayClickListener {
            ScannerActivity.launchForResult(this, ScannerActivity.BASIC, QRCodeEnum.TYPE_IMPORT)
        }
        restore_by_mnemonics_btn.setDelayClickListener {
//            RestoreByMnemonicsActivity.launch(requireActivity())
        }
        restore.setDelayClickListener {
            new_user_container.visibility = View.INVISIBLE
            exists_user_container.visibility = View.VISIBLE
            previous_btn.visibility = View.VISIBLE
        }
        language.setDelayClickListener {
//            LanguageSettingActivity.launch(requireActivity())
        }
        previous_btn.setDelayClickListener {
            new_user_container.visibility = View.VISIBLE
            exists_user_container.visibility = View.GONE
            previous_btn.visibility = View.GONE
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initData() {
        viewModel.apply {
            qrCodeParseLiveData.observe(requireActivity()) {
                EnterPasswordActivity.launch(requireActivity(), it)
            }
            hintLiveData.observe(requireActivity()) {
                showInputDialog(
                    getString(R.string.input_pwd),
                    getString(R.string.input_pwd_to_parse_qr_code),
                    it
                ) { input ->
                    getInput(input)
                }
            }
            hintErrorLiveData.observe(requireActivity()) {
                onShowMessageDialog(getString(R.string.parse_qr_code_error))
            }
            qrCodeImageBeanLiveData.observe(requireActivity()) { data ->
                val hint = getString(R.string.pwd_hint) + data.hint
                val mnemonicRaw = data.content.system.mnemonic
                val mnemonicDecrypt =
                    Utils.decryptPrivateKey(mnemonicRaw, qrCodeImagePwd)
                val mnemonics = mnemonicDecrypt.split(" ")
                if (mnemonics.size != 12) {
                    onShowMessageDialog(getString(R.string.parse_qr_code_pwd_error)) {
                        showInputDialog(
                            getString(R.string.input_pwd),
                            getString(R.string.input_pwd_to_parse_qr_code),
                            hint
                        ) { input ->
                            getInput(input)
                        }
                    }
                    return@observe
                }
                data.content.system.mnemonic = mnemonicDecrypt
                for (walletContent in data.content.system.wallets) {
                    val pkyDecrypt =
                        Utils.decryptPrivateKey(walletContent.privateKey, qrCodeImagePwd)
                    walletContent.privateKey = pkyDecrypt
                }
                for (walletContent in data.content.imported) {
                    val pkyDecrypt =
                        Utils.decryptPrivateKey(walletContent.privateKey, qrCodeImagePwd)
                    walletContent.privateKey = pkyDecrypt
                }
                UserWalletQrCodeParseResultActivity.launch(
                    requireActivity(),
                    data,
                    qrCodeImagePwd,
                    data.hint
                )
            }
            qrCodeImageBeanError.observe(requireActivity()) {
                onShowMessageDialog(getString(R.string.parse_qr_code_error))
            }
            languageLiveData.observe(requireActivity()) {
                language.text = "  $it"
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == ScannerActivity.REQUEST_CODE) {
            val stringData = data?.getStringExtra(ScannerActivity.EXTRA_CODE_ADDRESS).orEmpty()
            Timber.d("as : $stringData")
            viewModel.parseUserWalletQrCode(stringData)
        }
    }
}