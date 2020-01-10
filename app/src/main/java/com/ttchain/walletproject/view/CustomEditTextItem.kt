package com.ttchain.walletproject.view

import android.content.Context
import android.text.Editable
import android.text.InputType
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.addTextChangedListener
import com.ttchain.walletproject.R
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.view_custom_edit_text.view.*

class CustomEditTextItem : ConstraintLayout {

    companion object {
        private const val typeEmail = 1
        private const val typePassword = 2
        private const val typeInteger = 3
        private const val typePhone = 4
        private const val typeUri = 5
    }

    private var onTextChange: ((editable: Editable?) -> Unit)? = null

    fun addTextChangeListener(onTextChange: ((editable: Editable?) -> Unit)) {
        this.onTextChange = onTextChange
    }

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs,
        defStyleAttr
    ) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        LayoutInflater.from(context).inflate(R.layout.view_custom_edit_text, this, true)
        val a = context.obtainStyledAttributes(attrs, R.styleable.CustomEditTextItem)
        val hint = a.getString(R.styleable.CustomEditTextItem_editTextHint)
        val type = a.getInt(R.styleable.CustomEditTextItem_editTextType, 0)
        val title = a.getString(R.styleable.CustomEditTextItem_titleText)
        a.recycle()
        textViewTile.text = title
        editText.apply {
            this.hint = hint
            inputType = when (type) {
                typeEmail -> InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
                typePassword -> InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                typeInteger -> InputType.TYPE_CLASS_NUMBER
                typePhone -> InputType.TYPE_CLASS_PHONE
                typeUri -> InputType.TYPE_TEXT_VARIATION_URI
                else -> InputType.TYPE_CLASS_TEXT
            }
        }
        editText.addTextChangedListener(
            beforeTextChanged = { _, _, _, _ ->

            },
            onTextChanged = { _, _, _, _ ->
                if (textViewError.text.isNotEmpty())
                    textViewError.text = ""
            },
            afterTextChanged = {
                onTextChange?.invoke(it)
            }
        )

        when (type) {
            typePassword -> buttonDisplayPassword.visibility = View.VISIBLE
            else -> buttonDisplayPassword.visibility = View.GONE
        }
        buttonDisplayPassword.setDelayClickListener {
            if (editText.transformationMethod == null) {
                editText.transformationMethod =
                    PasswordTransformationMethod.getInstance()
                buttonDisplayPassword.setImageResource(R.mipmap.btn_hide)
            } else {
                editText.transformationMethod = null
                buttonDisplayPassword.setImageResource(R.mipmap.btn_show)
            }
        }
    }

    fun setError(errorText: String) {
        textViewError.text = errorText
    }

    fun getText(): String {
        return editText.text.toString()
    }

    fun setText(text: String) {
        editText.setText(text)
    }
}