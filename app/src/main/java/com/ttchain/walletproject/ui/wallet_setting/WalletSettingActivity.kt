package com.ttchain.walletproject.ui.wallet_setting

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addFragment
import com.ttchain.walletproject.base.BaseActivity

class WalletSettingActivity : BaseActivity() {

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, WalletSettingActivity::class.java))
        }
    }

    override val layoutId: Int = R.layout.activity_wallet_setting

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        addFragment(
            R.id.content_view, WalletSettingFragment.newInstance()
        )
    }
}