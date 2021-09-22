package com.android.kotlin.newsappmvvm.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.android.kotlin.newsappmvvm.models.Article

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateInsert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}