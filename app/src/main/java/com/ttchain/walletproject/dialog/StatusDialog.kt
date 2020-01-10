package com.ttchain.walletproject.dialog

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R
import kotlinx.android.synthetic.main.dialog_status.view.*

class StatusDialog : DialogFragment() {

    private var onRightClick: (() -> Unit)? = null

    fun setOnRightClickListener(onRightClick: (() -> Unit)): StatusDialog {
        this.onRightClick = onRightClick
        return this
    }

    private var onLeftClick: (() -> Unit)? = null

    fun setOnLeftClickListener(onLeftClick: (() -> Unit)): StatusDialog {
        this.onLeftClick = onLeftClick
        return this
    }

    private var onDismiss: DialogInterface.OnDismissListener? = null

    fun setOnDismissListener(onDismiss: DialogInterface.OnDismissListener): StatusDialog {
        this.onDismiss = onDismiss
        return this
    }

    private var titleString = ""
    private var contentString = ""
    private var rightText: String? = null
    private var leftText: String? = null
    private var isLeftBtnRed: Boolean? = false

    fun setTitle(titleString: String): StatusDialog {
        this.titleString = titleString
        return this
    }

    fun setContentString(contentString: String): StatusDialog {
        this.contentString = contentString
        return this
    }

    fun setIdLeftBtnRed(isLeftBtnRed: Boolean): StatusDialog {
        this.isLeftBtnRed = isLeftBtnRed
        return this
    }

    fun setBtnText(rightText: String?, leftText: String?): StatusDialog {
        this.rightText = rightText
        this.leftText = leftText
        return this
    }

    fun setLeftBtnRedBg(): StatusDialog {
        this.isLeftBtnRed = true
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
        LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_status, null).apply {
            title.text = titleString
            content.text = contentString
            if (rightText != null) {
                buttonRight.text = rightText
                buttonRight.setOnClickListener {
                    onRightClick?.invoke()
                    dismissAllowingStateLoss()
                }
            } else {
                buttonRight.visibility = View.GONE
            }
            if (leftText != null) {
                buttonLeft.text = leftText
                buttonLeft.setOnClickListener {
                    onLeftClick?.invoke()
                    dismissAllowingStateLoss()
                }
            } else {
                buttonLeft.visibility = View.GONE
            }
            if (onDismiss != null)
                dialog!!.setOnDismissListener(onDismiss)
        }.run {
            builder.setView(this)
        }
        return builder.create()
    }

}
