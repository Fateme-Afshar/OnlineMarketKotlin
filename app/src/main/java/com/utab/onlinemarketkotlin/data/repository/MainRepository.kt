package com.utab.onlinemarketkotlin.data.repository

import com.utab.onlinemarketkotlin.model.Product

object MainRepository {
    private var productList:List<Product> = mutableListOf()

    fun setProducts(list: List<Product>){
        productList=list
    }

    fun getProduct():List<Product> = productList
}