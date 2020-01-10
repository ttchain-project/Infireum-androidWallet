package com.ttchain.walletproject.base

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import androidx.core.app.TaskStackBuilder
import com.afollestad.materialdialogs.MaterialDialog
import com.ttchain.walletproject.App
import com.ttchain.walletproject.ContextWrapper
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.dialog.ProgressDialog
import com.ttchain.walletproject.utils.Utility
import kotlinx.android.synthetic.main.view_toolbar.*

abstract class BaseActivity : AppCompatActivity() {

    private var mProgressDialog: ProgressDialog? = null
    private var mMessageDialog: MaterialDialog? = null
    private var mMessageDialogFinish: MaterialDialog? = null

    private var mActiveServiceDialog: MaterialDialog? = null
    /**
     * The ActiveServiceDialog is showing or not.
     *
     * @return
     */
    private val isShowingActiveServiceDialog: Boolean
        get() = mActiveServiceDialog != null && mActiveServiceDialog!!.isShowing


    protected abstract val layoutId: Int

    override fun onResume() {
        super.onResume()
        if (System.currentTimeMillis() < App.clickLastClickTime)
            App.clickLastClickTime = 0L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        toolbar?.let {
            setSupportActionBar(it)
            displayHomeButton(true)
        }
    }


//    override fun attachBaseContext(newBase: Context) {
//        super.attachBaseContext(ContextWrapper.wrap(newBase, Utility.getPrefLocal(newBase)))
//    }

    protected fun displayHomeButton(isDisplay: Boolean) {
        supportActionBar?.setDisplayHomeAsUpEnabled(isDisplay)
        supportActionBar?.setHomeButtonEnabled(isDisplay)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val upIntent = NavUtils.getParentActivityIntent(this)
                if (upIntent != null &&
                    NavUtils.shouldUpRecreateTask(this, upIntent) || isTaskRoot
                ) {
                    if (upIntent != null) {
                        // This activity is NOT part of this app's task, so create a new task
                        // when navigating up, with a synthesized back stack.
                        TaskStackBuilder.create(this)
                            // Add all of this activity's parents to the back stack
                            .addNextIntentWithParentStack(upIntent)
                            // Navigate up to the closest parent
                            .startActivities()
                    }
                } else {
                    // This activity is part of this app's task, so simply
                    // navigate up to the logical parent activity.
                    onBackPressed()
                }
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun onShowLoading() {
        if (mProgressDialog == null) {
            mProgressDialog = ProgressDialog()
            supportFragmentManager.addDialog(mProgressDialog!!, "loading")
        }
    }

    fun onHideLoading() {
        mProgressDialog?.dismissAllowingStateLoss()
        mProgressDialog = null
    }

    fun onShowMessageDialog(msg: String?) {
        onShowMessageDialog(msg, false)
    }

    fun onShowMessageDialog(msg: String?, showLatest: Boolean) {
        if (msg.isNullOrEmpty() && mMessageDialog != null && mMessageDialog!!.isShowing && !showLatest) {
            return
        }
        mMessageDialog = MaterialDialog.Builder(this)
            .content(msg!!)
            .positiveText(R.string.g_ok)
            .show()
    }

      fun onShowMessageDialogFinish(msg: String?) {
        if (msg.isNullOrEmpty() && mMessageDialogFinish != null && mMessageDialogFinish!!.isShowing) {
            return
        }
        mMessageDialogFinish = MaterialDialog.Builder(this)
            .autoDismiss(false)
            .cancelable(false)
            .content(msg!!)
            .positiveText(R.string.g_ok)
            .onPositive { dialog, _ ->
                dialog.dismiss()
                finish()
            }
            .show()
    }

    fun closeAllDialog() {
        if (mProgressDialog != null && mProgressDialog?.isAdded == true) {
            mProgressDialog?.dismissAllowingStateLoss()
            mProgressDialog = null
        }
        if (mMessageDialog != null) {
            mMessageDialog?.dismiss()
            mMessageDialog = null
        }
        if (mMessageDialogFinish != null) {
            mMessageDialogFinish?.dismiss()
            mMessageDialogFinish = null
        }
    }

    fun finishActivity() {
        finish()
    }

    override fun onDestroy() {
        if (isShowingActiveServiceDialog) {
            mActiveServiceDialog?.dismiss()
            mActiveServiceDialog = null
        }
        closeAllDialog()
        super.onDestroy()
    }
}
