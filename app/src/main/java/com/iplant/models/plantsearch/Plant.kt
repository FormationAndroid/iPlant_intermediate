package com.iplant.models.plantsearch


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Plant(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("genus_id") val genusId: String,
    val id: String,
    val author: String,
    @SerializedName("common_name") val commonName: String,
    val family: String,
    val genus: String,
    @SerializedName("image_url") val imageUrl: String?,
    val rank: String,
    @SerializedName("scientific_name") val scientificName: String,
    val slug: String,
    val status: String
)