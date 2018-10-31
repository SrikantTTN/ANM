package com.example.srikant.apishitting.user.model

import com.example.srikant.apishitting.base.BaseResponse
import com.example.srikant.apishitting.user.java_model.House
import com.google.gson.annotations.SerializedName

class HouseResponse :BaseResponse(){
    @SerializedName("recordsTotal")
    var totalRecords:Int?=null

    @SerializedName("data")
    var listOfHouse:List<House>?=null

    @SerializedName("recordsFiltered")
    var recordsFiltered:Int?=null

    @SerializedName("max")
    var max:Int?=null

    @SerializedName("offset")
    var offset:Int?=null


}