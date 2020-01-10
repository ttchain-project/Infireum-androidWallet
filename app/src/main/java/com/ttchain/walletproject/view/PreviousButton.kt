package com.ttchain.walletproject.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.ttchain.walletproject.R
import kotlinx.android.synthetic.main.view_previous_button.view.*

class PreviousButton : ConstraintLayout {

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        // 連接畫面
        LayoutInflater.from(context).inflate(R.layout.view_previous_button, this, true)
        val a = context.obtainStyledAttributes(attrs, R.styleable.PreviousButton)
        val buttonText = a.getString(R.styleable.PreviousButton_previous_button_text)
        val buttonImage =
            a.getResourceId(
                R.styleable.PreviousButton_previous_button_image,
                R.mipmap.btn_arrow_previous
            )
        a.recycle()
        imageView.setImageResource(buttonImage)
        if (!buttonText.isNullOrEmpty()) {
            textView.text = buttonText
        }
    }
}