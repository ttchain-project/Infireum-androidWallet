package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.dialog_update_version.view.*

class UpdateVersionDialogFragment : DialogFragment() {

    private var onUpdateClick: (() -> Unit)? = null

    fun setOnUpdateClickListener(onUpdateClick: (() -> Unit)): UpdateVersionDialogFragment {
        this.onUpdateClick = onUpdateClick
        return this
    }

    private var messageText = ""

    fun setMessagetext(messageText: String): UpdateVersionDialogFragment {
        this.messageText = messageText
        return this
    }

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_update_version, null).apply {
            textViewMessage.text = messageText
            textViewLater.setDelayClickListener { dismissAllowingStateLoss() }
            textViewUpdate.setDelayClickListener {
                onUpdateClick?.invoke()
                dismissAllowingStateLoss()
            }
        }.run {
            builder.setView(this)
        }
        return builder.create()
    }
}