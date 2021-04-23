package com.utab.onlinemarketkotlin.retrofit

import com.utab.onlinemarketkotlin.utils.NetworkUtils
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitBuilder @Inject constructor(){

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder().
        baseUrl(NetworkUtils.BASE_URL).
        addConverterFactory(GsonConverterFactory.create()).
        build()
    }

    val apiService:ApiService= getRetrofit().create(ApiService::class.java)
}