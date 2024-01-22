package be.aminmousavi.fitnessapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import be.aminmousavi.fitnessapp.R
import be.aminmousavi.fitnessapp.data.Datasource
import be.aminmousavi.fitnessapp.ui.theme.FitnessAppTheme
import be.aminmousavi.fitnessapp.utils.IconButton
import be.aminmousavi.fitnessapp.utils.LogoImage

@Composable
fun HomeScreen(
    homeIconButtonOptions: List<Datasource.IconButtonOption>,
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
    ) {
        LogoImage()
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(
                dimensionResource(id = R.dimen.padding_medium)
            )
        ) {
            homeIconButtonOptions.forEach { item ->
                IconButton(labelResId = item.labelResId,
                    iconResId = item.iconResId,
                    iconDescriptionResId = item.iconDescriptionResId,
                    onClick = {
                        onNextButtonClicked(item.labelResId)
                    })
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    FitnessAppTheme {
        HomeScreen(
            homeIconButtonOptions = Datasource.homeIconButtonOptions,
            onNextButtonClicked = {},
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.padding_medium))
        )
    }
}