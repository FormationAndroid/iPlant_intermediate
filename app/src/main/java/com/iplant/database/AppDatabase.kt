package com.iplant.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.iplant.App
import com.iplant.models.plantsearch.Plant

const val DATABASE_NAME = "PLANT_DB"

@Database(entities = [Plant::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun favoritesPlantDao(): FavoritesPlantDao

    companion object {

        val instance: AppDatabase by lazy {
            Room.databaseBuilder(
                App.appContext,
                AppDatabase::class.java,
                DATABASE_NAME
            ).build()
        }

    }

}