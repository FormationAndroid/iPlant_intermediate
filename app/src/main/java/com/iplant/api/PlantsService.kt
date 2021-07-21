package com.iplant.api

import com.iplant.models.plant.PlantDetails
import com.iplant.models.plantsearch.SearchResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlantsService {

    @GET("plants/search")
    suspend fun getSearchPlants(
        @Query("q") query: String,
    ): Response<SearchResult>

    @GET("plants/{id}")
    suspend fun getPlantDetails(
        @Path("id") plantId: String,
    ): Response<PlantDetails>

}