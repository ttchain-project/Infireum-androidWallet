package com.ttchain.walletproject.base

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NavUtils
import androidx.core.app.TaskStackBuilder
import com.afollestad.materialdialogs.MaterialDialog
import com.ttchain.walletproject.App

abstract class BaseActivity : AppCompatActivity() {


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
//        toolbar?.let {
//            setSupportActionBar(it)
//            displayHomeButton(true)
//        }
    }
//
//
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

    fun finishActivity() {
        finish()
    }

    override fun onDestroy() {
        if (isShowingActiveServiceDialog) {
            mActiveServiceDialog?.dismiss()
            mActiveServiceDialog = null
        }
        super.onDestroy()
    }
}
