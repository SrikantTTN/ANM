package com.example.srikant.apishitting.login.model

import com.google.gson.annotations.SerializedName

class AuthToken {
    @SerializedName("x-auth-token")
    var token:String?=null
}