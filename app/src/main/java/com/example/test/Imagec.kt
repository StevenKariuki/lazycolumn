package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Imagec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagec)
        setContent {
            val painter = painterResource(id = R.drawable.vituofly)
            val description ="Basketball shoe"
            val title = "Shoe"
            Imagecard(
                painter = painter,
                contentDescription = description,
                title = title
            )
        }
    }
}

@Composable
fun Imagecard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(20.dp)

    ) {
        Box( //TODO 1
            modifier = Modifier
                .height(300.dp) //TODO 2 about compose modifiers https://www.youtube.com/watch?v=XCuC_p3E0qo
        ) {
            Image(
                painter =painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                contentAlignment =  Alignment.BottomStart)
            {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))

            }
        }
    }
}