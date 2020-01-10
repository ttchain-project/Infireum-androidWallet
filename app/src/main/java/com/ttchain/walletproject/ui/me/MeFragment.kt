package com.ttchain.walletproject.ui.me

import android.os.Bundle
import android.view.View
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MeFragment : BaseFragment() {

    companion object {
        fun newInstance() = MeFragment()
    }

    private val viewModel by viewModel<MeViewModel>()

    override val layoutId = R.layout.fragment_setting

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
    }

    private fun initData() {

    }
}