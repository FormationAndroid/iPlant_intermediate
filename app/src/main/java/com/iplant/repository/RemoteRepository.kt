package com.iplant.repository

import com.iplant.api.ApiHelper
import com.iplant.api.ApiResult
import com.iplant.api.safeApiCall
import com.iplant.models.SearchResult

object RemoteRepository {

    suspend fun searchPlants(query: String): ApiResult<SearchResult> = safeApiCall {
        ApiHelper.apiService.getSearchPlants(query)
    }

}
