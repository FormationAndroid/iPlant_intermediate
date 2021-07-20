package com.iplant.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iplant.api.ApiResult
import com.iplant.models.stackoverflow.Questions
import com.iplant.repository.RemoteRepository
import kotlinx.coroutines.launch

class FavoritesViewModel : ViewModel() {

    val getLastQuestionsSuccess = MutableLiveData<Questions>()
    val getLastQuestionsError = MutableLiveData<String>()

    fun getLastQuestions() {
        viewModelScope.launch {
            when (val retrofitPost = RemoteRepository().getLastQuestions()) {
                is ApiResult.Success -> getLastQuestionsSuccess.postValue(retrofitPost.data)
                is ApiResult.Error -> getLastQuestionsError.postValue(retrofitPost.errorResponse)
            }
        }
    }

}