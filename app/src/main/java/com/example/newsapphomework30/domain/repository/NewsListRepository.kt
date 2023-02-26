package com.example.newsapphomework30.domain.repository

import com.example.newsapphomework30.domain.models.NewsData

interface NewsListRepository {
    suspend fun getNewsList(): List<NewsData>
}