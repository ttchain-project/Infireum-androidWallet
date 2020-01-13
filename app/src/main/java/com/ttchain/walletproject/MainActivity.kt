package com.ttchain.walletproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.enums.BottomTabState
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : BaseActivity() {

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }
    }

    override val layoutId = R.layout.main_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        val mainPagerAdapter = MainPagerAdapter(supportFragmentManager)
        view_pager.apply {
            setSwipeable(false)
            offscreenPageLimit = mainPagerAdapter.count
            adapter = mainPagerAdapter
        }
        bottomTabView.setOnItemClickListener { bottomTabStatus ->
            view_pager.currentItem = when (bottomTabStatus) {
                BottomTabState.WALLET -> 0
                BottomTabState.EXPLORER -> 1
                BottomTabState.ME -> 2
            }
            bottomTabView.setTabPosition(bottomTabStatus)
        }
        bottomTabView.setItemClick(BottomTabState.WALLET)
    }
}
