package com.example.toyproject014_airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/a36e81f3-2d0c-4dd9-936c-d7885a5de1c5")
    fun getHouseList(): Call<HouseDto>
}