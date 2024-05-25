package com.skyblue.databindingexample1

import com.skyblue.databindingexample1.BR
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.skyblue.databindingexample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding =  DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.setVariable(BR.onButtonClick, this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.button1-> binding.textView.text = binding.button1.text
            R.id.button2-> binding.textView.text = binding.button2.text
            R.id.button3-> binding.textView.text = binding.button3.text
        }
    }
}