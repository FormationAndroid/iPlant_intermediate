package com.iplant.models

import com.google.gson.annotations.SerializedName

data class SearchResult(
    @SerializedName("data") val plants: List<Plant>,
    val first: String,
    val last: String,
    val next: String,
    val self: String
)