package com.example.firstapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R
import org.w3c.dom.Text

@Composable
fun MainDashboard(modifier: Modifier = Modifier)
{
    val gambar = painterResource(id = R.drawable.background)
    val logo = painterResource(id = R.drawable.umy)
    val jokowi =  painterResource(id = R.drawable.jokowi)
    Box (modifier = Modifier)
    {
        Image(
            painter = gambar,
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Text(text = "Login", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Blue)
                Text(text = "Ini Adalah Halaman Login.",)
                Image(
                    painter = logo,
                    contentDescription = "Logo UMY",
                    modifier = Modifier.size(280.dp),
                    contentScale = ContentScale.Fit
                )

                Text(text = "Nama", fontWeight = FontWeight.Bold, color = Color.Red)
                Text(text = "Muhammad Rasyid Ridha Aqimuddin", fontWeight = FontWeight.Bold, color = Color.Blue)
                Text(text = "20240140151", fontSize = 25.sp ,fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(60.dp))

                Image(
                    painter = jokowi,
                    contentDescription = "Jokowi is Perfect",
                    modifier = Modifier
                        .size(280.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .border(
                            width = 5.dp,
                            shape = CircleShape,
                            color = Color.White
                        ),
                    contentScale = ContentScale.Fit

                )

            }
        }
    }
}