package com.ttchain.walletproject

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ttchain.walletproject.enums.BottomTabState
import com.ttchain.walletproject.ui.discovery.DiscoveryFragment
import com.ttchain.walletproject.ui.me.MeFragment
import com.ttchain.walletproject.ui.wallet.WalletMainFragment

class MainPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            BottomTabState.WALLET.position -> WalletMainFragment.newInstance()
            BottomTabState.EXPLORER.position -> DiscoveryFragment.newInstance()
            BottomTabState.ME.position -> MeFragment.newInstance()
            else -> WalletMainFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}
