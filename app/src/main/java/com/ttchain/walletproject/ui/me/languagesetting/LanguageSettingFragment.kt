package com.ttchain.walletproject.ui.me.languagesetting

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.dialog.WarningDialog
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_language_setting.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class LanguageSettingFragment : BaseFragment() {

    companion object {
        fun newInstance() = LanguageSettingFragment()
    }

    private val viewModel by viewModel<LanguageSettingViewModel>()

    override val layoutId = R.layout.fragment_language_setting

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        viewModel.getPrefLanguage()
        apply_btn.setDelayClickListener {
            showWarnDialog()
        }
        zh_tw_container.setOnClickListener {
            setCheckBoxSelect(Locale.TAIWAN)
        }
        zh_cn_container.setOnClickListener {
            setCheckBoxSelect(Locale.CHINA)
        }
        en_container.setOnClickListener {
            setCheckBoxSelect(Locale.ENGLISH)
        }
    }

    private fun initData() {
        viewModel.apply {
            getPrefLanguageLiveData.observe(requireActivity()) { prefLocale ->
                setCheckBoxSelect(prefLocale)
            }
            setPrefLanguageLiveData.observe(requireActivity()) { status ->
                if (status) {
                    restartApplication()
                }
            }
        }
    }

    private fun showWarnDialog() {
        val warningDialog = WarningDialog()
            .setTitle(getString(R.string.app_restart_title))
            .setContent(getString(R.string.app_restart_message))
            .setBtnText(getString(R.string.g_confirm), getString(R.string.g_cancel))
            .setRightBtnRedBg()
            .setOnRightClickListener {
                viewModel.setPrefLanguage(
                    when {
                        zh_tw_ckb.isChecked -> Locale.TAIWAN
                        zh_cn_ckb.isChecked -> Locale.CHINA
                        en_ckb.isChecked -> Locale.ENGLISH
                        else -> Locale.ENGLISH
                    }
                )
            }
            .setOnLeftClickListener { }
        childFragmentManager.addDialog(warningDialog, WarningDialog::class.java.simpleName)
    }

    private fun initCheckBox() {
        zh_tw_ckb?.isChecked = false
        zh_cn_ckb?.isChecked = false
        en_ckb?.isChecked = false
    }

    private fun setCheckBoxSelect(prefLocale: Locale) {
        initCheckBox()
        when (prefLocale) {
            Locale.TAIWAN -> zh_tw_ckb?.isChecked = true
            Locale.CHINA -> zh_cn_ckb?.isChecked = true
            Locale.ENGLISH -> en_ckb?.isChecked = true
        }
    }
}