package com.memebattle.extensionsresearch

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log("Hello")
        snack("Extensions")
        toast("")
        alertChoose("lol", DialogInterface.OnClickListener { dialog, which ->
            snack("qqqqq")
            dialog.cancel()
        })
    }
}
