package com.example.srikant.apishitting.home.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class UserDetails {
    @SerializedName("profileUrl")
    @Expose
     val profileUrl: String? = null
    @SerializedName("firstName")
    @Expose
     val firstName: String? = null
    @SerializedName("lastName")
    @Expose
     val lastName: String? = null
    @SerializedName("phoneNumber")
    @Expose
     val phoneNumber: String? = null
    @SerializedName("gender")
    @Expose
     val gender: String? = null
    @SerializedName("alternatePhoneNumber")
    @Expose
     val alternatePhoneNumber: String? = null
    @SerializedName("emailId")
    @Expose
     val emailId: String? = null
    @SerializedName("id")
    @Expose
     val id: Int? = null
    @SerializedName("userType")
    @Expose
     val userType: String? = null
}