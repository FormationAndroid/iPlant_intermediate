package com.iplant.repository

import com.iplant.database.AppDatabase
import com.iplant.models.plantsearch.Plant

object LocalRepository {

    fun getAllFavoritesPlants() = AppDatabase.instance.favoritesPlantDao().getAll()

    fun getFavoritePlantById(plantId: String) = AppDatabase.instance.favoritesPlantDao().getById(plantId)

    suspend fun insertFavoritePlant(plant: Plant) = AppDatabase.instance.favoritesPlantDao().insert(plant)

    suspend fun deleteFavoritePlant(plant: Plant) = AppDatabase.instance.favoritesPlantDao().delete(plant)


}