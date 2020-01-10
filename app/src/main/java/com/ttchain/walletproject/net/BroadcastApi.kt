package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.*
import io.reactivex.Observable
import retrofit2.http.*

interface BroadcastApi {

    /**
     * ETH廣播
     * result:txID
     * @param model 請求內容 (required)
     */
    @Headers("Content-Type:application/json")
    @POST("MainnetInfura")
    fun broadcastMainnetInfuraAsync(
        @Body model: MainnetInfuraRequest
    ): Observable<ApiResult<String>>

    /**
     * BTC廣播
     * result:txID
     * @param model 請求內容 (required)
     */
    @Headers("Content-Type:application/json")
    @POST("BlockExplorer")
    fun broadcastBlockExplorer(
        @Body model: BlockExplorerRequest
    ): Observable<ApiResult<String>>

    /**
     * SignETHOrSignETHContract
     *
     * @param body SignETHBodyModel (required)
     * @param nonce Nonce (optional)
     * @param gasLimit 計算礦工費用 (optional)
     * @param to 轉帳給 (optional)
     * @param value 金額 (optional)
     * @param gasPrice 計算礦工費用 (optional)
     */
    @Headers("Content-Type:application/json")
    @POST("SignETHContract")
    fun broadcastSignETHOrSignETHContractAsync(
        @Body body: SignETHBodyRequest,
        @Query("nonce") nonce: String?,
        @Query("gasLimit") gasLimit: String?,
        @Query("to") to: String?,
        @Query("value") value: String?,
        @Query("gasPrice") gasPrice: String?
    ): Observable<ApiResult<ResponseSignETHData>>

    /**
     * 取得BTC Unspent
     *
     * @param address 地址 (required)
     */
    @GET("BtcTransaction/{address}")
    fun broadcastGetBtcTransaction(
        @Path("address") address: String
    ): Observable<ApiResult<List<ResponseBTCTransactionData>>>

    /**
     * SignBTCOrSignBTCRelay
     *
     * @param model SignBTCBodyModel (required)
     */
    @Headers("Content-Type:application/json")
    @POST("SignBTCRelay")
    fun broadcastSignBTCOrSignBTCRelayAsync(
        @Body model: SignBTCBodyData
    ): Observable<ApiResult<ResponseSignBTCData>>

    /**
     * 取得客戶備註
     *
     * @param model 交易編號 (required)
     */
    @Headers("Content-Type:application/json")
    @POST("CustomComments")
    fun broadcastGetCustomComments(
        @Body model: TransactionData
    ): Observable<ApiResult<List<CustomCommentsData>>>

    /**
     * 新增用戶備註
     *
     * @param model CustomCommentsModel (required)
     */
    @Headers("Content-Type:application/json")
    @POST("CustomComment")
    fun broadcastAddCustomComments(
        @Body model: CustomCommentsData
    ): Observable<ApiResult<Boolean>>
}