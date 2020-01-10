package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.hideKeyboard
import kotlinx.android.synthetic.main.dialog_input.view.*

class InputDialog : DialogFragment() {

    private var titleText: String? = null

    fun setTitleText(titleText: String): InputDialog {
        this.titleText = titleText
        return this
    }

    private var messageText: String? = null

    fun setMessageText(messageText: String): InputDialog {
        this.messageText = messageText
        return this
    }

    private var hintText = ""

    fun setHintText(hintText: String): InputDialog {
        this.hintText = hintText
        return this
    }

    private var inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

    fun setInputType(inputType: Int): InputDialog {
        this.inputType = inputType
        return this
    }

    private var onConfirmClick: ((input: String) -> Unit)? = null

    fun setOnConfirmClickListener(onConfirmClick: ((input: String) -> Unit)): InputDialog {
        this.onConfirmClick = onConfirmClick
        return this
    }

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        val view = LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_input, null)
        return AlertDialog.Builder(requireActivity()).apply {
            setView(view)
            if (titleText != null)
                setTitle(titleText)
            if (messageText != null)
                setMessage(messageText)
            view.editText.apply {
                hint = hintText
                inputType = this@InputDialog.inputType
            }
            setNegativeButton(getString(R.string.g_cancel)) { _, _ ->
                dismissAllowingStateLoss()
            }
            setPositiveButton(getString(R.string.g_ok)) { _, _ ->
                onConfirmClick?.invoke(view.editText.text.toString())
                dismissAllowingStateLoss()
            }
        }.run {
            create()
                .apply {
                    setOnDismissListener {
                        requireActivity().hideKeyboard()
                    }
                    setOnShowListener {
                        // positive button setting
                        getButton(AlertDialog.BUTTON_POSITIVE).apply {
                            setTextColor(ContextCompat.getColor(requireContext(), R.color.red_700))
                            view.editText.addTextChangedListener {
                                this.isEnabled = it.toString().isNotEmpty()
                            }
                        }
                    }
                }
        }
    }
}
