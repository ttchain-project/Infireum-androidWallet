package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R

class ProgressDialog : DialogFragment() {

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity())
            .inflate(R.layout.dialog_progress, null).apply {
                dialog?.setCancelable(false)
                dialog?.setCanceledOnTouchOutside(false)
                isCancelable = false
//                dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }.run {
                builder.setView(this)
            }
        return builder.create()
    }

}