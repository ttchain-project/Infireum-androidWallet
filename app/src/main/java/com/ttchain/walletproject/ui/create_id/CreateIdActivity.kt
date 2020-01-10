package com.ttchain.walletproject.ui.create_id

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class CreateIdActivity : BaseActivity() {

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, CreateIdActivity::class.java))
        }
    }

    override val layoutId: Int
        get() = R.layout.activity_create_id

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, CreateIdFragment.newInstance())
    }

}
