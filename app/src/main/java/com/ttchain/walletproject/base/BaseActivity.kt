package com.ttchain.walletproject.base

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import androidx.core.app.TaskStackBuilder
import com.ttchain.walletproject.App
import com.ttchain.walletproject.ContextWrapper
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.dialog.MessageDialog
import com.ttchain.walletproject.dialog.ProgressDialog
import com.ttchain.walletproject.utils.Utility
import kotlinx.android.synthetic.main.view_toolbar.*

abstract class BaseActivity : AppCompatActivity() {

    private var mProgressDialog: ProgressDialog? = null
    private var messageDialog: MessageDialog? = null

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


    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ContextWrapper.wrap(newBase, Utility.getPrefLocal(newBase)))
    }

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

    fun onShowMessageDialog(msg: String) {
        messageDialog = MessageDialog()
            .setMessageText(msg)
            .setPositiveButtonText(getString(R.string.g_ok))
        supportFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }

    fun onShowMessageDialogFinish(msg: String) {
        messageDialog = MessageDialog()
            .setMessageText(msg)
            .setPositiveButtonText(getString(R.string.g_ok))
            .setPositiveButtonListener {
                finishActivity()
            }.apply {
                isCancelable = false
            }
        supportFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }

    private fun closeAllDialog() {
        if (mProgressDialog != null && mProgressDialog?.isAdded == true) {
            mProgressDialog?.dismissAllowingStateLoss()
            mProgressDialog = null
        }
        if (messageDialog != null) {
            messageDialog?.dismissAllowingStateLoss()
            messageDialog = null
        }
    }

    fun finishActivity() {
        finish()
    }

    override fun onDestroy() {
        closeAllDialog()
        super.onDestroy()
    }

    fun showToast(message: String) {
        showToast(message, Toast.LENGTH_LONG)
    }

    fun showToast(message: String, lengthLong: Int) {
        Toast.makeText(this, message, lengthLong).show()
    }
}
