package com.ttchain.walletproject.repository

import com.ttchain.walletproject.model.ApiEtherscanResponse
import com.ttchain.walletproject.net.EtherscanApi
import io.reactivex.Observable

class EtherscanApiRepository(private val api: EtherscanApi) : BaseRepository() {

    fun performGetEtherscanApiResult(queryMap: Map<String, String>): Observable<ApiEtherscanResponse> {
        return getApi(api.getEtherscanApiResult(queryMap))
    }
}