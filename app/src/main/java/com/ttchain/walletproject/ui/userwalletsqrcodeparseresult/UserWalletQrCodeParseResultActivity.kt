package com.ttchain.walletproject.ui.userwalletsqrcodeparseresult

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.model.UserWalletQrCodeImageBean
import kotlinx.android.synthetic.main.activity_user_wallet_qr_code_parse_result.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserWalletQrCodeParseResultActivity : BaseActivity() {

    companion object {

        const val _ID = "_ID"
        const val _PASSWORD = "_PASSWORD"
        const val _HINT = "_HINT"

        fun launch(
            activity: Activity,
            bean: UserWalletQrCodeImageBean,
            password: String,
            hint: String
        ) {
            activity.startActivity(
                Intent(
                    activity,
                    UserWalletQrCodeParseResultActivity::class.java
                ).apply {
                    putExtras(bundleOf(_ID to bean))
                    putExtra(_PASSWORD, password)
                    putExtra(_HINT, hint)
                })
        }
    }

    private val viewModel by viewModel<UserWalletQrCodeParseResultViewModel>()

    private val bundleValue: UserWalletQrCodeImageBean by lazy {
        intent.getSerializableExtra(_ID) as UserWalletQrCodeImageBean
    }

    private val bundleValuePassword: String by lazy {
        intent.getStringExtra(_PASSWORD).orEmpty()
    }

    private val bundleValueHint: String by lazy {
        intent.getStringExtra(_HINT).orEmpty()
    }

    private val systemWalletRecyclerAdapter = SystemWalletAdapter()
    private val importedWalletAdapter = SystemWalletAdapter()

    override val layoutId = R.layout.activity_user_wallet_qr_code_parse_result

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initData()
    }

    private fun initViews() {
        bundleValue.content.imported
        bundleValue.content.system.mnemonic
        next.setOnClickListener {
            viewModel.onCreateClick(
                bundleValuePassword,
                bundleValueHint
            )
        }
        recyclerViewSystemWallet.apply {
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(this@UserWalletQrCodeParseResultActivity)
            adapter = systemWalletRecyclerAdapter
        }
        recyclerViewImportedWallet.apply {
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(this@UserWalletQrCodeParseResultActivity)
            adapter = importedWalletAdapter
        }
        viewModel.getQrCodeImageWallets(bundleValue)
    }

    private fun initData() {
        viewModel.apply {
            isLoading.observe(this@UserWalletQrCodeParseResultActivity) {
                if (it) onShowLoading()
                else onHideLoading()
            }
            getQrCodeImageWalletsLiveData.observe(this@UserWalletQrCodeParseResultActivity) {
                val systemWallets = bundleValue.content.system.wallets
                val importedWallets = bundleValue.content.imported
                systemWalletRecyclerAdapter.updateData(systemWallets.toMutableList())
                importedWalletAdapter.updateData(importedWallets.toMutableList())
            }
            onCreateClickLiveData.observe(this@UserWalletQrCodeParseResultActivity) { status ->
                if (status) {
                    finishActivity()
//                    SuccessLoginActivity.launch(this@UserWalletQrCodeParseResultActivity)
                } else {
                    showToast(getString(R.string.fail_create))
                }
            }
            onCreateClickErrorLiveData.observe(this@UserWalletQrCodeParseResultActivity) {
                showToast(getString(R.string.fail_create))
            }
        }
    }


}
