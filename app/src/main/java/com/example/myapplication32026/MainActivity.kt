package com.example.myapplication32026

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication32026.ui.theme.Dafos
import com.example.myapplication32026.ui.theme.Fascinate
import com.example.myapplication32026.ui.theme.MyApplication32026Theme
import com.example.myapplication32026.ui.theme.Play

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            MyApplication32026Theme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Layout(
                        modifier = Modifier.padding(innerPadding)
//                    GameOver(
//                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Layout(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(13.dp),
                verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column() {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {


                Text(
                    text = "SCORE: 0050",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontFamily = Play,
                    fontWeight = FontWeight.Bold
                )


                Row(
                    verticalAlignment = Alignment.CenterVertically,

                    ) {

                    Text(
                        text = "Lives: ",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontFamily = Play,
                        fontWeight = FontWeight.Bold
                    )

                    AndroidView(
                        color = Color.Green,
                        modifier = Modifier.size(45.dp)
                    )
                    AndroidView(
                        color = Color.Green,
                        modifier = Modifier.size(45.dp)
                    )
                    AndroidView(
                        color = Color.Green,
                        modifier = Modifier.size(45.dp)
                    )
                }
            }

            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Center
            ) {
                AndroidView(
                    color = Color.Green,
                    modifier = Modifier.size(76.dp)
                )

                AndroidView(
                    color = Color.Red,
                    modifier = Modifier.size(76.dp)
                )

                AndroidView(
                    color = Color.Blue,
                    modifier = Modifier.size(76.dp)
                )

                AndroidView(
                    color = Color.Yellow,
                    modifier = Modifier.size(76.dp)
                )

                AndroidView(
                    color = Color.Green,
                    modifier = Modifier.size(76.dp)
                )
            }
        }

        Column(
            modifier=modifier,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            AndroidView(
                color = Color.Blue,
                modifier = Modifier.size(120.dp)
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray
                ),

                shape = RoundedCornerShape(5.dp),

                onClick = {

                }
            ) {
                Text(
                    text = "PRESS START",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontFamily = Play,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        }

}

@Composable
fun GameOver(
    modifier: Modifier
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AndroidView(
                color = Color.Green,
                modifier = Modifier
                    .weight(1f)

            )
            AndroidView(
                color = Color.Red,
                modifier = Modifier
                    .weight(1f)

            )
            AndroidView(
                color = Color.Blue,
                modifier = Modifier
                    .weight(1f)
            )
            AndroidView(
                color = Color.Yellow,
                modifier = Modifier
                    .weight(1f)

            )
            AndroidView(
                color = Color.Green,
                modifier = Modifier
                    .weight(1f)

            )
        }


        Text(
            text = "GAME OVER",
            fontSize = 65.sp,
            color = Color.White,
            fontFamily = Play,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun AndroidView(
    color: Color,
    modifier: Modifier = Modifier
) {

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Android Enemy"
    )
}