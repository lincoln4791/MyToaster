package com.example.mytoaster

import android.content.Context
import android.widget.Toast

object ToastUtils {

    fun ShowToast(context: Context){
        Toast.makeText(context,"ggwp",Toast.LENGTH_LONG).show()
    }
}