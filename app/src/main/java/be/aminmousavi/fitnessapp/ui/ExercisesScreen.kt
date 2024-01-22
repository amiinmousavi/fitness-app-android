package be.aminmousavi.fitnessapp.ui

import android.graphics.Color
import androidx.compose.foundation.border

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import be.aminmousavi.fitnessapp.data.Datasource
import be.aminmousavi.fitnessapp.model.Exercise
import be.aminmousavi.fitnessapp.ui.theme.FitnessAppTheme
import be.aminmousavi.fitnessapp.utils.HeadingText

@Composable
fun ExercisesScreen(
    exercises: List<Exercise>
) {
    LazyColumn {
        items(exercises) { exercise ->
            ExerciseItem(exercise = exercise)
        }
    }
}

@Composable
fun ExerciseItem(exercise: Exercise) {
    Card(
        modifier = Modifier
            .fillMaxSize(1f)
//            .border(2.dp, androidx.compose.ui.graphics.Color.Black)
            .padding(4.dp)
            .clickable(onClick = {})
            .clip(MaterialTheme.shapes.small),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {

        HeadingText(
            modifier = Modifier.padding(4.dp),
            text = exercise.name
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ExercisesScreenPreview() {
    FitnessAppTheme {
        ExercisesScreen(exercises = Datasource.exercises)
    }
}
