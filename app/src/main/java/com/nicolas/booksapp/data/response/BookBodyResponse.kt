package com.nicolas.booksapp.data.response

import com.squareup.moshi.Json

data class BookBodyResponse(
    @field:Json(name = "results")
    val bookResults: List<BookResultsResponse>
)