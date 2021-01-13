package com.nicolas.booksapp.data.network

import com.nicolas.booksapp.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NyServices {

    @GET("lists.json")
    fun listRepos(
        @Query("api-key") api: String = "p9uHuaGqAsQZPjsrAb8xP1dXwALqK2hh",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}