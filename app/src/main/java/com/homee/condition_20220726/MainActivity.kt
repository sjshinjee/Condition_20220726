package com.homee.condition_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            variationTestBtn.setOnClickListener {
                val myAge = 10
                if(myAge<10){
                    Log.d("나이검사","유아입니다")
                }
                else if(myAge<20){
                    Log.d("나이검사","청소년입니다")
                }
                else{
                    Log.d("나이검사","성인입니다")
                }
            }




    }
}