package com.ttchain.walletproject.ui.me.userwalletmnemonic

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class UserWalletMnemonicActivity : BaseActivity() {

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, UserWalletMnemonicActivity::class.java))
        }

    }

    override val layoutId: Int
        get() = R.layout.activity_user_wallet_mnemonic

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        changeFragment(R.id.content_view, UserWalletMnemonicFragment.newInstance())
    }

}