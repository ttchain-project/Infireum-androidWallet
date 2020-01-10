package com.ttchain.walletproject.ui.webview

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.text.TextUtils
import android.util.Base64
import android.view.KeyEvent
import android.view.View
import android.view.ViewConfiguration
import android.webkit.*
import androidx.annotation.RequiresApi
import androidx.appcompat.view.menu.MenuPopupHelper
import androidx.appcompat.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.performCopyString
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_web_view.*
import okhttp3.HttpUrl
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber
import java.io.ByteArrayInputStream

class WebViewFragment : BaseFragment() {

    companion object {

        private const val JS_PROTOCOL_CANCELLED = "cancelled"
        private const val JS_PROTOCOL_ON_SUCCESSFUL = "onSignSuccessful(%1\$s, \"%2\$s\")"
        private const val JS_PROTOCOL_ON_FAILURE = "onSignError(%1\$s, \"%2\$s\")"

        fun newInstance(url: String) = WebViewFragment().apply {
            arguments = bundleOf(WebViewActivity._URL to url)
        }
    }

    private val viewModel by viewModel<WebViewViewModel>()

    private val lock = Any()
    private var isInjected: Boolean = false
    private var jsInjectorClient: JsInjectorClient? = null
    private val bundleValue: String by lazy {
        arguments?.getString(WebViewActivity._URL, "") ?: ""
    }

    override val layoutId = R.layout.fragment_web_view

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        nav_btn.setDelayClickListener {
            if (web_view.canGoBack()) {
                web_view.goBack()
            } else {
                finishActivity()
            }
        }
        more_btn.setDelayClickListener {
            showPopupMenu(more_btn)
        }
        web_view.setOnKeyListener { v, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN) {
                val webView = v as WebView

                when (keyCode) {
                    KeyEvent.KEYCODE_BACK -> if (webView.canGoBack()) {
                        web_view.goBack()
                        return@setOnKeyListener true
                    } else {
                        finishActivity()
                    }
                }
            }

            return@setOnKeyListener false
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        destroyWebView()
        super.onDestroy()
    }

    /**
     * Wait for zoom control to fade away.
     * https://code.google.com/p/android/issues/detail?id=15694
     * http://stackoverflow.com/a/5966151/1797648
     */
    private fun destroyWebView() {
        Handler().postDelayed(
            { web_view?.destroy() }, ViewConfiguration.getZoomControlsTimeout() + 1000L
        )
    }

    private fun initData() {
        viewModel.apply {
            onViewCreateLivaData.observe(requireActivity()) {
                initWebView(it)
            }
            signTxActionLiveData.observe(requireActivity()) {
                showDappConfirmDialog(it,
                    onCancelClick = { transition ->
                        onSignCancel(transition)
                    },
                    onConfirmClick = { transition ->
                        viewModel.performGetEthNonceRequest(transition)
                    })
            }
            onSignTransactionSuccessfulLiveData.observe(requireActivity()) {
                val transaction = it[0] as Transaction
                val hex = it[1] as String
                onSignTransactionSuccessful(transaction, hex)
            }
            signPersonalMessageLiveData.observe(requireActivity()) {
                val message = it[0] as Message<Transaction>
                val msg = it[1] as String
                onShowMessageDialog(
                    "授權簽名",
                    msg,
                    getString(R.string.g_cancel),
                    {
                        onSignCancel(message.value)
                    },
                    getString(R.string.g_ok),
                    {
                        viewModel.performSignPersonalMessage(message)
                    }
                )
            }
            onSignMessageSuccessfulLiveData.observe(requireActivity()) {
                val message = it[0] as Message<Transaction>
                val hexSign = it[1] as String
                onSignMessageSuccessful(message, hexSign)
            }
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView(ethAddress: String) {
        jsInjectorClient = JsInjectorClient(context)
        jsInjectorClient?.walletAddress = Address(ethAddress)
        web_view.apply {
            settings.apply {
                javaScriptEnabled = true
                cacheMode = WebSettings.LOAD_DEFAULT
                builtInZoomControls = true
                displayZoomControls = false
                useWideViewPort = true
                loadWithOverviewMode = true
                domStorageEnabled = true
            }
            addJavascriptInterface(
                SignCallbackJSInterface(
                    web_view,
                    OnSignTransactionListener { transaction ->
                        viewModel.signTxAction(web_view, transaction)
                    },
                    OnSignPersonalMessageListener { message ->
                        viewModel.signPersonalMessage(message)
                    }), "cytonSign"
            )
            webViewClient = object : WebViewClient() {

                override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                    view.loadUrl(url)
                    return true
                }

                @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
                override fun shouldInterceptRequest(
                    view: WebView,
                    request: WebResourceRequest?
                ): WebResourceResponse? {

                    if (request == null) {
                        return null
                    }

                    if (!request.method.equals(
                            "GET",
                            ignoreCase = true
                        ) || !request.isForMainFrame
                    ) {
                        if (request.method.equals(
                                "GET",
                                ignoreCase = true
                            ) && (request.url.toString().contains(".js")
                                    || request.url.toString().contains("json")
                                    || request.url.toString().contains("css"))
                        ) {
                            synchronized(lock) {
                                if (!isInjected) {
                                    injectScriptFile(view)
                                    isInjected = true
                                }
                            }
                        }
                        super.shouldInterceptRequest(view, request)
                        return null
                    }

                    val httpUrl = HttpUrl.parse(request.url.toString()) ?: return null
                    val headers = request.requestHeaders
                    val response: JsInjectorResponse?
                    try {
                        response = jsInjectorClient?.loadUrl(httpUrl.toString(), headers)
                    } catch (ex: Exception) {
                        return null
                    }
                    return if (response == null || response.isRedirect) {
                        null
                    } else if (TextUtils.isEmpty(response.data)) {
                        null
                    } else {
                        val inputStream = ByteArrayInputStream(response.data.toByteArray())
                        val webResourceResponse = WebResourceResponse(
                            response.mime, response.charset, inputStream
                        )
                        synchronized(lock) {
                            isInjected = true
                        }
                        webResourceResponse
                    }

                }
            }
            webChromeClient = object : WebChromeClient() {
                override fun onReceivedTitle(view: WebView, title: String) {
                    title_tv?.text = title
                    url_tv?.text = web_view.url
                }

                override fun onProgressChanged(view: WebView, newProgress: Int) {
                    if (newProgress < 100) {
                        progressBar?.visibility = View.VISIBLE
                        progressBar?.progress = newProgress
                    } else if (newProgress == 100) {
                        progressBar?.visibility = View.INVISIBLE
                    }
                }
            }
            loadUrl(
                when {
                    !bundleValue.startsWith("http") ->
                        "http://$bundleValue"
                    else ->
                        bundleValue
                }
            )
        }
    }

    @SuppressLint("RestrictedApi")
    private fun showPopupMenu(menuItemView: View) {
        val popupMenu = PopupMenu(context!!, menuItemView)
        popupMenu.menuInflater.inflate(R.menu.menu_webview_popup, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
            // 控件每一个item的点击事件

            when (item.itemId) {
                R.id.refresh -> {
                    web_view.reload()
                    return@OnMenuItemClickListener true
                }
                R.id.copy -> {
                    web_view.url.performCopyString(requireContext())
                    return@OnMenuItemClickListener true
                }
                R.id.share -> {
                    val shareIntent = Intent()
                    shareIntent.action = Intent.ACTION_SEND
                    shareIntent.putExtra(Intent.EXTRA_TEXT, web_view.url)
                    shareIntent.type = "text/plain"
                    startActivity(shareIntent)
                    return@OnMenuItemClickListener true
                }
                R.id.intent -> {
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(web_view.url))
                    startActivity(browserIntent)
                    return@OnMenuItemClickListener true
                }
            }
            true
        })
        popupMenu.show()

        try {
            val field = popupMenu.javaClass.getDeclaredField("mPopup")
            field.isAccessible = true
            val helper = field.get(popupMenu) as MenuPopupHelper
            helper.setForceShowIcon(true)
        } catch (e: NoSuchFieldException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }

    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    private fun onSignCancel(transaction: Transaction) {
        val callbackId = transaction.leafPosition
        callbackToJS(callbackId, JS_PROTOCOL_ON_FAILURE, JS_PROTOCOL_CANCELLED)
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    private fun callbackToJS(callbackId: Long, function: String, param: String) {
        val callback = String.format(function, callbackId, param)
        Timber.i("test99 callback: $callback")
        web_view.post { web_view.evaluateJavascript(callback) { value -> Timber.d("test99 WEB_VIEW $value") } }
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    private fun onSignTransactionSuccessful(transaction: Transaction, signHex: String) {
        val callbackId = transaction.leafPosition
        callbackToJS(callbackId, getSuccessFunction(signHex), signHex)
    }

    private fun getSuccessFunction(param: String): String {
        //        return isJson(param) ? JS_PROTOCOL_JSON_ON_SUCCESSFUL : JS_PROTOCOL_ON_SUCCESSFUL;
        return JS_PROTOCOL_ON_SUCCESSFUL
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    private fun onSignMessageSuccessful(message: Message<*>, signHex: String) {
        val callbackId = message.leafPosition
        callbackToJS(callbackId, getSuccessFunction(signHex), signHex)
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    private fun injectScriptFile(view: WebView) {
        val js = jsInjectorClient!!.assembleJs(view.context, "%1\$s%2\$s")
        val buffer = js.toByteArray()
        val encoded = Base64.encodeToString(buffer, Base64.NO_WRAP)

        view.post {
            view.evaluateJavascript(
                "javascript:(function() {" +
                        "var parent = document.getElementsByTagName('head').item(0);" +
                        "var script = document.createElement('script');" +
                        "script.type = 'text/javascript';" +
                        // Tell the browser to BASE64-decode the string into your script !!!
                        "script.innerHTML = window.atob('" + encoded + "');" +
                        "parent.appendChild(script)" +
                        "})()", null
            )
        }
    }
}