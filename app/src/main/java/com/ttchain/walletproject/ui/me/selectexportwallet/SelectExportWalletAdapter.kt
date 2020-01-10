package com.ttchain.walletproject.ui.me.selectexportwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.item_select_export_wallet.view.*

class SelectExportWalletAdapter :
    RecyclerView.Adapter<SelectExportWalletAdapter.SelectExportWalletViewHolder>() {

    private var dataSet: List<WalletData>? = null

    fun updateData(dataSet: List<WalletData>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    private var onSelectExportWalletClick: ((data: WalletData) -> Unit)? = null

    fun setOnSelectExportWalletClickListener(onSelectExportWalletClick: ((data: WalletData) -> Unit)) {
        this.onSelectExportWalletClick = onSelectExportWalletClick
    }

    private var coinEnum = CoinEnum.BTC

    fun setCoinEnum(coinEnum: CoinEnum) {
        this.coinEnum = coinEnum
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SelectExportWalletViewHolder {
        return SelectExportWalletViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_select_export_wallet, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: SelectExportWalletViewHolder, position: Int) {
        dataSet?.let { holder.setData(it[position]) }
    }

    override fun getItemCount(): Int {
        return dataSet?.size ?: 0
    }


    inner class SelectExportWalletViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setData(data: WalletData) {
            itemView.apply {
                when (coinEnum) {
                    CoinEnum.BTC -> imageViewCoin.setImageResource(R.mipmap.wallet_coin_btc_small)
                    CoinEnum.ETH -> imageViewCoin.setImageResource(R.mipmap.wallet_coin_eth_small)
                    else -> imageViewCoin.setImageResource(R.mipmap.wallet_coin_btc_small)
                }
                textViewWalletName.text = data.name
                setDelayClickListener {
                    onSelectExportWalletClick?.invoke(data)
                }
            }
        }
    }
}