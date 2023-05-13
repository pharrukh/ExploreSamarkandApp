package com.normuradov.exploresamarkand.ui

import androidx.lifecycle.ViewModel
import com.normuradov.exploresamarkand.data.Repository
import com.normuradov.exploresamarkand.model.Category
import com.normuradov.exploresamarkand.model.Sightseeing
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class ExploreSamarkandViewModel(val screen: AppScreens = AppScreens.CategoryList) : ViewModel() {
    private val _uiState: MutableStateFlow<ExploreSamarkandUiState>
    val uiState: StateFlow<ExploreSamarkandUiState>

    init {
        _uiState = MutableStateFlow(
            ExploreSamarkandUiState(
                currentScreen = this.screen,
                sightseeingList = Repository.categoryItems,
            )
        )
        uiState = _uiState
    }

    fun navigateBack() {
        if (_uiState.value.currentScreen == AppScreens.SightseeingDetail) {
            this.navigateToSightseeingList()
        } else if (_uiState.value.currentScreen == AppScreens.SightseeingList) {
            this.navigateToCategory()
        }
    }

    fun navigateToCategory() {
        _uiState.update {
            it.copy(currentScreen = AppScreens.CategoryList)
        }
    }

    fun navigateToSightseeingList() {
        _uiState.update {
            it.copy(
                currentScreen = AppScreens.SightseeingList,
                selectedSightseeing = null,
            )
        }
    }


    fun selectCategory(category: Category) {
        val list = Repository.categoryItems.filter { it.category == category }
        _uiState.update {
            it.copy(
                selectedCategory = category,
                sightseeingList = list,
                selectedSightseeing = null,
            )
        }
    }

    fun navigateToSightseeingDetails() {
        _uiState.update {
            it.copy(
                currentScreen = AppScreens.SightseeingDetail,
            )
        }
    }

    fun selectSightseeing(sightseeing: Sightseeing) {
        val item = Repository.categoryItems.first { it.id == sightseeing.id }
        _uiState.update {
            it.copy(
                selectedSightseeing = item,
            )
        }
    }
}