package com.example.test.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold( // TODO 6 learn about scaffold https://www.youtube.com/shorts/UoK2i5CLsZc
        topBar = {
            HomeScreenTopAppBar()
        }
    ) { paddingValues ->
        LazyColumn( // TODO 5 learn about list
            modifier = Modifier
                .padding(paddingValues)
        ) {
            items(basketBallItemsList) {uiModel ->
                CustomizeThisCard(uiModel)
            }
        }
    }
}

//TODO customize this card
@Composable
private fun CustomizeThisCard(uiModel: UIModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp)),

    ) {
        Row( //TODO 1
            modifier = Modifier //TODO 2 about compose modifiers https://www.youtube.com/watch?v=XCuC_p3E0qo
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            val image: Painter = painterResource(id = uiModel.image)
            Image(
                modifier = Modifier
                    .size(80.dp, 80.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = image,
                alignment = Alignment.CenterStart,
                contentDescription = "",
                contentScale = ContentScale.Crop
            ) // TODO 3 learn Image card about https://www.youtube.com/watch?v=KPVoQjwmWX4
            Column(
                modifier = Modifier
                    .padding(start = 12.dp)
            ) {
                Text(text = uiModel.name, style = MaterialTheme.typography.titleMedium) // TODO 4 learn about Styling text https://www.youtube.com/watch?v=nm_LNJWHi9A
            }
        }
    }
}

val basketBallItemsList = listOf(
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
    UIModel(
        name = "Shoe 1",
        image = R.drawable.vituofly
    ),
)

@Preview
@Composable
fun PrevHomeScreen() {
    HomeScreen()
}