package com.utab.onlinemarketkotlin.data.repository

import com.utab.onlinemarketkotlin.retrofit.RetrofitBuilder
import com.utab.onlinemarketkotlin.utils.NetworkUtils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CategoryRepository  @Inject constructor(private val retrofitBuilder: RetrofitBuilder){
    private val apiService=retrofitBuilder.apiService

    suspend fun getCategories()=apiService.getCategories(NetworkUtils.MAP_KEYS)
}