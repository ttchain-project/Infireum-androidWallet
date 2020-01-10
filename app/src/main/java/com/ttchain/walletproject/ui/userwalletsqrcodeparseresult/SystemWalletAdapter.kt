package com.ttchain.walletproject.ui.userwalletsqrcodeparseresult

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.model.UserWalletQrCodeImageBean
import kotlinx.android.synthetic.main.view_list_system_wallet.view.*

class SystemWalletAdapter : RecyclerView.Adapter<SystemWalletAdapter.SystemWalletViewHolder>() {

    private var dataSet: MutableList<UserWalletQrCodeImageBean.WalletContent>? = null

    fun updateData(dataSet: MutableList<UserWalletQrCodeImageBean.WalletContent>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SystemWalletViewHolder {
        return SystemWalletViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_list_system_wallet, parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return dataSet?.size ?: 0
    }

    override fun onBindViewHolder(holder: SystemWalletViewHolder, position: Int) {
        dataSet?.let { holder.setData(it[position]) }
    }

    inner class SystemWalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(data: UserWalletQrCodeImageBean.WalletContent) {
            itemView.apply {
                textViewName.text = data.name
                textViewAddress.text = data.address
            }
        }
    }
}