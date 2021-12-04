package com.nepplus.lifrcycle_20211204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setupEvents()
        setValues()
    }

    fun setupEvents() {

    }

    fun setValues() {
        
        Log.d("다른화면", "onCreate 실행됨")

    }
}