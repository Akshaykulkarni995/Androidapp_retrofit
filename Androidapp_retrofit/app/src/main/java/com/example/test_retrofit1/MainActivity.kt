package com.example.test_retrofit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch {
        Log.d(tag,"coroutines says hi,1st test ${Thread.currentThread().name}")
        }


        //optional to delay whenever necessary
        runBlocking {
            delay(2000)
        }
        Log.d(tag,"Main Thread test1 ${Thread.currentThread().name}")
    }
}
