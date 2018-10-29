package com.example.srikant.apishitting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.srikant.apishitting.home.model.ConfigModel
import com.example.srikant.apishitting.retrofit.LoginService
import com.example.srikant.apishitting.retrofit.RetrofitCallback
import com.example.srikant.apishitting.retrofit.RetrofitInstance
import com.example.srikant.apishitting.retrofit.UserServices
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var userService = UserServices(RetrofitInstance.createHeaderInstance())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val responseHandler = object : RetrofitCallback<ConfigModel>(){
            override fun handleResponse(response: Response<ConfigModel>) {
                Toast.makeText(this@MainActivity,"Got Details",Toast.LENGTH_SHORT).show()
            }
            override fun handleError(message: String) {
                Toast.makeText(this@MainActivity,message,Toast.LENGTH_SHORT).show()
            }
        }
        userService.getConfig(responseHandler)
    }
}
