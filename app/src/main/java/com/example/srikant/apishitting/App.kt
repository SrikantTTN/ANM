package com.example.srikant.apishitting

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        sharedPrefHelper = getSharedPreferences(Constants.PERSON_SHARED_PREF, Context.MODE_PRIVATE)
    }

    companion object {
        private var sharedPrefHelper:SharedPreferences?=null
        fun getSharedPref():SharedPreferences?{
            return sharedPrefHelper
        }
    }
}