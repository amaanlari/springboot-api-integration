package com.lari.api_testing

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("users/{id}")
    fun getUser(@Path("id") id: Int): Call<User>
}