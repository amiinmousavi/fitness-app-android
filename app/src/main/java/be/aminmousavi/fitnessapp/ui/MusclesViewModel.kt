package be.aminmousavi.fitnessapp.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import be.aminmousavi.fitnessapp.network.MusclesApi
import kotlinx.coroutines.launch

class MusclesViewModel() : ViewModel() {
    var musclesUiState: String by mutableStateOf("")
        private set

    init {
        getMuscles()
    }

    private fun getMuscles() {
        viewModelScope.launch {
            val listResult = MusclesApi.retrofitService.getMuscles()
            musclesUiState = listResult
        }
    }
}