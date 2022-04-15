package com.cs.newsappcleanarchvisionandroid.utils

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data = data)
    class Error<T>(message: String?) : Resource<T>()
    class Loading<T>(message: String?) : Resource<T>()

}