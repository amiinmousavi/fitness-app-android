package be.aminmousavi.fitnessapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import be.aminmousavi.fitnessapp.ui.theme.FitnessAppTheme
import be.aminmousavi.fitnessapp.utils.HeadingText
import be.aminmousavi.fitnessapp.utils.Paragraph
import be.aminmousavi.fitnessapp.utils.SubHeadingText
import be.aminmousavi.fitnessapp.utils.TitleText


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MuscleDetailScreen(muscleDetailViewModel: MuscleDetailViewModel = viewModel()) {
    val muscleState by muscleDetailViewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        MuscleDetailHeader(
            scientificName = muscleState.scientificName,
            commonName = muscleState.commonName
        )
        TitleText(text = "Description")
        Paragraph(text = muscleState.description)
        TitleText(text = "Movements")
        muscleState.movements.forEach { movement ->
            Paragraph(text = movement)
        }
        TitleText(text = "Location")
        Paragraph(text = muscleState.location)
    }
}

@Composable
fun MuscleDetailHeader(scientificName: String, commonName: String, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.padding(10.dp)
        ) {
            Column {
                HeadingText(scientificName)
                SubHeadingText(commonName)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MuscleDatailScreenPreview() {
    FitnessAppTheme {
        MuscleDetailScreen()
    }
}