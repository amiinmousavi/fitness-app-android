package be.aminmousavi.fitnessapp.data

import androidx.compose.ui.res.stringResource
import be.aminmousavi.fitnessapp.R
import be.aminmousavi.fitnessapp.model.Execution
import be.aminmousavi.fitnessapp.model.Exercise
import be.aminmousavi.fitnessapp.model.Muscle
import be.aminmousavi.fitnessapp.model.Region

object Datasource {
    val regions = listOf(
        Region(R.string.abdominals, R.drawable.abdominals),
        Region(R.string.arms, R.drawable.arms),
        Region(R.string.back, R.drawable.back),
        Region(R.string.chest, R.drawable.chest),
        Region(R.string.legs, R.drawable.legs),
        Region(R.string.shoulders, R.drawable.shoulders)
    )

    data class IconButtonOption(
        val labelResId: Int,
        val iconResId: Int,
        val iconDescriptionResId: Int,
        val route: String
    )

    val homeIconButtonOptions = listOf(
        IconButtonOption(R.string.muscles, R.drawable.muscles, R.string.muscles_png, "muscles"),
        IconButtonOption(
            R.string.exercises,
            R.drawable.exercises,
            R.string.exercises_png,
            "exercises"
        )
    )

    val exercises = listOf(
        Exercise(
            "",
            "Barbell Shoulder Press",
            listOf(
                Execution(
                    "",
                    1,
                    "Seated on a bench, take a shoulder-width grip on the bar with your palms facing forward."
                ),
                Execution(
                    "",
                    2,
                    "Lower the weight slowly in front until it touches your upper chest."
                ),
                Execution("", 3, "Push vertically upward until your elbows lock out.")
            ),
            "A neutral grip (palms facing each other) targets the anterior deltoid better than a pronated grip (palms facing forward).",
            "A shorter repetition terminating the press just before lockout keeps tension on the deltoid.",
            "Performing the exercise while seated upright is stricter than performing the exercise while standing because it prevents cheating the weight upward using momentum generated by the legs."
        ),
        Exercise(
            "",
            "Dumbbell Shoulder Press",
            listOf(
                Execution(
                    "",
                    1,
                    "Seated on a bench, hold a dumbbell in each hand at shoulder level, palms facing forward."
                ),
                Execution(
                    "",
                    2,
                    "Press the dumbbells vertically upward until your elbows lock out."
                ),
                Execution("", 3, "Lower the dumbbells until they touch your shoulders.")
            ),
            "A neutral grip (palms facing each other) targets the anterior deltoid better than a pronated grip (palms facing forward).",
            "A shorter repetition terminating the press just before lockout keeps tension on the deltoid.",
            "Performing the exercise while seated upright is stricter than performing the exercise while standing because it prevents cheating the weight upward using momentum generated by the legs."
        )
    )

    val muscles = listOf(
        Muscle(
            "0",
            "00",
            "Lateral Deltoid",
            "Side Deltoid",
            "The lateral deltoid is situated on the outer side of the shoulder and assists in abducting the arm.",
            listOf(""),
            "Outer side of the shoulder"
        ),
        Muscle(
            "1",
            "11",
            "Posterior Deltoid",
            "Rear Deltoid",
            "The posterior deltoid is located on the back of the shoulder and aids in extending the arm.",
            listOf(""),
            "Back of the shoulder"
        ),
    )
}