package com.utab.onlinemarketkotlin.data.repository

import com.utab.onlinemarketkotlin.model.Product
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor() {
    private var newestProductList:List<Product> = mutableListOf()
    private var popularProductList:List<Product> = mutableListOf()
    private var bestProductList:List<Product> = mutableListOf()
    private var specialProductList:List<Product> = mutableListOf()

    fun setSpecialProductList(list: List<Product>){
        specialProductList=list
    }

    fun specialProductList():List<Product> = specialProductList

    fun setBestProductList(list: List<Product>){
        popularProductList=list
    }

    fun bestProductList():List<Product> = bestProductList

    fun setPopularProductList(list: List<Product>){
        popularProductList=list
    }

    fun popularProductList():List<Product> = popularProductList

    fun setNewestProductList(list: List<Product>){
        newestProductList=list
    }

    fun newestProductList():List<Product> = newestProductList
}