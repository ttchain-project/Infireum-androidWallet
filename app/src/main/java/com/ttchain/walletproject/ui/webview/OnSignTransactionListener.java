package com.ttchain.walletproject.ui.webview;

import com.ttchain.walletproject.model.Transaction;

public interface OnSignTransactionListener {
    void onSignTransaction(Transaction transaction);
}