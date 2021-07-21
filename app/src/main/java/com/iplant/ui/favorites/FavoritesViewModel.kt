package com.iplant.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.iplant.models.plantsearch.Plant
import com.iplant.repository.LocalRepository

class FavoritesViewModel : ViewModel() {

    val favoritePlants: LiveData<List<Plant>> = LocalRepository.getAllFavoritesPlants()



}