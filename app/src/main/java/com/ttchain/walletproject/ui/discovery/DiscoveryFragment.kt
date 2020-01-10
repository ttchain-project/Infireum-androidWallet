package com.ttchain.walletproject.ui.discovery

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.materialdialogs.MaterialDialog
import com.git4u.tt_wallet_android.rx.RxBusTag
import com.google.gson.Gson
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.ui.dapp.DappActivity
import com.ttchain.walletproject.ui.trend.TrendActivity
import com.ttchain.walletproject.ui.webview.WebViewActivity
import kotlinx.android.synthetic.main.fragment_discovery.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.ArrayList

class DiscoveryFragment : BaseFragment() {

    companion object {

        fun newInstance() = DiscoveryFragment()
    }

    private val viewModel by viewModel<DiscoveryViewModel>()
    private val mTrendAdapter = ExplorerTrendAdapter()
    private val mMediaAdapter = ExplorerDappAdapter()
    private val mDappAdapter = ExplorerDappAdapter()
    private val mBlockChainExplorerAdapter = ExplorerDappAdapter()

    override val layoutId = R.layout.fragment_discovery

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RxBus.getInstance().register<Boolean>(RxBusTag.CT_WALLET_REFRESH)
            .toMain()
            .subscribe { status ->
                if (status) {
                    viewModel.getQuotes()
                }
            }
        initView()
        initData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        RxBus.getInstance().unregister(RxBusTag.CT_WALLET_REFRESH)
    }

    override fun initView() {
        swipeLayout.setOnRefreshListener {
            swipeLayout.isRefreshing = true
            viewModel.apply {
                getQuotes()
                getNews()
            }
        }
        trend_rv.layoutManager = object : LinearLayoutManager(requireContext()) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
        trend_rv.adapter = mTrendAdapter
        trend_rv.apply {
            isNestedScrollingEnabled = false
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            adapter = mTrendAdapter
        }
        mMediaAdapter.setOnItemClickListener {
            launchQuick(it)
        }
        media_rv.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = mMediaAdapter
        }

        mDappAdapter.setOnItemClickListener {
            launchQuick(it)
        }
        dapp_rv.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = mDappAdapter
        }

        mBlockChainExplorerAdapter.setOnItemClickListener {
            launchQuick(it)
        }
        blockchain_explorer_rv.apply {
            layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            adapter = mBlockChainExplorerAdapter
        }
    }

    private fun initData() {
        val owner = this@DiscoveryFragment
        viewModel.apply {
            quotesResult.observe(owner) {
                //設定漲跌幅價格單位
                price_tv.text = getString(R.string.usd_price).format(getUserPrefFiatName())
                mTrendAdapter.updateData(it)
            }
            newsResult.observe(owner) {
                swipeLayout.isRefreshing = false
            }
//            bannerResult.observe(owner) {
//                banner.setAutoPlay(true)
//                    .setOffscreenPageLimit(it.size)
//                    //設定是否循環
//                    .setLoop(true)
//                    //設定資料和 UI function
//                    .setPages(it, CustomViewHolder().setOnBannerClickListener { bean ->
//                        launchQuick(bean.url)
//                    })
//                    //設定間隔時間
//                    .setDelayTime(5000)
//                    .start()
//            }
            mediaResult.observe(owner) {
                mMediaAdapter.updateData(it)
            }
            dappResult.observe(owner) {
                mDappAdapter.updateData(it)
            }
            blockChainExplorerResult.observe(owner) {
                mBlockChainExplorerAdapter.updateData(it)
            }
            throwableMessage.observe(owner) {
                onShowMessageDialog(it)
            }
            getNews()
        }
    }

    private fun showItemListDialog(itemName: List<String>, itemUrl: List<String>) {
        MaterialDialog.Builder(requireActivity()).items(itemName)
            .itemsCallback { _, _, position, _ ->
                launchQuick(itemUrl[position])
            }
            .show()
    }

    private fun launchQuick(url: String) {
        if (url.contains("app://")) {
            val nameList = ArrayList<String>()
            val urlList = ArrayList<String>()
            with(viewModel) {
                when (url) {
                    "app://finnews" -> {
                        for (bean in mediaResult.value.orEmpty()) {
                            nameList.add(bean.name)
                            urlList.add(bean.url)
                        }
                        showItemListDialog(nameList, urlList)
                    }
                    "app://dapp" -> {
                        DappActivity.launch(requireActivity())
                    }
                    "app://explorer" -> {
                        for (bean in blockChainExplorerResult.value.orEmpty()) {
                            nameList.add(bean.name)
                            urlList.add(bean.url)
                        }
                        showItemListDialog(nameList, urlList)
                    }
                    "app://markettool" -> {
                        TrendActivity.launch(requireActivity())
                    }
                    "app://marketmsg" -> {
                        for (bean in marketMsgResult.value.orEmpty()) {
                            nameList.add(bean.name)
                            urlList.add(bean.url)
                        }
                        showItemListDialog(nameList, urlList)
                    }
                }
            }
        } else {
            WebViewActivity.launch(requireActivity(), url)
        }
    }
}