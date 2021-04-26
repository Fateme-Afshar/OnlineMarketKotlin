package com.utab.onlinemarketkotlin.retrofit

import com.utab.onlinemarketkotlin.model.Category
import com.utab.onlinemarketkotlin.model.Product
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {
    @GET("products")
    suspend fun getProducts(@QueryMap queryParam: Map<String, String>): List<Product>

    @GET("products/categories?per_page=100")
    suspend fun getCategories(@QueryMap queryParam: Map<String, String>): List<Category>
}