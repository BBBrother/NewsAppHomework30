package com.example.newsapphomework30.data.mappers

import com.example.newsapphomework30.data.models.NewsResponse
import com.example.newsapphomework30.domain.models.NewsData
import javax.inject.Inject

class NewsMapper @Inject constructor() {

    operator fun invoke(response: NewsResponse) = with(response) {
        NewsData(
            title = title.orEmpty(),
            author = author.orEmpty(),
            date = (date?.substring(0, 10)).orEmpty(),
            url = url.orEmpty(),
            urlToImage = urlToImage.orEmpty()
        )
    }
}