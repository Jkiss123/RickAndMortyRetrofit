package com.example.rickandmorthyretrofit

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("character")
    fun getdata() : Call<CharacterResponse>

    companion object{
        val moshi = Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()



        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl("https://rickandmortyapi.com/api/")
            .build()
            .create(ApiInterface::class.java)
    }
}