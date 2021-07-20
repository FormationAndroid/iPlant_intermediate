package com.iplant.api

import com.iplant.models.stackoverflow.Questions
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface StackOverflowService {

    @GET("questions?order=desc&sort=activity&site=stackoverflow")
    suspend fun getLastQuestions() : Response<Questions>

}