package com.ttchain.walletproject.model

import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.annotation.DrawableRes
import com.ttchain.walletproject.R
import com.ttchain.walletproject.view.FormView
import kotlinx.android.synthetic.main.item_miner_fee_sat.view.*

class MinerFeeSatItem(context: Context, bean: MinerFeeSatItemBean?) : FormView.ItemView(context) {
    override val layoutId: Int
        get() = R.layout.item_miner_fee_sat

    private var checkedDrawableRes = -1
    private var clickedView: View? = null

    private var onMinerFeeSatItemGasItemListener: OnMinerFeeSatItemGasItemListener? = null

    interface OnMinerFeeSatItemGasItemListener {
        fun onCheckedRegular()

        fun onCheckedPriority()

        fun onCheckedCustom(string: String)
    }

    init {
        clickedView = view.regular_fee

        if (bean != null) {
            onMinerFeeSatItemGasItemListener = bean.onMinerFeeSatItemGasItemListener

            if (bean.inputCustomGasWatcher != null) {
                view.custom_fee.addTextChangedListener(bean.inputCustomGasWatcher)
            }
        }

        view.regular_fee.keyListener = null
        view.regular_fee.isFocusable = false

        view.priority_fee.keyListener = null
        view.priority_fee.isFocusable = false

        val onTouchListener = View.OnTouchListener { view, motionEvent ->
            if (motionEvent!!.action == MotionEvent.ACTION_DOWN) {
                clickedView = view
            } else if (motionEvent.action == MotionEvent.ACTION_UP) {
                if (clickedView!!.id == view!!.id) {
                    updateCheckedDrawableView(view)
                }
            }
            false
        }

        view.regular_fee.setOnTouchListener(onTouchListener)
        view.priority_fee.setOnTouchListener(onTouchListener)
        view.custom_fee.setOnTouchListener(onTouchListener)

        view.custom_fee.setOnEditorActionListener { textView, actionId, keyEvent ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
            }
            false
        }
    }

    fun setCheckedDrawable(@DrawableRes drawableRes: Int): MinerFeeSatItem {
        checkedDrawableRes = drawableRes
        if (clickedView != null) {
            updateCheckedDrawableView(clickedView)
        }
        return this
    }


    fun setItemVisibility(visibility: Int): MinerFeeSatItem {
        view.item_layout.visibility = visibility
        return this
    }

    fun setRegularFee(string: String): MinerFeeSatItem {
        view.regular_fee.setText(string)
        return this
    }

    fun setPriorityFee(string: String): MinerFeeSatItem {
        view.priority_fee.setText(string)
        return this
    }

    fun setCustomFee(string: String): MinerFeeSatItem {
        view.custom_fee.setText(string)
        return this
    }

    fun isCheckedRegularFee(status: Boolean): MinerFeeSatItem {
        if (clickedView != null && status) {
            clickedView = view.regular_fee
            updateCheckedDrawableView(clickedView)
        }
        return this
    }

    fun isCheckedPriorityFee(status: Boolean): MinerFeeSatItem {
        if (clickedView != null && status) {
            clickedView = view.priority_fee
            updateCheckedDrawableView(clickedView)
        }
        return this
    }

    fun isCheckedCustomFee(status: Boolean): MinerFeeSatItem {
        if (clickedView != null && status) {
            clickedView = view.custom_fee
            updateCheckedDrawableView(clickedView)
        }
        return this
    }

    private fun updateCheckedDrawableView(fView: View?) {
        if (checkedDrawableRes == -1) {
            return
        }

        view.regular_fee.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
        view.priority_fee.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
        view.custom_fee.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)

        when (fView!!.id) {
            R.id.regular_fee -> {
                view.regular_fee.setCompoundDrawablesWithIntrinsicBounds(0, 0, checkedDrawableRes, 0)
                if (onMinerFeeSatItemGasItemListener != null) {
                    onMinerFeeSatItemGasItemListener!!.onCheckedRegular()
                }
            }
            R.id.priority_fee -> {
                view.priority_fee.setCompoundDrawablesWithIntrinsicBounds(0, 0, checkedDrawableRes, 0)
                if (onMinerFeeSatItemGasItemListener != null) {
                    onMinerFeeSatItemGasItemListener!!.onCheckedPriority()
                }
            }
            R.id.custom_fee -> {
                view.custom_fee!!.setCompoundDrawablesWithIntrinsicBounds(0, 0, checkedDrawableRes, 0)
                if (onMinerFeeSatItemGasItemListener != null) {
                    onMinerFeeSatItemGasItemListener!!.onCheckedCustom(view.custom_fee.text!!.toString())
                }
            }
            else -> {
                view.regular_fee.setCompoundDrawablesWithIntrinsicBounds(0, 0, checkedDrawableRes, 0)
                if (onMinerFeeSatItemGasItemListener != null) {
                    onMinerFeeSatItemGasItemListener!!.onCheckedRegular()
                }
            }
        }
    }
}
