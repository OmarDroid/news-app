package com.android.kotlin.newsappmvvm.repository

import com.android.kotlin.newsappmvvm.api.RetrofitInstance
import com.android.kotlin.newsappmvvm.db.ArticleDatabase
import com.android.kotlin.newsappmvvm.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun updateInsert(article: Article) = db.getArticleDao().updateInsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}