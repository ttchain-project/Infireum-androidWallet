package com.ttchain.walletproject.ui.splash

import android.graphics.PorterDuff
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.observe
import com.ttchain.walletproject.ui.login.LoginActivity
import com.ttchain.walletproject.ui.main.MainActivity
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity : BaseActivity() {

    private val viewModel by viewModel<SplashViewModel>()

    override val layoutId = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initData()
    }

    private fun initViews() {
        progress_bar.indeterminateDrawable.setColorFilter(
            ContextCompat.getColor(this, R.color._506EF5),
            PorterDuff.Mode.SRC_IN
        )
    }

    private fun initData () {
        viewModel.apply {
            throwableMessage.observe(this@SplashActivity) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            firstTaskResult.observe(this@SplashActivity) {
                if (it) {
                    viewModel.performSecondSectionTask()
                }
            }
            touchIdResult.observe(this@SplashActivity) {
                //TODO: showAuthenticationDialog
                MainActivity.launch(this@SplashActivity)
            }
            launchMainResult.observe(this@SplashActivity) {
                MainActivity.launch(this@SplashActivity)
            }
            launchLoginResult.observe(this@SplashActivity) {
                LoginActivity.launch(this@SplashActivity)
            }
            performFirstSectionTask()
        }
    }
}
