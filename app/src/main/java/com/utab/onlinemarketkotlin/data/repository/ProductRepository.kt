package com.utab.onlinemarketkotlin.data.repository

import com.utab.onlinemarketkotlin.model.Product
import com.utab.onlinemarketkotlin.retrofit.RetrofitBuilder
import com.utab.onlinemarketkotlin.utils.NetworkUtils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepository @Inject constructor(private val retrofitBuilder: RetrofitBuilder) {
    private val apiService=retrofitBuilder.apiService

    suspend fun getProducts():List<Product> = apiService.getProducts(NetworkUtils.MAP_KEYS)
}