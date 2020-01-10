package com.ttchain.walletproject.ui.me.commonaddress

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.git4u.tt_wallet_android.rx.RxBusTag
import com.ttchain.walletproject.ui.me.commonaddress.operation_new.OperationCommAddressActivity
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew
import com.ttchain.walletproject.model.AddressEntity
import com.ttchain.walletproject.rx.RxBus
import kotlinx.android.synthetic.main.fragment_common_address.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CommonAddressFragment : BaseRecyclerViewFragmentNew<AddressEntity>() {

    override val recyclerViewId = R.id.recycler_view

    override val mBaseSwipeRefreshLayoutId = R.id.swipe_layout

    override fun setAdapter() = CommonAddressAdapter()

    override fun onRefresh() {
        viewModel.refreshRequest()
    }

    companion object {
        fun newInstance(isPicker: Boolean) = CommonAddressFragment().apply {
            arguments = bundleOf(CommonAddressActivity._ID to isPicker)
        }
    }

    private val viewModel by viewModel<CommonAddressViewModel>()

    override val layoutId = R.layout.fragment_common_address

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().unregister(RxBusTag.COMMON_ADDRESS_FINISH)
    }

    override fun initView() {
        requireActivity().title = getString(R.string.common_address)
        RxBus.getInstance().register<Any>(RxBusTag.COMMON_ADDRESS_FINISH)
            .subscribe { viewModel.getAddressList() }
        viewModel.isPicker = arguments?.getBoolean(CommonAddressActivity._ID, false) ?: false
        swipe_layout.apply {
            setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light
            )
        }
        setOnItemClickListener { item ->
            if (viewModel.isPicker) {
                RxBus.getInstance().post(RxBusTag.SELECT_ADDRESS_OK, item.data.address)
                finishActivity()
            } else {
                OperationCommAddressActivity.launch(
                    requireActivity(),
                    item.data.addressID,
                    item.data.address
                )
            }
        }
    }

    private fun initData() {
        viewModel.apply {
            getAddressList()
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

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_add, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add -> {
                launchOperationCommAddressActivity(-1)
                return true
            }
        }
        return false
    }

    private fun launchOperationCommAddressActivity(addressID: Int) {
        OperationCommAddressActivity.launch(requireActivity(), addressID, "")
    }

}