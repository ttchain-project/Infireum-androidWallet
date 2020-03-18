package com.ttchain.walletproject.ui.wallet_setting.walletpasswordhint

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class WalletPasswordHintActivity : BaseActivity() {

    companion object {

        const val BUNDLE_PASSWORD_HINT = "BUNDLE_PASSWORD_HINT"

        fun launch(activity: Activity, passwordHint: String) {
            activity.startActivity(Intent(activity, WalletPasswordHintActivity::class.java).apply {
                putExtra(BUNDLE_PASSWORD_HINT, passwordHint)
            })
        }
    }

    override val layoutId: Int = R.layout.activity_wallet_password_hint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        changeFragment(
            R.id.content_view, WalletPasswordHintFragment.newInstance(
                intent.getStringExtra(BUNDLE_PASSWORD_HINT)
            )
        )
    }

}