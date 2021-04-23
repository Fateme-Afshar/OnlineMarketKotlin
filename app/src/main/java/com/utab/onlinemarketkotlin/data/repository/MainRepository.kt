package com.utab.onlinemarketkotlin.data.repository

import com.utab.onlinemarketkotlin.model.Product
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor() {
    private var productList:List<Product> = mutableListOf()

    fun setProducts(list: List<Product>){
        productList=list
    }

    fun getProduct():List<Product> = productList
}