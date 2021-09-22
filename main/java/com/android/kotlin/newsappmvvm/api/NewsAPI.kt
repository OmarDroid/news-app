package com.android.kotlin.newsappmvvm.api

import com.android.kotlin.newsappmvvm.models.NewsResponse
import com.android.kotlin.newsappmvvm.util.Keys
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Keys.apiKey()
    ): Response<NewsResponse>


    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Keys.apiKey()
    ): Response<NewsResponse>

}