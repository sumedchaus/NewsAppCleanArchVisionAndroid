package com.cs.newsappcleanarchvisionandroid.domain.model

import com.cs.newsappcleanarchvisionandroid.data.model.SourceDTO

data class Article(

    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
