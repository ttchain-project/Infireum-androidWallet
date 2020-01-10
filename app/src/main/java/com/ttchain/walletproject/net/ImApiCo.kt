package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.*
import kotlinx.coroutines.Deferred
import retrofit2.http.*
import java.util.*

interface ImApiCo {

    /**
     * 預登入取得使用帳號 (Orange)
     *
     * @param model PreLoginModel (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/PreLogin")
    fun iMPreLogin(
        @Body model: PreLoginRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<RegisterUserData>>

    /**
     * 預登入取得使用帳號 (Orange)
     *
     * @param model PreLoginModel (required)
     * @param lang  (required)
     * @return Call&lt;ApiResponseRegisterUserModel&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/PreLogin")
    fun cultureIMPreLogin(
        @Path("lang") lang: String,
        @Body model: PreLoginRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<RegisterUserData>>

    /**
     * 取得個人資訊 (Orange)
     *
     * @param uid 使用者代號 (required)
     * @param systemId 系統ID (required)
     */
    @GET("IM/GetUserData")
    fun iMGetUserData(
        @Query("uid") uid: UUID,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<PersonalInfo>>

    /**
     * 取得個人資訊 (Orange)
     *
     * @param lang language code : Use Utils.getYuiApiLanguageQuery(context)
     * @param uid 使用者代號 (required)
     * @param systemId 系統ID (required)
     */
    @GET("{lang}/IM/GetUserData")
    fun iMGetUserData(
        @Path("lang") lang: String,
        @Query("uid") uid: UUID,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<PersonalInfo>>

    /**
     * 更新使用者資訊 (Orange)
     *
     * @param model 使用者資訊 (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/UpdateUser")
    fun iMUpdateUser(
        @Body model: UpdateUserInfoRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 更新使用者資訊 (Orange)
     *
     * @param lang  (required)
     * @param model 使用者資訊 (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/UpdateUser")
    fun cultureIMUpdateUser(
        @Path("lang") lang: String,
        @Body model: UpdateUserInfoRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 取得他人個人信息(Albert)
     *
     * @param uid 會員自身識別Id (required)
     * @param targetUid 目標會員識別Id (required)
     * @param systemId 系統ID (required)
     */
    @GET("IM/SearchUser")
    fun iMSearchUser(
        @Query("uid") uid: UUID,
        @Query("targetUid") targetUid: UUID,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<QueryUserResponse>>


    /**
     * 取得他人個人信息(Albert)
     *
     * @param lang  (required)
     * @param uid 會員自身識別Id (required)
     * @param targetUid 目標會員識別Id (required)
     * @return Call&lt;ApiResponseQueryUserResponse&gt;
     */
    @GET("{lang}/IM/SearchUser")
    fun cultureIMSearchUser(
        @Path("lang") lang: String?,
        @Query("uid") uid: UUID?,
        @Query("targetUid") targetUid: UUID?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<QueryUserResponse>>

    /**
     * 設置 Recovery Key (Orange)
     *
     * @param model RecoveryKeyModel (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/SetRecoveryKey")
    fun iMSetRecoveryKey(
        @Body model: RecoveryKeyRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 設置 Recovery Key (Orange)
     *
     * @param model RecoveryKeyModel (required)
     * @param lang  (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/SetRecoveryKey")
    fun cultureIMSetRecoveryKey(
        @Path("lang") lang: String?,
        @Body model: RecoveryKeyRequest?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 封鎖/解除封鎖好友(Albert)
     * Action參數：block；unblock
     * @param model FriendshipBlock (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/blocklist")
    fun iMBlockMember(
        @Body model: FriendshipBlockRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 封鎖/解除封鎖好友(Albert)
     * Action參數：block；unblock
     * @param model FriendshipBlock (required)
     * @param lang  (required)
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/blocklist")
    fun cultureIMBlockMember(
        @Path("lang") lang: String?,
        @Body model: FriendshipBlockRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 發送好友邀請(Albert)
     *
     * @param model FriendshipRequest (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/friendship")
    fun iMRequestFriendship(
        @Body model: FriendshipRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 發送好友邀請(Albert)
     *
     * @param model FriendshipRequest (required)
     * @param lang  (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/friendship")
    fun cultureIMRequestFriendship(
        @Path("lang") lang: String?,
        @Body model: FriendshipRequest?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>


    /**
     * 新增群組 (Orange)
     *
     * @param model 群組資訊 (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/CreateGroup")
    fun iMCreateGroup(
        @Body model: AddGroupData,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<GroupInfoData>>

    /**
     * 新增群組 (Orange)
     *
     * @param model 群組資訊 (required)
     * @param lang  (required)
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/CreateGroup")
    fun cultureIMCreateGroup(
        @Path("lang") lang: String,
        @Body model: AddGroupData,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<GroupInfoData>>

    /**
     * 取得群組資訊 (Orange)
     *
     * @param uid 使用者代號 (required)
     * @param systemId 系統ID (required)
     * @param groupID 群組代號。groupID or roomId choice one, if both are entered, first reference (optional)
     * @param roomId 聊天室代號。groupID or roomId choice one (optional)
     */
    @GET("IM/GetGroupInfo")
    fun iMGetGroupInfo(
        @Query("uid") uid: UUID,
        @Header("SystemId") systemId: String,
        @Query("groupID") groupID: String?,
        @Query("roomId") roomId: String?
    ): Deferred<ApiResult<GroupInfoData>>

    /**
     * 取得群組資訊 (Orange)
     *
     * @param lang  (required)
     * @param uid 使用者代號 (required)
     * @param groupID 群組代號。groupID or roomId choice one, if both are entered, first reference (optional)
     * @param roomId 聊天室代號。groupID or roomId choice one (optional)
     * @return Call&lt;ApiResponseGroupInfoModel&gt;
     */
    @GET("{lang}/IM/GetGroupInfo")
    fun cultureIMGetGroupInfo(
        @Path("lang") lang: String?,
        @Query("uid") uid: UUID?,
        @Query("groupID") groupID: String?,
        @Query("roomId") roomId: String?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<GroupInfoData>>

    /**
     * 回覆群組邀請 (Orange)
     * 退出群組請送 Status&#x3D;2
     * @param model 回覆設定 (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/GroupInviteReply")
    fun iMGroupInviteReply(
        @Body model: GroupMemberInviteRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 回覆群組邀請 (Orange)
     * 退出群組請送 Status&#x3D;2
     * @param model 回覆設定 (required)
     * @param lang  (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/GroupInviteReply")
    fun cultureIMGroupInviteReply(
        @Path("lang") lang: String,
        @Body model: GroupMemberInviteRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 取得使用者關閉提醒的聊天室Id清單
     *
     * @param uid 會員Uid (required)
     * @param systemId 系統ID (required)
     * @return Call&lt;ApiResponseIEnumerableMuteRoom&gt;
     */
    @GET("IM/Member/MuteRooms")
    fun iMGetMemberMuteRoomList(
        @Query("uid") uid: UUID,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<List<MuteRoomData>>>

    /**
     * 取得使用者關閉提醒的聊天室Id清單
     *
     * @param lang  (required)
     * @param uid 會員Uid (required)
     * @return Call&lt;ApiResponseIEnumerableMuteRoom&gt;
     */
    @GET("{lang}/IM/Member/MuteRooms")
    fun cultureIMGetMemberMuteRoomList(
        @Path("lang") lang: String?,
        @Query("uid") uid: UUID?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<List<MuteRoomData>>>


    /**
     * 刪除群組 (Orange)
     *
     * @param model 刪除設定 (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/DeleteGroup")
    fun iMDeleteGroup(
        @Body model: GroupDeleteRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>


    /**
     * 刪除群組 (Orange)
     *
     * @param model 刪除設定 (required)
     * @param lang  (required)
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/DeleteGroup")
    fun cultureIMDeleteGroup(
        @Path("lang") lang: String,
        @Body model: GroupDeleteRequest,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 更新群組資訊 (Orange)
     *
     * @param model 群組資訊 (required)
     * @param systemId 系統ID (required)
     */
    @Headers("Content-Type:application/json")
    @POST("IM/UpdateGroup")
    fun iMUpdateGroup(
        @Body model: UpdateGroupInfoData,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 更新群組資訊 (Orange)
     *
     * @param model 群組資訊 (required)
     * @param lang  (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/UpdateGroup")
    fun cultureIMUpdateGroup(
        @Path("lang") lang: String?,
        @Body model: UpdateGroupInfoData?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 設定使用者聊天室訊息提醒
     *
     * @param model ChatRoomNotificationSetting (required)
     * @param systemId 系統ID (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("IM/Member/MuteRoom")
    fun iMSetChatRoomNotification(
        @Body model: ChatRoomNotificationSetting,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>

    /**
     * 設定使用者聊天室訊息提醒
     *
     * @param model ChatRoomNotificationSetting (required)
     * @param lang  (required)
     * @return Call&lt;ApiResponseBoolean&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("{lang}/IM/Member/MuteRoom")
    fun cultureIMSetChatRoomNotification(
        @Path("lang") lang: String?,
        @Body model: ChatRoomNotificationSetting?,
        @Header("SystemId") systemId: String
    ): Deferred<ApiResult<Boolean>>
}