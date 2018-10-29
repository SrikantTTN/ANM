package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.home.model.ConfigModel
import com.example.srikant.apishitting.login.model.LoginDetails
import com.example.srikant.apishitting.login.model.LoginResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiServices {

    @POST("/login")
    fun validateUser(@Body requestBody:LoginDetails):Call<LoginResponse>

    @GET("/config")
    fun getConfig():Call<ConfigModel>
}