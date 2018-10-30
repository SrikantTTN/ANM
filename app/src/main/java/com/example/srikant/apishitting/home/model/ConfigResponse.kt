package com.example.srikant.apishitting.home.model

import com.example.srikant.apishitting.base.BaseResponse
import com.google.gson.annotations.SerializedName

class ConfigResponse:BaseResponse() {

    @SerializedName("data")
    var model:ConfigModel?=null
}