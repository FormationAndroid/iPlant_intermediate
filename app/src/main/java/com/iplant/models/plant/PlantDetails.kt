package com.iplant.models.plant


import com.google.gson.annotations.SerializedName

data class PlantDetails(
    val author: String,
    @SerializedName("common_name") val commonName: String,
    @SerializedName("genus_id") val genusId: String,
    val id: String,
    @SerializedName("main_species") val mainSpecies: MainSpecies,
    @SerializedName("scientific_name") val scientificName: String,
    val slug: String,
    val sources: List<Source>
)