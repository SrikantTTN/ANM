package com.example.srikant.apishitting.base

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() ,BaseView{
    abstract fun setPresenter()
}