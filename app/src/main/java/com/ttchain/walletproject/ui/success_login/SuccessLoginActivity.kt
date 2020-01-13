package com.ttchain.walletproject.ui.success_login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.ui.main.MainActivity
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import kotlinx.android.synthetic.main.activity_success_login.*

class SuccessLoginActivity : BaseActivity() {

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, SuccessLoginActivity::class.java))
        }
    }

    override val layoutId = R.layout.activity_success_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        next.setOnClickListener {
            finishActivity()
            MainActivity.launch(this)
        }
    }
}