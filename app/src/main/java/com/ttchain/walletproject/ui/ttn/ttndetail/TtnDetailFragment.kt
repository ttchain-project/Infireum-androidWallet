package com.ttchain.walletproject.ui.ttn.ttndetail

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.App.Companion.DEFAULT_AMOUNT
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.handleAmount
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.ttn.ttnreceipt.TtnReceiptAssetActivity
import com.ttchain.walletproject.ui.ttn.ttnrecord.TtnRecordActivity
import com.ttchain.walletproject.ui.ttn.ttntransfer.TtnTransferActivity
import kotlinx.android.synthetic.main.fragment_ttn_detail.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TtnDetailFragment : BaseFragment() {

    companion object {
        fun newInstance(id: String) = TtnDetailFragment().apply {
            arguments = bundleOf(TtnDetailActivity._ID to id)
        }
    }

    private val viewModel by viewModel<TtnDetailViewModel>()

    private val bundleValue: String by lazy {
        arguments?.getString(TtnDetailActivity._ID, "") ?: ""
    }

    override val layoutId = R.layout.fragment_ttn_detail

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun initView() {
        swipe_layout.setOnRefreshListener {
            viewModel.getRateAndBalance()
        }
        swipe_layout.isEnabled = true
        ttn_transfer_btn.setDelayClickListener {
            TtnTransferActivity.launch(requireActivity(), bundleValue)
        }
        ttn_receipt_btn.setDelayClickListener {
            TtnReceiptAssetActivity.launch(requireActivity())
        }
        ttn_record_btn.setDelayClickListener {
            TtnRecordActivity.launch(requireActivity(), bundleValue)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_tt_asset_list, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.wallet_setting -> {
                return true
            }
        }
        return false
    }

    private fun initData() {
        viewModel.apply {
            setCoinId(bundleValue)
            throwableMessage.observe(requireActivity()) {
                onShowMessageDialog(it)
            }
            getBalanceLiveData.observe(requireActivity()) { response ->
                swipe_layout.isRefreshing = false
                var amount = DEFAULT_AMOUNT
                var fiat = "≈$fiatIcon $DEFAULT_AMOUNT"
                when (coinId) {
                    CoinEnum.TTN.coinId -> when {
                        response.balance.isNotEmpty() -> {
                            amount = response.balance.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.BTCN.coinId -> when {
                        response.token != null && response.token.btcn.isNotEmpty() -> {
                            amount = response.token.btcn.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.ETHN.coinId -> when {
                        response.token != null && response.token.ethn.isNotEmpty() -> {
                            amount = response.token.ethn.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.USDTN.coinId -> when {
                        response.token != null && response.token.usdtn.isNotEmpty() -> {
                            amount = response.token.usdtn.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.EXR.coinId -> when {
                        response.token != null && response.token.exr.isNotEmpty() -> {
                            amount = response.token.exr.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.MCC.coinId -> when {
                        response.token != null && response.token.mcc.isNotEmpty() -> {
                            amount = response.token.mcc.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.DAI1.coinId -> when {
                        response.token != null && response.token.dai1.isNotEmpty() -> {
                            amount = response.token.dai1.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                    CoinEnum.TUSD1.coinId -> when {
                        response.token != null && response.token.tusd1.isNotEmpty() -> {
                            amount = response.token.tusd1.handleAmount(coinId)
                            fiat = viewModel.getFiat(coinId, amount)
                        }
                    }
                }
                showAmount(amount)
                showFiat(fiat)
            }
        }
    }

    private fun showFiat(fiat: String) {
        fiat_tv.text = fiat
    }

    private fun showAmount(ttnAmount: String) {
        amount_tv.text = ttnAmount
    }

    private fun setCoinId(bundleValue: String) {
        viewModel.coinId = bundleValue
        val coinName = viewModel.getCoinDataByCoinId(bundleValue).displayName
        when (viewModel.coinId) {
            CoinEnum.TTN.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.ic_launcher_round
            )
            CoinEnum.BTCN.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.wallet_ttchain_btc
            )
            CoinEnum.ETHN.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.wallet_ttchain_eth
            )
            CoinEnum.USDTN.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.wallet_ttchain_usdt
            )
            CoinEnum.EXR.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.exr
            )
            CoinEnum.MCC.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.icon_mcc_big
            )
            CoinEnum.DAI1.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.icon_dai_big
            )
            CoinEnum.TUSD1.coinId -> setTitleAndIcon(
                coinName,
                R.mipmap.icon_tusd_big
            )
            else -> setTitleAndIcon(
                "",
                R.mipmap.icon_list_noimage
            )
        }
    }

    private fun setTitleAndIcon(title: String, imageResource: Int) {
        (requireActivity() as TtnDetailActivity).setToolbarMidTitle(title)
        coin_name_tv.text = title
        icon_iv.setImageResource(imageResource)
    }
}