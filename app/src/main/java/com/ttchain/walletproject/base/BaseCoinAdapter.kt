package com.ttchain.walletproject.base

import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.ttchain.walletproject.R
import com.ttchain.walletproject.loadCoinCenterCrop
import com.ttchain.walletproject.model.CoinEntity
import com.ttchain.walletproject.utils.FeatureUtils
import java.util.*


open class BaseCoinAdapter : BaseMultiItemQuickAdapter<CoinEntity, BaseViewHolder>(ArrayList()) {

    private var onCheckedCoinSelection: ((coinSelectedId: Int, selected: Boolean) -> Unit)? = null

    fun setOnCheckedCoinSelectionListener(onCheckedCoinSelection: ((coinSelectedId: Int, selected: Boolean) -> Unit)) {
        this.onCheckedCoinSelection = onCheckedCoinSelection
    }

    private var onDeletedCoinSelection: ((coinSelectedId: Int) -> Unit)? = null

    fun setOnDeletedCoinSelectionListener(onDeletedCoinSelection: ((coinSelectedId: Int) -> Unit)) {
        this.onDeletedCoinSelection = onDeletedCoinSelection
    }

    private var onSearchCoin: ((coinId: String, isAdded: Boolean) -> Unit)? = null

    fun setOnSearchCoinListener(onSearchCoin: ((coinId: String, isAdded: Boolean) -> Unit)) {
        this.onSearchCoin = onSearchCoin
    }

    init {
        this.addItemType(CoinEntity.NORMAL, R.layout.item_coin_normal)
        this.addItemType(CoinEntity.PICK, R.layout.item_coin_pick)
        this.addItemType(CoinEntity.ASSET, R.layout.item_coin_asset)
        this.addItemType(CoinEntity.DELETE, R.layout.item_coin_delete)
        this.addItemType(CoinEntity.SEARCH, R.layout.item_coin_search)
    }

    override fun convert(helper: BaseViewHolder, iItem: CoinEntity?) {
        if (iItem != null) {
            when (iItem.itemType) {
                CoinEntity.NORMAL -> {
                    val itemNormal = iItem.data
                    helper.setText(R.id.name, itemNormal.displayName)
                    helper.setText(R.id.amount, itemNormal.amount)
                    helper.setText(R.id.exchange, itemNormal.exchange)
                    (helper.getView(R.id.image) as ImageView).loadCoinCenterCrop(
                        itemNormal.iconPath ?: ""
                    )
                }
                CoinEntity.PICK -> {
                    val itemPick = iItem.data
                    helper.setText(R.id.name, itemPick.displayName)
                    helper.setText(R.id.amount, itemPick.remindAmount)

                    if (itemPick.isPicked) {
                        helper.getView<View>(R.id.checked).visibility = View.VISIBLE
                    } else {
                        helper.getView<View>(R.id.checked).visibility = View.GONE
                    }
                    helper.getView<ImageView>(R.id.image)
                        .loadCoinCenterCrop(itemPick.iconPath ?: "")
                }
                CoinEntity.ASSET -> {
                    val itemAsset = iItem.data
                    helper.setText(R.id.name, itemAsset.displayName)
                    helper.setText(R.id.full_name, itemAsset.fullName)
                    val selected = helper.getView<CheckBox>(R.id.selected)
                    if (itemAsset.isLockSelection) {
                        selected.visibility = View.INVISIBLE
                    } else {
                        selected.visibility = View.VISIBLE
                    }
                    selected.setOnCheckedChangeListener(null)
                    selected.isChecked = itemAsset.isSelected
                    selected.setOnCheckedChangeListener { _, b ->
                        itemAsset.isSelected = b
                        onCheckedCoinSelection?.invoke(itemAsset.coinSelectionDataId, b)
                    }
                    helper.getView<ImageView>(R.id.image)
                        .loadCoinCenterCrop(itemAsset.iconPath ?: "")
                }
                CoinEntity.DELETE -> {
                    val itemDelete = iItem.data
                    if (FeatureUtils.isDeveloper) {
                        helper.setText(
                            R.id.name,
                            itemDelete.displayName + " : " + itemDelete.amount
                        )
                    } else {
                        helper.setText(R.id.name, itemDelete.displayName)
                    }
                    helper.setText(R.id.full_name, itemDelete.fullName)
                    helper.setText(
                        R.id.address,
                        if (itemDelete.contract != null) itemDelete.contract else ""
                    )
                    helper.getView<View>(R.id.delete_bg).setOnClickListener(null)
                    helper.getView<View>(R.id.delete_bg).setOnClickListener {
                        onDeletedCoinSelection?.invoke(itemDelete.coinSelectionDataId)
                    }
                    if (itemDelete.isLockDelete) {
                        helper.getView<View>(R.id.delete_bg).visibility = View.INVISIBLE
                        helper.getView<View>(R.id.delete).visibility = View.INVISIBLE
                    } else {
                        helper.getView<View>(R.id.delete_bg).visibility = View.VISIBLE
                        helper.getView<View>(R.id.delete).visibility = View.VISIBLE
                    }
                    helper.getView<ImageView>(R.id.image)
                        .loadCoinCenterCrop(itemDelete.iconPath ?: "")
                }
                CoinEntity.SEARCH -> {
                    val itemSearch = iItem.data
                    if (FeatureUtils.isDeveloper) {
                        helper.setText(
                            R.id.name,
                            itemSearch.displayName + " : " + itemSearch.amount
                        )
                    } else {
                        helper.setText(R.id.name, itemSearch.displayName)
                    }
                    helper.setText(R.id.full_name, itemSearch.fullName)
                    helper.setText(
                        R.id.address,
                        if (itemSearch.contract != null) itemSearch.contract else ""
                    )
                    val img = helper.getView<ImageView>(R.id.action)
                    if (itemSearch.searchIsAdded) {
                        img.setImageResource(R.mipmap.btn_cancel_grey_normal)
                    } else {
                        img.setImageResource(R.mipmap.btn_add_black_normal)
                    }
                    val action = helper.getView<ImageView>(R.id.action)
                    if (itemSearch.isLockSearch) {
                        action.visibility = View.GONE
                    } else {
                        action.visibility = View.VISIBLE
                    }
                    action.setOnClickListener(null)
                    action.setOnClickListener {
                        onSearchCoin?.invoke( itemSearch.coinId, itemSearch.searchIsAdded)
                    }
                    helper.getView<ImageView>(R.id.image)
                        .loadCoinCenterCrop(itemSearch.iconPath ?: "")
                }
            }
        }
    }
}
