package com.ttchain.walletproject.model

interface UserHelper {

    var selectedWalletID: Int

    var selectedWalletCategory: String

    var identityID: Int

    var userTouchId: Boolean

    var privacyMode: Boolean

    var preferLanguage: String

    var createAccountResponse: String

    var settingChanged: Boolean

    var rocketChatUid: String

    var rocketChatUserId: String

    var rocketChatAuthToken: String

    val jPushRegistrationId: String

    val jPushExtras: String

    val imageCropFileName: String

    fun removeSelectedWalletID()

    fun removeSelectedWalletCategory()

    fun removeIdentityID()

    fun removeUserTouchId()

    fun removePrivacyMode()

    fun removePreferLanguage()

    fun removeCreateAccountResponse()

    fun removeSettingChanged()

    fun removeRocketChatData()

    fun clearJPushExtras()

    fun setNotificationSwitchOn(SwitchOn: Boolean?)

    fun clearImageCropFileName()

}
