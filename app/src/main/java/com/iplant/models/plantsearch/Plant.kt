package com.iplant.models.plantsearch


import com.google.gson.annotations.SerializedName

data class Plant(
    val author: String,
    @SerializedName("common_name") val commonName: String,
    val family: String,
    val genus: String,
    @SerializedName("genus_id") val genusId: String,
    val id: String,
    @SerializedName("image_url") val imageUrl: String?,
    val rank: String,
    @SerializedName("scientific_name") val scientificName: String,
    val slug: String,
    val status: String
)