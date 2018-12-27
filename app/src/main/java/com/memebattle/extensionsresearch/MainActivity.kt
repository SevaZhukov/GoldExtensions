package com.memebattle.extensionsresearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.memebattle.goldextensions.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log("Hello")
        snack("Fucking")
        toast("Extensions")
        alertInfo("Enjoy!")
    }
}
