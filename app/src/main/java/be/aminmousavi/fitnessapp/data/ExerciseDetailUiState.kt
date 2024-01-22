package be.aminmousavi.fitnessapp.data

import be.aminmousavi.fitnessapp.model.Execution

class ExerciseDetailUiState(
    val id: Int = 0,
    val name: String = "",
    val execution: List<Execution> = emptyList(),
    val handSpacing: String = "",
    val rangeOfMotion: String = "",
    bodyPosition: String = ""
)