package com.ttchain.walletproject.ui.wallet.exportkey

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ttchain.walletproject.ui.wallet.exportkey.qrcodekey.QrcodeKeyFragment
import com.ttchain.walletproject.ui.wallet.exportkey.privatekey.PrivateKeyFragment

class ExportKeyPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val fragmentList: MutableList<Fragment> = arrayListOf()

    init {
        fragmentList.apply {
            add(QrcodeKeyFragment.newInstance())
            add(PrivateKeyFragment.newInstance())
        }
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

}
