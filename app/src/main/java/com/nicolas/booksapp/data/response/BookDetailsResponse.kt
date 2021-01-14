package com.nicolas.booksapp.data.response

import com.nicolas.booksapp.data.model.Book
import com.squareup.moshi.Json

data class BookDetailsResponse(
    @field:Json(name = "title")
    val title: String,
    @field:Json(name = "author")
    val author: String,
    @field:Json(name = "description")
    val description: String
) {
    fun getBookModel() = Book(
        title = this.title,
        author = this.author,
        description = this.description
    )
}
