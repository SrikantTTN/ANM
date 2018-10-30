package com.example.srikant.apishitting.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.srikant.apishitting.App
import com.example.srikant.apishitting.R
import com.example.srikant.apishitting.home.model.ConfigResponse
import com.example.srikant.apishitting.home.java_model.LocationDbModel
import com.example.srikant.apishitting.retrofit.RetrofitCallback
import com.example.srikant.apishitting.retrofit.RetrofitInstance
import com.example.srikant.apishitting.retrofit.UserServices
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var userService = UserServices(RetrofitInstance.createHeaderInstance())
    var mDaoSession = App.getDaoSession()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val responseHandler = object : RetrofitCallback<ConfigResponse>(){
            override fun handleResponse(response: Response<ConfigResponse>) {
                Toast.makeText(this@MainActivity,"Got Details",Toast.LENGTH_SHORT).show()
                var currUser = response.body()!!.model!!.user
                mDaoSession.userDetailsDao.insertOrReplaceInTx(currUser)
                App.getSharedPref()!!.edit().putLong("userId",currUser!!.id).apply()
                for(loc in response.body()!!.model!!.locationList!!){
                    mDaoSession.userDetailsDao.insertOrReplaceInTx(loc.anganwadiWorkerDetails)
                    mDaoSession.userDetailsDao.insertOrReplaceInTx(loc.anmWorkerDetails)
                    mDaoSession.userDetailsDao.insertOrReplaceInTx(loc.ashaWorkerDetails)
                    mDaoSession.userDetailsDao.insertOrReplaceInTx(loc.awwHelperWorkerDetails)
                    mDaoSession.locationDbModelDao.insertOrReplaceInTx(
                        LocationDbModel(
                            loc.stateId,
                            loc.stateName.english,
                            loc.districtId,
                            loc.districtName.english,
                            loc.talukaId,
                            loc.talukaName.english,
                            loc.phcId,
                            loc.talukaName.english,
                            loc.subCentreId,
                            loc.subCentreName.english,
                            loc.villageId,
                            loc.villageName.english,
                            loc.anganwadiId,
                            loc.anganwadiName.english
                        )
                    )
                }
            }
            override fun handleError(message: String) {
                Toast.makeText(this@MainActivity,message,Toast.LENGTH_SHORT).show()
            }
        }
        userService.getConfig(responseHandler)
    }
}
