package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.login.model.LoginDetails
import com.example.srikant.apishitting.login.model.LoginResponse

class LoginService(private var apiServices: ApiServices) {
    fun login(loginDetails: LoginDetails,callback: RetrofitCallback<LoginResponse>){
        apiServices.validateUser(loginDetails).enqueue(callback)
    }

}