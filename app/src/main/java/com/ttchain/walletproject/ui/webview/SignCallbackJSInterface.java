package com.ttchain.walletproject.ui.webview;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.ttchain.walletproject.utils.NumberUtils;


public class SignCallbackJSInterface {

    private final WebView webView;
    private final OnSignTransactionListener onSignTransactionListener;
    private final OnSignPersonalMessageListener onSignPersonalMessageListener;

    public SignCallbackJSInterface(
            WebView webView,
            OnSignTransactionListener onSignTransactionListener,
            OnSignPersonalMessageListener onSignPersonalMessageListener) {
        this.webView = webView;
        this.onSignTransactionListener = onSignTransactionListener;
        this.onSignPersonalMessageListener = onSignPersonalMessageListener;
    }

    @JavascriptInterface
    public void signTransaction(
            int callbackId,
            String recipient,
            String value,
            String nonce,
            String gasLimit,    // quota
            String gasPrice,    // validUntilBlock
            String data,
            String chainId,
            String version,
            String chainType) {
        Log.i("test99", "signTransaction");
        Transaction transaction = new Transaction(
                TextUtils.isEmpty(recipient) ? Address.EMPTY : new Address(recipient),
                null,
                value,
                gasLimit,
                gasPrice,
                NumberUtils.INSTANCE.hexToLong(nonce, -1),
                data,
                NumberUtils.INSTANCE.hexToLong(chainId, -1),
                NumberUtils.INSTANCE.hexToInteger(version, 0),
                chainType,
                callbackId);
        onSignTransactionListener.onSignTransaction(transaction);
    }

    @JavascriptInterface
    public void signMessage(int callbackId, String data, String chainType) {
        Log.i("test99", "signMessage");
//        Transaction transaction = new Transaction(data, chainType);
//        webView.post(() -> onSignMessageListener.onSignMessage(new Message<>(transaction, getUrl(), callbackId)));
    }

    @JavascriptInterface
    public void signPersonalMessage(int callbackId, String data, String chainType) {
        Log.i("test99", "signPersonalMessage");
        Transaction transaction = new Transaction(data, chainType);
//        webView.post(() -> onSignPersonalMessageListener.onSignPersonalMessage(
//                new Message<>(transaction, getUrl(), callbackId)));
        String url = getUrl();
        Message message = new Message<>(transaction, url, callbackId);
        onSignPersonalMessageListener.onSignPersonalMessage(message);
    }

    @JavascriptInterface
    public void signTypedMessage(int callbackId, String data) {
        Log.i("test99", "signTypedMessage");
//        webView.post(() -> {
//            TrustProviderTypedData[] rawData = new Gson().fromJson(data, TrustProviderTypedData[].class);
//            int len = rawData.length;
//            TypedData[] typedData = new TypedData[len];
//            for (int i = 0; i < len; i++) {
//                typedData[i] = new TypedData(rawData[i].name, rawData[i].type, rawData[i].value);
//            }
//            onSignTypedMessageListener.onSignTypedMessage(new Message<>(typedData, getUrl(), callbackId));
//        });
    }

    private String getUrl() {
        try {
            return webView == null ? "" : webView.getUrl();
        }catch (Exception e) {
            return "";
        }
    }
}
