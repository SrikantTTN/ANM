package com.example.srikant.apishitting.retrofit

import com.example.srikant.apishitting.App
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.internal.Internal.instance
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        var nHInstance: Retrofit? = null
        var hInstance: Retrofit? = null
        val BASE_URL = "http://akshada-api.qa3.tothenew.net"
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        val client = OkHttpClient.Builder().addInterceptor(interceptor)
        fun getRetrofitInstance(): ApiServices {
            if (nHInstance == null) {
                nHInstance = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client.build())
                    .baseUrl(BASE_URL)
                    .build()
            }
            return nHInstance!!.create(ApiServices::class.java)
        }

        fun createHeaderInstance(): ApiServices {
            var httpClient = OkHttpClient.Builder().addInterceptor { chain ->
                val original = chain.request()
                val request = original.newBuilder().addHeader("x-auth-token", App.getSharedPref()!!.getString("token", "null")!!)
                    .method(original.method(), original.body())
                    .build()
                chain.proceed(request)
            }
            if (hInstance == null) {
                hInstance = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.addInterceptor(interceptor).build())
                    .baseUrl(BASE_URL)
                    .build()
            }
            return hInstance!!.create(ApiServices::class.java)
        }

    }
}