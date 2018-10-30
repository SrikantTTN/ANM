package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.home.model.ConfigResponse

class UserServices(private var apiServices: ApiServices) {
    fun getConfig(callback: RetrofitCallback<ConfigResponse>){
        apiServices.getConfig().enqueue(callback)
    }
}