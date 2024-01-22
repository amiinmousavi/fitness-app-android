package be.aminmousavi.fitnessapp.data

data class MuscleDetailUiState(
    val id: Int = 0,
    val scientificName: String = "",
    val commonName: String = "",
    val description: String = "",
    val movements: List<String> = emptyList(),
    val location: String = ""
)