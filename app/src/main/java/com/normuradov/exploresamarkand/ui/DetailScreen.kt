package com.normuradov.exploresamarkand.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.normuradov.exploresamarkand.data.Repository
import com.normuradov.exploresamarkand.model.Sightseeing
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.normuradov.exploresamarkand.model.Category

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    sightseeng: Sightseeing,
    onBackPressed: (Category) -> Unit
) {
    Card(
        modifier = modifier
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxHeight(),

        ) {
        Column() {
            Image(
                painter = painterResource(id = sightseeng.newImageId),
                modifier = modifier
                    .fillMaxWidth()
                    .height(400.dp),
                contentDescription = sightseeng.name,
                contentScale = ContentScale.Crop,
            )

            Column {
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = sightseeng.name,
                    style = MaterialTheme.typography.displaySmall,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = sightseeng.address,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center
                )
                Divider(modifier = modifier.padding(vertical = 4.dp))
                Text(
                    text = sightseeng.description,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(sightseeng = Repository.categoryItems[0], onBackPressed = {})
}