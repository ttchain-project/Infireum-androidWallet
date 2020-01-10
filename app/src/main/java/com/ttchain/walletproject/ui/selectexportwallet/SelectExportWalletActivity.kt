package com.ttchain.walletproject.ui.selectexportwallet

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.os.bundleOf
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import com.ttchain.walletproject.enums.CoinEnum

class SelectExportWalletActivity : BaseActivity() {

    companion object {

        const val BUNDLE_COIN_TYPE = "BUNDLE_COIN_TYPE"

        fun launch(activity: Activity, coinType: CoinEnum) {
            activity.startActivity(Intent(activity, SelectExportWalletActivity::class.java).apply {
                putExtras(bundleOf(BUNDLE_COIN_TYPE to coinType))
            })
        }
    }

    override val layoutId = R.layout.activity_select_export_wallet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        changeFragment(
            R.id.content_view,
            SelectExportWalletFragment.newInstance(intent.getSerializableExtra(BUNDLE_COIN_TYPE) as CoinEnum)
        )
    }
}