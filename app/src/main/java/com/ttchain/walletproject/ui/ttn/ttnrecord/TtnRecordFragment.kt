package com.ttchain.walletproject.ui.ttn.ttnrecord

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.ui.coin_record.CoinRecordPagerAdapter
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.enums.CoinEnum
import kotlinx.android.synthetic.main.fragment_ttn_record.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TtnRecordFragment : BaseFragment() {

    companion object {
        fun newInstance(id: String) = TtnRecordFragment().apply {
            arguments = bundleOf(TtnRecordActivity._ID to id)
        }
    }

    private val viewModel by viewModel<TtnRecordViewModel>()
    private val bundleValue: String by lazy {
        arguments?.getString(TtnRecordActivity._ID, "") ?: ""
    }

    override val layoutId = R.layout.fragment_ttn_record

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        viewModel.apply {
            setCoinIdData(bundleValue)
            performGetApiTtnTransactionRecordDataList()
        }
    }

    private fun initData() {
        viewModel.apply {
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
            setCoinIdDataLiveData.observe(requireActivity()) {
                (requireActivity() as TtnRecordActivity).setToolbarMidTitle(it.displayName)
            }
            performGetApiTtnTransactionRecordDataListLiveData.observe(requireActivity()) {
                initViewPager()
                val itemList = it.transactions
                if (itemList != null && itemList.isNotEmpty()) {
                    resultTtnResponseBeanList.addAll(itemList)
                }
                if (resultTtnResponseBeanList.isNotEmpty()) {
                    performSyncTtnTransRecordDataList(resultTtnResponseBeanList)
                } else {
                    initViewPager()
                }
            }
            performGetApiTtnTransactionRecordDataErrorListLiveData.observe(requireActivity()) {
                onHideLoading()
                onShowMessageDialog(it.message ?: "")
                initViewPager()
            }
            performSyncTtnTransRecordDataListErrorLiveData.observe(requireActivity()) {
                onHideLoading()
                onShowMessageDialog(it.message ?: "")
                initViewPager()
            }
        }
    }

    private fun initViewPager() {
        val coinRecordPagerAdapter = CoinRecordPagerAdapter(
            requireContext(), childFragmentManager, bundleValue
        )
        tab_container.visibility = View.VISIBLE
        tab_layout.setupWithViewPager(view_pager.apply {
            offscreenPageLimit = 4
            adapter = coinRecordPagerAdapter
            currentItem = 0
        })
    }
}