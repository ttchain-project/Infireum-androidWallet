package com.ttchain.walletproject.ui.discovery

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.loadCoinCenterCrop
import com.ttchain.walletproject.model.ExplorerListEntity
import kotlinx.android.synthetic.main.item_explorer_trend.view.*

class ExplorerTrendAdapter : RecyclerView.Adapter<ExplorerTrendAdapter.ExplorerTrendViewHolder>() {

    private var dataSet: List<ExplorerListEntity>? = null

    fun updateData(data: List<ExplorerListEntity>) {
        this.dataSet = data
        notifyDataSetChanged()
    }

    // inflates the cell layout from xml when needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExplorerTrendViewHolder {
        return ExplorerTrendViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_explorer_trend, parent, false
            )
        )
    }

    // binds the data to the TextView in each cell
    override fun onBindViewHolder(holder: ExplorerTrendViewHolder, position: Int) {
        dataSet.let { holder.setData(it!![position], position) }
    }

    // total number of cells
    override fun getItemCount(): Int {
        return dataSet?.size ?: 0
    }


    // stores and recycles views as they are scrolled off screen
    inner class ExplorerTrendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @SuppressLint("SetTextI18n")
        fun setData(data: ExplorerListEntity, position: Int) {
            itemView.apply {
                val bean = data.data
                index_tv.text = (position + 1).toString()
                icon_tv.loadCoinCenterCrop(bean?.img.orEmpty())
                name_tv.text = bean?.title
                price_tv.text = bean?.price
                val change = bean?.change
                if (change?.startsWith("-") != false) {
                    price_tv.setTextColor(ContextCompat.getColor(context, R.color._FF576E))
                    change_tv.text = change
                    change_tv.setBackgroundResource(R.drawable.bg_trend_red_radius_8)
                } else {
                    price_tv.setTextColor(ContextCompat.getColor(context, R.color._66C92E))
                    change_tv.text = "+$change"
                    change_tv.setBackgroundResource(R.drawable.bg_trend_green_radius_8)
                }
            }
        }
    }
}