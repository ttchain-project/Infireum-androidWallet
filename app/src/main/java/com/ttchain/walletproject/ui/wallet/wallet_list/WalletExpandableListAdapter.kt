package com.ttchain.walletproject.ui.wallet.wallet_list

import android.annotation.SuppressLint
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ImageView
import android.widget.TextView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.loadCoinCenterCrop
import com.ttchain.walletproject.setDelayClickListener
import java.io.Serializable

class WalletExpandableListAdapter : BaseExpandableListAdapter() {

    private val mIndicators = SparseArray<ImageView>()

    private var dataSet: List<ExpandableListBean> = arrayListOf()

    fun updateData(dataSet: List<ExpandableListBean>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    private var onChildClick: ((groupData: ExpandableListBean, groupPosition: Int, childPosition: Int) -> Unit)? =
        null

    fun setOnClickListener(onChildClick: ((groupData: ExpandableListBean, groupPosition: Int, childPosition: Int) -> Unit)) {
        this.onChildClick = onChildClick
    }

    private var mOnGroupExpandedListener: OnGroupExpandedListener? = null

    interface OnGroupExpandedListener {
        fun onGroupExpanded(groupPosition: Int)
    }

    fun setOnGroupExpandedListener(onGroupExpandedListener: OnGroupExpandedListener) {
        mOnGroupExpandedListener = onGroupExpandedListener
    }

    fun setIndicatorState(groupPosition: Int, isExpanded: Boolean) {
        if (isExpanded) {
            mIndicators.get(groupPosition).setImageResource(R.mipmap.btn_close)
        } else {
            mIndicators.get(groupPosition).setImageResource(R.mipmap.btn_open)
        }
    }

    override fun getGroupCount(): Int {
        return dataSet.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return dataSet[groupPosition].childData.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return dataSet[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return dataSet[groupPosition].childData[childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    @SuppressLint("SetTextI18n")
    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var view = convertView
        val groupViewHolder: GroupViewHolder
        if (view == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_wallet_expand_group, parent, false)
            groupViewHolder = GroupViewHolder()
            groupViewHolder.coinIV = view.findViewById(R.id.coin_iv)
            groupViewHolder.coinNameTV = view.findViewById(R.id.coin_name_tv)
            groupViewHolder.coinAmountTV = view.findViewById(R.id.coin_amount_tv)
            groupViewHolder.coinFiatTV = view.findViewById(R.id.coin_fiat_tv)
            groupViewHolder.arrowBtn = view.findViewById(R.id.arrow_btn)

            view.tag = groupViewHolder
        } else {
            groupViewHolder = view.tag as GroupViewHolder
        }

        val data = dataSet[groupPosition]

        groupViewHolder.coinNameTV?.text = data.name
        groupViewHolder.coinIV?.loadCoinCenterCrop(data.iconPath)
        groupViewHolder.coinAmountTV?.text = data.totalAmount
        groupViewHolder.coinFiatTV?.text = data.totalFiat

        mIndicators.put(groupPosition, groupViewHolder.arrowBtn)
        setIndicatorState(groupPosition, isExpanded)

        return view!!
    }

    @SuppressLint("SetTextI18n")
    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var view = convertView
        val childViewHolder: ChildViewHolder
        if (view == null) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_wallet_expand_child, parent, false)
            childViewHolder = ChildViewHolder()
            childViewHolder.walletNameTV = view.findViewById(R.id.wallet_name_tv)
            childViewHolder.walletAmountTV = view.findViewById(R.id.wallet_amount_tv)
            childViewHolder.walletFiatTV = view.findViewById(R.id.wallet_fiat_tv)
            childViewHolder.arrowBtn = view.findViewById(R.id.arrow_btn)

            view.tag = childViewHolder
        } else {
            childViewHolder = view.tag as ChildViewHolder
        }
        val (_, name, totalAmount, totalFiat) = dataSet[groupPosition].childData[childPosition]

        childViewHolder.walletNameTV?.text = name
        childViewHolder.walletAmountTV?.text = totalAmount
        childViewHolder.walletFiatTV?.text = totalFiat
        view?.setDelayClickListener {
            onChildClick?.invoke(dataSet[groupPosition], groupPosition, childPosition)
        }
        return view!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun onGroupExpanded(groupPosition: Int) {
        mOnGroupExpandedListener?.onGroupExpanded(groupPosition)
    }

    override fun onGroupCollapsed(groupPosition: Int) {}


    private class GroupViewHolder {
        internal var coinIV: ImageView? = null
        internal var coinNameTV: TextView? = null
        internal var coinAmountTV: TextView? = null
        internal var coinFiatTV: TextView? = null
        internal var arrowBtn: ImageView? = null
    }

    private class ChildViewHolder {
        internal var walletNameTV: TextView? = null
        internal var walletAmountTV: TextView? = null
        internal var walletFiatTV: TextView? = null
        internal var arrowBtn: ImageView? = null
    }
}

data class ExpandableListBean(
    var walletID: Int = -1,
    var name: String = "",
    var totalAmount: String = "0.00",
    var totalFiat: String = "0.00",
    var iconPath: String = "",
    var childData: List<ExpandableListBean> = arrayListOf(),
    var isFromSystem: Boolean = false
) : Serializable