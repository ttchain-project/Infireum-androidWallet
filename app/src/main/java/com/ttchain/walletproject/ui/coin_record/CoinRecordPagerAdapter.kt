package com.git4u.tt_wallet_android.activity.coin.record_new

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ttchain.walletproject.ui.coin_record.list.CoinRecordListFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.CoinRecordListBean
import com.ttchain.walletproject.model.RecordEntity

class CoinRecordPagerAdapter(private val mContext: Context, fm: FragmentManager, coinId: String) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val fragmentList: MutableList<Fragment> = arrayListOf()

    init {
        when (coinId) {
            CoinEnum.TTN1.coinId -> fragmentList.apply {
                add(
                    CoinRecordListFragment.newInstance(
                        CoinRecordListBean(
                            coinId, RecordEntity.NORMAL, GlobalConstant.TRANSACTION_STATE_ALL
                        )
                    )
                )
            }
            else -> fragmentList.apply {
                add(
                    CoinRecordListFragment.newInstance(
                        CoinRecordListBean(
                            coinId, RecordEntity.NORMAL, GlobalConstant.TRANSACTION_STATE_ALL
                        )
                    )
                )
                add(
                    CoinRecordListFragment.newInstance(
                        CoinRecordListBean(
                            coinId, RecordEntity.NORMAL, GlobalConstant.TRANSACTION_STATE_OUTCOME
                        )
                    )
                )
                add(
                    CoinRecordListFragment.newInstance(
                        CoinRecordListBean(
                            coinId, RecordEntity.NORMAL, GlobalConstant.TRANSACTION_STATE_INCOME
                        )
                    )
                )
                add(
                    CoinRecordListFragment.newInstance(
                        CoinRecordListBean(
                            coinId, RecordEntity.NORMAL, GlobalConstant.TRANSACTION_STATE_FAIL
                        )
                    )
                )
            }
        }
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> mContext.getString(R.string.all)
            1 -> mContext.getString(R.string.outcome)
            2 -> mContext.getString(R.string.income)
            3 -> mContext.getString(R.string.fail)
            else -> ""
        }
    }
}
