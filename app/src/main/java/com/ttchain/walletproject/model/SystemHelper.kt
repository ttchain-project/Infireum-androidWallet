package com.ttchain.walletproject.model

interface SystemHelper {

    var manageCoinBeanListString: String

    var showOnlyOncePerDayStatus: Boolean?

    var readDayTimeStamp: String

    var readVersionCode: Int

    fun removeAllSharedPreferences()

    fun removeUserIdentityPreferences(identityID: Int)

    fun removeShowOnlyOncePerDayStatus()

    fun removeReadDayTimeStamp()

    fun removeReadVersionCode()
}
