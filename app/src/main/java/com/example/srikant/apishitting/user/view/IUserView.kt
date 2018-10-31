package com.example.srikant.apishitting.user.view

import com.example.srikant.apishitting.user.java_model.Location

interface IUserView {
        fun showError(msg:String)
    fun populateData(locList:List<Location>)
    fun showLoading()
    fun hideLoading()
}