package com.ttchain.walletproject.dialog

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment

class MessageDialog : DialogFragment() {

    private var titleText: String? = null

    fun setTitleText(titleText: String): MessageDialog {
        this.titleText = titleText
        return this
    }

    private var messageText: String? = null

    fun setMessageText(messageText: String): MessageDialog {
        this.messageText = messageText
        return this
    }

    // confirm button
    private var positiveButtonText: String? = null

    fun setPositiveButtonText(positiveButtonText: String): MessageDialog {
        this.positiveButtonText = positiveButtonText
        return this
    }

    private var positiveButtonListener: (() -> Unit)? = null

    fun setPositiveButtonListener(positiveButtonListener: (() -> Unit)?): MessageDialog {
        this.positiveButtonListener = positiveButtonListener
        return this
    }

    // cancel button
    private var negativeButtonText: String? = null

    fun setNegationButtonText(negativeButtonText: String): MessageDialog {
        this.negativeButtonText = negativeButtonText
        return this
    }

    private var negationButtonListener: (() -> Unit)? = null

    fun setNegationButtonListener(negationButtonListener: (() -> Unit)?): MessageDialog {
        this.negationButtonListener = negationButtonListener
        return this
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        return AlertDialog.Builder(requireActivity()).apply {
            if (titleText != null)
                setTitle(titleText)
            if (messageText != null)
                setMessage(messageText)
            if (negativeButtonText != null)
                setNegativeButton(negativeButtonText) { _, _ ->
                    negationButtonListener?.invoke()
                }
            if (positiveButtonText != null)
                setPositiveButton(positiveButtonText) { _, _ ->
                    positiveButtonListener?.invoke()
                }
        }.run {
            create()
        }
    }
}