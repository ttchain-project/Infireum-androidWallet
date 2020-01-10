package com.ttchain.walletproject.ui.me

import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MeFragment : BaseFragment() {

    companion object {
        fun newInstance() = MeFragment()
    }

    private val viewModel by viewModel<MeViewModel>()

    override val layoutId = R.layout.fragment_setting

    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}