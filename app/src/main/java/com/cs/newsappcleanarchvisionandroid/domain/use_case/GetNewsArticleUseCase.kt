package com.cs.newsappcleanarchvisionandroid.domain.use_case

import com.cs.newsappcleanarchvisionandroid.domain.model.Article
import com.cs.newsappcleanarchvisionandroid.domain.repository.GetNewsArticleRepo
import com.cs.newsappcleanarchvisionandroid.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class GetNewsArticleUseCase @Inject constructor(private val getNewsArticleRepo: GetNewsArticleRepo ){
    operator fun invoke(): Flow<Resource<List<Article>>> = flow {

        emit(Resource.Loading(""))
         try {
            emit(Resource.Success(getNewsArticleRepo.getNewsArticle()))
        } catch ( e: Exception){
            emit(Resource.Error(e.message))
        }
    }
}