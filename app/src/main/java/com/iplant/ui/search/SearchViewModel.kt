package com.iplant.ui.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iplant.api.ApiResult
import com.iplant.models.plantsearch.Plant
import com.iplant.repository.RemoteRepository
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {

    var plantsResultLiveData = MutableLiveData<List<Plant>>()
    var apiErrorLiveData = MutableLiveData<String>()

    fun searchPlants(query: String){
        viewModelScope.launch {
            when(val result = RemoteRepository.searchPlants(query)){
                is ApiResult.Success -> plantsResultLiveData.postValue(result.data.plants)
                is ApiResult.Error -> apiErrorLiveData.postValue(result.errorResponse)
            }
        }
    }

}