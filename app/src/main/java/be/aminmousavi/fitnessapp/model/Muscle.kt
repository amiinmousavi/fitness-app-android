package be.aminmousavi.fitnessapp.model

data class Muscle(
    var _id: String,
    val anatomicalRegionId: String,
    var scientificName: String,
    var commonName: String,
    var description: String,
    var movements: List<String>,
    var location: String,
) {
    constructor() : this("0", "","", "", "", listOf(""), "")

}