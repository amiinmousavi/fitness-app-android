import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import be.aminmousavi.fitnessapp.R
import be.aminmousavi.fitnessapp.data.Datasource
import be.aminmousavi.fitnessapp.ui.ExercisesScreen
import be.aminmousavi.fitnessapp.ui.HomeScreen
import be.aminmousavi.fitnessapp.ui.MarsViewModel
import be.aminmousavi.fitnessapp.ui.MusclesScreen
import be.aminmousavi.fitnessapp.ui.MusclesViewModel

enum class FitnessScreen(@StringRes val title: Int) {
    Home(title = R.string.app_name),
    Muscles(title = R.string.muscles),
    Exercises(title = R.string.exercises),
    MuscleDetail(title = R.string.details),
    ExerciseDetail(title = R.string.details)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FitnessAppBar(
    currentScreen: FitnessScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(

        title = { Text(stringResource(currentScreen.title)) },

        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),

        modifier = modifier,

        navigationIcon = {
            if (canNavigateBack) {

                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }

            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FitnessApp(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = FitnessScreen.valueOf(
        backStackEntry?.destination?.route ?: FitnessScreen.Home.name
    )

    Scaffold(
        topBar = {
            FitnessAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
//        val uiState by viewModel.uiState.collectAsState()
        NavHost(
            navController = navController,
            startDestination = FitnessScreen.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = FitnessScreen.Home.name) {
                HomeScreen(
                    homeIconButtonOptions = Datasource.homeIconButtonOptions,
                    onNextButtonClicked = { route ->
                        when (route) {
                            FitnessScreen.Muscles.title -> {
                                navController.navigate(FitnessScreen.Muscles.name)
                            }

                            FitnessScreen.Exercises.title -> {
                                navController.navigate(FitnessScreen.Exercises.name)
                            }

                            else -> {
                                navController.navigate(FitnessScreen.Exercises.name)
                            }
                        }
                    })
            }
            composable(route = FitnessScreen.Exercises.name) {
                ExercisesScreen(exercises = Datasource.exercises)
            }

            composable(route = FitnessScreen.Muscles.name){
                val musclesViewModel: MusclesViewModel = viewModel()
                MusclesScreen(musclesUiState = musclesViewModel.musclesUiState)
            }

        }
    }
}










