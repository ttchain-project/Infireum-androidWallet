package com.ttchain.walletproject.ui.coin_record.list

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecordAdapter
import com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew
import com.ttchain.walletproject.model.CoinRecordListBean
import com.ttchain.walletproject.model.RecordEntity
import com.ttchain.walletproject.ui.webview.WebViewActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class CoinRecordListFragment : BaseRecyclerViewFragmentNew<RecordEntity>() {

    companion object {
        const val _ID = "_ID"
        const val _BEAN = "_BEAN"
        const val _TYPE = "_TYPE"

        fun newInstance(bean: CoinRecordListBean) = CoinRecordListFragment().apply {
            arguments = bundleOf(_BEAN to bean)
        }
    }

    private val viewModel by viewModel<CoinRecordListViewModel>()
    private val bundleValueBean: CoinRecordListBean by lazy {
        arguments?.getSerializable(_BEAN) as CoinRecordListBean
    }

    override val recyclerViewId = R.id.recycler_view
    override val mBaseSwipeRefreshLayoutId = R.id.swipe_layout
    override fun setAdapter() = CoinRecordListAdapter()
    override val layoutId = R.layout.fragment_coin_record_list

    override fun isEnableRefresh(): Boolean {
        return false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        viewModel.setBean(bundleValueBean)
        viewModel.onViewCreate()
        if (mBaseAdapter is BaseRecordAdapter) {
            (mBaseAdapter as BaseRecordAdapter).onClickDetailListener =
                object : BaseRecordAdapter.OnClickDetailListener {
                    override fun onClickDetail(superLink: String) {
                        viewModel.onClickDetail(superLink)
                    }
                }
        }
        setOnItemClickListener {
//            TransferRecordDetailActivity.launch(requireActivity(), it.data)
        }
    }

    private fun initData() {
        viewModel.apply {
            launchUrlLivaData.observe(requireActivity()) {
                WebViewActivity.launch(requireActivity(), it)
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