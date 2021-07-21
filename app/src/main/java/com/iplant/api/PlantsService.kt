package com.iplant.api

import com.iplant.models.SearchResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PlantsService {

    @GET("plants/search")
    suspend fun getSearchPlants(
        @Query("q") query: String,
    ): Response<SearchResult>

}