package be.aminmousavi.fitnessapp.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import be.aminmousavi.fitnessapp.data.MuscleDetailUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MuscleDetailViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(
        MuscleDetailUiState(
            id = 0,
            scientificName = "Lateral Deltoid",
            commonName = "Side Deltoid",
            description = "The lateral deltoid is situated on the outer side of the shoulder and assists in abducting the arm.",
            listOf("Abduction"),
            "Outer side of the shoulder"
        )
    )
    val uiState: StateFlow<MuscleDetailUiState> = _uiState


}