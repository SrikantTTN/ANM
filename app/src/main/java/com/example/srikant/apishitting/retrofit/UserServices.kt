package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.user.model.ConfigResponse
import com.example.srikant.apishitting.user.model.HouseRequest
import com.example.srikant.apishitting.user.model.HouseResponse

class UserServices(private var apiServices: ApiServices) {
    fun getConfig(callback: RetrofitCallback<ConfigResponse>){
        apiServices.getConfig().enqueue(callback)
    }
    fun getHouseList(houseRequest:HouseRequest,callback: RetrofitCallback<HouseResponse>){
        apiServices.getHouseList(houseRequest).enqueue(callback)
    }
}