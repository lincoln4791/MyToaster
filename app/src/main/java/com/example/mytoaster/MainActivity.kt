package com.example.mytoaster

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            //showToast()
            ToastUtils.ShowToast(this)
        }

    }

    fun showToast(){
        Toast.makeText(this,"ggwp",Toast.LENGTH_LONG).show()
    }
}