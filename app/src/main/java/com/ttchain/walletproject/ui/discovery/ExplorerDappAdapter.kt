package com.ttchain.walletproject.ui.discovery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.loadCenterInsideRoundedCorners
import com.ttchain.walletproject.model.ExplorerDappBean
import kotlinx.android.synthetic.main.item_explorer_dapp.view.*

class ExplorerDappAdapter : RecyclerView.Adapter<ExplorerDappAdapter.ExplorerDappViewHolder>() {

    private var dataSet: List<ExplorerDappBean>? = null

    private var onItemClick: ((url: String) -> Unit)? = null

    fun setOnItemClickListener(onItemClick: ((url: String) -> Unit)) {
        this.onItemClick = onItemClick
    }

    fun updateData(mData: List<ExplorerDappBean>) {
        this.dataSet = mData
        notifyDataSetChanged()
    }

    // inflates the cell layout from xml when needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExplorerDappViewHolder {
        return ExplorerDappViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_explorer_dapp, parent, false
            )
        )
    }

    // binds the data to the TextView in each cell
    override fun onBindViewHolder(holder: ExplorerDappViewHolder, position: Int) {
        dataSet.let { holder.setData(it!![position], position) }
    }

    // total number of cells
    override fun getItemCount(): Int {
        return dataSet?.size ?: 0
    }

    // stores and recycles views as they are scrolled off screen
    inner class ExplorerDappViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(data: ExplorerDappBean, position: Int) {
            itemView.apply {
                name_tv.text = data.name
                icon.loadCenterInsideRoundedCorners(data.icon, 8)
                setOnClickListener { onItemClick?.invoke(data.url) }
                if (position == 0) {
//                    setPadding(
//                        24f.dp2px(context),
//                        0,
//                        9f.dp2px(context),
//                        0
//                    )
                } else {
//                    setPadding(
//                        9f.dp2px(context),
//                        0,
//                        9f.dp2px(context),
//                        0
//                    )
                }
            }
        }
    }

}