package com.ttchain.walletproject.base

import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.ttchain.walletproject.R
import com.ttchain.walletproject.model.RecordEntity
import com.ttchain.walletproject.utils.FeatureUtils
import com.ttchain.walletproject.utils.ViewUtils

open class BaseRecordAdapter : BaseMultiItemQuickAdapter<RecordEntity, BaseViewHolder>(ArrayList<RecordEntity>()) {

    init {
        addItemType(RecordEntity.NORMAL, R.layout.item_record_normal)
        addItemType(RecordEntity.THUNDER, R.layout.item_record_thunder)
    }

    var onClickDetailListener: OnClickDetailListener? = null

    interface OnClickDetailListener {
        fun onClickDetail(superLink: String)
    }

    override fun convert(helper: BaseViewHolder?, item: RecordEntity?) {
        item?.let {
            when (item.itemType) {
                RecordEntity.NORMAL -> {
                    val amount = helper?.getView<TextView>(R.id.amount)
                    val detail = helper?.getView<TextView>(R.id.detail)
                    val note = helper?.getView<TextView>(R.id.note)

                    detail?.setTextColor(ContextCompat.getColor(mContext, item.data.textColorRes))
                    amount?.setTextColor(ContextCompat.getColor(mContext, item.data.textColorRes))

                    helper?.setText(R.id.address, item.data.address)
                    helper?.setText(R.id.day, item.data.date)
                    if (item.data.statusIcon != -1) {
                        helper?.setImageDrawable(R.id.status_icon, ResourcesCompat.getDrawable(mContext.resources, item.data.statusIcon, null))
                    }
                    val content = SpannableString(item.data.detailText)
                    content.setSpan(UnderlineSpan(), 0, item.data.detailText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                    detail?.text = content
                    amount?.text = item.data.amountText
                    detail?.setOnClickListener(null)
                    detail?.setOnClickListener {
                        onClickDetailListener?.let {
                            onClickDetailListener!!.onClickDetail(item.data.superLinkUrl)
                        }
                    }
                    if (FeatureUtils.isDeveloper) {
                        helper?.getView<TextView>(R.id.day)?.append(", _id:${item.data._id}")
                    }

                    if (item.data.comment == null || item.data.comment!!.isEmpty()) {
                        note?.visibility = View.GONE
                    } else {
                        note?.visibility = View.VISIBLE
                        note?.text = item.data.comment
                    }
                }
                RecordEntity.THUNDER -> {
                    val amount = helper?.getView<TextView>(R.id.amount)
                    val detail = helper?.getView<TextView>(R.id.detail)
                    val icon = helper?.getView<ImageView>(R.id.status_icon)
                    val note = helper?.getView<TextView>(R.id.note)

                    detail?.setTextColor(ContextCompat.getColor(mContext, item.data.textColorRes))
                    amount?.setTextColor(ContextCompat.getColor(mContext, item.data.textColorRes))

                    helper?.setText(R.id.coin_to_coin, item.data.coinToCoinText)
                    helper?.setText(R.id.miner_fee, item.data.minerFeeText)
                    helper?.setText(R.id.day, item.data.date)

                    val content = SpannableString(item.data.detailText)
                    content.setSpan(UnderlineSpan(), 0, item.data.detailText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
                    detail?.text = content
                    amount?.text = item.data.amountText

                    detail?.visibility = View.GONE

                    ViewUtils.setImageDrawableColorFilter(icon, R.color.colorPrimary)

                    if (FeatureUtils.isDeveloper) {
                        helper?.getView<TextView>(R.id.day)?.append(", _id:${item.data._id}")
                    }

                    if (item.data.comment == null || item.data.comment!!.isEmpty()) {
                        note?.visibility = View.GONE
                    } else {
                        note?.visibility = View.VISIBLE
                        note?.text = item.data.comment
                    }
                }
                else -> {
                }
            }
        }
    }

}