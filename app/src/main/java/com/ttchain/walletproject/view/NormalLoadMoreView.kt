package com.ttchain.walletproject.view

import com.chad.library.adapter.base.loadmore.LoadMoreView
import com.ttchain.walletproject.R

class NormalLoadMoreView : LoadMoreView() {
    override fun getLayoutId(): Int {
        return R.layout.view_normal_load_more
    }

    override fun getLoadingViewId(): Int {
        return R.id.load_more_loading_view
    }

    override fun getLoadFailViewId(): Int {
        return R.id.load_more_load_fail_view
    }

    override fun getLoadEndViewId(): Int {
        return R.id.load_more_load_end_view
    }
}
