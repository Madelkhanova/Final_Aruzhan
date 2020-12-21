package com.example.finalaru.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
    const val BASE_URL = "https://saurav.tech/NewsAPI/"
    private var retrofit: Retrofit? = null

    /**
     * This method returns retrofit client instance
     *
     * @return Retrofit object
     */
    val client: Retrofit?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}