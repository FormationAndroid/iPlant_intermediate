package com.iplant.ui.details

import androidx.lifecycle.*
import com.iplant.api.ApiResult
import com.iplant.models.plant.PlantDetails
import com.iplant.models.plantsearch.Plant
import com.iplant.repository.LocalRepository
import com.iplant.repository.RemoteRepository
import kotlinx.coroutines.launch

class DetailsViewModel : ViewModel() {

    var plantDetailsResultLiveData = MutableLiveData<PlantDetails?>()
    var apiErrorLiveData = MutableLiveData<String>()

    fun getPlantDetails(plantId: String){
        viewModelScope.launch {
            when(val result = RemoteRepository.getPlantDetails(plantId)){
                is ApiResult.Success -> plantDetailsResultLiveData.postValue(result.data)
                is ApiResult.Error -> apiErrorLiveData.postValue(result.errorResponse)
            }
        }
    }

    val idPlantLiveData: MutableLiveData<String> = MutableLiveData()

    fun setIdPlant(idPlant: String) {
        idPlantLiveData.value = idPlant
    }

    val plantFavoriteLiveData: LiveData<Plant> = Transformations.switchMap(idPlantLiveData) { param->
        LocalRepository.getFavoritePlantById(param)
    }

    fun addOrRemoveFromFavorite(){
        viewModelScope.launch {
            plantFavoriteLiveData.value?.let {
                LocalRepository.insertFavoritePlant(it)
            }
        }
    }

}