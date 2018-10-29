package com.example.srikant.apishitting.login

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.srikant.apishitting.App
import com.example.srikant.apishitting.Constants
import com.example.srikant.apishitting.MainActivity
import com.example.srikant.apishitting.R
import com.example.srikant.apishitting.databinding.LoginScreenBinding
import com.example.srikant.apishitting.login.model.LoginDetails
import com.example.srikant.apishitting.login.model.LoginResponse
import com.example.srikant.apishitting.retrofit.LoginService
import com.example.srikant.apishitting.retrofit.RetrofitCallback
import com.example.srikant.apishitting.retrofit.RetrofitInstance
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    var loginDetails: LoginDetails? = null
    var loginService = LoginService(RetrofitInstance.getRetrofitInstance())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mBinding: LoginScreenBinding = DataBindingUtil.setContentView(this, R.layout.login_screen)
        loginDetails = LoginDetails()
        mBinding.person = loginDetails
        mBinding.loginBtn.setOnClickListener {
            val callbackHandler = object : RetrofitCallback<LoginResponse>() {
                override fun handleError(message: String) {
                    Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
                }

                override fun handleResponse(response: Response<LoginResponse>) {
                    Toast.makeText(this@LoginActivity, response.body()!!.message, Toast.LENGTH_SHORT).show()
                    var sharedPref = App.getSharedPref()
                    if (sharedPref != null) {
                        sharedPref
                            .edit()
                            .putString("token", response.body()!!.data!!.token)
                            .apply()
                        startActivity(Intent().setClass(this@LoginActivity, MainActivity::class.java))
                        finish()
                    }
                }
            }
            loginService.login(mBinding.person!!, callbackHandler)
        }
    }
}