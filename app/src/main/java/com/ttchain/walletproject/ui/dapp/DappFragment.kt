package com.ttchain.walletproject.ui.dapp

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import androidx.recyclerview.widget.GridLayoutManager
import com.ttchain.walletproject.ui.webview.WebViewActivity
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.ui.discovery.ExplorerDappAdapter
import kotlinx.android.synthetic.main.fragment_dapp.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DappFragment : BaseFragment() {

    companion object {
        fun newInstance() = DappFragment()
    }

    override val layoutId: Int = R.layout.fragment_dapp

    private val viewModel by viewModel<DappViewModel>()
    private val mAdapter = ExplorerDappAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        mAdapter.setOnItemClickListener {
            WebViewActivity.launch(requireActivity(), it)
        }
        swipe_layout.setOnRefreshListener {
            viewModel.getData()
        }
        swipe_layout.isEnabled = true
        val gridLayoutManager = GridLayoutManager(context, 4)
        recycler_view.layoutManager = gridLayoutManager
        recycler_view.adapter = mAdapter
    }

    private fun initData() {
        viewModel.apply {
            getDataLiveData.observe(requireActivity()) { list ->
                swipe_layout.isRefreshing = false
                mAdapter.updateData(list.toMutableList())
            }
            getData()
        }
    }
}