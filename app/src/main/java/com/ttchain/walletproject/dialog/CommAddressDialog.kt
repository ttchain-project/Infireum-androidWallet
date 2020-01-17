package com.ttchain.walletproject.dialog

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.dialog_com_address.view.*

class CommAddressDialog : DialogFragment() {

    private var isEdit = false

    fun setIsEdit(isEdit: Boolean): CommAddressDialog {
        this.isEdit = isEdit
        return this
    }

    private var onConfirmClick: (() -> Unit)? = null

    fun setOnConfirmClickListener(onConfirmClick: (() -> Unit)): CommAddressDialog {
        this.onConfirmClick = onConfirmClick
        return this
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_com_address, null).apply {
            if (isEdit) {
                title.text = getString(R.string.dialog_comm_address_title_edit)
                content.text = getString(R.string.dialog_comm_address_message_edit)
            } else {
                title.text = getString(R.string.dialog_comm_address_title)
                content.text = getString(R.string.dialog_comm_address_message)
            }
            textViewConfirm.setDelayClickListener {
                onConfirmClick?.invoke()
                dismissAllowingStateLoss()
            }
        }.run {
            builder.setView(this)
        }
        return builder.create()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        onConfirmClick?.invoke()
    }
}