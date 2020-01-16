package com.ttchain.walletproject.ui.search_coin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class SearchCoinActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_search_coin


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, SearchCoinFragment.newInstance())
    }

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, SearchCoinActivity::class.java))
        }
    }
}
