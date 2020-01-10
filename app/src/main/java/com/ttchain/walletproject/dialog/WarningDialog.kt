package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import kotlinx.android.synthetic.main.dialog_warning.view.*

class WarningDialog : DialogFragment() {

    private var onRightClick: (() -> Unit)? = null

    fun setOnRightClickListener(onRightClick: (() -> Unit)): WarningDialog {
        this.onRightClick = onRightClick
        return this
    }

    private var onLeftClick: (() -> Unit)? = null

    fun setOnLeftClickListener(onLeftClick: (() -> Unit)): WarningDialog {
        this.onLeftClick = onLeftClick
        return this
    }

    private var titleString = ""
    private var contentString = ""
    private var rightText: String? = null
    private var leftText: String? = null
    private var isLeftBtnRed: Boolean = false
    private var isRightBtnRed: Boolean = false

    fun setTitle(string: String): WarningDialog {
        titleString = string
        return this
    }

    fun setContent(content: String): WarningDialog {
        contentString = content
        return this
    }

    fun setBtnText(right: String?, left: String?): WarningDialog {
        rightText = right
        leftText = left
        return this
    }

    fun setLeftBtnRedBg(): WarningDialog {
        this.isLeftBtnRed = true
        return this
    }

    fun setRightBtnRedBg(): WarningDialog {
        this.isRightBtnRed = true
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
        val builder = AlertDialog.Builder(requireActivity())
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_warning, null).apply {
            title.text = titleString
            content.text = contentString

            if (rightText != null) {
                buttonRight.text = rightText
                if (isRightBtnRed) {
                    buttonRight.background =
                        ContextCompat.getDrawable(context, R.drawable.bg_warning_radius_30)
                    buttonRight.setTextColor(ContextCompat.getColor(context, R.color.white))
                }
                buttonRight.setOnClickListener { v ->
                    onRightClick?.invoke()
                    dismissAllowingStateLoss()
                }
            } else {
                buttonRight.visibility = View.GONE
            }

            if (leftText != null) {
                buttonLeft.text = leftText
                if (isLeftBtnRed) {
                    buttonLeft.background =
                        ContextCompat.getDrawable(context, R.drawable.bg_warning_radius_30)
                    buttonLeft.setTextColor(ContextCompat.getColor(context, R.color.white))
                }
                buttonLeft.setOnClickListener { v ->
                    onLeftClick?.invoke()
                    dismissAllowingStateLoss()
                }
            } else {
                buttonLeft.visibility = View.GONE
            }
        }.run {
            builder.setView(this)
        }
        return builder.create()
    }
}
