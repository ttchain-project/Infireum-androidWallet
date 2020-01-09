package com.ttchain.walletproject.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.ttchain.walletproject.R
import com.ttchain.walletproject.enums.BottomTabState
import com.ttchain.walletproject.utils.DelayOnClickListener
import kotlinx.android.synthetic.main.view_bottom_tab.view.*

class BottomTabView : ConstraintLayout {

    private var onItemClickListener: ((status: BottomTabState) -> Unit)? = null

    fun setOnItemClickListener(l: (status: BottomTabState) -> Unit) {
        onItemClickListener = l
    }

    fun setItemClick(status: BottomTabState) {
        onItemClickListener?.invoke(status)
    }

    lateinit var currentPosition: BottomTabState

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context)
    }

    private fun init(context: Context) {
        LayoutInflater.from(context).inflate(R.layout.view_bottom_tab, this, true)

        buttonWallet.setOnClickListener(tabButtonClickListener)
//        buttonChat.setOnClickListener(tabButtonClickListener)
//        buttonTTN.setOnClickListener(tabButtonClickListener)
        buttonExplorer.setOnClickListener(tabButtonClickListener)
        buttonSetting.setOnClickListener(tabButtonClickListener)
    }

    private val tabButtonClickListener = DelayOnClickListener { view ->
        if (view.isSelected) {
            return@DelayOnClickListener
        }

        val status: BottomTabState = when (view.id) {
            R.id.buttonWallet -> BottomTabState.WALLET
//            R.id.buttonChat -> BottomTabState.CHAT
//            R.id.buttonTTN -> BottomTabState.TTN
            R.id.buttonExplorer -> BottomTabState.EXPLORER
            R.id.buttonSetting -> BottomTabState.ME
            else -> return@DelayOnClickListener
        }

        onItemClickListener?.invoke(status)
    }

    fun setTabPosition(status: BottomTabState) {
        currentPosition = status
        val view = when (status) {
            BottomTabState.WALLET -> buttonWallet
//            BottomTabState.CHAT -> buttonChat
//            BottomTabState.TTN -> buttonTTN
            BottomTabState.EXPLORER -> buttonExplorer
            BottomTabState.ME -> buttonSetting
        }
        buttonWallet.isSelected = false
//        buttonChat.isSelected = false
//        buttonTTN.isSelected = false
        buttonExplorer.isSelected = false
        buttonSetting.isSelected = false
        view.isSelected = true
    }

}