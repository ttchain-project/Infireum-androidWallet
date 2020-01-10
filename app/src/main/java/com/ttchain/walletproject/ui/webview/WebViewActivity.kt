package com.ttchain.walletproject.ui.webview

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class WebViewActivity : BaseActivity() {

    val TAG = javaClass.simpleName

    override val layoutId: Int
        get() = R.layout.activity_web_view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view,
            WebViewFragment.newInstance(intent.getStringExtra(_URL) ?: "")
        )
    }

    companion object {

        val _URL = "_URL"

        fun launch(activity: Activity, url: String) {
            activity.startActivity(Intent(activity, WebViewActivity::class.java).apply {
                putExtra(_URL, url)
            })
        }
    }
}
