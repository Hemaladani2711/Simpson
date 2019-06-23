package com.sample.simpsonviewer.WebServices

import com.google.gson.GsonBuilder
import com.sample.simpsonviewer.Objects.Simpsons
import okhttp3.OkHttpClient
import retrofit2.Call
import java.util.concurrent.TimeUnit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface Retrofit {
    companion object {
        val BASE_URL:String="http://api.duckduckgo.com/"
        var longerTimeoutClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
        var gson = GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()

        var retrofitApiInstance = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(longerTimeoutClient)
            .build()
        fun create(): Retrofit{

            return retrofitApiInstance.create(Retrofit::class.java)
        }

    }

    @GET("?q=simpsons+characters&format=json")
    fun getSimpsonsData(): Call<Simpsons>


}