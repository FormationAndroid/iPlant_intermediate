package com.iplant.repository

import com.iplant.api.ApiResult
import com.iplant.api.retrofitClient
import com.iplant.api.safeApiCall
import com.iplant.models.stackoverflow.Questions

class RemoteRepository {

    suspend fun getLastQuestions(): ApiResult<Questions> =
        safeApiCall { retrofitClient.getLastQuestions() }

}
