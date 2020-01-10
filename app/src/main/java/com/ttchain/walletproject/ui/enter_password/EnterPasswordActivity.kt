package com.ttchain.walletproject.ui.enter_password

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.model.UserWalletQrCodeImageBean
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.userwalletsqrcodeparseresult.UserWalletQrCodeParseResultActivity
import kotlinx.android.synthetic.main.activity_enter_password.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class EnterPasswordActivity : BaseActivity() {

    companion object {

        const val BUNDLE_QR_CODE_DATA = "BUNDLE_QR_CODE_DATA"

        fun launch(activity: Activity, data: UserWalletQrCodeImageBean) {
            activity.startActivity(Intent(activity, EnterPasswordActivity::class.java).apply {
                putExtras(bundleOf(BUNDLE_QR_CODE_DATA to data))
            })
        }
    }


    private val viewModel by viewModel<EnterPasswordViewModel>()

    private val bundleValueQrCodeData: UserWalletQrCodeImageBean
        get() = intent?.getSerializableExtra(BUNDLE_QR_CODE_DATA) as UserWalletQrCodeImageBean

    override val layoutId = R.layout.activity_enter_password

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initData()
    }

    private fun initView() {
        customEditTextPassword.addTextChangeListener {
            next.setEnable(it?.isNotEmpty() ?: false)
        }
        customEditTextHint.setText(bundleValueQrCodeData.hint)
        next.setOnClickListener {
            viewModel.getInput(customEditTextPassword.getText())
        }
        previous.setDelayClickListener {
            finishActivity()
        }
    }

    private fun initData() {
        viewModel.apply {
            qrCodeImageBean = bundleValueQrCodeData
            qrCodeImageBeanLiveData.observe(this@EnterPasswordActivity) { data ->
                val mnemonicDecrypt = data.content.system.mnemonic
                val mnemonics = mnemonicDecrypt.split(" ")
                if (mnemonics.size != 12) {
                    onShowMessageDialog(getString(R.string.parse_qr_code_pwd_error))
                    return@observe
                }


//
//                data.content.system.mnemonic = mnemonicDecrypt
//                for (walletContent in data.content.system.wallets) {
//                    val pkyDecrypt =
//                        Utility.decryptPrivateKey(walletContent.privateKey, qrCodeImagePwd)
//                    walletContent.privateKey = pkyDecrypt
//                }
//                for (walletContent in data.content.imported) {
//                    val pkyDecrypt =
//                        Utility.decryptPrivateKey(walletContent.privateKey, qrCodeImagePwd)
//                    walletContent.privateKey = pkyDecrypt
//                }
                UserWalletQrCodeParseResultActivity.launch(
                    this@EnterPasswordActivity,
                    data,
                    qrCodeImagePwd,
                    data.hint
                )
                finishActivity()
            }
            qrCodeImageBeanError.observe(this@EnterPasswordActivity) {
                onShowMessageDialog(getString(R.string.parse_qr_code_error))
            }
            isLoading.observe(this@EnterPasswordActivity) {
                if (it) onShowLoading() else onHideLoading()
            }
        }
    }
}