package com.nepplus.lifrcycle_20211204

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
        
        Log.d("메인화면","onCreate 실행됨")
    }

    override fun onResume() {
        super.onResume()  // 오버라이딩: super.시작 -> 보존함. / return super.시작 -> 통으로 삭제함.

        Log.d("메인화면", "onResume 실행됨")

    }

    override fun onPause() {
        super.onPause()

        Log.d("메인화면", "onPause 실행됨")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("메인화면", "onDestroy 실행됨")

    }

//    이벤트 처리 (버튼 클릭 등) 관련 코드를 모아두기 위한 함수
    fun setupEvents() {

        btnMoveToOther.setOnClickListener {

            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

//    UI (화면)에 데이터를 보여주는 것에 관련된 코드 모음
    fun setValues() {
        
        txtName.text  = "조경진"
        
    }
}