package com.ttchain.walletproject.ui.wallet.wallet_list

import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.git4u.tt_wallet_android.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.ui.asset.AssetListActivity
import com.ttchain.walletproject.ui.coin_record.CoinRecordActivity
import com.ttchain.walletproject.ui.ttn.ttndetail.TtnDetailActivity
import kotlinx.android.synthetic.main.fragment_wallet_list.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class WalletListFragment : BaseFragment() {

    companion object {
        const val _ID = "_ID"
        const val MAIN_COIN = 0
        const val STABLE_COIN = 1

        fun newInstance(): WalletListFragment {
            return WalletListFragment()
        }

        fun newInstance(id: Int) = WalletListFragment().apply {
            arguments = bundleOf(_ID to id)
        }
    }


    private var walletId = 0
    private val mAdapter = WalletExpandableListAdapter()

    private val viewModel by viewModel<WalletListViewModel>()

    override val layoutId = R.layout.fragment_wallet_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RxBus.getInstance().register<Boolean>(RxBusTag.CT_WALLET_REFRESH)
            .toMain()
            .subscribe { status ->
                if (status) {
                    viewModel.getRateAndWalletData()
                }
            }
        RxBus.getInstance().register<Boolean>(RxBusTag.UPDATE_WALLET_NAME_OK)
            .subscribe { status ->
                if (status) {
                    viewModel.getRateAndWalletData()
                }
            }
        initView()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().unregister(RxBusTag.CT_WALLET_REFRESH)
        RxBus.getInstance().unregister(RxBusTag.UPDATE_WALLET_NAME_OK)
    }

    override fun initView() {
        val coinType = arguments?.getInt(_ID, -1) ?: -1
        if (coinType == MAIN_COIN) {
            viewModel.onClickMainChain()
        } else if (coinType == STABLE_COIN) {
            viewModel.onClickStableCoin()
        }
        expandable_list.apply {
            setOnScrollListener(object : AbsListView.OnScrollListener {
                override fun onScrollStateChanged(view: AbsListView, scrollState: Int) {

                }

                override fun onScroll(
                    view: AbsListView,
                    firstVisibleItem: Int,
                    visibleItemCount: Int,
                    totalItemCount: Int
                ) {
                    val topRowVerticalPosition = if (childCount == 0) 0 else getChildAt(0).top
                    swipe_layout.isEnabled = firstVisibleItem == 0 && topRowVerticalPosition >= 0
                }
            })
            isNestedScrollingEnabled = false
            setAdapter(mAdapter)
            setGroupIndicator(null)
            setOnGroupClickListener { parent, _, groupPosition, _ ->
                val groupExpanded = parent.isGroupExpanded(groupPosition)
                mAdapter.setIndicatorState(groupPosition, groupExpanded)
                false
            }
        }
        mAdapter.setOnClickListener { groupData, groupPosition, childPosition ->
            walletId = groupData.walletID
            viewModel.launchAssetListActivity(groupData, childPosition)
        }
        swipe_layout.setOnRefreshListener {
            swipe_layout.isRefreshing = true
            viewModel.getRateAndWalletData()
        }
    }

    private fun initData() {
        viewModel.apply {
            getRateAndWalletDataErrorLiveData.observe(this@WalletListFragment) {
                if (it) {
                    swipe_layout.isRefreshing = false
                }
            }
            isLoading.observe(this@WalletListFragment) {
                if (it) onShowLoading() else onHideLoading()
            }
            throwableMessage.observe(this@WalletListFragment) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            mainDataLiveData.observe(this@WalletListFragment) {
                mAdapter.updateData(it)
                swipe_layout.isRefreshing = false
            }
            totalAssetAmountLiveData.observe(this@WalletListFragment) {
                total_amount_tv.text = it
            }
            fiatNameLiveData.observe(requireActivity()) {
                currency_symbol_tv.text = it
            }
            launchAssetListActivityLiveData.observe(this@WalletListFragment) {
                if (it)
                    AssetListActivity.launch(requireActivity())
            }
            launchCoinRecordLiveData.observe(this@WalletListFragment) {
                CoinRecordActivity.launch(requireActivity(), it, walletId)
            }
            launchTtnCoinRecordLiveData.observe(this@WalletListFragment) {
                TtnDetailActivity.launch(requireActivity(), it)
            }
        }
    }
}