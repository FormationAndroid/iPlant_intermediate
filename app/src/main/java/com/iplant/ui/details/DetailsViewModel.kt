package com.iplant.ui.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iplant.api.ApiResult
import com.iplant.models.plant.PlantDetails
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

}