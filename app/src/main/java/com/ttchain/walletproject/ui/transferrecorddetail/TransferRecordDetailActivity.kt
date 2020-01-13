package com.ttchain.walletproject.ui.transferrecorddetail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.os.bundleOf
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import com.ttchain.walletproject.model.RecordBean

class TransferRecordDetailActivity : BaseActivity() {

    override val layoutId = R.layout.activity_transfer_record_detail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view,
            TransferRecordDetailFragment.newInstance(intent.getSerializableExtra(_RECORD) as RecordBean)
        )
    }

    companion object {
        const val _RECORD = "_RECORD"
        fun launch(activity: Activity, recordBean: RecordBean) {
            activity.startActivity(
                Intent(
                    activity,
                    TransferRecordDetailActivity::class.java
                ).apply {
                    putExtras(bundleOf(_RECORD to recordBean))
                })
        }
    }
}
