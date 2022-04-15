package com.cs.newsappcleanarchvisionandroid.presentation

import com.cs.newsappcleanarchvisionandroid.domain.model.Article

data class HomeStateHolder(
    val isLoading : Boolean = false,
    val data :List<Article>? = null,
    val error : String = ""
)