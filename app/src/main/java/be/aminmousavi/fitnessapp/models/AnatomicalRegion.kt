package be.aminmousavi.fitnessapp.models

data class AnatomicalRegion(
    var id: String,
    var name: String,
    var description: String
) {
    constructor() : this(
        "",
        "",
        ""
    )
}