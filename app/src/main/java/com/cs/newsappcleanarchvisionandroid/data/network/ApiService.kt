package com.cs.newsappcleanarchvisionandroid.data.network

import com.cs.newsappcleanarchvisionandroid.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey:String = "04487b9b125b490ba70d9468f7170941"
    ) : Response<NewsDTO>
}