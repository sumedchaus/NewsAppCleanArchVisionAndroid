package com.cs.newsappcleanarchvisionandroid.domain.di

import com.cs.newsappcleanarchvisionandroid.data.network.ApiService
import com.cs.newsappcleanarchvisionandroid.data.repository.GetNewsArticleRepoImpl
import com.cs.newsappcleanarchvisionandroid.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object DomainModule {


    @Provides
    @Singleton
    fun provideApiService(): ApiService{
        return Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo{
        return GetNewsArticleRepoImpl(apiService = apiService)
    }

}