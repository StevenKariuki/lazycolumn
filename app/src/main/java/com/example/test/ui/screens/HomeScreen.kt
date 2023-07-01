package com.example.test.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
            ,
//            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {
                Text(
                    text = "BASKETBALL BALLS",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .padding(20.dp,12.dp,12.dp)
                )
                Text(
                    text = "The best baskeketballs avaible.",
                    modifier = Modifier
                        .padding(20.dp,2.dp,2.dp))
                LazyRow( // TODO 5 learn about list
                    modifier = Modifier
                ) {
                    items(basketBallItemsList) { uiModel ->
                        CustomizeThisCard(uiModel)
                    }
                }
            }
            item {
                Text(
                    text = "BASKETBALL JERSEYS",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .padding(20.dp,12.dp,12.dp)
                )
                Text(
                    text = "The best baskeketball's Jerseys avaible.",
                    modifier = Modifier
                        .padding(20.dp,2.dp,2.dp))
                LazyRow(
                    modifier = Modifier
                ) {
                    items(Jersey) { UIModel ->
                        CustomizeThisCard(UIModel)

                    }
                }
            }
            item {
                Text(
                    text = "BASKETBALL BALLS",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .padding(20.dp,12.dp,12.dp)
                )
                Text(
                    text = "The best baskeketball's  balls available.",
                    modifier = Modifier
                        .padding(20.dp,2.dp,2.dp))
                LazyRow(
                    modifier = Modifier
                ) {
                    items(Balls) { UIModel ->
                        CustomizeThisCard(UIModel)
                    }
                }
            }
        }
    }
}

//TODO customize this card
@Composable
private fun CustomizeThisCard(uiModel: UIModel) {
    Column {
        Card(
            modifier = Modifier

                .padding(20.dp)
                .clip(RoundedCornerShape(12.dp)),
        ) {
            Row(

            )
            {
                val image: Painter = painterResource(id = uiModel.image)
                Image(
                    modifier = Modifier
                        .size(150.dp)
                        .clip(shape = CircleShape)
                        .padding(20.dp),
                    painter = image,
                    alignment = Alignment.CenterStart,
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                ) // TODO 3 learn Image card about https://www.youtube.com/watch?v=KPVoQjwmWX4
                Column {
                    Text(
                        text = uiModel.name,
                        modifier = Modifier
                            .padding(0.dp,2.dp,2.dp)
                    )
                    Text(
                        text = uiModel.type,
                        modifier = Modifier
                            .padding(0.dp,2.dp,2.dp)
                    )
                    // TODO 4 learn about Styling text https://www.youtube.com/watch?v=nm_LNJWHi9A
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(0.dp,2.dp,2.dp)) {
                        Text(text = "Buy")
                    }
                }
            }
        }

    }
}

val basketBallItemsList = listOf(
    UIModel(
        name = "View",
        type = "Jordans Shoes",
        image = R.drawable.s10
    ),
    UIModel(
        name = "Shoe ",
        type = "Legit ball",
        image = R.drawable.s1
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball hoops",
        image = R.drawable.s2
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball rims",
        image = R.drawable.s3
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball rocks",
        image = R.drawable.s4
    ),
    UIModel(
        name = "Shoe 1",
        type = "Great sport",
        image = R.drawable.s5
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball wilson",
        image = R.drawable.s6
    ),
    UIModel(
        name = "Shoe 1",
        type = "Long lasting balls",
        image = R.drawable.s7
    ),
    UIModel(
        name = "Shoe 1",
        type = "leather",
        image = R.drawable.s8
    ),
    UIModel(
        name = "Shoe 1",
        type = "Lit basketball balls",
        image = R.drawable.s9
    ),
    UIModel(
        name = "Shoe 1",
        type = "leather",
        image = R.drawable.s10
    ),
    UIModel(
        name = "Shoe",
        type = "leather",
        image = R.drawable.s10
    ),
)
val Jersey = listOf(
    UIModel(
        name = "View",
        type = "Black Jersey",
        image = R.drawable.j1
    ),
    UIModel(
        name = "Shoe ",
        type = "Legit ball",
        image = R.drawable.j2
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball hoops",
        image = R.drawable.j2
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball rims",
        image = R.drawable.j3
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball rocks",
        image = R.drawable.j4
    ),
    UIModel(
        name = "Shoe 1",
        type = "Great sport",
        image = R.drawable.j5
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball wilson",
        image = R.drawable.j6
    ),
    UIModel(
        name = "Shoe 1",
        type = "Long lasting balls",
        image = R.drawable.j7
    ),
    UIModel(
        name = "Shoe 1",
        type = "leather",
        image = R.drawable.j8
    ),
    UIModel(
        name = "Shoe 1",
        type = "Lit basketball balls",
        image = R.drawable.j9
    ),
    UIModel(
        name = "Shoe 1",
        type = "leather",
        image = R.drawable.j10
    ),
)

val Balls = listOf(
    UIModel(
        name = "View",
        type = "Black Jersey",
        image = R.drawable.b10
    ),
    UIModel(
        name = "Shoe ",
        type = "Legit ball",
        image = R.drawable.b1
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball hoops",
        image = R.drawable.b2
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball rims",
        image = R.drawable.b3
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball rocks",
        image = R.drawable.b4
    ),
    UIModel(
        name = "Shoe 1",
        type = "Great sport",
        image = R.drawable.b5
    ),
    UIModel(
        name = "Shoe 1",
        type = "Basketball wilson",
        image = R.drawable.b6
    ),
    UIModel(
        name = "Shoe 1",
        type = "Long lasting balls",
        image = R.drawable.b7
    ),
    UIModel(
        name = "Shoe 1",
        type = "leather",
        image = R.drawable.b8
    ),
    UIModel(
        name = "Shoe 1",
        type = "Lit basketball balls",
        image = R.drawable.b9
    ),
    UIModel(
        name = "Shoe 1",
        type = "leather",
        image = R.drawable.b10
    ),

)
@Preview
@Composable
fun PrevHomeScreen() {
    HomeScreen()
}