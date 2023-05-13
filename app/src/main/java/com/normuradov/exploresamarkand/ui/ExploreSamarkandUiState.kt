package com.normuradov.exploresamarkand.ui

import com.normuradov.exploresamarkand.model.Category
import com.normuradov.exploresamarkand.model.Sightseeing

data class ExploreSamarkandUiState(
    val selectedCategory: Category? = null,
    val sightseeingList: List<Sightseeing>,
    val selectedSightseeing: Sightseeing? = null,
    val currentScreen: AppScreens,
)
