package com.ttchain.walletproject.view

import android.content.Context
import android.database.DataSetObservable
import android.database.DataSetObserver
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout

class FormView : LinearLayout {

    private var onItemClickListener: OnItemClickListener? = null
    private var adapter: Adapter? = null

    private val dataSetObserver = object : DataSetObserver() {
        override fun onChanged() {
            super.onChanged()
            reloadChildView()
        }
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        if (this.adapter != null) {
            this.adapter!!.unregisterDataSetObserver(this.dataSetObserver)
        }

    }

    constructor(context: Context) : super(context) {
        //        setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        //        setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
    }

    fun setAdapter(adapter: Adapter?) {
        if (this.adapter !== adapter) {
            this.adapter = adapter
            adapter?.registerDataSetObserver(this.dataSetObserver)

            this.reloadChildView()
        }
    }

    private fun reloadChildView() {
        this.removeAllViews()
        if (this.adapter != null) {
            for (i in 0 until this.adapter!!.count) {
                val view = this.adapter!!.getView(i)
                if (view != null) {
                    this.addView(view)
                }
            }

            if (onItemClickListener != null) {
                setOnItemClickListener(onItemClickListener!!)
            }

            this.requestLayout()
        }
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.onItemClickListener = listener

        for (i in 0 until this.adapter!!.count) {
            if (this.adapter!!.getItemView(i)!!.getClickable()) {
                this.adapter!!.getView(i)!!.setOnClickListener { v -> this@FormView.onItemClickListener!!.onItemClick(v, i) }
            }
        }

    }

    interface OnItemClickListener {
        fun onItemClick(var1: View, var2: Int)
    }

    abstract class ItemView(protected var context: Context) {
        val view: View
        private var clickable = true

        abstract val layoutId: Int

        init {
            this.view = LayoutInflater.from(context).inflate(this.layoutId, null)
        }

        fun setClickable(flag: Boolean) {
            this.clickable = flag
        }

        fun getClickable(): Boolean {
            return clickable
        }
    }

    class Adapter {
        private val dataSetObservable = DataSetObservable()
        private val list = arrayListOf<ItemView>()

        val count: Int
            get() = this.list.size

        fun registerDataSetObserver(observer: DataSetObserver) {
            this.dataSetObservable.registerObserver(observer)
        }

        fun unregisterDataSetObserver(observer: DataSetObserver) {
            this.dataSetObservable.unregisterObserver(observer)
        }

        fun notifyDataSetChanged() {
            this.dataSetObservable.notifyChanged()
        }

        fun getView(position: Int): View? {
            return if (position < this.list.size) this.list[position].view else null
        }

        fun getItemView(position: Int): ItemView? {
            return if (position < this.list.size) this.list[position] else null
        }

        fun add(itemView: ItemView): Adapter {
            this.list.add(itemView)
            return this
        }

        fun add(position: Int, itemView: ItemView): Adapter {
            this.list.add(position, itemView)
            return this
        }

        fun remove(position: Int) {
            this.list.removeAt(position)
        }

        fun removeAll() {
            this.list.clear()
        }
    }
}
