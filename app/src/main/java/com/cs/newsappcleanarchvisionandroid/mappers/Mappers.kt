package com.cs.newsappcleanarchvisionandroid.mappers

import com.cs.newsappcleanarchvisionandroid.data.model.ArticleDTO
import com.cs.newsappcleanarchvisionandroid.domain.model.Article

fun List<ArticleDTO>.toDomain():List<Article>{
    return  map{
        Article(
            content = it.content ?: "",
            description = it.description?:"",
            title =  it.title?:"",
            urlToImage = it.urlToImage?:""
        )
    }
}