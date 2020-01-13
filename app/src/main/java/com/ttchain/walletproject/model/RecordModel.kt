package com.ttchain.walletproject.model

import android.content.Context
import com.ttchain.walletproject.App
import com.ttchain.walletproject.App.Companion.btcnFeeText
import com.ttchain.walletproject.App.Companion.ttnFeeText
import com.ttchain.walletproject.App.Companion.usdtnFeeText
import com.ttchain.walletproject.BuildConfig
import com.ttchain.walletproject.R
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.LightningTransRecordData
import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.database.data.UsdtTransRecordData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.utils.*

class RecordModel(
    context: Context,
    apiHelper: ApiHelper,
    userHelper: UserHelper,
    dbHelper: DbHelper
) : BaseMainModel(apiHelper, userHelper, dbHelper) {

    val mContext = context

    fun getRecordTotalEntitySize(bean: RecordQueryBean): Int {
        val walletID = bean.walletID
        val coinID = bean.coinID
        val state = bean.recordState

        val walletData = mDbHelper.getWalletData(walletID)
        val walletAddress = walletData?.address

        walletAddress?.let {
            if (bean.recordType == RecordEntity.NORMAL) {
                return mDbHelper.getTransRecordDataListByCondition(walletAddress, coinID, state)
                    .size
            } else if (bean.recordType == RecordEntity.THUNDER) {
                return mDbHelper.getAllLightningTransRecordDataList().size
            }
        }
        return 0
    }

    fun getRecordEntityList(bean: RecordQueryBean, page: Int): List<RecordEntity> {
        val walletID = bean.walletID
        val coinID = bean.coinID
        val state = bean.recordState

        val walletData = mDbHelper.getWalletData(walletID)
        val walletAddress = walletData?.address

        var recordList: ArrayList<TransRecordData>
        var recordThunderList: ArrayList<LightningTransRecordData>

        var beanList = ArrayList<RecordBean>()

        val resultList = ArrayList<RecordEntity>()

        walletAddress?.let {
            if (bean.recordType == RecordEntity.NORMAL) {
                recordList = mDbHelper.getTransRecordDataListByCondition(
                    walletAddress,
                    coinID,
                    state,
                    page
                ) as ArrayList<TransRecordData>
                for (item in recordList) {
                    beanList.add(createRecordBean(item))
                }
            } else if (bean.recordType == RecordEntity.THUNDER) {
                recordThunderList =
                    mDbHelper.getAllLightningTransRecordDataList(page) as ArrayList<LightningTransRecordData>
                for (item in recordThunderList) {
                    beanList.add(createRecordBean(item))
                }
            }
        }

        beanList = SortUtils.getRecordBeanDataListByDate(beanList) as ArrayList<RecordBean>

        if (beanList.isNotEmpty()) {
            for (item in beanList) {
                resultList.add(createRecordEntity(item, bean.recordType))
            }
        }

        return resultList
    }

    fun createRecordBean(data: TransRecordData): RecordBean {
        val bean = RecordBean()

        bean._id = data._id
        bean.status = data.status
        bean.date = when {
            data.date.isNotEmpty() -> TimeUtils.getTimeFormat(data.date)
            data.syncDate.isNotEmpty() -> TimeUtils.getTimeFormat(data.syncDate)
            else -> ""
        }

        var amountSymbol = ""

        bean.toAddress = data.toAddress
        bean.fromAddress = data.fromAddress

        when (data.status) {
            GlobalConstant.TRANSACTION_STATE_OUTCOME -> {
                bean.address = data.toAddress
                bean.statusIcon = R.mipmap.wallet_icon_out
                bean.textColorRes = R.color._FB6B5B
                bean.detailText =
                    ViewUtils.setUnderLineString(mContext.getString(R.string.look_before))
                        .toString()
                amountSymbol = "-"
            }
            GlobalConstant.TRANSACTION_STATE_INCOME -> {
                bean.address = data.fromAddress
                bean.statusIcon = R.mipmap.wallet_icon_in
                bean.textColorRes = R.color._50BE53
                bean.detailText =
                    ViewUtils.setUnderLineString(mContext.getString(R.string.look_before))
                        .toString()
                amountSymbol = "+"
            }
            GlobalConstant.TRANSACTION_STATE_FAIL -> {
                bean.address = data.toAddress
                bean.statusIcon = R.mipmap.icon_list_fail
                bean.textColorRes = R.color.colorPrimaryWarn
                bean.detailText = mContext.getString(R.string.fail)
                amountSymbol = "-"
            }
            else -> {
            }
        }

        if (data.status == GlobalConstant.TRANSACTION_STATE_OUTCOME && data.fromCoinData.coinId.equals(
                CoinEnum.BTC.coinId
            )
            && !data.block.isNullOrEmpty()
        ) {
            bean.amountText = "$amountSymbol${NumberUtils.showNonZero(
                data.toAmount.minus(data.totalFee),
                "0"
            )} ${data.fromCoinData.displayName}"
        } else if (data.fromCoinData.coinId.equals(CoinEnum.BTCN.coinId) && data.toAddress.equals(
                App.ttnRelayAddress
            )
        ) {
            bean.amountText = "$amountSymbol${NumberUtils.showNonZero(
                data.toAmount.minus(NumberUtils.valueOf(App.btcnFee)),
                "0"
            )} ${data.fromCoinData.displayName}"
        } else {
            bean.amountText = "$amountSymbol${NumberUtils.showNonZero(
                data.toAmount,
                "0"
            )} ${data.fromCoinData.displayName}"
        }

        val fromCoinText =
            "${NumberUtils.showNonZero(data.fromAmount, "0")} ${data.fromCoinData.displayName}"
        val toCoinText =
            "${NumberUtils.showNonZero(data.toAmount, "0")} ${data.toCoinData.displayName}"
        bean.coinToCoinText = "$fromCoinText → $toCoinText"

        val feeText: String
        if (data.fromCoinData.coinId == CoinEnum.USDTN.coinId) {
            feeText = when {
                data.fromAddress == App.ttnRelayAddress -> {  //deposit
                    mContext.getString(R.string.please_check_usdt_wallet)
                }
                data.toAddress == App.ttnRelayAddress -> { //withdraw
                    "$ttnFeeText, $usdtnFeeText"
                }
                else -> {
                    ttnFeeText
                }
            }
        } else if (data.fromCoinData.coinId == CoinEnum.TTN.coinId ||
            data.fromCoinData.coinId == CoinEnum.EXR.coinId ||
            data.fromCoinData.coinId == CoinEnum.MCC.coinId
        ) {
            feeText = ttnFeeText
        } else if (data.fromCoinData.coinId == CoinEnum.BTCN.coinId) {
            feeText = when {
                data.fromAddress == App.ttnRelayAddress -> //deposit
                    mContext.getString(R.string.please_check_btc_wallet)
                data.toAddress == App.ttnRelayAddress -> //withdraw
                    "$ttnFeeText, $btcnFeeText"
                else -> ttnFeeText
            }
        } else {
            feeText =
                "${NumberUtils.showNonZero(data.totalFee, "0")} ${data.feeCoinData.displayName}"
        }
//        bean.minerFeeText = mContext.getString(R.string.miner_fee) + " : $feeText"
        bean.minerFeeText = feeText

        bean.superLinkUrl = when (RuleUtils.getChainType(data.fromCoinData.chainType)) {
            ChainType.ETH -> {
                BuildConfig.ETHERSCAN_DOMAIN_URL + "tx/" + data.txId
            }
            ChainType.BTC -> {
                if (data.fromCoinData.coinId == CoinEnum.USDT.coinId) {
                    BuildConfig.OMNIEXPLORER_URL + "tx/" + data.txId
                } else {
                    BuildConfig.BLOCKEXPLORER_DOMAIN_URL + "tx/" + data.txId
                }
            }
            ChainType.TTN -> {
                App.TTN_TX_RESULT_URL + data.txId
            }
            else -> {
                ""
            }
        }

        bean.comment = data.note

        bean.block = data.block

        if (!RuleUtils.isChainType(bean.address, ChainType.TTN) && bean.isPadding) {
            bean.textColorRes = R.color._FF8603
            bean.amountText =
                bean.amountText + " " + mContext.getString(R.string.transaction_packing)
        }

        bean.txid = data.txId
        bean.coinDisplayName = data.fromCoinData.displayName

        return bean
    }

    fun createRecordBean(data: LightningTransRecordData): RecordBean {
        val bean = RecordBean()

        bean._id = data._id
        bean.status = data.status
        bean.date = TimeUtils.getTimeFormat(data.date)

        var amountSymbol = ""

        when (data.status) {
            GlobalConstant.TRANSACTION_STATE_OUTCOME -> {
                bean.address = data.toAddress
                bean.statusIcon = R.mipmap.icon_list_transfer_out
                bean.textColorRes = R.color.colorPrimary
                bean.detailText = mContext.getString(R.string.look_before)
                amountSymbol = "-"
            }
            GlobalConstant.TRANSACTION_STATE_INCOME -> {
                bean.address = data.fromAddress
                bean.statusIcon = R.mipmap.icon_list_into
                bean.textColorRes = R.color.colorPrimaryGreen
                bean.detailText = mContext.getString(R.string.look_before)
                amountSymbol = "+"
            }
            GlobalConstant.TRANSACTION_STATE_FAIL -> {
                bean.address = data.toAddress
                bean.statusIcon = R.mipmap.icon_list_fail
                bean.textColorRes = R.color.colorPrimaryWarn
                bean.detailText = mContext.getString(R.string.fail)
                amountSymbol = "-"
            }
            else -> {
            }
        }

        bean.amountText = "$amountSymbol${NumberUtils.showNonZero(data.toAmount, "0")}"

        val fromCoinText =
            "${NumberUtils.showNonZero(data.fromAmount, "0")} ${data.fromCoinData.displayName}"
        val toCoinText =
            "${NumberUtils.showNonZero(data.toAmount, "0")} ${data.toCoinData.displayName}"
        bean.coinToCoinText = "$fromCoinText → $toCoinText"

        val feeText =
            "${NumberUtils.showNonZero(data.totalFee, "0")} ${data.feeCoinData.displayName}"

        bean.minerFeeText = mContext.getString(R.string.miner_fee) + " : $feeText"

        bean.superLinkUrl = when (RuleUtils.getChainType(data.fromCoinData.chainType)) {
            ChainType.ETH -> {
                BuildConfig.ETHERSCAN_DOMAIN_URL + "tx/" + data.txId
            }
            ChainType.BTC -> {
                BuildConfig.BLOCKEXPLORER_DOMAIN_URL + "tx/" + data.txId
            }
            else -> {
                ""
            }
        }

        // if is cic chain record, remove detail text
        if (data.fromCoinData.chainType == ChainType.CIC.value) {
            bean.detailText = ""
        }

        bean.comment = data.note

        return bean
    }

    fun createRecordEntity(recordBean: RecordBean, viewType: Int): RecordEntity {
        return RecordEntity(recordBean, viewType)
    }

    fun getUsdtRecordEntityList(bean: RecordQueryBean, page: Int): List<RecordEntity> {
        val walletID = bean.walletID
        val coinID = bean.coinID
        val state = bean.recordState

        val walletData = mDbHelper.getWalletData(walletID)
        val walletAddress = walletData?.address

        var recordList: ArrayList<UsdtTransRecordData>

        var beanList = ArrayList<RecordBean>()

        val resultList = ArrayList<RecordEntity>()

        walletAddress?.let {
            if (bean.recordType == RecordEntity.NORMAL) {
                recordList = mDbHelper.getUsdtTransRecordDataListByCondition(
                    walletAddress,
                    coinID,
                    state,
                    page
                ) as ArrayList<UsdtTransRecordData>
                for (item in recordList) {
                    beanList.add(createUsdtRecordBean(item))
                }
            }
        }

        beanList = SortUtils.getRecordBeanDataListByDate(beanList) as ArrayList<RecordBean>

        if (beanList.isNotEmpty()) {
            for (item in beanList) {
                resultList.add(createRecordEntity(item, bean.recordType))
            }
        }

        return resultList
    }

    fun createUsdtRecordBean(data: UsdtTransRecordData): RecordBean {
        val bean = RecordBean()

        bean._id = data._id
        bean.status = data.status
        bean.date = if (data.date.isNotEmpty()) {
            TimeUtils.getTimeFormat(data.date)
        } else if (data.syncDate.isNotEmpty()) {
            TimeUtils.getTimeFormat(data.syncDate)
        } else {
            ""
        }

        var amountSymbol = ""

        bean.toAddress = data.toAddress
        bean.fromAddress = data.fromAddress

        when (data.status) {
            GlobalConstant.TRANSACTION_STATE_OUTCOME -> {
                bean.address = data.toAddress
                bean.statusIcon = R.mipmap.wallet_icon_out
                bean.textColorRes = R.color._FB6B5B
                bean.detailText =
                    ViewUtils.setUnderLineString(mContext.getString(R.string.look_before))
                        .toString()
                amountSymbol = "-"
            }
            GlobalConstant.TRANSACTION_STATE_INCOME -> {
                bean.address = data.fromAddress
                bean.statusIcon = R.mipmap.wallet_icon_in
                bean.textColorRes = R.color._50BE53
                bean.detailText =
                    ViewUtils.setUnderLineString(mContext.getString(R.string.look_before))
                        .toString()
                amountSymbol = "+"
            }
            GlobalConstant.TRANSACTION_STATE_FAIL -> {
                bean.address = data.toAddress
                bean.statusIcon = R.mipmap.icon_list_fail
                bean.textColorRes = R.color.colorPrimaryWarn
                bean.detailText = mContext.getString(R.string.fail)
                amountSymbol = "-"
            }
            else -> {
            }
        }

        if (data.status == GlobalConstant.TRANSACTION_STATE_OUTCOME &&
            data.fromCoinData.coinId == CoinEnum.BTC.coinId
        ) {
            bean.amountText = "$amountSymbol${NumberUtils.showNonZero(
                data.toAmount.minus(data.totalFee),
                "0"
            )} ${data.fromCoinData.displayName}"
        } else {
            bean.amountText = "$amountSymbol${NumberUtils.showNonZero(
                data.toAmount,
                "0"
            )} ${data.fromCoinData.displayName}"
        }

        val fromCoinText =
            "${NumberUtils.showNonZero(data.fromAmount, "0")} ${data.fromCoinData.displayName}"
        val toCoinText =
            "${NumberUtils.showNonZero(data.toAmount, "0")} ${data.toCoinData.displayName}"
        bean.coinToCoinText = "$fromCoinText → $toCoinText"

        val feeText: String = if (data.fromCoinData.coinId == CoinEnum.USDT.coinId) {
            "${NumberUtils.showNonZero(data.totalFee, "0")} ${CoinEnum.BTC.coinName}"
        } else {
            "${NumberUtils.showNonZero(data.totalFee, "0")} ${data.feeCoinData.displayName}"
        }
        //        bean.minerFeeText = mContext.getString(R.string.miner_fee) + " : $feeText"
        bean.minerFeeText = feeText

        bean.superLinkUrl = when (RuleUtils.getChainType(data.fromCoinData.chainType)) {
            ChainType.ETH -> {
                BuildConfig.ETHERSCAN_DOMAIN_URL + "tx/" + data.txId
            }
            ChainType.BTC -> {
                if (data.fromCoinData.coinId == CoinEnum.USDT.coinId) {
                    BuildConfig.OMNIEXPLORER_URL + "tx/" + data.txId
                } else {
                    BuildConfig.BLOCKEXPLORER_DOMAIN_URL + "tx/" + data.txId
                }
            }
            else -> {
                ""
            }
        }

        bean.comment = data.note

        bean.block = data.block

        if (!RuleUtils.isChainType(bean.address, ChainType.CIC) && bean.isPadding) {
            bean.textColorRes = R.color._FF8603
            bean.amountText =
                bean.amountText + " " + mContext.getString(R.string.transaction_packing)
        }

        bean.txid = data.txId
        bean.coinDisplayName = CoinEnum.USDT.coinName

        return bean
    }
}