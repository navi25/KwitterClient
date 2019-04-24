package io.navendra.kwitterclient

import android.util.Log

object KwitterLog {

    fun d(message : ()->String){
        Log.d("Kwitter",message.invoke())
    }

}
