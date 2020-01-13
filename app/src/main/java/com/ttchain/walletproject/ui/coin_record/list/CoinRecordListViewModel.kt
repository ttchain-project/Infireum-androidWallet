package com.ttchain.walletproject.ui.coin_record.list

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseRecyclerViewViewModel
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.CoinRecordListBean
import com.ttchain.walletproject.model.RecordEntity
import com.ttchain.walletproject.model.RecordModel
import com.ttchain.walletproject.model.RecordQueryBean
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.toMain
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

class CoinRecordListViewModel(
    private val baseMainModel: BaseMainModel,
    private val recordModel: RecordModel
) : BaseRecyclerViewViewModel<RecordEntity>() {

    private var mCoinId = ""
    private var mRecordType = -1
    private var mRecordState = -1
    private var queryBean: RecordQueryBean? = null
    private var entitySize = -1

    private val clickUrlSubject = PublishSubject.create<String>()

    fun setBean(bean: CoinRecordListBean) {
        mCoinId = bean.coinId
        mRecordType = bean.recordType
        mRecordState = bean.recordState
    }

    fun onClickDetail(url: String) {
        clickUrlSubject.onNext(url)
    }

    var launchUrlLivaData = MutableLiveData<String>()

    fun onViewCreate() {
        add(
            clickUrlSubject.throttleFirst(
                GlobalConstant.GAP_TIME_LONG.toLong(),
                TimeUnit.MILLISECONDS
            ).subscribe({ url ->
                launchUrlLivaData.value = url
            }, { throwable -> })
        )

        if (mCoinId == CoinEnum.TTN.coinId ||
            mCoinId == CoinEnum.BTCN.coinId ||
            mCoinId == CoinEnum.USDTN.coinId ||
            mCoinId == CoinEnum.EXR.coinId ||
            mCoinId == CoinEnum.MCC.coinId ||
            mCoinId == CoinEnum.DAI1.coinId ||
            mCoinId == CoinEnum.TUSD1.coinId ||
            mCoinId == CoinEnum.TTN1.coinId
        ) {
            queryBean = RecordQueryBean(
                baseMainModel.ttnWalletID,
                baseMainModel.getCoinIDByCoinId(mCoinId),
                mRecordType,
                mRecordState
            )
        } else {
            queryBean = RecordQueryBean(
                baseMainModel.selectedWalletID,
                baseMainModel.getCoinIDByCoinId(mCoinId),
                mRecordType,
                mRecordState
            )
        }
        entitySize = recordModel.getRecordTotalEntitySize(queryBean!!)

        normalRequest()
    }

    override fun normalRequest() {
        super.normalRequest()
        if (mCoinId != CoinEnum.USDT.coinId) {
            performGetTransRecordEntityList()
        } else {
            performGetUsdtTransRecordEntityList()
        }
    }

    private fun performGetTransRecordEntityList() {
        add(
            Observable.just(queryBean)
                .map { s -> recordModel.getRecordEntityList(s, mPageNow) }
                .map { s ->
                    if (hasNextPage()) {
                        mPageNow++
                    } else {
                        mPageNow = -1
                    }
                    return@map s
                }
                .toMain()
                .compose(loadingRecyclerView(mRequestStatus, false))
                .subscribe(
                    { this.onSubscribeComplete(it) },
                    { this.onSubscribeError(it) })
        )
    }

    private fun performGetUsdtTransRecordEntityList() {
        add(Observable.just(queryBean)
            .map { s -> recordModel.getUsdtRecordEntityList(s, mPageNow) }
            .map { s ->
                if (hasNextPage()) {
                    mPageNow++
                } else {
                    mPageNow = -1
                }
                return@map s
            }
            .toMain()
            .compose(loadingRecyclerView(mRequestStatus, false))
            .subscribe(
                { this.onSubscribeComplete(it) },
                { this.onSubscribeError(it) })
        )
    }

    public override fun loadMoreRequest() {
        super.loadMoreRequest()
        if (mPageNow > 1) {
            normalRequest()
        }
    }

    fun hasNextPage(): Boolean {
        return mPageNow * GlobalConstant.PAGE_LIMIT_NORMAL < entitySize
    }

}