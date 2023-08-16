package com.jeonyul.shoppi_android

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    // 액티비티가 생성되고 최초 1회만 실행
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        Log.d(TAG, "onCreate")
    }

    // 서비스가 백그라운드에서 다시 돌아왔을 때
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    // 액티비티가 화면을 벗어났다가 돌아왔을 때 실행
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    // 액티비티가 포커스 잡혔을 때 실행
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    // 액티비티가 포커스를 잃었을 때
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    // 서비스가 백그라운드로 넘어갔을 때
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    // 서비스를 완전히 제거할 때
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}