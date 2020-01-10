package com.ttchain.walletproject.ui.wallet

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ttchain.walletproject.R
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListFragment
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListFragment.Companion.MAIN_COIN
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListFragment.Companion.STABLE_COIN

class WalletMainPagerAdapter (private val mContext: Context, fm: FragmentManager) :
    FragmentPagerAdapter(
        fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {
    private val fragmentList: MutableList<Fragment> = arrayListOf()

    init {
        fragmentList.apply {
            add(WalletListFragment.newInstance(MAIN_COIN))
            add(WalletListFragment.newInstance(STABLE_COIN))
        }
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> mContext.getString(R.string.tab_main_coin)
            1 -> mContext.getString(R.string.tab_stable_coin)
            else -> ""
        }
    }
}