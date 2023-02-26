package com.example.newsapphomework30.data.network

import com.example.newsapphomework30.data.models.NewsListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface NewsService {

    @Headers("x-api-key: 97fefde1d8be43d6a070bc9689ad069b")
    @GET("everything?q=bitcoin")
    fun getNewsList(): Call<NewsListResponse>
}