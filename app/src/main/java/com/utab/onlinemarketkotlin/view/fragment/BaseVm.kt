package com.utab.onlinemarketkotlin.view.fragment

import androidx.lifecycle.ViewModel
import com.utab.onlinemarketkotlin.data.repository.CategoryRepository
import com.utab.onlinemarketkotlin.data.repository.MainRepository
import com.utab.onlinemarketkotlin.data.repository.ProductRepository
import com.utab.onlinemarketkotlin.model.Product
import javax.inject.Inject

class BaseVm @Inject constructor(private val productRepository: ProductRepository,
             private val mainRepository: MainRepository,
             private val categoryRepository: CategoryRepository) : ViewModel() {

    fun setNewestProduct(list: List<Product>){
        mainRepository.setNewestProductList(list)
    }

    fun getNewestProduct():List<Product> = mainRepository.newestProductList()

    fun setBestProduct(list: List<Product>){
        mainRepository.setBestProductList(list)
    }

    fun getBestProduct():List<Product> = mainRepository.bestProductList()

    fun setPopulatedProduct(list: List<Product>) {
        mainRepository.setPopularProductList(list)
    }

    fun getPopulatedProduct():List<Product> = mainRepository.popularProductList()

    fun setSpecialProductList(list: List<Product>){
        mainRepository.setSpecialProductList(list)
    }

    fun specialProductList():List<Product> = mainRepository.specialProductList()
}