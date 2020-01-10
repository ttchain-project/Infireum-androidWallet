package com.ttchain.walletproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.chad.library.adapter.base.loadmore.LoadMoreView
import com.ttchain.walletproject.R
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.view.NormalLoadMoreView

abstract class BaseRecyclerViewFragmentNew<L> : BaseFragment(),
    BaseQuickAdapter.RequestLoadMoreListener,
    SwipeRefreshLayout.OnRefreshListener,
    BaseQuickAdapter.OnItemClickListener {

    private var onItemClick: ((item: L) -> Unit)? = null

    fun setOnItemClickListener(onItemClick: ((item: L) -> Unit)) {
        this.onItemClick = onItemClick
    }

    private var onItemClickWithPosition: ((item: L, position: Int) -> Unit)? = null

    fun setOnItemClickWithPositionListener(onItemClickWithPosition: ((item: L, position: Int) -> Unit)) {
        this.onItemClickWithPosition = onItemClickWithPosition
    }

    private var onLoadMoreRequested: (() -> Unit)? = null

    fun setOnLoadMoreRequestedListener(onLoadMoreRequested: (() -> Unit)) {
        this.onLoadMoreRequested = onLoadMoreRequested
    }

    protected abstract val recyclerViewId: Int
    protected abstract val mBaseSwipeRefreshLayoutId: Int

    protected var mBaseAdapter: BaseQuickAdapter<L, BaseViewHolder>? = null
    // new
    protected var mBaseNewAdapter: BaseRecyclerViewAdapter<L>? = null
    protected var mBaseSwipeRefreshLayout: SwipeRefreshLayout? = null
    protected var mBaseRecyclerView: RecyclerView? = null

    protected var mBaseEmptyView: View? = null
    protected var mBaseEmptyImageView: ImageView? = null
    protected var mBaseLargeEmptyMsg: TextView? = null
    protected var mBaseEmptyMsg: TextView? = null

    protected fun canScrollVertical(): Boolean {
        return true
    }

    protected fun canScrollHorizontal(): Boolean {
        return false
    }

    protected fun isEnableItemDecoration(): Boolean {
        return false
    }

    protected fun isEnableItemClick(): Boolean {
        return false
    }

    protected abstract fun setAdapter(): BaseQuickAdapter<L, BaseViewHolder>

//    protected abstract fun setNewAdapter(): BaseRecyclerViewAdapter<L>

    /**
     * Override when you want to use others LoadMoreView.
     *
     * @return [NormalLoadMoreView]
     */
    protected fun setLoadMoreView(): LoadMoreView {
        return NormalLoadMoreView()
    }

    /**
     * Override parameters into one of those: ALPHAIN, SCALEIN, SLIDEIN_BOTTOM, SLIDEIN_LEFT, SLIDEIN_RIGHT.
     *
     * @return -1 in default to disable.
     */
    protected fun setOpenLoadAnimation(): Int {
        return -1
    }

    /**
     * Override when you want to change the default LayoutManager type.
     *
     * @return LinearLayoutManager in default.
     */
    protected fun setLayoutManager(): RecyclerView.LayoutManager {
        return object : LinearLayoutManager(requireActivity()) {
            override fun canScrollVertically(): Boolean {
                return canScrollVertical()
            }

            override fun canScrollHorizontally(): Boolean {
                return canScrollHorizontal()
            }
        }
    }

    /**
     * Override when you use the BaseMultiItemQuickAdapter.
     *
     * @return
     */
    protected fun setSpanSizeLookup(): BaseQuickAdapter.SpanSizeLookup? {
        return null
    }

    protected open fun isEnableRefresh(): Boolean {
        return true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mBaseRecyclerView = view.findViewById(recyclerViewId)
        mBaseSwipeRefreshLayout = view.findViewById(mBaseSwipeRefreshLayoutId)
        mBaseAdapter = setAdapter()
//        mBaseNewAdapter = setNewAdapter()

        mBaseAdapter?.setOnLoadMoreListener(this, mBaseRecyclerView)

        if (mBaseSwipeRefreshLayout != null) {
            mBaseSwipeRefreshLayout?.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light
            )

            mBaseSwipeRefreshLayout?.setOnRefreshListener(this)

            mBaseSwipeRefreshLayout?.isEnabled = isEnableRefresh()
        }
        mBaseAdapter?.setLoadMoreView(setLoadMoreView())
        mBaseNewAdapter?.setLoadMoreView(setLoadMoreView())
        if (setOpenLoadAnimation() > 0) {
            mBaseAdapter?.openLoadAnimation(setOpenLoadAnimation())
            mBaseNewAdapter?.openLoadAnimation(setOpenLoadAnimation())
        }

        mBaseAdapter?.onItemClickListener = this

        if (isEnableItemDecoration()) {
            mBaseRecyclerView?.addItemDecoration(
                DividerItemDecoration(
                    requireContext(),
                    LinearLayout.VERTICAL
                )
            )
        }
        mBaseRecyclerView?.layoutManager = setLayoutManager()
        mBaseAdapter?.setSpanSizeLookup(setSpanSizeLookup())
        mBaseEmptyView = LayoutInflater.from(requireContext())
            .inflate(R.layout.view_empty, mBaseRecyclerView?.parent as ViewGroup, false)

        mBaseEmptyImageView = mBaseEmptyView?.findViewById(R.id.empty_img)
        mBaseLargeEmptyMsg = mBaseEmptyView?.findViewById(R.id.large_empty_msg)
        mBaseEmptyMsg = mBaseEmptyView?.findViewById(R.id.empty_msg)

        mBaseEmptyView?.setDelayClickListener { onRefresh() }
        mBaseAdapter?.emptyView = mBaseEmptyView
//        mBaseNewAdapter?.setEmptyView()
        mBaseRecyclerView?.adapter = mBaseAdapter

        super.onViewCreated(view, savedInstanceState)
    }


    override fun onItemClick(adapter: BaseQuickAdapter<*, *>, view: View, position: Int) {
        onItemClick?.invoke(adapter.getItem(position) as L)
        onItemClickWithPosition?.invoke(adapter.getItem(position) as L, position)
    }

    fun setListData(list: List<L>) {
        mBaseAdapter?.setNewData(list)
    }

    fun addArrayListData(data: Collection<L>) {
        mBaseAdapter?.addData(data)
    }

    fun loadMoreComplete() {
        mBaseAdapter?.loadMoreComplete()
    }

    fun loadMoreEnd(status: Boolean) {
        mBaseAdapter?.loadMoreEnd(status)
    }


    fun showRefreshLoading() {
        if (mBaseSwipeRefreshLayout != null) {
            mBaseSwipeRefreshLayout?.isRefreshing = true
        }
    }

    fun hideRefreshLoading() {
        if (mBaseSwipeRefreshLayout != null) {
            mBaseSwipeRefreshLayout?.isRefreshing = false
        }
    }

    fun onShowRecyclerViewLoading() {
        super.onShowLoading()
        setEmptyViewVisibility(View.INVISIBLE)
    }

    fun onHideRecyclerViewLoading() {
        super.onHideLoading()
        setEmptyViewVisibility(View.VISIBLE)
    }


    fun setEmptyViewVisibility(visibility: Int) {
        mBaseEmptyView?.visibility = visibility
    }

    fun setEmptyMsg(msg: String) {
        mBaseEmptyMsg?.text = msg
    }

    fun getLinearLayoutManager(): LinearLayoutManager? {
        return if (mBaseRecyclerView != null) {
            mBaseRecyclerView?.layoutManager as LinearLayoutManager?
        } else {
            null
        }
    }

    override fun onLoadMoreRequested() {
        onLoadMoreRequested?.invoke()
    }

}