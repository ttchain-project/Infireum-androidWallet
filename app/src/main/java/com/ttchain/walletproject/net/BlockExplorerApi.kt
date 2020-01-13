package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse
import com.ttchain.walletproject.model.ApiBtcTransactionData
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BlockExplorerApi {

    @GET("/api/addr/{address}/utxo")
    fun getBtcTransaction(
            @Path("address") address: String
    ): Observable<List<ApiBtcTransactionData>>
//
//    @POST("/api/tx/send")
//    fun postBtcTransactionBroadcasting(
//            @retrofit2.http.Body model: BtcBroadcastModel
//    ): Observable<ApiPostBtcBroadcastResponse>
//
//    @GET("/api/addrs/{address}/txs")
//    fun getBtcTransactionRecord(
//            @retrofit2.http.Path("address") address: String,
//            @retrofit2.http.Query("from") from: Int,
//            @retrofit2.http.Query("to") to: Int
//    ): Observable<ApiBtcTransactionListResponse>
//
//    @GET("/api/addr/{address}/balance")
//    fun getBtcBalance(
//            @retrofit2.http.Path("address") address: String
//    ): Observable<String>


    @GET("/rawaddr/{address}")
    fun getBtcTransactionRecord(
            @Path("address") address: String
    ): Observable<ApiBlockChainBtcTransactionListResponse>

    @GET("/balance")
    fun getBtcBalance(
            @Query("active") address: String
    ): Observable<String>
}