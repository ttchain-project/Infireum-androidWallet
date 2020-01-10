package com.git4u.tt_wallet_android.ui.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import kotlinx.android.synthetic.main.dialog_progress_title.view.*

class ProgressTitleDialog : DialogFragment() {

    private var titleText: String? = null

    fun setTitleText(titleText: String): ProgressTitleDialog {
        this.titleText = titleText
        return this
    }

    private var messageText: String? = null

    fun setMessageText(messageText: String?): ProgressTitleDialog {
        this.messageText = messageText
        return this
    }

    private var progress = 0

    fun updateProgress(progress: Int): ProgressTitleDialog {
        this.progress = progress
        return this
    }

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        val view =
            LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_progress_title, null)
        return AlertDialog.Builder(requireActivity()).apply {
            setView(view)
            if (titleText != null)
                setTitle(titleText)
            if (messageText != null)
                setMessage(messageText)
            isCancelable = false
            view.progressBar.apply {
                max = 100
                progress = this@ProgressTitleDialog.progress
            }
        }.run {
            create()
        }
    }
}