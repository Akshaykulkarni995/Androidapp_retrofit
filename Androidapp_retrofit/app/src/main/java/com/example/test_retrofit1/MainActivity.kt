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
        Log.d(tag,"coroutines says hi,1st test ${Thread.currentThread().name}")

        //statring with coroutines
        GlobalScope.launch {
//        Log.d(tag,"coroutines says hi,1st test ${Thread.currentThread().name}")
            val networkCallAnswer = doNetworkCall()
            val networkCallAnswer1 = doNetworkCall1()

//            to display above values
            Log.d(tag,networkCallAnswer)
            Log.d(tag,networkCallAnswer1)
        }

//        //optional to delay whenever necessary
//        runBlocking {
//            delay(2000)
//        }
//        Log.d(tag,"Main Thread test1 ${Thread.currentThread().name}")


    }
    //suspend fun with delay init
      suspend fun doNetworkCall():String{

          delay(3000L)

          return " This is the test for suspend function"

    }

    suspend fun doNetworkCall1():String{

        delay(3000L)

        return " This is the test for suspend function1"

    }
}
