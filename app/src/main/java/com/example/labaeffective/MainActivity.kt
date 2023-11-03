package com.example.labaeffective

import android.graphics.Picture
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.labaeffective.ui.theme.LabaeffectiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(colorResource(R.color.backColor))
                    .fillMaxSize()
            ) {
                dotaPrew()
//                dotaText()
                description()
                video()
                review()
//                digits()
                digitsAndStars()
                humans()
            }
            Column(
                modifier = Modifier.fillMaxHeight(0.45f),
                verticalArrangement = Arrangement.Bottom
            ) {
                dotaLogo()
            }

        }
    }
}

/** Картинка вверху экрана **/
@Preview
@Composable
fun dotaPrew(){
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
private fun dotaLogo() {
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
private fun dotaText() {
    Card(
        modifier = Modifier
            .size(width = 120.dp, height = 80.dp)
            .padding(22.dp, 50.dp, 100.dp)
    ){
        Box(
            modifier = Modifier
                .background(colorResource(R.color.backColor))
                .size(width = 124.dp, height = 200.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "DoTA 2",
                fontSize = 20.sp,
                lineHeight = 26.sp,
                fontWeight = FontWeight(700),
                color = Color(0xB2EEF2FB),
            )
//                        color: #FFF;
//            font-family: Sk-Modernist;
//            font-size: 20px;
//            font-style: normal;
//            font-weight: 700;
//            line-height: 26px; /* 130% */
//            letter-spacing: 0.5px;)
        }
    }
}

@Preview
@Composable
private fun description() {
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
private fun video() {
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
private fun review() {
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
private fun digitsAndStars(){
    Row(modifier = Modifier
        .size(width = 195.dp, height = 58.dp)
        .padding(start = 24.dp)) {
        Text(
            text = "4.9",
            style = TextStyle(
                fontSize = 48.sp,
// fontFamily = FontFamily(Font(R.font.sk-modernist)),
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
// fontFamily = FontFamily(Font(R.font.sk-modernist)),
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
private fun humans(){
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
//                    fontFamily = FontFamily(Font(R.font.sk-modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.5.sp,
                )
            )
        }



    }
}