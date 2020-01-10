package com.ttchain.walletproject.dialog

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialog
import androidx.fragment.app.DialogFragment
import com.ttchain.walletproject.R

class SelectAddressDialog : DialogFragment() {

//    private var onAddressItemClick: ((data: WalletData) -> Unit)? = null
//
//    fun setOnAddressItemClickListener(onAddressItemClick: ((data: WalletData) -> Unit)): SelectAddressDialog {
//        this.onAddressItemClick = onAddressItemClick
//        return this
//    }

    override fun onCreateDialog(savedInstanceState: Bundle?): AppCompatDialog {
        val view =
            LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_select_address, null)
        return AlertDialog.Builder(requireActivity()).apply {
            setView(view)

            setTitle(getString(R.string.select_wallet_address))
        }.run {
            create()
        }
    }
}