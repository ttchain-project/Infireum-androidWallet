package com.ttchain.walletproject.base

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.ttchain.walletproject.R
import java.io.File

abstract class BaseFragment : Fragment() {

    protected abstract val layoutId: Int
    protected abstract fun initView()

    companion object {
        private const val SELECT_FROM_GALLERY = 0
        private const val SELECT_FROM_CAMERA = 1
        private const val REQUEST_GET_SINGLE_IMAGE = 9001
        private const val REQUEST_IMAGE_CAPTURE = 9002
        private const val UPLOAD_PNG = "upload.png"
    }

//    val configViewModel by viewModel<BaseConfigViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    fun getToolbar(): Toolbar? {
        var toolbar: Toolbar? = null
        activity?.let {
            toolbar = when (it) {
                is BaseActivity -> it.findViewById(R.id.toolbar)
                else -> null
            }
        }
        return toolbar
    }

    fun showToolbar(show: Boolean) {
        if (show) {
            getToolbar()?.visibility = View.VISIBLE
        } else {
            getToolbar()?.visibility = View.GONE
        }
    }

    private var mInputDialog: MaterialDialog? = null


    fun releaseInputDialog() {
        if (mInputDialog != null) {
            mInputDialog?.dismiss()
            mInputDialog = null
        }
    }

    fun finishActivity() {
        requireActivity().finish()
    }

    fun showToast(message: String) {
        showToast(message, Toast.LENGTH_LONG)
    }

    fun showToast(message: String, lengthLong: Int) {
        activity?.let {
            Toast.makeText(it, message, lengthLong).show()
        }
    }


    fun showItemListDialog(
        title: String,
        items: List<String>,
        callback: MaterialDialog.ListCallback
    ) {
        activity?.let {
            MaterialDialog.Builder(it).items(items).title(title)
                .itemsCallback(callback)
                .show()
        }
    }

    private fun setCameraIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        val folder = File(
            (Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)).toString() +
                    File.separator + "TTChain"
        )
        val fileName = "camera.png"

        val f = File((folder.toString() + File.separator) + fileName)

        context?.let {
            val imageUri: Uri = when {
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.N ->
                    FileProvider.getUriForFile(
                        it, it.applicationContext.packageName + ".provider", f
                    )
                else -> Uri.fromFile(f)
            }

            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)

            if (takePictureIntent.resolveActivity(it.packageManager) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }

    private var mTwoInputDialog: MaterialDialog? = null

    interface ValidateTwoInput {
        fun validate(input1: String, input2: String): Int
    }

    fun releaseTwoInputDialog() {
        if (mTwoInputDialog != null) {
            mTwoInputDialog?.dismiss()
            mTwoInputDialog = null
        }
    }

}