package com.example.bluelock

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ScreenA_Bg() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(painter = painterResource(id = R.drawable.rin), contentDescription = "rin",
            modifier = Modifier.size(600.dp))
    }


}

@Composable
fun Screen2_Card1() {
    Column(
        modifier = Modifier,
    ) {
        Image(painter = painterResource(id = R.drawable.nagi1), contentDescription = "nagi",
            modifier = Modifier.size(600.dp))


    }

}

@Composable
fun Screen2_Card2() {
    Column(
        modifier = Modifier
    ) {
        Image(painter = painterResource(id = R.drawable.isagi), contentDescription = "Isagi",
            modifier = Modifier.size(600.dp))
    }

}

@Composable
fun Screen2_Card3() {
    Column(
        modifier = Modifier
    ) {
        Image(painter = painterResource(id = R.drawable.nagii), contentDescription = "Nagii",
            modifier = Modifier.size(600.dp))

    }

}

@Composable
fun Screen2_Card4() {
    Column(
        modifier = Modifier

    ) {
        Image(painter = painterResource(id = R.drawable.bachira), contentDescription = "Bachira",
            modifier = Modifier.size(600.dp))

    }

}