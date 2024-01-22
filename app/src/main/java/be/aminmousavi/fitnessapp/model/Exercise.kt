package be.aminmousavi.fitnessapp.model

data class Exercise(
    val _id: String,
    val name: String,
    val execution: List<Execution>,
//    val musclesInvolvedPrimary: List<Any>,
//    val musclesInvolvedSecondary: List<Any>,
    val handSpacing: String,
    val rangeOfMotion: String,
    val bodyPosition: String
)