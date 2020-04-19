package com.example.test_retrofit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d(tag, "coroutines says hi,1st test ${Thread.currentThread().name}")

//        //statring with coroutines
//        GlobalScope.launch {
//            //        Log.d(tag,"coroutines says hi,1st test ${Thread.currentThread().name}")
//            val networkCallAnswer = doNetworkCall()
//            val networkCallAnswer1 = doNetworkCall1()
//
////            to display above values
//            Log.d(tag, networkCallAnswer)
//            Log.d(tag, networkCallAnswer1)
//        }
//
//
//    }
//
//    //suspend fun with delay init
//    suspend fun doNetworkCall(): String {
//
//        delay(3000L)
//
//        return " This is the test for suspend function"
//
//    }
//
//    suspend fun doNetworkCall1(): String {
//
//        delay(3000L)
//
//        return " This is the test for suspend function1"
//
//    }

//        //Coroutines Context
//        Log.d(tag, "name of current tread1 ${Thread.currentThread().name}")
//        GlobalScope.launch(Dispatchers.IO) {
//            //runs 2nd
//            Log.d(tag, "name of current tread ${Thread.currentThread().name}")
//            val answer = doNetworkCall1()
//            //runs 1st as its in main tread
//            withContext(Dispatchers.Main) {
//                Log.d(tag, "Setting text in thread  ${Thread.currentThread().name}")
//                tvdummy.text = answer
//
//            }
//
//        }
//    }
//
//    suspend fun doNetworkCall1(): String {
//
//        delay(3000L)
//
//        return " This is the test for suspend function1"
//
//    }
//        //runblocking
//        Log.d(tag, "before runblocking")
//        runBlocking {
//            launch(Dispatchers.IO) {
//                delay(3000L)
//                Log.d(tag, "finished coroutines1")
//            }
//            launch(Dispatchers.IO) {
//
//                delay(3000L)
//                Log.d(tag, "finished coroutines2")
//            }
//            Log.d(tag, "start of runblocking")
//            delay(5000L)
//            Log.d(tag, "End of runblocking")
//
//        }
//        Log.d(
//            tag, "After runblocking"
//        )
//    }

    }
}
