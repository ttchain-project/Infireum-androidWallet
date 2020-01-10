package com.ttchain.walletproject.model

import android.content.Context
import android.os.Build
import androidx.core.content.edit
import java.util.*


class UserHelperImpl(private val mContext: Context) : UserHelper {


    companion object {

        const val USER_PREFS = "user_prefs"

        private const val SELECTED_WALLET_ID = "selected_wallet_id"
        private const val SELECTED_WALLET_CATEGORY = "selected_wallet_category"
        private const val IDENTITY_ID = "IDENTITY_ID"
        private const val TOUCH_ID = "TOUCH_ID"
        private const val PRIVACY_MODE = "PRIVACY_MODE"
        private const val PREF_LANGUAGE_MODE = "PREF_LANGUAGE_MODE"
        private const val CREATE_RESPONSE = "CREATE_RESPONSE"
        private const val SETTING_CHANGED = "SETTING_CHANGED"

        /**
         * Rocket Chat
         */
        private const val ROCKET_CHAT_UID = "ROCKET_CHAT_UID"
        private const val ROCKET_CHAT_AUTH_TOKEN = "ROCKET_CHAT_AUTH_TOKEN"
        private const val ROCKET_CHAT_USER_ID = "ROCKET_CHAT_USER_ID"
        private const val J_PUSH_REGISTRATION_ID = "J_PUSH_REGISTRATION_ID"
        private const val J_PUSH_EXTRAS = "J_PUSH_EXTRAS"
        private const val NOTIFICATION_SWITCH_ON = "NOTIFICATION_SWITCH_ON"
        private const val IMAGE_CROP_FILE_NAME = "IMAGE_CROP_FILE_NAME"
    }

    private val sharedPreferences by lazy {
        mContext.getSharedPreferences(USER_PREFS, Context.MODE_PRIVATE)
    }

    private val userSharedPreferences by lazy {
        mContext.getSharedPreferences(USER_PREFS + identityID, Context.MODE_PRIVATE)
    }


    override var selectedWalletID: Int
        get() = sharedPreferences.getInt(SELECTED_WALLET_ID, -1)
        set(value) = sharedPreferences.edit {
            putInt(SELECTED_WALLET_ID, value)
        }

    override var selectedWalletCategory: String
        get() = sharedPreferences.getString(SELECTED_WALLET_CATEGORY, "").orEmpty()
        set(value) = sharedPreferences.edit {
            putString(SELECTED_WALLET_CATEGORY, value)
        }

    override var identityID: Int
        get() = sharedPreferences.getInt(IDENTITY_ID, -1)
        set(value) = sharedPreferences.edit {
            putInt(IDENTITY_ID, value)
        }

    override var userTouchId: Boolean
        get() = userSharedPreferences.getBoolean(TOUCH_ID, false)
        set(value) = userSharedPreferences.edit {
            putBoolean(TOUCH_ID, value)
        }

    override var privacyMode: Boolean
        get() = userSharedPreferences.getBoolean(PRIVACY_MODE, false)
        set(value) = userSharedPreferences.edit {
            putBoolean(PRIVACY_MODE, value)
        }

    override var preferLanguage: String
        get() {
            val localeString = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                mContext.resources.configuration.locales[0].toString()
            } else {
                Locale.getDefault().toString()
            }
            return userSharedPreferences.getString(PREF_LANGUAGE_MODE, localeString) ?: localeString
        }
        set(value) = userSharedPreferences.edit {
            putString(PREF_LANGUAGE_MODE, value)
        }

    override var createAccountResponse: String
        get() {
            val prefs =
                mContext.getSharedPreferences(ApiHelperImpl.API_DATA_PREFS, Context.MODE_PRIVATE)
            return if (preferenceHelper.decrypt(
                    mContext,
                    prefs.getString(CREATE_RESPONSE, "").orEmpty()
                ) != ""
            ) preferenceHelper.decrypt(mContext, prefs.getString(CREATE_RESPONSE, "").orEmpty()) else ""
        }
        set(value) {
            mContext.getSharedPreferences(ApiHelperImpl.API_DATA_PREFS, Context.MODE_PRIVATE).edit {
                putString(CREATE_RESPONSE, preferenceHelper.encrypt(mContext, value))
            }
        }

    override var settingChanged: Boolean
        get() = userSharedPreferences.getBoolean(SETTING_CHANGED, false)
        set(value) = userSharedPreferences.edit {
            putBoolean(SETTING_CHANGED, value)
        }

    /**
     * Rocket chat
     */
    override var rocketChatUid: String
        get() {
            val uid = userSharedPreferences.getString(ROCKET_CHAT_UID, "")
            return if (uid!!.isEmpty()) "" else Utility.decryptPrivateKeyWith32ByteKey(
                uid,
                Utility.MD5Encoding(Utility.KEY)
            )
        }
        set(value) {
            var uid = value
            uid = Utility.encryptWith32ByteKey(uid, Utility.MD5Encoding(Utility.KEY))
            userSharedPreferences.edit {
                putString(ROCKET_CHAT_UID, uid)
            }
        }

    override var rocketChatUserId: String
        get() {
            return Utility.decryptPrivateKeyWith32ByteKey(
                userSharedPreferences.getString(ROCKET_CHAT_USER_ID, "").orEmpty(),
                Utility.MD5Encoding(Utility.KEY)
            )
        }
        set(value) {
            var userId = value
            userId = Utility.encryptWith32ByteKey(userId, Utility.MD5Encoding(Utility.KEY))
            userSharedPreferences.edit {
                putString(ROCKET_CHAT_USER_ID, userId)
            }
        }

    override var rocketChatAuthToken: String
        get() {
            return Utility.decryptPrivateKeyWith32ByteKey(
                userSharedPreferences.getString(ROCKET_CHAT_AUTH_TOKEN, "").orEmpty(),
                Utility.MD5Encoding(Utility.KEY)
            )
        }
        set(value) {
            var authToken = value
            authToken = Utility.encryptWith32ByteKey(authToken, Utility.MD5Encoding(Utility.KEY))
            userSharedPreferences.edit {
                putString(ROCKET_CHAT_AUTH_TOKEN, authToken)
            }
        }

    override val jPushRegistrationId: String
        get() = sharedPreferences.getString(J_PUSH_REGISTRATION_ID, "").orEmpty()

    override val jPushExtras: String
        get() = sharedPreferences.getString(J_PUSH_EXTRAS, "").orEmpty()

    override val imageCropFileName: String
        get() = sharedPreferences.getString(IMAGE_CROP_FILE_NAME, "").orEmpty()

    override fun removeSelectedWalletID() {
        sharedPreferences.edit {
            remove(SELECTED_WALLET_ID)
        }
    }

    override fun removeSelectedWalletCategory() {
        sharedPreferences.edit {
            remove(SELECTED_WALLET_CATEGORY)
        }
    }

    override fun removeIdentityID() {
        sharedPreferences.edit {
            remove(IDENTITY_ID)
        }
    }

    override fun removeUserTouchId() {
        userSharedPreferences.edit {
            remove(TOUCH_ID)
        }
    }

    override fun removePrivacyMode() {
        userSharedPreferences.edit {
            remove(PRIVACY_MODE)
        }
    }

    override fun removePreferLanguage() {
        userSharedPreferences.edit {
            remove(PREF_LANGUAGE_MODE)
        }
    }

    override fun removeCreateAccountResponse() {
        mContext.getSharedPreferences(ApiHelperImpl.API_DATA_PREFS, Context.MODE_PRIVATE).edit {
            remove(CREATE_RESPONSE)
        }
    }

    override fun removeSettingChanged() {
        userSharedPreferences.edit {
            remove(SETTING_CHANGED)
        }
    }

    override fun removeRocketChatData() {
        userSharedPreferences.edit {
            remove(ROCKET_CHAT_UID)
            remove(ROCKET_CHAT_USER_ID)
            remove(ROCKET_CHAT_AUTH_TOKEN)
        }
    }

    override fun clearJPushExtras() {
        sharedPreferences.edit {
            putString(J_PUSH_EXTRAS, "")
        }
    }

    override fun setNotificationSwitchOn(SwitchOn: Boolean?) {
        sharedPreferences.edit {
            putBoolean(NOTIFICATION_SWITCH_ON, SwitchOn ?: false)
        }
    }

    override fun clearImageCropFileName() {
        sharedPreferences.edit {
            remove(IMAGE_CROP_FILE_NAME)
        }
    }
}
