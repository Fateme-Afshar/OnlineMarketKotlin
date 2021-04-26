package com.utab.onlinemarketkotlin.data.repository

import com.utab.onlinemarketkotlin.model.Product
import com.utab.onlinemarketkotlin.retrofit.RetrofitBuilder
import com.utab.onlinemarketkotlin.utils.NetworkUtils
import com.utab.onlinemarketkotlin.utils.QueryParameters
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepository @Inject constructor(private val retrofitBuilder: RetrofitBuilder) {
    private val apiService = retrofitBuilder.apiService

    suspend fun getNewestProducts(): List<Product> {

        val queryParams: HashMap<String, String> = NetworkUtils.MAP_KEYS
        queryParams[QueryParameters.orderBy] = QueryParameters.date
        queryParams[QueryParameters.order] = QueryParameters.order_desc

        return apiService.getProducts(queryParams)
    }

    suspend fun getPopulatedProduct():List<Product>{
        val queryParams: HashMap<String, String> = NetworkUtils.MAP_KEYS
        queryParams[QueryParameters.orderBy] = QueryParameters.popularity
        queryParams[QueryParameters.order] = QueryParameters.order_desc

        return apiService.getProducts(NetworkUtils.MAP_KEYS)
    }

    suspend fun getBestProduct():List<Product>{
        val queryParams: HashMap<String, String> = NetworkUtils.MAP_KEYS
        queryParams[QueryParameters.orderBy] = QueryParameters.rating
        queryParams[QueryParameters.order] = QueryParameters.order_desc

        return apiService.getProducts(NetworkUtils.MAP_KEYS)
    }

    suspend fun getSpecialProduct():List<Product>{
        val queryParams: HashMap<String, String> = NetworkUtils.MAP_KEYS
        queryParams[QueryParameters.on_sale] ="true"

        return apiService.getProducts(NetworkUtils.MAP_KEYS)
    }
}