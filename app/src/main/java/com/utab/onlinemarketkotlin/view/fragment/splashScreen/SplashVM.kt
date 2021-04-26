package com.utab.onlinemarketkotlin.view.fragment.splashScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.utab.onlinemarketkotlin.data.repository.MainRepository
import com.utab.onlinemarketkotlin.data.repository.ProductRepository
import com.utab.onlinemarketkotlin.model.Category
import com.utab.onlinemarketkotlin.model.Product
import com.utab.onlinemarketkotlin.utils.networkUtils.Resource
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class SplashVM @Inject constructor(private val productRepository: ProductRepository, private val mainRepository: MainRepository) : ViewModel(){
    private val flags= booleanArrayOf(false,false,false,false)

    fun getNewestProducts()= liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = productRepository.getNewestProducts()))
        }catch (exception:Exception){
            emit(Resource.error(data = null,msg=exception.message ?: " Error Occurred !"))
        }
    }

    fun getPopulatedProduct():LiveData<Resource<List<Product>?>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = productRepository.getPopulatedProduct()))
        }catch (exception:Exception){
            emit(Resource.error(data = null,msg=exception.message ?: " Error Occurred !"))
        }
    }

    fun getBestProduct():LiveData<Resource<List<Product>?>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = productRepository.getBestProduct()))
        }catch (exception:Exception){
            emit(Resource.error(data = null,msg=exception.message ?: " Error Occurred !"))
        }
    }

    fun getSpecialProduct():LiveData<Resource<List<Product>?>> = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = productRepository.getSpecialProduct()))
        }catch (exception:Exception){
            emit(Resource.error(data = null,msg=exception.message ?: " Error Occurred !"))
        }
    }

    fun checkCompleteLoading():Boolean{
        return flags[0] && flags[1] && flags[2] && flags[3]
    }

    fun flags()=flags
}