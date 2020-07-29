package com.ttchain.walletproject.ui.ttn.ttnrecord

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import kotlinx.android.synthetic.main.view_toolbar.*

class TtnRecordActivity : BaseActivity() {

    private val bundleValue: String? by lazy {
        intent.getStringExtra(_ID)
    }

    override val layoutId = R.layout.activity_ttn_record

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        title = ""
    }

    fun setToolbarMidTitle(title: String) {
        toolbar_mid_title.text = title
    }

    private fun initViews() {
        changeFragment(R.id.content_view, TtnRecordFragment.newInstance(bundleValue))
    }

    companion object {
        const val _ID = "_ID"

        fun launch(activity: Activity, id: String) {
            activity.startActivity(Intent(activity, TtnRecordActivity::class.java).apply {
                putExtra(_ID, id)
            })
        }
    }
}
