package com.example.newsapphomework30.data

import com.example.newsapphomework30.data.mappers.NewsMapper
import com.example.newsapphomework30.data.network.NewsService
import com.example.newsapphomework30.domain.models.NewsData
import com.example.newsapphomework30.domain.repository.NewsListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class NewsListRepositoryImpl @Inject constructor(
    private val mapper: NewsMapper,
    private val service: NewsService
) : NewsListRepository {

    override suspend fun getNewsList(): List<NewsData> {
        return withContext(Dispatchers.IO) {
            service.getNewsList().execute().body()?.articles?.map { mapper(it) }
                ?: throw Exception()
        }
    }
}