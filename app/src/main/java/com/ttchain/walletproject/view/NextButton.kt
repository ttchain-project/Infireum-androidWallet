package com.ttchain.walletproject.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.ttchain.walletproject.R
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.view_next_button.view.*

class NextButton : ConstraintLayout {

    private var onClick: (() -> Unit)? = null

    fun setOnClickListener(onClick: (() -> Unit)) {
        this.onClick = onClick
    }

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
        LayoutInflater.from(context).inflate(R.layout.view_next_button, this, true)
        val a = context.obtainStyledAttributes(attrs, R.styleable.NextButton)
        val buttonText = a.getString(R.styleable.NextButton_button_text)
        val buttonImage =
            a.getResourceId(R.styleable.NextButton_button_image, R.mipmap.btn_arrow_next)
        val buttonEnable = a.getBoolean(R.styleable.NextButton_button_enable, true)
        a.recycle()
        if (!buttonText.isNullOrEmpty()) {
            textView.text = buttonText
        }
        imageView.setImageResource(buttonImage)
        linearLayout.isEnabled = buttonEnable
        linearLayout.setDelayClickListener {
            onClick?.invoke()
        }
    }

    fun setEnable(isButtonEnable: Boolean) {
        linearLayout.isEnabled = isButtonEnable
    }

    fun setText(text: String) {
        textView.text = text
    }

}