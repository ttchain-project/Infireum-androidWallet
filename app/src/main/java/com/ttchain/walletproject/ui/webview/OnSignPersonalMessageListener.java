package com.ttchain.walletproject.ui.webview;


import com.ttchain.walletproject.model.Message;
import com.ttchain.walletproject.model.Transaction;

public interface OnSignPersonalMessageListener {
    void onSignPersonalMessage(Message<Transaction> message);
}
