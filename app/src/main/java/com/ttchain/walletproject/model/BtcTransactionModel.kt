package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class BtcTransactionModel : Serializable {

    /**
     * token : btc
     * privatekey : L1uyy5qTuGrVXrmrsvHWHgVzW9kKdrp27wBC7Vs6nZDTF2BRUVwy
     * tx : [{"address":"1138DmfNXq44erShdVnfTgRJuNsdkLhcj1","value":7430},{"address":"1qQZ8X1waotobH7yHzyE41pMtxBYb9Ykg","value":5460}]
     * unspend : [{"txid":"6c215b731831dceed69f2a36312ef1b305df8ad3af57df37609b571b9727e42d","value":1110},{"txid":"6c215b731831dceed69f2a36312ef1b305df8ad3af57df37609b571b9727e421","value":111000}]
     */
    @SerializedName("token")
    var token: String? = null
    @SerializedName("privatekey")
    var privatekey: String? = null
    @SerializedName("tx")
    var tx: List<BtcTxBean>? = null
    @SerializedName("unspend")
    var unspend: List<BtcUnSpendBean>? = null
    @SerializedName("compressed")
    var compressed: Boolean? = null
    @SerializedName("encry")
    var encry: Boolean? = null
}
