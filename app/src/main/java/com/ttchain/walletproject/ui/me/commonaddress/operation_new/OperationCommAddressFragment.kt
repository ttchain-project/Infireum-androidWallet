package com.ttchain.walletproject.ui.me.commonaddress.operation_new

import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.database.data.AddressData
import com.ttchain.walletproject.dialog.CommAddressDialog
import com.ttchain.walletproject.enums.QRCodeEnum
import com.ttchain.walletproject.performCopyString
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.scanner_new.ScannerActivity
import kotlinx.android.synthetic.main.fragment_add_comm_address_new_new.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class OperationCommAddressFragment : BaseFragment() {

    companion object {
        fun newInstance(addressID: Int?, address: String) = OperationCommAddressFragment().apply {
            arguments = bundleOf(
                OperationCommAddressActivity._ID to addressID,
                OperationCommAddressActivity._ADDRESS to address
            )
        }
    }

    private val viewModel by viewModel<OperationCommAddressNewViewModel>()

    private val bundleAddressIDValue: Int by lazy {
        arguments?.getInt(OperationCommAddressActivity._ID, -1) ?: -1
    }

    private val bundleAddressValue: String by lazy {
        arguments?.getString(OperationCommAddressActivity._ADDRESS) ?: ""
    }

    override val layoutId = R.layout.fragment_add_comm_address_new_new

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (bundleAddressIDValue != -1)
            setHasOptionsMenu(false)
        else
            setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun initView() {
        requireActivity().title = getString(R.string.operation_comm_address_title)
        viewModel.apply {
            getWalletNameListRx()
        }
        editTextName.addTextChangedListener {
            textViewError.text = ""
        }
        copy.setDelayClickListener {
            editTextAddress.text.toString().performCopyString(requireContext())
        }
        create.setOnClickListener {
            if (bundleAddressIDValue == -1)
                viewModel.onSaveClick(
                    editTextName.text.toString(),
                    editTextNote.text.toString(),
                    editTextAddress.text.toString()
                )
            else
                if (editTextName.isEnabled &&
                    editTextAddress.isEnabled &&
                    editTextNote.isEnabled
                ) {
                    viewModel.onSaveClick(
                        editTextName.text.toString(),
                        editTextNote.text.toString(),
                        editTextAddress.text.toString()
                    )
                } else {
                    setEnable()
                }
        }
        previous.setDelayClickListener {
            if (bundleAddressIDValue == -1)
                finishActivity()
            else
                setDisable()
        }
    }

    private fun initData() {
        viewModel.apply {
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
            getWalletNameListLiveData.observe(requireActivity()) {
                setAddressIDRx(bundleAddressIDValue)
                address = bundleAddressValue
            }
            getAddressDataLiveData.observe(requireActivity()) {
                setView(it)
            }
            nameErrorLiveData.observe(requireActivity()) {
                textViewError.text = it
            }
            onShowMessageDialogLiveData.observe(requireActivity()) {
                onShowMessageDialog(it)
            }
            performPostAddressBookDataListLiveData.observe(requireActivity()) {
                if (it) {
                    val commAddressDialog = CommAddressDialog()
                        .setIsEdit(false)
                        .setOnConfirmClickListener {
                            finishActivity()
                        }
                    childFragmentManager.addDialog(commAddressDialog, "add")
                }
            }
            performPutAddressBookDataLiveData.observe(requireActivity()) {
                if (it) {
                    val commAddressDialog = CommAddressDialog()
                        .setIsEdit(true)
                        .setOnConfirmClickListener {
                            finishActivity()
                        }
                    childFragmentManager.addDialog(commAddressDialog, "edit")
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_scan, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.scan -> {
                ScannerActivity.launchForResult(this, ScannerActivity.BASIC, QRCodeEnum.TYPE_IMPORT)
                return true
            }
        }
        return false
    }

    private fun setInputAddress(qrCode: String) {
        editTextAddress.setText(qrCode)
    }

    private fun setView(addressBean: AddressData) {
        editTextName.setText(addressBean.name)
        editTextAddress.setText(addressBean.address)
        editTextNote.setText(addressBean.note)
        setDisable()
    }

    private fun setEnable() {
        copy.visibility = View.GONE
        editTextName.isEnabled = true
        editTextAddress.isEnabled = true
        editTextNote.isEnabled = true
        previous.visibility = View.VISIBLE
        create.setText(getString(R.string.g_confirm))
    }

    private fun setDisable() {
        copy.visibility = View.VISIBLE
        editTextName.isEnabled = false
        editTextAddress.isEnabled = false
        editTextNote.isEnabled = false
        previous.visibility = View.INVISIBLE
        create.setText(getString(R.string.g_edit))
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == ScannerActivity.REQUEST_CODE) {
            val qrCode = data?.getStringExtra(ScannerActivity.EXTRA_CODE_ADDRESS).orEmpty()
            setInputAddress(qrCode)
        }
    }
}