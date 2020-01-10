package com.ttchain.walletproject.ui.wallet.exportkey

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import android.widget.TextView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_export_key.*

class ExportKeyFragment : BaseFragment() {

    companion object {
        fun newInstance() = ExportKeyFragment()
    }

    override val layoutId = R.layout.fragment_export_key

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    @SuppressLint("InflateParams")
    override fun initView() {
        requireActivity().title = getString(R.string.export_private_key)
        val adapter = ExportKeyPagerAdapter(childFragmentManager)
        view_pager.adapter = adapter
        tab_layout.setupWithViewPager(view_pager)
        val tabLeft = tab_layout.getTabAt(0)
        if (tabLeft != null) {
            val mInflater = LayoutInflater.from(context)
            val viewLeft = mInflater.inflate(R.layout.tab_green_left, null)
            viewLeft.layoutParams = TableLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            val tv = viewLeft.findViewById<View>(R.id.text) as TextView
            tv.text = getText(R.string.export_private_key_qrcode)
            tabLeft.customView = viewLeft
        }
        val tabRight = tab_layout.getTabAt(1)
        if (tabRight != null) {
            val mInflater = LayoutInflater.from(context)
            val viewRight = mInflater.inflate(R.layout.tab_green_right, null)
            viewRight.layoutParams = TableLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            val tv = viewRight.findViewById<View>(R.id.text) as TextView
            tv.text = getText(R.string.export_private_key_pky)
            tabRight.customView = viewRight
        }
    }

    private fun initData() {

    }
}