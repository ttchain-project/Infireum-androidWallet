package com.ttchain.walletproject.ui.agreement

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.enums.AgreementEnum
import com.ttchain.walletproject.html
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.activity_agreement.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class AgreementActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_agreement

    companion object {

        const val _ID = "_ID"
        const val REQUEST_CODE = 210
        const val RESULT_DATA = "RESULT_DATA"

        fun launchForResult(activity: Activity, id: Int) {
            activity.startActivityForResult(Intent(activity, AgreementActivity::class.java).apply {
                putExtra(_ID, id)
            }, REQUEST_CODE)
        }
    }

    private val bundleValue: Int
        get() = intent.getIntExtra(_ID, -1)

    private val viewModel by viewModel<AgreementViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initData()
    }

    private fun initViews() {
        agree.setOnClickListener {
            setResult(Activity.RESULT_OK, Intent().apply {
                putExtra(RESULT_DATA, true)
            })
            finishActivity()
        }
        deny.setDelayClickListener {
            setResult(Activity.RESULT_OK, Intent().apply {
                putExtra(RESULT_DATA, false)
            })
            finishActivity()
        }

    }

    private fun initData() {
        viewModel.apply {
            getDataLiveData.observe(this@AgreementActivity) { response ->
                var content = ""
                when (bundleValue) {
                    AgreementEnum.AGREEMENT.type -> content =
                        response.settingd?.get(0)?.content.orEmpty().replace("\n", "\n\n")
                    AgreementEnum.ABOUT.type -> content =
                        response.settingd?.get(1)?.content.orEmpty()
                    AgreementEnum.HELP.type -> content =
                        response.settingd?.get(2)?.content.orEmpty()
                }
                updateContent(content)
            }
            getDataErrorLivaData.observe(this@AgreementActivity) {
                content.html(it)
            }
            getData()
        }
    }

    private fun updateContent(s: String) {
        content.text = s
    }
}
