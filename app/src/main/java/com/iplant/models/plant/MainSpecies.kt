package com.iplant.models.plant

import com.google.gson.annotations.SerializedName

data class MainSpecies(
    @SerializedName("common_names") val commonNames: List<CommonName>,
    val family: String,
    val genus: String,
    @SerializedName("image_url") val imageUrl: String,
    val rank: String,
    val sources: List<Source>,
    val status: String,
)