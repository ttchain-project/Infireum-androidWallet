package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import kotlinx.android.synthetic.main.dialog_two_input.view.*

class TwoInputDialog : DialogFragment() {

    private var onConfirmClick: ((inputOne: String, inputTwo: String) -> Unit)? = null

    fun setOnConfirmClickListener(onConfirmClick: ((inputOne: String, inputTwo: String) -> Unit)): TwoInputDialog {
        this.onConfirmClick = onConfirmClick
        return this
    }

    private var titleText: String = ""
    private var inputOne: String = ""
    private var inputOneHint: String = ""
    private var inputTwo: String = ""
    private var inputTwoHint: String = ""


    fun setTitle(string: String): TwoInputDialog {
        titleText = string
        return this
    }

    fun setInputOne(subtitle: String, hint: String): TwoInputDialog {
        this.inputOne = subtitle
        this.inputOneHint = hint
        return this
    }

    fun setInputTwo(subtitle: String, hint: String): TwoInputDialog {
        this.inputTwo = subtitle
        this.inputTwoHint = hint
        return this
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.apply {
            window?.setBackgroundDrawableResource(R.color.transparent)
            requestWindowFeature(Window.FEATURE_NO_TITLE)
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    @SuppressLint("InflateParams")
    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_two_input, null).apply {

            title.text = titleText
            input_one_tv.text = inputOne
            input_one_edit.hint = inputOneHint
            input_two_tv.text = inputTwo
            input_two_edit.hint = inputTwoHint

            input_one_display_btn.setOnClickListener { v ->
                if (input_one_edit.transformationMethod == null) {
                    input_one_edit.transformationMethod = PasswordTransformationMethod.getInstance()
                    input_one_display_btn.setImageResource(R.mipmap.btn_hide)
                } else {
                    input_one_edit.transformationMethod = null
                    input_one_display_btn.setImageResource(R.mipmap.btn_show)
                }
            }

            input_two_display_btn.setOnClickListener { v ->
                if (input_two_edit.transformationMethod == null) {
                    input_two_edit.transformationMethod = PasswordTransformationMethod.getInstance()
                    input_two_display_btn.setImageResource(R.mipmap.btn_hide)
                } else {
                    input_two_edit.transformationMethod = null
                    input_two_display_btn.setImageResource(R.mipmap.btn_show)
                }
            }

            confirm.setOnClickListener { v ->
                onConfirmClick?.invoke(
                    input_one_edit.text.toString(),
                    input_two_edit.text.toString()
                )
                dialog!!.dismiss()
            }
            cancel.setOnClickListener { v -> dialog!!.dismiss() }
        }.run {
            builder.setView(this)
        }
        return builder.create()
    }
}
