package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.home.model.ConfigModel
import com.example.srikant.apishitting.login.model.LoginDetails
import com.example.srikant.apishitting.login.model.LoginResponse

class UserServices(private var apiServices: ApiServices) {
    fun getConfig(callback: RetrofitCallback<ConfigModel>){
        apiServices.getConfig().enqueue(callback)
    }
}