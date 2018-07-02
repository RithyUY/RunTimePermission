package com.example.runtimepermission

import android.Manifest
import android.app.Activity
import android.content.Context
import android.support.v4.app.ActivityCompat

/****
 *
 * Created by TUON BONDOL on 27/04/18.
 *
 */

object RuntimePermissionUtil {

    fun onLocationRequestPermission(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                intentCode)
    }

    fun onCheckCameraPermission(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onCheckGalleryPermissions(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onCheckPermissions(context: Context, intentCode: Int, permissions: Array<String>) {
        ActivityCompat.requestPermissions(context as Activity, permissions, intentCode)
    }

    fun onCheckVoiceRecordPermissions(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.RECORD_AUDIO, Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }

    fun onCheckContactPermission(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(Manifest.permission.READ_CONTACTS),
                intentCode)
    }

    fun requestWriteExternalStorage(context: Context, intentCode: Int) {
        ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                intentCode)
    }
}