package com.example.labaeffective

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(colorResource(R.color.backColor))
                    .fillMaxSize()
            ) {
                DotaPrew()
                Description()
                Video()
                Review()
                DigitsAndStars()
                Humans()
            }
            Column(
                modifier = Modifier.fillMaxHeight(0.45f),
                verticalArrangement = Arrangement.Bottom
            ) {
                DotaLogo()
            }

        }
    }
}

@Preview
@Composable
fun DotaPrew(){
    Box(
        modifier = Modifier
            .fillMaxHeight(0.35f)
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(id = R.drawable.back_image),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

/** Лого доты **/
@Preview
@Composable
private fun DotaLogo() {
    Card(
        modifier = Modifier
            .size(width = 132.dp, height = 138.dp)
            .padding(22.dp)
    ){
        Box(
            modifier = Modifier
                .background(colorResource(R.color.backColor))
                .size(width = 88.dp, height = 94.5.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_dota_),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Preview
@Composable
private fun Description() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 21.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(
            modifier = Modifier.size(height = 150.dp, width = 327.dp),
            contentAlignment = Alignment.BottomCenter
        ){
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xB2EEF2FB),

                    )
            )
        }
    }
}
@Composable
private fun Video() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, top = 18.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .size(width = 240.dp, height = 135.dp)
                .padding(end = 15.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.video1),
                contentDescription = "screen1",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(width=240.dp, height=135.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ellipse),
                contentDescription = "ellipse",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(45.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "arrow",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(24.dp)
            )
        }

        Column(){
            Image(
                painter = painterResource(id = R.drawable.video2),
                contentDescription = "screen2",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width=240.dp, height=135.dp)
            )
        }

    }
}
@Preview
@Composable
private fun Review() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, top = 20.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(
            modifier = Modifier.size(height = 19.dp, width = 137.dp),
            contentAlignment = Alignment.BottomCenter
        ){
            Text(
                text = "Review & Ratings",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 19.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xB2EEF2FB),

                    )
            )
        }
    }
}

@Preview
@Composable
private fun DigitsAndStars(){
    Row(modifier = Modifier
        .size(width = 195.dp, height = 58.dp)
        .padding(start = 24.dp)) {
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 48.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF),
            )
        )
        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(start = 16.dp),
            verticalArrangement = Arrangement.Center) {

            Image(
                painter = painterResource(id = R.drawable.stars),
                contentDescription = "stars",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(width = 76.dp, height = 14.dp)
            )

            Text(
                text = "70M Reviews",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFA8ADB7),
                    letterSpacing = 0.5.sp,
                )
            )
        }
    }
}
@Preview
@Composable
private fun Humans(){
    Column (modifier = Modifier
        .fillMaxHeight()
        .padding(start = 24.dp),
    verticalArrangement = Arrangement.Center){
        Box(            modifier = Modifier.padding(end = 16.dp)
        ){
            Image(painter = painterResource(id = R.drawable.ellipse_9),
                contentDescription = "people",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(45.dp)
            )
            Text(
                modifier = Modifier.padding(start = 56.dp),
                text = "Auguste Conte",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.5.sp,
                )
            )
        }



    }
}