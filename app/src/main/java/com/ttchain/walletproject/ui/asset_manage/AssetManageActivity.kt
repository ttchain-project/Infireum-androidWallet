package com.ttchain.walletproject.ui.asset_manage

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.git4u.tt_wallet_android.activity.asset_new.AssetManageFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class AssetManageActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_asset_manage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, AssetManageFragment.newInstance())
    }

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, AssetManageActivity::class.java))
        }
    }
}
