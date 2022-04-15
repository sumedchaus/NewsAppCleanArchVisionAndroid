package com.cs.newsappcleanarchvisionandroid.data.model


// DTO - Data Transfer Object
data class NewsDTO(
    val articles: List<ArticleDTO>?,
    val status: String?,
    val totalResults: Int?
)