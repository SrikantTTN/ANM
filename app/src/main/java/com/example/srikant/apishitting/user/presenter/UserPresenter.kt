package com.example.srikant.apishitting.user.presenter

import com.example.srikant.apishitting.App
import com.example.srikant.apishitting.retrofit.RetrofitCallback
import com.example.srikant.apishitting.retrofit.RetrofitInstance
import com.example.srikant.apishitting.retrofit.UserServices
import com.example.srikant.apishitting.user.java_model.LocationDbModel
import com.example.srikant.apishitting.user.model.AnganwadiObj
import com.example.srikant.apishitting.user.model.ConfigResponse
import com.example.srikant.apishitting.user.model.HouseRequest
import com.example.srikant.apishitting.user.model.HouseResponse
import com.example.srikant.apishitting.user.view.IUserView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import retrofit2.Response

class UserPresenter(private var rootView: IUserView?):IUserPresenter {
    val mDaoSession = App.getDaoSession()
    val userService = UserServices(RetrofitInstance.createHeaderInstance())
    var anganwadiObjs:MutableList<AnganwadiObj> = ArrayList()
    override fun onDestroy() {
        rootView=null
    }

    override fun fetchData() {
        rootView!!.showLoading()
        val responseHandler = object : RetrofitCallback<ConfigResponse>(){
            override fun handleResponse(response: Response<ConfigResponse>) {
                rootView!!.hideLoading()
                insertUserInDb(response.body()!!)
                val locList = response.body()!!.model!!.locationList!!
                rootView!!.populateData(locList)
            }
            override fun handleError(message: String) {
                rootView!!.hideLoading()
                rootView!!.showError(message)
            }
        }
        userService.getConfig(responseHandler)
    }
    private fun insertUserInDb(response:ConfigResponse) {
        GlobalScope.async(Dispatchers.Default) {
            val currUser = response.model!!.user
            mDaoSession.userDetailsDao.insertOrReplaceInTx(currUser)
            App.getSharedPref()!!.edit().putLong("userId", currUser!!.id).apply()
            val locList = response.model!!.locationList!!
            for (loc in locList) {
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
                        loc.phcName.english,
                        loc.subCentreId,
                        loc.subCentreName.english,
                        loc.villageId,
                        loc.villageName.english,
                        loc.anganwadiId,
                        loc.anganwadiName.english
                    )
                )
            }
        }.invokeOnCompletion { getHouseList()    }
    }
    private fun getHouseList(){
        val location = mDaoSession.locationDbModelDao.loadAll()
        for(loc in location){
                anganwadiObjs.add(AnganwadiObj(loc.anganwadiId))
        }
        val houseResponseHandler = object :RetrofitCallback<HouseResponse>(){
            override fun handleResponse(response: Response<HouseResponse>) {
                rootView!!.showError("Data found " + response.body()!!.recordsFiltered)
                insertHouseInDb(response.body()!!)
            }

            override fun handleError(message: String) {
                rootView!!.showError(message)
            }
        }
        val houseRequest = HouseRequest(100, 0, anganwadiObjs.toList())
        userService.getHouseList(houseRequest, houseResponseHandler)
    }

    private fun insertHouseInDb(response: HouseResponse){
        GlobalScope.async(Dispatchers.Default) {
            mDaoSession.houseDao.insertOrReplaceInTx(response.listOfHouse)
        }
    }

}
