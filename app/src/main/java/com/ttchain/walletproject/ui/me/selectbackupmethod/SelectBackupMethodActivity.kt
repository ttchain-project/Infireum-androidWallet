package com.ttchain.walletproject.ui.me.selectbackupmethod

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class SelectBackupMethodActivity : BaseActivity() {

    override val layoutId: Int
        get() =  R.layout.activity_select_backup_method

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeFragment(R.id.content_view, SelectBackupMethodFragment.newInstance())
    }

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, SelectBackupMethodActivity::class.java))
        }
    }
}
