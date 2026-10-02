package com.example.praktikum2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanLogin(modifier: Modifier = Modifier) {
    val latar = painterResource(id = R.drawable.angkatsepeda)
    val logo = painterResource(id = R.drawable.logo_umy)
    val foto = painterResource(id = R.drawable.wisuda)
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) { Image(
        painter = latar,
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp, bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text(
                text = "Login",
                color = Color.Blue,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Ini adalah halaman login,",
                color = Color.White,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(40.dp))
            // Logo dibungkus Box berbentuk lingkaran
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = logo,
                    contentDescription = "Logo Universitas Muhammadiyah Yogyakarta",
                    modifier = Modifier
                        .fillMaxSize()
                        .scale(1.5f),
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(48.dp))

                Text(
                    text = "Nama",
                    color = Color.Red,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Aufa Maha Dana",
                    color = Color.Blue,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "20240140262",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

            }

        }
    }
}