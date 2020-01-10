package com.ttchain.walletproject.repository

import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.net.BroadcastApi
import io.reactivex.Observable

class BroadcastRepository(private val api: BroadcastApi) : BaseRepository() {

    fun performMainnetInfuraRequest(
        model: MainnetInfuraRequest
    ): Observable<RepositoryResult<String>> {
        return getApi(api.broadcastMainnetInfuraAsync(model))
            .map { checkResultRepository(it) }
    }

    fun performBlockExplorerRequest(
        model: BlockExplorerRequest
    ): Observable<RepositoryResult<String>> {
        return getApi(api.broadcastBlockExplorer(model))
            .map { checkResultRepository(it) }
    }

    fun performEthSignRequest(
        model: SignETHBodyRequest,
        signEthQueryModel: SignEthQueryModel
    ): Observable<RepositoryResult<ResponseSignETHData>> {
        return getApi(
            api.broadcastSignETHOrSignETHContractAsync(
                model,
                signEthQueryModel.nonce,
                signEthQueryModel.gasLimit,
                signEthQueryModel.to,
                signEthQueryModel.value,
                signEthQueryModel.gasPrice
            )
        ).map { checkResultRepository(it) }
    }

    fun performGetBtcTransactionRequest(
        address: String
    ): Observable<RepositoryResult<List<ResponseBTCTransactionData>>> {
        return getApi(api.broadcastGetBtcTransaction(address))
            .map { checkResultRepository(it) }
    }

    fun performBtcSignRequest(
        model: SignBTCBodyData
    ): Observable<RepositoryResult<ResponseSignBTCData>> {
        return getApi(api.broadcastSignBTCOrSignBTCRelayAsync(model))
            .map { checkResultRepository(it) }
    }

    fun performGetCommentsRequest(model: TransactionData): Observable<RepositoryResult<List<CustomCommentsData>>> {
        return getApi(api.broadcastGetCustomComments(model))
            .map { checkResultRepository(it) }
    }

    fun performPostCommentRequest(model: CustomCommentsData): Observable<RepositoryResult<Boolean>> {
        return getApi(api.broadcastAddCustomComments(model))
            .map { checkResultRepository(it) }
    }
}