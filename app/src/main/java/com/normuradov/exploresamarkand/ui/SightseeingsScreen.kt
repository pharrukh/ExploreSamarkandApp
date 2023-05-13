package com.normuradov.exploresamarkand.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.normuradov.exploresamarkand.data.Repository
import com.normuradov.exploresamarkand.model.Sightseeing
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.normuradov.exploresamarkand.model.Category

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SightseeingsScreen(
    modifier: Modifier = Modifier,
    sightseeingList: List<Sightseeing>,
    onItemClick: (Sightseeing) -> Unit,
    onBackPressed: () -> Unit,
) {

    LazyColumn(
        content = {
            items(sightseeingList) {
                SightseeingListItem(
                    onItemClick = onItemClick,
                    onBackPressed = onBackPressed,
                    sightseeing = it
                )
            }
        },
        modifier = modifier,
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SightseeingListItem(
    modifier: Modifier = Modifier,
    onBackPressed: () -> Unit,
    onItemClick: (Sightseeing) -> Unit,
    sightseeing: Sightseeing
) {
    Card(
        modifier = modifier
            .height(100.dp)
            .padding(2.dp),
        onClick = { onItemClick(sightseeing) },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
    ) {
        Row(modifier = modifier.fillMaxWidth()) {
            Image(
                modifier = modifier.width(150.dp),
                painter = painterResource(id = sightseeing.newImageId),
                contentDescription = sightseeing.name,
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
                    text = sightseeing.name,
                    style = MaterialTheme.typography.displayMedium,
                    textAlign = TextAlign.Center
                )
                Text(text = sightseeing.address, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SightseeingScreenPreview() {
    SightseeingsScreen(
        sightseeingList = Repository.categoryItems,
        onItemClick = {},
        onBackPressed = {}
    )
}