package com.example.newsapphomework30.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapphomework30.R
import com.example.newsapphomework30.domain.models.NewsData

class NewsAdapter(
    private val newsList: List<NewsData>,
    private val itemClick: (String) -> Unit
) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_news_item, parent, false)
        return NewsViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.onBind(newsList[position])
    }

    override fun getItemCount(): Int = newsList.size
}