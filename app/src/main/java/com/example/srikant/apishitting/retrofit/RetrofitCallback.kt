package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.base.BaseResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class RetrofitCallback<T : BaseResponse> : Callback<T> {
    override fun onFailure(call: Call<T>, t: Throwable) {
        handleError(t.message!!)
    }

    override fun onResponse(call: Call<T>, response: Response<T>) {
            if (response.raw().code().equals(401)) {
                handleError("Not Authorized")
            } else {
                handleResponse(response)
            }
        }
    abstract fun handleResponse(response: Response<T>)
    abstract fun handleError(message:String)
}