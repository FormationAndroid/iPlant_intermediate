package com.iplant.models.plant


import com.google.gson.annotations.SerializedName

data class CommonName(
    @SerializedName("ENGLISH") val english: List<String>,
    @SerializedName("FRENCH") val french: List<String>
)