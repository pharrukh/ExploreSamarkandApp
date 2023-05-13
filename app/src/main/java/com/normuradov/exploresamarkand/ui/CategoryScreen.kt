package com.normuradov.exploresamarkand.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.normuradov.exploresamarkand.R
import com.normuradov.exploresamarkand.data.Repository
import com.normuradov.exploresamarkand.model.Category

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(
    modifier: Modifier = Modifier,
    onItemClick: (Category) -> Unit,
    categories: List<Category>,
    selectedCategory: Category?
) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
    ) {
        items(categories) { category ->
            CategoryItem(
                category = category, onItemClick = onItemClick, selectedCategory = selectedCategory
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryItem(
    modifier: Modifier = Modifier,
    category: Category,
    onItemClick: (Category) -> Unit,
    selectedCategory: Category?
) {
    val painter = painterResource(id = getImageFor(category))
    val elevation = if (category == selectedCategory) 4.dp else 0.dp

    Card(
        modifier = modifier
            .height(100.dp)
            .padding(2.dp),
        onClick = { onItemClick(category) },
        elevation = CardDefaults.cardElevation(elevation)
    ) {
        Row(
            modifier = modifier.fillMaxWidth()
        ) {
            Image(
                modifier = modifier.width(150.dp),
                painter = painter,
                contentDescription = category.name,
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = modifier
                    .padding(4.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = category.name,
                    style = MaterialTheme.typography.displayLarge,
                )

            }
        }
    }
}

private fun getImageFor(category: Category): Int {
    return when (category) {
        Category.Ancient -> R.drawable.ancient
        Category.Temurid -> R.drawable.timurid
        Category.Bazaar -> R.drawable.bazaar
        Category.Modern -> R.drawable.modern
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    CategoryScreen(
        categories = Repository.categories, onItemClick = {}, selectedCategory = Category.Bazaar
    )
}