package com.ttchain.walletproject.ui.ttn.ttndetail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import kotlinx.android.synthetic.main.view_toolbar.*

class TtnDetailActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_ttn_detail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        toolbar?.setBackgroundColor(ContextCompat.getColor(this, R.color._2C3C4E))
        title = ""
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view,
            TtnDetailFragment.newInstance(intent.getStringExtra(_ID) ?: "")
        )
    }

    fun setToolbarMidTitle(title: String) {
        toolbar_mid_title.text = title
    }

    companion object {
        const val _ID = "_ID"

        fun launch(activity: Activity, id: String) {
            activity.startActivity(Intent(activity, TtnDetailActivity::class.java).apply {
                putExtra(_ID, id)
            })
        }
    }
}
