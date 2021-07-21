package com.iplant.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.iplant.models.plantsearch.Plant

@Dao
interface FavoritesPlantDao {

    @Query("SELECT * FROM Plant")
    fun getAll(): LiveData<List<Plant>>

    @Query("SELECT * FROM Plant WHERE id=:plantId")
    fun getById(plantId: String): LiveData<Plant?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(plant: Plant)

    @Delete
    suspend fun delete(plant: Plant)

}