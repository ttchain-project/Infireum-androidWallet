package com.ttchain.walletproject.ui.restorebymnemonics_new.restoremnemonicswalletlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.database.data.WalletData
import kotlinx.android.synthetic.main.view_list_system_wallet.view.*

class RestoreWalletListAdapter :
    RecyclerView.Adapter<RestoreWalletListAdapter.RestoreWalletListViewHolder>() {

    private var dataSet: MutableList<WalletData> = arrayListOf()

    fun updateData(dataSet: MutableList<WalletData>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestoreWalletListViewHolder {
        return RestoreWalletListViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_list_system_wallet, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: RestoreWalletListViewHolder, position: Int) {
        holder.setData(dataSet[position])
    }


    inner class RestoreWalletListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(data: WalletData) {
            itemView.apply {
                textViewName.text = data.name
                textViewAddress.text = data.address
            }
        }
    }
}