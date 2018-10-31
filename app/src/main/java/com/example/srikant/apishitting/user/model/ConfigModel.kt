package com.example.srikant.apishitting.user.model

import com.example.srikant.apishitting.user.java_model.Language
import com.example.srikant.apishitting.user.java_model.Location
import com.example.srikant.apishitting.user.java_model.UserDetails
import com.google.gson.annotations.SerializedName

class ConfigModel {
    @SerializedName("locations")
    var locationList:List<Location>?=null

    @SerializedName("languages")
    var languages:List<Language>?=null

    @SerializedName("userDetail")
    var user: UserDetails?=null

}