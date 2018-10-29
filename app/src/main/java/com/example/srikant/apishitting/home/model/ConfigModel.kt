package com.example.srikant.apishitting.home.model

import com.example.srikant.apishitting.base.BaseResponse
import com.google.gson.annotations.SerializedName

class ConfigModel:BaseResponse() {

    @SerializedName("locations")
    var locationList:List<Location>?=null

    @SerializedName("languages")
    var languages:List<Language>?=null

    @SerializedName("userDetails")
    var user:UserDetails?=null

}