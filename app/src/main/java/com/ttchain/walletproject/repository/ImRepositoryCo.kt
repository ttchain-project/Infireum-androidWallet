package com.ttchain.walletproject.repository

import com.ttchain.walletproject.BuildConfig
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.net.ImApiCo
import com.ttchain.walletproject.utils.Utils
import java.util.*

class ImRepositoryCo(
    private val imApiCo: ImApiCo
) : BaseRepository() {

    companion object {

        // preLogin response status
        const val USER_NOT_EXIST = 0
        const val USER_EXIST = 1
        const val DEVICE_NOT_MATCH = 2

        const val GROUP_MEMBERS_ADD = 1
        const val GROUP_MEMBERS_UPDATE = 2

        const val ROOM_TYPE_PM = "PrivateMessage"
        const val ROOM_TYPE_GROUP = "Group"
        const val ROOM_TYPE_CHANNEL = "Channel"

        const val VIDEO_CALL = "video"
        const val AUDIO_CALL = "audio"
    }

    /**
     * 預登入取得使用帳號 (Orange)
     *
     * @param model PreLoginModel (required)
     */
    suspend fun preLogin(model: PreLoginRequest): RepositoryResult<RegisterUserData> =
        checkDeferred(
            imApiCo.cultureIMPreLogin(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 取得個人資訊 (Orange)
     *
     * @param uId 使用者代號 (required)
     */
    suspend fun iMGetUserData(uId: UUID): RepositoryResult<PersonalInfo> =
        checkDeferred(
            imApiCo.iMGetUserData(
                Utils.getYuiApiLanguageQuery(),
                uId,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 更新使用者資訊 (Orange)
     *
     * @param model 使用者 model
     */
    suspend fun iMUpdateUser(model: UpdateUserInfoRequest): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMUpdateUser(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 取得他人個人信息(Albert)
     *
     * @param uid 會員自身識別Id (required)
     * @param targetUid 目標會員識別Id (required)
     */
    suspend fun iMSearchUser(uid: UUID, targetUid: UUID): RepositoryResult<QueryUserResponse> =
        checkDeferred(
            imApiCo.cultureIMSearchUser(
                Utils.getYuiApiLanguageQuery(),
                uid,
                targetUid,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 設置 Recovery Key (Orange)
     *
     * @param model RecoveryKeyModel (required)
     */
    suspend fun iMSetRecoveryKey(model: RecoveryKeyRequest): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMSetRecoveryKey(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 封鎖/解除封鎖好友(Albert)
     * Action參數：block；unblock
     *
     * @param model FriendshipBlock (required)
     */
    suspend fun iMBlockMember(model: FriendshipBlockRequest): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMBlockMember(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 發送好友邀請(Albert)
     *
     * @param model FriendshipRequest (required)
     */
    suspend fun iMRequestFriendship(model: FriendshipRequest): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMRequestFriendship(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 新增群組 (Orange)
     *
     * @param model 群組資訊 (required)
     */
    suspend fun iMCreateGroup(model: AddGroupData): RepositoryResult<GroupInfoData> =
        checkDeferred(
            imApiCo.cultureIMCreateGroup(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 取得群組資訊 (Orange)
     *
     * @param uid 使用者代號 (required)
     * @param groupID 群組代號。groupID or roomId choice one, if both are entered, first reference (optional)
     * @param roomId 聊天室代號。groupID or roomId choice one (optional)
     */
    suspend fun iMGetGroupInfo(
        uid: UUID,
        groupID: String?,
        roomId: String?
    ): RepositoryResult<GroupInfoData> =
        checkDeferred(
            imApiCo.cultureIMGetGroupInfo(
                Utils.getYuiApiLanguageQuery(),
                uid,
                groupID,
                roomId,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 回覆群組邀請 (Orange)
     * 退出群組請送 Status&#x3D;2
     * @param request 回覆設定 (required)
     */
    suspend fun iMGroupInviteReply(request: GroupMemberInviteRequest): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMGroupInviteReply(
                Utils.getYuiApiLanguageQuery(),
                request,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 取得使用者關閉提醒的聊天室Id清單
     *
     * @param uuid 會員Uid (required)
     */
    suspend fun iMGetMemberMuteRoomList(uuid: UUID): RepositoryResult<List<MuteRoomData>> =
        checkDeferred(
            imApiCo.cultureIMGetMemberMuteRoomList(
                Utils.getYuiApiLanguageQuery(),
                uuid,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 刪除群組 (Orange)
     *
     * @param request 刪除設定 (required)
     */
    suspend fun iMDeleteGroup(request: GroupDeleteRequest): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMDeleteGroup(
                Utils.getYuiApiLanguageQuery(),
                request,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 更新群組資訊 (Orange)
     *
     * @param request 群組資訊 (required)
     */
    suspend fun iMUpdateGroup(request: UpdateGroupInfoData): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMUpdateGroup(
                Utils.getYuiApiLanguageQuery(),
                request,
                BuildConfig.SYSTEM_ID
            )
        )

    /**
     * 設定使用者聊天室訊息提醒
     *
     * @param model ChatRoomNotificationSetting (required)
     */
    suspend fun iMSetChatRoomNotification(model: ChatRoomNotificationSetting): RepositoryResult<Boolean> =
        checkDeferred(
            imApiCo.cultureIMSetChatRoomNotification(
                Utils.getYuiApiLanguageQuery(),
                model,
                BuildConfig.SYSTEM_ID
            )
        )

}