package com.example.srikant.apishitting.user.view

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.example.srikant.apishitting.R
import com.example.srikant.apishitting.base.BaseActivity
import com.example.srikant.apishitting.databinding.ActivityUserBinding
import com.example.srikant.apishitting.user.LocationAdapter
import com.example.srikant.apishitting.user.java_model.Location
import com.example.srikant.apishitting.user.presenter.UserPresenter

class UserActivity : BaseActivity(), IUserView {
    override fun populateData(locList:List<Location>) {
        var adapter = LocationAdapter(locList)
        dataBinding.locationRecycler.layoutManager = LinearLayoutManager(this)
        dataBinding.locationRecycler.adapter = adapter
        dataBinding.locationRecycler.visibility = View.VISIBLE
    }

    override fun showError(msg: String) {
        Toast.makeText(this@UserActivity,msg,Toast.LENGTH_SHORT).show()
    }

    override fun setPresenter() {
        dataBinding.presenter = presenter
    }

    override fun showLoading() {
        dataBinding.progressHorizontal.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        dataBinding.progressHorizontal.visibility = View.GONE
    }

    lateinit var dataBinding: ActivityUserBinding
    var presenter: UserPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_user)
        presenter = UserPresenter(this)
        setPresenter()
        presenter!!.fetchData()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }

    companion object {
        @JvmStatic
        fun buildIntent(context: Context): Intent {
            val intent = Intent(context, UserActivity::class.java)
            return intent
        }
    }
}
