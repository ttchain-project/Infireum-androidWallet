package com.ttchain.walletproject.dialog

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.dialog_tip.view.*

class TipDialog : DialogFragment() {


    private var titleText = ""

    fun setTitleText(titleText: String): TipDialog {
        this.titleText = titleText
        return this
    }

    private var onConfirmClick: (() -> Unit)? = null

    fun setOnConfirmClickListener(onConfirmClick: (() -> Unit)): TipDialog {
        this.onConfirmClick = onConfirmClick
        return this
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_tip, null).apply {
            title.text = titleText
            textViewCancel.setDelayClickListener {
                dismissAllowingStateLoss()
            }
            textViewConfirm.setDelayClickListener {
                onConfirmClick?.invoke()
            }
        }.run {
            builder.setView(this)
        }
        return builder.create()
    }


}