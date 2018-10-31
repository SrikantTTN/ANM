package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.user.model.ConfigResponse
import com.example.srikant.apishitting.login.model.LoginDetails
import com.example.srikant.apishitting.login.model.LoginResponse
import com.example.srikant.apishitting.user.model.HouseRequest
import com.example.srikant.apishitting.user.model.HouseResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServices {

    @POST("/login")
    fun validateUser(@Body requestBody:LoginDetails):Call<LoginResponse>

    @GET("/config")
    fun getConfig():Call<ConfigResponse>

    @POST("/sync/house/list")
    fun getHouseList(@Body requestBody:HouseRequest):Call<HouseResponse>
}