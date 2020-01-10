package com.ttchain.walletproject.ui.trend

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_trend.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TrendFragment : BaseFragment() {

    companion object {
        fun newInstance() = TrendFragment()
    }

    override val layoutId = R.layout.fragment_trend

    private val viewModel by viewModel<TrendViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }


    @SuppressLint("SetJavaScriptEnabled")
    override fun initView() {
        val webSettings = web_view.settings
        webSettings.javaScriptEnabled = true
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false

        web_view.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        web_view.webChromeClient = object : WebChromeClient() {


            override fun onReceivedTitle(view: WebView, title: String) {
                requireActivity().title = title
            }


            override fun onProgressChanged(view: WebView, newProgress: Int) {
                if (newProgress < 100) {
                    val progress = "$newProgress%"
                    //                    loading.setText(progress);
                } else if (newProgress == 100) {
                    val progress = "$newProgress%"
                    //                    loading.setText(progress);
                }
            }
        }
    }

    private fun initData() {
        viewModel.apply {
            getDataLiveData.observe(requireActivity()) { html ->
                web_view.loadData(html, "text/html", "UTF-8")
            }
            getData()
        }
    }

}