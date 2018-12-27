package com.memebattle.goldextensions

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

fun Any.log(text: String) {
    Log.i(this::class.simpleName, text)
}

fun Activity.snack(text: String) {
    val view = this.window.decorView.rootView
    Snackbar.make(view, text, Snackbar.LENGTH_SHORT).show()
}

fun Fragment.snack(text: String) {
    val view = this.activity!!.window.decorView.rootView
    Snackbar.make(view, text, Snackbar.LENGTH_SHORT).show()
}

fun Activity.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}

fun Fragment.toast(text: String) {
    Toast.makeText(this.activity!!, text, Toast.LENGTH_SHORT).show()
}

fun Any.alert(builder: AlertDialog.Builder) {
    val alert = builder.create()
    alert.show()
}

fun Any.alertInfo(message: String) {
    val builder = AlertDialog.Builder(this as Context)
            .setMessage(message)
            .setCancelable(false)
    val alert = builder.create()
    alert.show()
}

fun Any.alertChoose(message: String, callback: DialogInterface.OnClickListener) {
    val builder = AlertDialog.Builder(this as Context)
            .setMessage(message)
            .setCancelable(false)
            .setPositiveButton("Да") { dialog, which ->
                callback.onClick(dialog, which)
            }
            .setNegativeButton("Нет") { dialog, which ->
                dialog.cancel()
            }
    val alert = builder.create()
    alert.show()
}