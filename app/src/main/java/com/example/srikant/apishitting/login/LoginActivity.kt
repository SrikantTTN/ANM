package com.example.srikant.apishitting.login

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.widget.Toast
import com.example.srikant.apishitting.App
import com.example.srikant.apishitting.R
import com.example.srikant.apishitting.base.BaseActivity
import com.example.srikant.apishitting.databinding.LoginScreenBinding
import com.example.srikant.apishitting.login.model.LoginDetails
import com.example.srikant.apishitting.login.model.LoginResponse
import com.example.srikant.apishitting.login.presenter.LoginPresenter
import com.example.srikant.apishitting.login.view.ILoginView
import com.example.srikant.apishitting.retrofit.LoginService
import com.example.srikant.apishitting.retrofit.RetrofitCallback
import com.example.srikant.apishitting.retrofit.RetrofitInstance
import com.example.srikant.apishitting.user.view.UserActivity
import retrofit2.Response

class LoginActivity : BaseActivity(),ILoginView<LoginPresenter> {
    override fun setPresenter() {
    }

    var loginDetails: LoginDetails? = null
    var loginService = LoginService(RetrofitInstance.getRetrofitInstance())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var token = App.getSharedPref()!!.getString("token", "null")
        if (token == null) {
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
                            startActivity(Intent().setClass(this@LoginActivity, UserActivity::class.java))
                            finish()
                        }
                    }
                }
                loginService.login(mBinding.person!!, callbackHandler)
            }
        }else{
            startActivity(Intent().setClass(this@LoginActivity, UserActivity::class.java))
            finish()
        }
    }
}