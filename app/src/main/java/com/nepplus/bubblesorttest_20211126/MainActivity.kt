package com.nepplus.bubblesorttest_20211126

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.nepplus.bubblesorttest_20211126.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val mList = arrayListOf(3, 5, 2, 1, 4, 9, 8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnCheckNum.setOnClickListener {

            for (num in mList) {

                Log.d("숫자", num.toString())

                for (i in 0 until mList.size) {
                    var tempNum = mList[i]


                    if (mList[i] >= mList[i + 1]) {
                        tempNum = mList[i]
                        mList[i] = mList[i + 1]
                        mList[i + 1] = tempNum
                        }
                    }
                Log.d("숫자", num.toString())

            }

        }


    }
}