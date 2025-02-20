package com.example.newsportal

data class News(
    var id: Int,
    val title: String,
    val summary: String,
    val date: String,
    val category: String
)
