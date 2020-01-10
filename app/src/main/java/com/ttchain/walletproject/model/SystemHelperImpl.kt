package com.ttchain.walletproject.model

import android.content.Context
import androidx.core.content.edit

class SystemHelperImpl(private val mContext: Context) : SystemHelper {

    companion object {
        private const val SYSTEM_PREFS = "system_prefs"
        private const val MANAGE_COIN_BEAN_LIST = "MANAGE_COIN_BEAN_LIST"
        private const val AGREEMENT_READ_DAY_TIMESTAMP = "AGREEMENT_READ_DAY_TIMESTAMP"
        private const val AGREEMENT_READ_VERSION_CODE = "AGREEMENT_READ_VERSION_CODE"
        private const val AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS =
            "AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS"
    }

    override var manageCoinBeanListString: String
        get() = mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).getString(
            MANAGE_COIN_BEAN_LIST,
            ""
        ) ?: ""
        set(value) {
            mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
                putString(MANAGE_COIN_BEAN_LIST, value)
            }
        }

    override var showOnlyOncePerDayStatus: Boolean?
        get() = mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).getBoolean(
            AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS,
            true
        )
        set(value) {
            mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
                putBoolean(AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS, value ?: false)
            }
        }


    override var readDayTimeStamp: String
        get() = mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).getString(
            AGREEMENT_READ_DAY_TIMESTAMP,
            ""
        ) ?: ""
        set(value) {
            mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
                putString(AGREEMENT_READ_DAY_TIMESTAMP, value)
            }
        }

    override var readVersionCode: Int
        get() = mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).getInt(
            AGREEMENT_READ_VERSION_CODE,
            -1
        )
        set(value) {
            mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
                putInt(AGREEMENT_READ_VERSION_CODE, value)
            }
        }

    override fun removeAllSharedPreferences() {
        mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
            clear()
        }
    }

    override fun removeUserIdentityPreferences(identityID: Int) {
        mContext.getSharedPreferences(
            UserHelperImpl.USER_PREFS + identityID,
            Context.MODE_PRIVATE
        ).edit {
            clear()
        }
        mContext.getSharedPreferences(ApiHelperImpl.API_DATA_PREFS, Context.MODE_PRIVATE).edit {
            clear()
        }
    }

    override fun removeShowOnlyOncePerDayStatus() {
        mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
            remove(AGREEMENT_SHOW_ONLY_ONCE_PER_DAY_STATUS)
        }
    }

    override fun removeReadDayTimeStamp() {
        mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
            remove(AGREEMENT_READ_DAY_TIMESTAMP)
        }
    }

    override fun removeReadVersionCode() {
        mContext.getSharedPreferences(SYSTEM_PREFS, Context.MODE_PRIVATE).edit {
            remove(AGREEMENT_READ_VERSION_CODE)
        }
    }

}
