package com.ttchain.walletproject.ui.asset_manage

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew
import com.ttchain.walletproject.enums.ManageBeanIdType
import com.ttchain.walletproject.model.CoinEntity
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.ui.search_coin.SearchCoinActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class AssetManageFragment : BaseRecyclerViewFragmentNew<CoinEntity>() {

    companion object {
        fun newInstance() = AssetManageFragment()
    }

    private val viewModel by viewModel<AssetManageViewModel>()
    private val mAdapter = AssetManageAdapter()
    private var menuTypeId = ManageBeanIdType.DEFAULT.type

    override val recyclerViewId = R.id.recycler_view
    override val mBaseSwipeRefreshLayoutId = R.id.swipe_layout

    override fun setAdapter() = mAdapter

    override val layoutId = R.layout.fragment_asset_manage

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun isEnableRefresh() = false

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().post(RxBusTag.ASSET_FRAGMENT_FINISH, true)
        RxBus.getInstance().unregister(RxBusTag.SEARCH_COIN_FRAGMENT_FINISH)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        inflater.inflate(R.menu.menu_asset_manage, menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.clear()
        val inflater = requireActivity().menuInflater
        if (menuTypeId == ManageBeanIdType.REMOVE.type) {
            inflater.inflate(R.menu.menu_finish, menu)
        } else {
            inflater.inflate(R.menu.menu_asset_manage, menu)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.finish -> {
                viewModel.onClickMenuDeleteFinish()
                return true
            }
            R.id.search -> {
                SearchCoinActivity.launch(requireActivity())
                return true
            }
            else -> {
            }
        }
        return false
    }

    override fun initView() {
        requireActivity().title = getString(R.string.add_and_manage_asset)

        RxBus.getInstance().register<Boolean>(RxBusTag.SEARCH_COIN_FRAGMENT_FINISH)
            .subscribe { s ->
                if (s) {
                    viewModel.requestData()
                }
            }
        viewModel.requestData()
        mAdapter.apply {
            setOnCheckedCoinSelectionListener { coinSelectedId, selected ->
                viewModel.updateCoinSelectionSelected(coinSelectedId, selected)
            }
            setOnDeletedCoinSelectionListener { coinSelectedId ->
                viewModel.deleteCoinSelectionData(coinSelectedId)
            }
        }
    }

    private fun initData() {
        viewModel.apply {
            setMenuTypeIdLiveData.observe(requireActivity()) { typeId ->
                menuTypeId = typeId
            }
            updateMenuItemLiveData.observe(requireActivity()) {
                if (it) requireActivity().invalidateOptionsMenu()
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

    override fun onRefresh() {

    }
}