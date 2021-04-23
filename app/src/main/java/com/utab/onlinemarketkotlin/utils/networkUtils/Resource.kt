package com.utab.onlinemarketkotlin.utils.networkUtils

data class Resource<out T>(val status: Status,val data:T?,val msg:String?) {
    companion object{
        fun <T> success(data:T):Resource<T> = Resource(status = Status.SUCCESS,data=data,null)
        fun <T> error(data:T,msg:String): Resource<T> = Resource(status = Status.ERROR,data=data,msg=msg)
        fun <T> loading(data:T): Resource<T> =Resource(status = Status.LOADING,data=data,msg = null)
    }
}