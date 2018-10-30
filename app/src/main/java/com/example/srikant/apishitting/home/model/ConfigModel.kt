package com.example.srikant.apishitting.home.model

import com.example.srikant.apishitting.home.java_model.Language
import com.example.srikant.apishitting.home.java_model.Location
import com.example.srikant.apishitting.home.java_model.UserDetails
import com.google.gson.annotations.SerializedName

class ConfigModel {
    @SerializedName("locations")
    var locationList:List<Location>?=null

    @SerializedName("languages")
    var languages:List<Language>?=null

    @SerializedName("userDetail")
    var user: UserDetails?=null

}