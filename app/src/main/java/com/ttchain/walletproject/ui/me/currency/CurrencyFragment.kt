package com.ttchain.walletproject.ui.me.currency

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.enums.CurrencyEnum
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_currency.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyFragment : BaseFragment() {

    companion object {
        fun newInstance() = CurrencyFragment()
    }

    private val viewModel by viewModel<CurrencyViewModel>()

    override val layoutId = R.layout.fragment_currency

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        viewModel.getCurrencySelect()
        apply_btn.setDelayClickListener {
            when {
                usd_ckb.isChecked -> viewModel.onSaveClick(CurrencyEnum.USD.type)
                twd_ckb.isChecked -> viewModel.onSaveClick(CurrencyEnum.TWD.type)
                cny_ckb.isChecked -> viewModel.onSaveClick(CurrencyEnum.CNY.type)
            }
        }
        usd_container.setOnClickListener {
            setCheckBoxSelect(CurrencyEnum.USD)
        }
        twd_container.setOnClickListener {
            setCheckBoxSelect(CurrencyEnum.TWD)
        }
        cny_container.setOnClickListener {
            setCheckBoxSelect(CurrencyEnum.CNY)
        }
    }

    private fun initData() {
        viewModel.apply {
            getCurrencySelectLiveData.observe(requireActivity()) { currency ->
                when (currency) {
                    CurrencyEnum.USD.type -> usd_ckb.isChecked = true
                    CurrencyEnum.TWD.type -> twd_ckb.isChecked = true
                    CurrencyEnum.CNY.type -> cny_ckb.isChecked = true
                }
            }
            onSaveClickLiveData.observe(requireActivity()) {
                RxBus.getInstance().post(RxBusTag.CT_WALLET_REFRESH, true)
                finishActivity()
            }
        }
    }

    private fun initCheckBox() {
        usd_ckb.isChecked = false
        twd_ckb.isChecked = false
        cny_ckb.isChecked = false
    }

    private fun setCheckBoxSelect(currencyEnum: CurrencyEnum) {
        initCheckBox()
        when (currencyEnum) {
            CurrencyEnum.USD -> usd_ckb.isChecked = true
            CurrencyEnum.TWD -> twd_ckb.isChecked = true
            CurrencyEnum.CNY -> cny_ckb.isChecked = true
        }
    }
}