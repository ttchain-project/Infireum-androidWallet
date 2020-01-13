package com.ttchain.walletproject.repository

import com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse
import com.ttchain.walletproject.model.ApiBtcTransactionData
import com.ttchain.walletproject.net.BlockExplorerApi
import io.reactivex.Observable

class BlockExplorerRepository(
    private val api: BlockExplorerApi
) : BaseRepository() {

    fun getBtcTransaction(address: String): Observable<List<ApiBtcTransactionData>> {
        return getApi(api.getBtcTransaction(address))
    }

    fun getBtcTransactionRecord(address: String): Observable<ApiBlockChainBtcTransactionListResponse> {
        return getApi(api.getBtcTransactionRecord(address))
    }

    fun getBtcBalance(address: String): Observable<String> {
        return getApi(api.getBtcBalance(address))
    }
}