package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.dialog_request_coin_success_dialog.view.*

class RequestCoinSuccessDialog : DialogFragment() {

    private var onConfirmClick: (() -> Unit)? = null

    fun setOnConfirmClickListener(onConfirmClick: (() -> Unit)): RequestCoinSuccessDialog {
        this.onConfirmClick = onConfirmClick
        return this
    }

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity())
            .inflate(R.layout.dialog_request_coin_success_dialog, null).apply {
                textViewConfirm.setDelayClickListener {
                    onConfirmClick?.invoke()
                    dismissAllowingStateLoss()
                }
                isCancelable = false
            }.run {
                builder.setView(this)
            }
        return builder.create()
    }

}