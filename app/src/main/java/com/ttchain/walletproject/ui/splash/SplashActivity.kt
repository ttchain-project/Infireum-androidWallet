package com.ttchain.walletproject.ui.splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity() {

    private val viewModel by viewModel<SplashViewModel>()

    override val layoutId = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {

    }

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, SplashActivity::class.java))
        }
    }
}
