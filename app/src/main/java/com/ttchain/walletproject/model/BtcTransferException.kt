package com.ttchain.walletproject.model

import com.ttchain.walletproject.App
import com.ttchain.walletproject.R

class BtcTransferException : Exception() {

    val titleText =
        App.context.getString(R.string.transaction_was_not_completed_title)
    val messageText =
        App.context.getString(R.string.transaction_was_not_completed_message)
}