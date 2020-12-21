package com.example.finalaru.network


import com.example.finalaru.Post
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*


interface ApiService {

    @GET("todos")
    fun getTodos(): Call<List<Post>>

    @POST("todos")
    fun postTodos(@Body body: JsonObject): Call<JsonObject>

    @GET("todos/{id}")
    fun getTodoById(@Path("id") todoId: Int): Call<Post>

    fun getNews(
        @Path("category") category: String,
        @Path("country_code") country: String
    ): Call<ApiResponse>

}