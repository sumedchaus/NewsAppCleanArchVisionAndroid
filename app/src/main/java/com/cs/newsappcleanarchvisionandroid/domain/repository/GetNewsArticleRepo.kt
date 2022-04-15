package com.cs.newsappcleanarchvisionandroid.domain.repository

import com.cs.newsappcleanarchvisionandroid.domain.model.Article

interface GetNewsArticleRepo {

    suspend fun getNewsArticle():List<Article>
}