package com.ttchain.walletproject.ui.me.languagesetting

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class LanguageSettingActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_language_setting

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.setting_language)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, LanguageSettingFragment.newInstance())
    }

    companion object {
        fun launch(activity: Activity) {
            val intent = Intent(activity, LanguageSettingActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
