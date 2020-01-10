package com.ttchain.walletproject.base

import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter.AnimationType
import com.chad.library.adapter.base.animation.*
import com.chad.library.adapter.base.loadmore.LoadMoreView
import com.chad.library.adapter.base.loadmore.SimpleLoadMoreView

abstract class BaseRecyclerViewAdapter<L> : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        //Animation
        //Animation
        /**
         * Use with [.openLoadAnimation]
         */
        private const val ALPHAIN = 0x00000001
        /**
         * Use with [.openLoadAnimation]
         */
        private const val SCALEIN = 0x00000002
        /**
         * Use with [.openLoadAnimation]
         */
        private const val SLIDEIN_BOTTOM = 0x00000003
        /**
         * Use with [.openLoadAnimation]
         */
        private const val SLIDEIN_LEFT = 0x00000004
        /**
         * Use with [.openLoadAnimation]
         */
        private const val SLIDEIN_RIGHT = 0x00000005
    }

    var dataSet: MutableList<L> = arrayListOf()

    fun updateData(dataSet: MutableList<L>) {
//        val diffCallback = DiffUtils(this.dataSet, dataSet)
//        val diffResult = DiffUtil.calculateDiff(diffCallback)
//        this.dataSet.clear()
//        this.dataSet = dataSet.toMutableList()
//        diffResult.dispatchUpdatesTo(this)
//
        this.dataSet = dataSet
        notifyDataSetChanged()
    }

    //load more
    private val mNextLoadEnable = false
    private val mLoadMoreEnable = false
    private val mLoading = false
    private var mLoadMoreView: LoadMoreView = SimpleLoadMoreView()
    private val mRequestLoadMoreListener: (() -> Unit)? = null
    private val mEnableLoadMoreEndClick = false

    private var mEmptyLayout: FrameLayout? = null
    private var mIsUseEmpty = true
    private val mHeadAndEmptyEnable = false
    private val mFootAndEmptyEnable = false
    //header footer
    private val mHeaderLayout: LinearLayout? = null
    private val mFooterLayout: LinearLayout? = null

    private var mOpenAnimationEnable = false
    private var mCustomAnimation: BaseAnimation? = null
    private var mSelectAnimation: BaseAnimation = AlphaInAnimation()

    fun setEmptyView(emptyView: View) {
        var insert = false
        if (mEmptyLayout == null) {
            mEmptyLayout = FrameLayout(emptyView.context)
            val layoutParams =
                ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_PARENT,
                    ConstraintLayout.LayoutParams.MATCH_PARENT
                )
            val lp = emptyView.layoutParams
            if (lp != null) {
                layoutParams.width = lp.width
                layoutParams.height = lp.height
            }
            mEmptyLayout?.layoutParams = layoutParams
            insert = true
        }
        mEmptyLayout?.removeAllViews()
        mEmptyLayout?.addView(emptyView)
        mIsUseEmpty = true
        if (insert) {
            if (getEmptyViewCount() == 1) {
                var position = 0
                if (mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                    position++
                }
                notifyItemInserted(position)
            }
        }
    }

    /**
     * if show empty view will be return 1 or not will be return 0
     *
     * @return
     */
    private fun getEmptyViewCount(): Int {
        if (mEmptyLayout == null || mEmptyLayout!!.childCount == 0) {
            return 0
        }
        if (!mIsUseEmpty) {
            return 0
        }
        return if (dataSet.size != 0) {
            0
        } else 1
    }

    open fun getHeaderLayoutCount(): Int {
        return if (mHeaderLayout == null || mHeaderLayout.childCount == 0) {
            0
        } else 1
    }

    /**
     * if addFooterView will be return 1, if not will be return 0
     */
    open fun getFooterLayoutCount(): Int {
        return if (mFooterLayout == null || mFooterLayout.childCount == 0) {
            0
        } else 1
    }

    override fun getItemCount(): Int {
        var count: Int
        if (getEmptyViewCount() == 1) {
            count = 1
            if (mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                count++
            }
            if (mFootAndEmptyEnable && getFooterLayoutCount() != 0) {
                count++
            }
        } else {
            count =
                getHeaderLayoutCount() + dataSet.size + getFooterLayoutCount() + getLoadMoreViewCount()
        }
        return count
    }

    /**
     * Load more view count
     *
     * @return 0 or 1
     */
    open fun getLoadMoreViewCount(): Int {
        if (mRequestLoadMoreListener == null || !mLoadMoreEnable) {
            return 0
        }
        if (!mNextLoadEnable && mLoadMoreView.isLoadEndMoreGone) {
            return 0
        }
        return if (dataSet.size == 0) {
            0
        } else 1
    }

    /**
     * Set custom load more
     *
     * @param loadingView 加载视图
     */
    open fun setLoadMoreView(loadingView: LoadMoreView?) {
        mLoadMoreView = loadingView!!
    }

    /**
     * Set the view animation type.
     *
     * @param animationType One of [.ALPHAIN], [.SCALEIN], [.SLIDEIN_BOTTOM],
     * [.SLIDEIN_LEFT], [.SLIDEIN_RIGHT].
     */
    open fun openLoadAnimation(@AnimationType animationType: Int) {
        this.mOpenAnimationEnable = true
        mCustomAnimation = null
        when (animationType) {
            ALPHAIN -> mSelectAnimation = AlphaInAnimation()
            SCALEIN -> mSelectAnimation = ScaleInAnimation()
            SLIDEIN_BOTTOM -> mSelectAnimation = SlideInBottomAnimation()
            SLIDEIN_LEFT -> mSelectAnimation = SlideInLeftAnimation()
            SLIDEIN_RIGHT -> mSelectAnimation = SlideInRightAnimation()
            else -> {
            }
        }
    }
}