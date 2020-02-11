package com.ttchain.walletproject.ui.scanner_new

import android.Manifest
import android.app.Activity
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat
import androidx.core.os.bundleOf
import com.afollestad.materialdialogs.MaterialDialog
import com.ttchain.walletproject.rx.RxBusTag
import com.google.zxing.BarcodeFormat
import com.google.zxing.ResultPoint
import com.journeyapps.barcodescanner.BarcodeCallback
import com.journeyapps.barcodescanner.BarcodeResult
import com.journeyapps.barcodescanner.DefaultDecoderFactory
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.enums.QRCodeEnum
import com.ttchain.walletproject.model.ImTokenReceiptQrCode
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.startSettingActivity
import com.ttchain.walletproject.utils.ZxingUtils
import kotlinx.android.synthetic.main.fragment_scanner.*
import org.json.JSONException
import org.json.JSONObject
import timber.log.Timber
import java.io.IOException
import java.util.ArrayList

class ScannerFragment : BaseFragment(), BarcodeCallback {

    companion object {

        const val REQUEST_GET_SINGLE_FILE_SCANNER = 8001
        const val REQUEST_PERMISSION_CAMERA = 101
        const val REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE = 102

        fun newInstance() = ScannerFragment()

        fun newInstance(@ScannerActivity.ScanType type: Int, qrCodeType: QRCodeEnum) =
            ScannerFragment().apply {
                arguments = bundleOf(
                    ScannerActivity._ID to type,
                    ScannerActivity.QRCODE_TYPE to qrCodeType
                )
            }
    }

    private val bundleTypeValue: Int by lazy {
        arguments?.getInt(ScannerActivity._ID) ?: -1
    }

    private val bundleValueQrCodeType: QRCodeEnum by lazy {
        arguments?.getSerializable(ScannerActivity.QRCODE_TYPE) as QRCodeEnum
    }

    private var permissionDialog: MaterialDialog? = null

    override val layoutId = R.layout.fragment_scanner

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {
        getScannerPermission()
        nav_btn.setDelayClickListener {
            finishActivity()
        }
        import_by_gallery_btn.setDelayClickListener {
            getReadFilePermissionS()
        }
        when (bundleValueQrCodeType) {
            QRCodeEnum.TYPE_IMPORT -> display_qrcode_btn.visibility = View.GONE
            QRCodeEnum.TYPE_PERSONAL -> {
            }
            QRCodeEnum.TYPE_WALLET -> {

            }
        }
    }

    override fun onResume() {
        super.onResume()
        preview_view.resume()
    }

    override fun onPause() {
        preview_view.pause()
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        preview_view?.barcodeView?.stopDecoding()
        if (permissionDialog != null) {
            permissionDialog?.dismiss()
            permissionDialog = null
        }
    }

    override fun barcodeResult(result: BarcodeResult?) {
        Timber.e(result?.text.orEmpty())
        onBarcodeResult(bundleTypeValue, result?.text.orEmpty())
    }

    override fun possibleResultPoints(resultPoints: MutableList<ResultPoint>?) {

    }

    private fun getScannerPermission() {
        RxPermissions(requireActivity())
            .request(Manifest.permission.CAMERA)
            .subscribe { granted ->
                if (granted) {
                    setCamera()
                    startDecode()
                } else {
                    showPermissionDenied(
                        requireActivity(),
                        Manifest.permission.CAMERA,
                        getString(R.string.g_camera_permission_request)
                    )
                }
            }
    }

    private fun setCamera() {
        val barcodeFormats = ArrayList<BarcodeFormat>().apply {
            add(BarcodeFormat.QR_CODE)
            add(BarcodeFormat.DATA_MATRIX)
            add(BarcodeFormat.MAXICODE)
        }
        preview_view.barcodeView.decoderFactory = DefaultDecoderFactory(barcodeFormats)
        preview_view.viewFinder.drawResultBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888))
    }

    private fun startDecode() {
        preview_view.decodeSingle(this)
    }

    private fun showPermissionDenied(context: Context, permissionType: String, msg: String) {
        permissionDialog = MaterialDialog.Builder(context)
            .content(msg)
            .positiveText(R.string.g_ok)
            .negativeText(R.string.g_cancel)
            .cancelable(false)
            .positiveColor(ResourcesCompat.getColor(resources, R.color.colorPrimaryGrey, null))
            .negativeColor(ResourcesCompat.getColor(resources, R.color.colorPrimaryGrey, null))
            .onPositive { _, _ ->
                if (permissionType == Manifest.permission.READ_EXTERNAL_STORAGE) {
                    startSettingActivity(REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE)
                } else if (permissionType == Manifest.permission.CAMERA) {
                    startSettingActivity(REQUEST_PERMISSION_CAMERA)
                }
            }
            .onNegative { _, _ ->
                if (permissionType == Manifest.permission.CAMERA) {
                    finishActivity()
                }
            }
            .build()
        permissionDialog?.show()
    }

    private fun getReadFilePermissionS() {
        RxPermissions(requireActivity())
            .request(Manifest.permission.READ_EXTERNAL_STORAGE)
            .subscribe { granted ->
                if (granted) {
                    startPickImageActionScan()
                } else {
                    showPermissionDenied(
                        requireActivity(),
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        getString(R.string.g_pick_photo_permission_request)
                    )
                }
            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            // 圖片選擇器回來
            REQUEST_GET_SINGLE_FILE_SCANNER -> if (resultCode == Activity.RESULT_OK) {
                onAfterChoosePicture(
                    bundleTypeValue,
                    requireActivity().contentResolver, data?.data ?: Uri.EMPTY
                )
            }
            REQUEST_PERMISSION_CAMERA -> {
                getScannerPermission()
            }
            REQUEST_PERMISSION_WRITE_EXTERNAL_STORAGE -> {
                getReadFilePermissionS()
            }
            else -> {

            }
        }
    }

    /**
     * Decode 圖片 QrCode
     */
    private fun onAfterChoosePicture(scan_type: Int, cr: ContentResolver, uri: Uri) {
        try {
            val result = ZxingUtils.readQrCodeFile(cr, uri)
            if (result != null) {
                onBarcodeResult(scan_type, result)
                return
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        onShowMessageDialog(getString(R.string.error_loading_data_and_try_again))
    }

    private fun onBarcodeResult(type: Int, result: String) {
        //        String scanAddress = mModel.parserScanResultAddress(result);
        val scanAddress = when (bundleValueQrCodeType) {
            QRCodeEnum.TYPE_IMPORT -> {
                result
            }
            else -> {
                ImTokenReceiptQrCode.getAddressFromQrCode(result)
            }
        }
        val amount = ImTokenReceiptQrCode.getAmountFromQrCode(result)
//        val parserCoinId = parserScanResultCoinId(result)
        RxBus.getInstance().post(RxBusTag.SCANNER_ADDRESS_TAG, scanAddress)
        RxBus.getInstance().post(RxBusTag.SCANNER_AMOUNT_TAG, amount)
        requireActivity().setResult(
            Activity.RESULT_OK,
            Intent().apply {
                putExtra(ScannerActivity.EXTRA_CODE_ADDRESS, scanAddress)
                putExtra(ScannerActivity.EXTRA_CODE_AMOUNT, amount)
            }
        )
        finishActivity()
    }

    private fun parserScanResultCoinId(result: String): String {
        try {
            val jSonObject = JSONObject(result)
            val string = jSonObject.getString("coinID")
            if (string != null) {
                return string
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return ""
    }

    /**
     * 開啟圖片選擇器
     */
    private fun startPickImageActionScan() {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "image/*"
        }
        startActivityForResult(
            Intent.createChooser(
                intent,
                getString(R.string.g_select_photo)
            ), REQUEST_GET_SINGLE_FILE_SCANNER
        )
    }

}