package com.normuradov.exploresamarkand.ui

import android.content.res.Resources.Theme
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.normuradov.exploresamarkand.data.Repository
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreSamarkandApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier,
) {

    val startScreen: AppScreens = when (windowSize) {
        WindowWidthSizeClass.Expanded -> AppScreens.MultipleColumns
        else -> AppScreens.CategoryList
    }

    val viewModel: ExploreSamarkandViewModel = viewModel()
    val uiState = viewModel.uiState.collectAsState().value


    if (startScreen != AppScreens.MultipleColumns) {
        Scaffold(
            topBar = {
                ExploreSamarkandAppBar(
                    currentScreen = uiState.currentScreen,
                    onBackButtonClick = { viewModel.navigateBack() }
                )
            }
        ) { innerPadding ->

            if (uiState.currentScreen == AppScreens.CategoryList) {
                CategoryScreen(
                    categories = Repository.categories,
                    onItemClick = {
                        viewModel.selectCategory(it)
                        viewModel.navigateToSightseeingList()

                    },
                    modifier = modifier.padding((innerPadding)),
                    selectedCategory = uiState.selectedCategory
                )
            } else if (uiState.currentScreen == AppScreens.SightseeingList) {
                SightseeingsScreen(
                    sightseeingList = uiState.sightseeingList,
                    onItemClick = {
                        viewModel.selectSightseeing(it)
                        viewModel.navigateToSightseeingDetails()
                    },
                    onBackPressed = { viewModel.navigateToCategory() },
                    modifier = modifier.padding((innerPadding))
                )
            } else if (uiState.currentScreen == AppScreens.SightseeingDetail && uiState.selectedSightseeing != null) {
                DetailScreen(
                    sightseeng = uiState.selectedSightseeing!!,
                    onBackPressed = { viewModel.navigateToSightseeingList() }
                )
            }
        }
    } else {
        Row(modifier = modifier.fillMaxSize()) {
            CategoryScreen(
                categories = Repository.categories,
                onItemClick = { viewModel.selectCategory(it) },
                modifier = modifier
                    .weight(1f),
                selectedCategory = uiState.selectedCategory
            )

            if (uiState.selectedCategory != null) {
                SightseeingsScreen(
                    sightseeingList = uiState.sightseeingList,
                    onItemClick = { viewModel.selectSightseeing(it) },
                    onBackPressed = { },
                    modifier = modifier
                        .weight(1f)
                )

                if (uiState.selectedSightseeing != null) {
                    Column(modifier = modifier.weight(1f)) {
                        DetailScreen(
                            sightseeng = uiState.selectedSightseeing!!,
                            onBackPressed = { },
                        )
                    }
                } else {
                    Spacer(modifier = modifier.weight(1f))
                }
            } else {
                Spacer(modifier = modifier.weight(2f))
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreSamarkandAppBar(
    onBackButtonClick: () -> Unit,
    currentScreen: AppScreens,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(
                text = currentScreen.title,
                style = MaterialTheme.typography.displayLarge,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        },
        navigationIcon = {
            if (currentScreen == AppScreens.SightseeingList || currentScreen == AppScreens.SightseeingDetail)
                IconButton(onClick = onBackButtonClick) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back"
                    )
                }
        },
        modifier = modifier
    )
}