package com.sample.commoncomps.WebServices

import com.google.gson.GsonBuilder
import com.sample.commoncomps.Constants
import com.sample.commoncomps.Objects.Simpsons
import okhttp3.OkHttpClient
import retrofit2.Call
import java.util.concurrent.TimeUnit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface  WebAPI {
    companion object{
        var longerTimeoutClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
        var gson = GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()

        var retrofitApiInstance = Retrofit.Builder().baseUrl(Constants.SIMPSONS_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(longerTimeoutClient)
            .build()
        fun create(): WebAPI {
            return retrofitApiInstance.create(WebAPI::class.java)
        }
    }
    @GET("?q=simpsons+characters&format=json")
    fun getSimpsonsData():Call<Simpsons>

    @GET("?q=the+wire+characters&format=json")
    fun getWireCharactersData():Call<Simpsons>


}