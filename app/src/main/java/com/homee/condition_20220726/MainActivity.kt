package com.homee.condition_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        conditionBtn2.setOnClickListener {
            //장기근속 1연봉 2야근유뮤 3거리
            val salary = 3800
            val dayNight = true
            val distance = 4

            //연봉이 4000이상이거나 거리가 5분 이내거나
            if(salary>4000 || distance<=5){
                    Log.d("입사 여부","취업")
            }

            //연봉이 3000이상이거나 야근이 없거나
            if(salary>3000 || !dayNight){  //dayNight!=true와 같은 문장
                    Log.d("입사 여부", "취업")
            }

            //야근이 없어야하고 거리고 10분 이내
            if(dayNight!=true && distance<10){
                    Log.d("입사 여부", "취업")
            }



        }



    }
}