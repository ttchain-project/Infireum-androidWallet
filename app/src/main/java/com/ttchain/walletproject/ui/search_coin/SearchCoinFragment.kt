package com.ttchain.walletproject.ui.search_coin

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew
import com.ttchain.walletproject.model.CoinEntity
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.rx.RxBusTag
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchCoinFragment : BaseRecyclerViewFragmentNew<CoinEntity>() {

    companion object {
        fun newInstance() = SearchCoinFragment()
    }

    private val viewModel by viewModel<SearchCoinViewModel>()
    private val mAdapter = SearchCoinAdapter()

    private var searchView: SearchView? = null

    override val recyclerViewId = R.id.recycler_view
    override val mBaseSwipeRefreshLayoutId = R.id.swipe_layout
    override fun setAdapter() = mAdapter
    override val layoutId = R.layout.fragment_search_coin

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().post(RxBusTag.SEARCH_COIN_FRAGMENT_FINISH, true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search, menu)
        val searchItem = menu.findItem(R.id.search)
        if (searchItem != null) {
            searchItem.expandActionView()
            searchItem.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
                override fun onMenuItemActionExpand(menuItem: MenuItem): Boolean {
                    return false
                }

                override fun onMenuItemActionCollapse(menuItem: MenuItem): Boolean {
                    if (searchView != null) {
                        searchView?.clearFocus()
                    }
                    finishActivity()
                    return false
                }
            })

            searchView = searchItem.actionView as SearchView
            if (searchView != null) {
                searchView?.isIconified = false
                searchView?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(query: String): Boolean {
                        viewModel.onMenuSearchSubmit(query)
                        if (searchView != null) {
                            searchView!!.clearFocus()
                        }
                        return true
                    }

                    override fun onQueryTextChange(newText: String): Boolean {
                        return false
                    }
                })
            }
        }
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun initView() {
        mAdapter.setOnSearchCoinListener { coinId, isAdded ->
            viewModel.onClickCoinAction(coinId, isAdded)
        }
    }

    private fun initData() {
        viewModel.apply {
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