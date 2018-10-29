package com.example.srikant.apishitting.login.model

import com.example.srikant.apishitting.base.BaseResponse
import com.google.gson.annotations.SerializedName

class LoginResponse: BaseResponse() {
    @SerializedName("data")
    var data :AuthToken?=null
}