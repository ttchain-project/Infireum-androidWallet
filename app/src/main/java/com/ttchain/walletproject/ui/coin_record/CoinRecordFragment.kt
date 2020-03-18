package com.ttchain.walletproject.ui.coin_record

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.lazy
import com.ttchain.walletproject.model.CoinRecordBean
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.coin_transfer.CoinTransferActivity
import com.ttchain.walletproject.ui.receiptasset.ReceiptAssetActivity
import com.ttchain.walletproject.ui.wallet_setting.WalletSettingActivity
import kotlinx.android.synthetic.main.fragment_coin_record.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CoinRecordFragment : BaseFragment() {

    companion object {
        fun newInstance(coinId: String): CoinRecordFragment {
            return CoinRecordFragment().apply {
                arguments = bundleOf(CoinRecordActivity._ID to coinId)
            }
        }

        fun newInstance(coinId: String, walletId: Int): CoinRecordFragment {
            return CoinRecordFragment().apply {
                arguments = bundleOf(
                    CoinRecordActivity._ID to coinId,
                    CoinRecordActivity.WALLET_ID to walletId
                )
            }
        }
    }

    private val viewModel by viewModel<CoinRecordViewModel>()

    private val bundleValue: String by lazy(CoinRecordActivity._ID)

    private val bundleWalletID: Int by lazy(CoinRecordActivity.WALLET_ID)

    override val layoutId = R.layout.fragment_coin_record

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.apply {
            getCoinRecordBean(bundleValue)
        }
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
    }

    override fun initView() {
        RxBus.getInstance().register<Boolean>(RxBusTag.UPDATE_WALLET_NAME_OK)
            .subscribe {
                if (it) {
                    finishActivity()
                }
            }

        viewModel.apply {
            receipt.setDelayClickListener {
                onClickReceipt()
            }
            transfer.setDelayClickListener {
                launchCoinTransfer()
            }
//            lighten_btn.setDelayClickListener {
//                launchTtnDeposit()
//            }
            coinRecordBean.observe(viewLifecycleOwner) {
                setCoinRecordBean(it)
            }
//            showLightButton.observe(viewLifecycleOwner) {
//                if (it) showLightenBtn()
//            }
            syncTransRecordDataListFinish.observe(viewLifecycleOwner) {
                initViewPager()
            }
            launchReceiptAsset.observe(viewLifecycleOwner) {
                launchReceiptAssetActivity(it)
            }
            launchCoinTransfer.observe(viewLifecycleOwner) {
                if (it) launchCoinTransferActivity()
            }
//            launchTtnDeposit.observe(viewLifecycleOwner) {
//                if (it.isNotEmpty())
//                    launchTtnDepositActivity(it, baseMainModel.selectedWalletID)
//            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_tt_asset_list, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.wallet_setting -> {
                WalletSettingActivity.launch(requireActivity())
                return true
            }
        }
        return false
    }

    override fun onDestroyView() {
        super.onDestroyView()
        RxBus.getInstance().unregister(RxBusTag.TRANSFER_COIN_ACTION_OK)
    }

    private fun initViewPager() {
        val pagerAdapter = CoinRecordPagerAdapter(
            requireContext(), childFragmentManager, bundleValue
        )
        view_pager.apply {
            offscreenPageLimit = 4
            adapter = pagerAdapter
            currentItem = 0
        }.run {
            tab_layout.setupWithViewPager(this)
        }
    }

    private fun setCoinRecordBean(bean: CoinRecordBean) {
        requireActivity().title = bean.title
        asset_value.text = bean.coinAmount
        currency.text = bean.coinCurrency
        wallet_name_tv.text = bean.walletName
    }

    private fun launchReceiptAssetActivity(coinID: Int) {
        ReceiptAssetActivity.launch(requireActivity(), coinID)
    }

    private fun launchCoinTransferActivity() {
        CoinTransferActivity.launch(requireActivity(), bundleValue, "")
    }

    private fun showLightenBtn() {
        lighten_ly.visibility = View.VISIBLE
    }

//    private fun launchTtnDepositActivity(coinId: String, walletID: Int) {
//        TtnDepositActivity.launch(requireActivity(), coinId, walletID)
//    }
}
