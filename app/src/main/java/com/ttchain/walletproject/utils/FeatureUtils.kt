package com.ttchain.walletproject.utils

import com.ttchain.walletproject.BuildConfig

/**
 * This class is controlling feature enable or not depend on different staff or different situation.
 */
object FeatureUtils {

    // only one api source in this app
    var FLAVOR_PRO = "pro" // for formal api
    // for developer
    var TYPE_DEVELOPER = "debug"
    // for external peoples, publish in google play with signed
    var TYPE_RELEASE = "release"
    // the version of pre-release
    var TYPE_RELEASE_BETA = "beta"

    var PLATFORM_HOCKEY = "HOCKEY"

    var PLATFORM_PLAY = "PLAY"

    val isProApi: Boolean
        get() = BuildConfig.FLAVOR == FeatureUtils.FLAVOR_PRO

    /**
     * Only the developer using.
     *
     * @return
     */
    val isDeveloper: Boolean
        get() = BuildConfig.BUILD_TYPE == TYPE_DEVELOPER

    /**
     * Release version.
     *
     * @return
     */
    val isRelease: Boolean
        get() = BuildConfig.BUILD_TYPE == TYPE_RELEASE

    /**
     * Beta version of pre-release using.
     *
     * @return
     */
    val isBeta: Boolean
        get() = BuildConfig.BUILD_TYPE == TYPE_RELEASE_BETA

    /**
     * Is release or beta version.
     *
     * @return
     */
    val isPublish: Boolean
        get() = BuildConfig.BUILD_TYPE != TYPE_DEVELOPER

    /**
     * Is release or beta version.
     *
     * @return
     */
    val isGaEnable: Boolean
        get() = BuildConfig.BUILD_TYPE != TYPE_DEVELOPER

    /**
     * Is release or beta version.
     *
     * @return
     */
    val isFabricEnable: Boolean
        get() = BuildConfig.BUILD_TYPE != TYPE_DEVELOPER

    val isHockeyPlatform: Boolean
        get() = BuildConfig.PLATFORM == PLATFORM_HOCKEY

    val isPlayPlatform: Boolean
        get() = BuildConfig.PLATFORM == PLATFORM_PLAY

    //        return !BuildConfig.BUILD_TYPE.equals(TYPE_DEVELOPER);
    val isFlurryEnable: Boolean
        get() = true
}
