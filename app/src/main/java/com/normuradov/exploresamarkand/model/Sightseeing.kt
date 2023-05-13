package com.normuradov.exploresamarkand.model

import androidx.annotation.DrawableRes
import androidx.annotation.Nullable

data class Sightseeing(
    val id: Int,
    @DrawableRes val oldImageId: Int?,
    @DrawableRes val newImageId: Int,
    val address: String,
    val name: String,
    val category: Category,
    val constructionTime: String,
    val description: String
)