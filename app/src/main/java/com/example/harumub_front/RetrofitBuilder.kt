package com.example.harumub_front

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    var api: RetrofitInteface

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.12:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(RetrofitInteface::class.java)
    }
}