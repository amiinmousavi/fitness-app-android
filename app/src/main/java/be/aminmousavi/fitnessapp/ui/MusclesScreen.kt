package be.aminmousavi.fitnessapp.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import be.aminmousavi.fitnessapp.R
import be.aminmousavi.fitnessapp.data.Datasource
import be.aminmousavi.fitnessapp.model.Muscle
import be.aminmousavi.fitnessapp.ui.theme.FitnessAppTheme
import be.aminmousavi.fitnessapp.utils.HeadingText
import be.aminmousavi.fitnessapp.utils.SubHeadingText

@Composable
fun MusclesScreen(musclesUiState: String, modifier: Modifier = Modifier) {
    ResultScreen(musclesUiState, modifier)
}

@Composable
fun ResultScreen(muscles: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
    ) {
        Text(text = muscles)
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    FitnessAppTheme {
        ResultScreen(stringResource(R.string.placeholder_result))
    }
}
//@Composable
//fun MusclesScreen(muscles: List<Muscle>, modifier: Modifier = Modifier) {
//    LazyColumn {
//        items(muscles) { muscle ->
//            MuscleItem(muscle = muscle)
//        }
//    }
//}

//@Composable
//fun MuscleItem(muscle: Muscle) {
//    Card(
//        modifier = Modifier
//            .fillMaxSize(1f)
//            .padding(4.dp)
//            .clickable(onClick = {})
//            .clip(MaterialTheme.shapes.small),
//        elevation = CardDefaults.cardElevation(2.dp)
//    ) {
//        HeadingText(
//            modifier = Modifier.padding(4.dp),
//            text = muscle.scientificName
//        )
//        SubHeadingText(
//            modifier = Modifier.padding(4.dp, 0.dp),
//            text = muscle.commonName
//        )
//    }
//}

//@Composable
//fun MusclesScreenPreview() {
//    FitnessAppTheme{
//        MusclesScreen(muscles = Datasource.muscles)
//    }
//}