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
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.dialog_verify_password.view.*

class VerifyPwdDialog : DialogFragment() {

    private var onConfirmClick: ((password: String) -> Unit)? = null

    fun setOnConfirmClickListener(l: ((password: String) -> Unit)): VerifyPwdDialog {
        onConfirmClick = l
        return this
    }

    private var hintEtText = ""

    fun setHintEdText(hintEtText: String): VerifyPwdDialog {
        this.hintEtText = hintEtText
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
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_verify_password, null)
            .apply {
                hint_et.apply {
                    setText(hintEtText)
                    transformationMethod = PasswordTransformationMethod.getInstance()
                }
                show_hint_btn.setOnClickListener {
                    if (hint_et.transformationMethod == null) {
                        hint_et.transformationMethod = PasswordTransformationMethod.getInstance()
                        show_hint_btn.setImageResource(R.mipmap.icon_textfield_eye_off)
                    } else {
                        hint_et.transformationMethod = null
                        show_hint_btn.setImageResource(R.mipmap.icon_textfield_eye_on)
                    }
                }
                show_pwd_btn.setOnClickListener {
                    if (pwd_et.transformationMethod == null) {
                        pwd_et.transformationMethod = PasswordTransformationMethod.getInstance()
                        show_pwd_btn.setImageResource(R.mipmap.icon_textfield_eye_off)
                    } else {
                        pwd_et.transformationMethod = null
                        show_pwd_btn.setImageResource(R.mipmap.icon_textfield_eye_on)
                    }
                }
                cancel.setDelayClickListener {
                    dismissAllowingStateLoss()
                }
                confirm.setDelayClickListener {
                    onConfirmClick?.invoke(pwd_et.text.toString())
                    dismissAllowingStateLoss()
                }
            }.run {
                builder.setView(this)
            }
        return builder.create()
    }
}