package com.example.srikant.apishitting

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.srikant.apishitting.home.java_model.DaoMaster
import com.example.srikant.apishitting.home.java_model.DaoSession

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        sharedPrefHelper = getSharedPreferences(Constants.PERSON_SHARED_PREF, Context.MODE_PRIVATE)
        appDaoSession = DaoMaster(
            DaoMaster.DevOpenHelper(
                this,
                "Anm.db"
            ).writableDb
        ).newSession()

    }

    companion object {
        private var sharedPrefHelper:SharedPreferences?=null
        private var appDaoSession: DaoSession?=null
        fun getSharedPref():SharedPreferences?{
            return sharedPrefHelper
        }
        fun getDaoSession(): DaoSession {
            return appDaoSession!!
        }

    }
}