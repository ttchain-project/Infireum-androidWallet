package com.ttchain.walletproject.ui.asset

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.CoinEntity
import com.ttchain.walletproject.model.RefreshUiDataBean
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.asset_manage.AssetManageActivity
import com.ttchain.walletproject.ui.coin_record.CoinRecordActivity
import com.ttchain.walletproject.ui.wallet_setting.WalletSettingActivity
import kotlinx.android.synthetic.main.fragment_asset_list.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class AssetListFragment : BaseRecyclerViewFragmentNew<CoinEntity>() {

    companion object {
        fun newInstance() = AssetListFragment()
    }

    private val viewModel by viewModel<AssetListViewModel>()
    override val layoutId = R.layout.fragment_asset_list
    override val recyclerViewId = R.id.recycler_view
    override val mBaseSwipeRefreshLayoutId = R.id.swipe_layout

    override fun setAdapter() = AssetListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_tt_asset_list, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.wallet_setting -> {
                viewModel.getSelectedWalletIDRx()
                return true
            }
        }
        return false
    }

    override fun initView() {
        requireActivity().title = ""
        viewModel.getSelectedWalletDataRx()
        viewModel.setTitle()
        asset_manage.setDelayClickListener {
            AssetManageActivity.launch(requireActivity())
        }
        setOnItemClickListener {
            CoinRecordActivity.launch(requireActivity(), it.data.coinId)
        }
        RxBus.getInstance().register<Boolean>(RxBusTag.UPDATE_WALLET_NAME_OK)
            .subscribe {
                if (it) {
                    finishActivity()
                }
            }
    }

    private fun initData() {
        viewModel.apply {
            getSelectedWalletIDLiveData.observe(requireActivity()) {
                WalletSettingActivity.launch(requireActivity())
            }
            getSelectedWalletDataRxLiveData.observe(requireActivity()) { walletData ->
                if (walletData.mainCoinId == CoinEnum.ETH.coinId) {
                    asset_manage_container.visibility = View.VISIBLE
                }
            }
            setTitleLiveData.observe(requireActivity()) {
                requireActivity().title = it
            }
            chainNameLiveData.observe(requireActivity()) { chainName ->
                chain_name.text = chainName.format(getString(R.string.main_chain_assets))
            }
            walletNameLiveData.observe(requireActivity()) { walletName ->
                wallet_name.text = walletName
            }
            fiatAmountLiveData.observe(requireActivity()) { fiatAmount ->
                total_fiat.text = fiatAmount
            }
            currencySymbolLiveData.observe(requireActivity()) { currencySymbol ->
                currency_symbol.text = currencySymbol
            }
            enableAssetButtonLiveData.observe(requireActivity()) { enable ->
                //            asset.setEnabled(enable)

            }
            addArrayListLiveData.observe(requireActivity()) {
                addArrayListData(it)
            }
            setListDataLiveData.observe(requireActivity()) {
                setListData(it)
            }
            isLoadMoreComplete.observe(requireActivity()) {
                if (it) loadMoreComplete()
            }
            isLoadMoreEnd.observe(requireActivity()) {
                if (it) loadMoreEnd(it)
            }
            isRefreshLoading.observe(requireActivity()) {
                if (it) {
                    showRefreshLoading()
                } else {
                    hideRefreshLoading()
                }
            }
            isLoading.observe(requireActivity()) {
                if (it) {
                    onShowLoading()
                } else {
                    onHideLoading()
                }
            }
            setEmptyMsg.observe(requireActivity()) {
                setEmptyMsg(it)
            }
            onShowMessageDialog.observe(requireActivity()) {
                onShowMessageDialog(it)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        RxBus.getInstance().register<Boolean>(RxBusTag.SET_WALLET_ID_RESULT_OK)
            .subscribe({
                if (it) {
//                    viewModel.channel.send(RefreshUiDataBean(b = true, b1 = false, b2 = true))
                    viewModel.performRefreshUiDataSubject.onNext(
                        RefreshUiDataBean(b = true, b1 = false, b2 = true)
                    )
                }
            }, {
            })
        RxBus.getInstance().register<Boolean>(RxBusTag.UPDATE_WALLET_NAME_OK)
            .subscribe({
                if (it) {
                    viewModel.performRefreshUiDataSubject.onNext(
                        RefreshUiDataBean(b = false, b1 = false, b2 = false)
                    )
                }
            }, {
            })
        RxBus.getInstance().register<Boolean>(RxBusTag.ASSET_FRAGMENT_FINISH)
            .subscribe({
                if (it) {
                    viewModel.performRefreshUiDataSubject.onNext(
                        RefreshUiDataBean(b = true, b1 = false, b2 = true)
                    )
                }
            }, {
            })
        viewModel.apply {
            addSubscribe()
            performRefreshUiDataSubject.onNext(
                RefreshUiDataBean(b = true, b1 = false, b2 = true)
            )
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.apply {
            if (getSettingChanged()) {
                performRefreshUiDataSubject.onNext(
                    RefreshUiDataBean(b = false, b1 = false, b2 = false)
                )
                setSettingChangedPerformTaskFinish()
            }
        }
    }

    override fun onRefresh() {
        viewModel.refreshRequest()
    }

}