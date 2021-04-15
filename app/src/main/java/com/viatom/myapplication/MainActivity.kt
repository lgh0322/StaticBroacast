package com.viatom.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timer().schedule(DrawTask(), Date(), 300)
    }

    inner class DrawTask() : TimerTask() {
        override fun run() {
            val i= Intent("com.viatom.login")
//            i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            i.setPackage("com.lepu.lepucare")
            i.putExtra("info","撒旦克里夫看见了")
            sendBroadcast(i)
        }
    }
}