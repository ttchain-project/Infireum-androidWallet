package com.ttchain.walletproject

import android.os.Bundle
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.enums.BottomTabState
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : BaseActivity() {

    override val layoutId = R.layout.main_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    override fun onResume() {
        super.onResume()
        bottomTabView.setItemClick(BottomTabState.WALLET)
    }

    private fun initView() {
        val mainPagerAdapter = MainPagerAdapter(supportFragmentManager)
        view_pager.apply {
            setSwipeable(false)
            offscreenPageLimit = mainPagerAdapter.count
            adapter = mainPagerAdapter
        }
        bottomTabView.setOnItemClickListener {bottomTabStatus ->
            view_pager.currentItem = when (bottomTabStatus) {
                BottomTabState.WALLET -> 0
                BottomTabState.EXPLORER -> 3
                BottomTabState.ME -> 4
            }
            bottomTabView.setTabPosition(bottomTabStatus)
        }
    }
}
