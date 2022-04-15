package com.cs.newsappcleanarchvisionandroid.data.repository

import androidx.compose.foundation.lazy.rememberLazyListState
import com.cs.newsappcleanarchvisionandroid.data.network.ApiService
import com.cs.newsappcleanarchvisionandroid.domain.model.Article
import com.cs.newsappcleanarchvisionandroid.domain.repository.GetNewsArticleRepo
import com.cs.newsappcleanarchvisionandroid.mappers.toDomain
import com.cs.newsappcleanarchvisionandroid.utils.SafeApiRequest
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService:ApiService)  :
    GetNewsArticleRepo,SafeApiRequest() {
    override suspend fun getNewsArticle(): List<Article> {

        val response = safeApiRequest {
            apiService.getNewsArticles()
        }
        return response?.articles?.toDomain()!!
    }
}