package com.ttchain.walletproject.ui.asset

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class AssetListActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_asset_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, AssetListFragment.newInstance())
    }

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, AssetListActivity::class.java))
        }
    }
}
