package com.ttchain.walletproject.enums

import com.google.gson.TypeAdapter
import com.google.gson.annotations.JsonAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.io.IOException

@JsonAdapter(ApiCodeEnum.Adapter::class)
enum class ApiCodeEnum(val value: Int) {

    NUMBER_0(0), //成功
    NUMBER_1001(1001), //必填提示訊息
    NUMBER_1002(1002), //欄位長度提示訊息，欄位長度提示訊息
    NUMBER_1003(1003), //欄位長度提示訊息，範圍提示訊息
    NUMBER_8000(8000), //钱多多，财神爷发功
    NUMBER_8001(8001), //{0}已領取紅包，等待{1}塞錢進紅包
    NUMBER_8002(8002), //{0} 发起{1}通话
    NUMBER_8003(8003), //音频
    NUMBER_8004(8004), //视频
    NUMBER_8005(8005), //發送紅包訊息
    NUMBER_8006(8006), //結束通話
    NUMBER_9000(9000), //失敗
    NUMBER_9001(9001), //帳號不存在
    NUMBER_9002(9002), //钱包余额不足，请重新输入转帐金额与矿工费用(ETH)
    NUMBER_9003(9003), //交易失败(Nonce)，请重新提交。
    NUMBER_9004(9004), //钱包余额不足，请重新输入转帐金额与矿工费用(BTC)
    NUMBER_9005(9005), //请调高转帐金额或矿工费用
    NUMBER_9006(9006), //無效的TxId格式
    NUMBER_9007(9007), //無效的備註格式
    NUMBER_9008(9008), //無效的Token
    NUMBER_9009(9009), //欄位驗證錯誤
    NUMBER_9010(9010), //沒有權限
    NUMBER_9011(9011), //帐号已存在
    NUMBER_9012(9012), //群组已存在
    NUMBER_9013(9013), //群组不存在
    NUMBER_9014(9014), //帐号不存在该群组
    NUMBER_9015(9015), //帐号移转失败，可能帐号或移转密码错误
    NUMBER_9016(9016), //Intrinsic Gas太低
    NUMBER_9017(9017), //轉出數量低於限制
    NUMBER_9018(9018), //昵称字数过长
    NUMBER_9019(9019), //自介字数过长
    NUMBER_9020(9020), //移转密码字数过长
    NUMBER_9021(9021), //移转密码为必填
    NUMBER_9022(9022), //移转密码不正确
    NUMBER_9023(9023), //群组名称过长
    NUMBER_9024(9024), //群组描述字数过长
    NUMBER_9025(9025), //群组名称为必填
    NUMBER_9026(9026), //添加名单不存在系统
    NUMBER_9027(9027), //邀请讯息过长
    NUMBER_9028(9028), //訊息字数过长
    NUMBER_9029(9029), //红包不存在
    NUMBER_9030(9030), //红包已过期
    NUMBER_9031(9031), //领取红包活动已结束
    NUMBER_9032(9032), //红包已领取完毕
    NUMBER_9033(9033), //红包类型不符
    NUMBER_9034(9034), //红包讯息字数过长
    NUMBER_9035(9035), //聊天室不存在
    NUMBER_9036(9036), //无效的限时聊天类型
    NUMBER_9037(9037), //您不能领取该红包
    NUMBER_9038(9038), //已领取过红包
    NUMBER_9039(9039), //未添加领取名单
    NUMBER_9040(9040), //無效的聊天室類型
    NUMBER_9041(9041), //無效的版號參數：{0}
    NUMBER_9042(9042), //您没有权限检视此红包
    NUMBER_9043(9043), //建立红包时需指定使用有效的钱包币种
    NUMBER_9044(9044), //链名称过长
    NUMBER_9045(9045), //该帐户为多使用者故无法使用此组密码，请设置不同密码
    NUMBER_9046(9046), //轉出金額不能小於
    NUMBER_9047(9047), //交易失败(原因：{0})
    NUMBER_9048(9048), //已送出邀請中
    NUMBER_9049(9049), //已送出邀请，等待对方回覆邀请中
    NUMBER_9050(9050), //无效的地址，请重新输入
    NUMBER_9051(9051), //目前系统未提供此币别
    NUMBER_9052(9052), //對象已經是好友
    NUMBER_9053(9053), //红包金额不得低于{0}
    NUMBER_9054(9054), //加密货币不存在
    NUMBER_9055(9055), //无效的预约发送时间
    NUMBER_9056(9056), //无效的红包发放数量
    NUMBER_9057(9057), //无效的发放限时设定
    NUMBER_9058(9058), //该成员已在群组中
    NUMBER_9501(9501), //IM server communicate fail
    NUMBER_9502(9502), //IM user delete fail
    NUMBER_9503(9503), //IM group delete fail
    NUMBER_9504(9504), //IM group member delete fail
    NUMBER_9505(9505), //IM leave group fail
    NUMBER_9600(9600), //档案为不支援的格式
    NUMBER_9601(9601), //该档案类型超过上传容量限制的大小 or 档案类型{0}不支援{1}的档名 !!
    NUMBER_9602(9602), //档案上传失败
    NUMBER_9603(9603), //查无此档案
    NUMBER_9604(9604), //档案删除失败
    NUMBER_9700(9700), //签章失败
    NUMBER_9701(9701), //广播错误
    NUMBER_9702(9702), //系统数据加载失败，请稍后再试
    NUMBER_9998(9998), //伺服器維護中
    NUMBER_9999(9999), //系統錯誤，伺服器连线失败，请稍候重试
    NUMBER_10000(10000), //必须上传一张脸部图片
    NUMBER_10001(10001), //找无相似脸孔的会员
    NUMBER_10002(10002), //脸部辨识失败
    NUMBER_MINUS_1(-1); //未定義的錯誤

    class Adapter : TypeAdapter<ApiCodeEnum>() {
        @Throws(IOException::class)
        override fun write(
            jsonWriter: JsonWriter,
            enumeration: ApiCodeEnum
        ) {
            jsonWriter.value(enumeration.value)
        }

        @Throws(IOException::class)
        override fun read(jsonReader: JsonReader): ApiCodeEnum {
            val value = jsonReader.nextInt()
            return fromValue(value)
        }
    }

    companion object {
        fun fromValue(value: Int): ApiCodeEnum {
            return values().find {
                it.value == value
            } ?: NUMBER_MINUS_1
        }

        fun fromCode(apiCodeEnum: ApiCodeEnum): ApiCodeEnum? {
            return values().find {
                it == apiCodeEnum
            }
        }
    }
}