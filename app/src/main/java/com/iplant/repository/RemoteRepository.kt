package com.iplant.repository

import com.iplant.api.ApiHelper
import com.iplant.api.ApiResult
import com.iplant.api.safeApiCall
import com.iplant.models.plant.PlantDetails
import com.iplant.models.plantsearch.SearchResult

object RemoteRepository {

    suspend fun searchPlants(query: String): ApiResult<SearchResult> = safeApiCall {
        ApiHelper.apiService.getSearchPlants(query)
    }

    suspend fun getPlantDetails(plantId: String): ApiResult<PlantDetails> = safeApiCall {
        ApiHelper.apiService.getPlantDetails(plantId)
    }

}
