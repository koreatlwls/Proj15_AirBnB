package com.example.proj15_airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/6129292c-d6cd-448d-980a-f8a3e9caff58")
    fun getHouseList(): Call<HouseDto>
}