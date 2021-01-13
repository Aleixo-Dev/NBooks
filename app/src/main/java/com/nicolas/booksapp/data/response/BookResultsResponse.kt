package com.nicolas.booksapp.data.response

import com.squareup.moshi.Json

data class BookResultsResponse(
    @field:Json(name = "book_details")
    val bookDetailsResponse: List<BookDetailsResponse>
)
