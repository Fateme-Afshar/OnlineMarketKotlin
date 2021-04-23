package com.utab.onlinemarketkotlin.view.fragment.splashScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.utab.onlinemarketkotlin.data.repository.MainRepository
import com.utab.onlinemarketkotlin.data.repository.ProductRepository
import com.utab.onlinemarketkotlin.model.Product
import com.utab.onlinemarketkotlin.utils.networkUtils.Resource
import kotlinx.coroutines.Dispatchers

class splashVM(private val productRepository: ProductRepository,private val mainRepository: MainRepository) : ViewModel(){

    fun getProducts()= liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = productRepository.getProducts()))
        }catch (exception:Exception){
            emit(Resource.error(data = null,msg=exception.message ?: " Error Occurred !"))
        }
    }

    fun setProduct(list: List<Product>){
        mainRepository.setProducts(list)
    }
}