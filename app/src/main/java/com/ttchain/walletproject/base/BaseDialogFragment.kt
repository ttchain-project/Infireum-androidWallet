package com.ttchain.walletproject.base

import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.afollestad.materialdialogs.MaterialDialog
import com.ttchain.walletproject.R
import com.ttchain.walletproject.clear
import io.reactivex.disposables.CompositeDisposable

open class BaseDialogFragment : BottomSheetDialogFragment() {

    var mMessageDialog: MaterialDialog? = null

    val mParentClassSimpleName: String? by lazy {
        activity?.javaClass?.simpleName
    }

    val mCompositeDisposable: CompositeDisposable by lazy {
        CompositeDisposable()
    }

    var mBehavior: BottomSheetBehavior<*>? = null

    var mExpanded: Boolean = false

    override fun onStart() {
        super.onStart()
        if (mExpanded) {
            mBehavior?.let {
                mBehavior!!.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
    }

    override fun onDestroy() {
        clear()
        mMessageDialog?.let {
            mMessageDialog!!.dismiss()
            mMessageDialog = null
        }
        super.onDestroy()
    }

    fun showMessageDialog(msg: String) {
        activity?.let {
            mMessageDialog = MaterialDialog.Builder(activity!!)
                    .content(msg)
                    .positiveText(R.string.g_ok)
                    .show()
        }
    }
}