package com.example.bluelock

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenA (navController: NavController) {
    var name by remember {
        mutableStateOf("")
    }
    ScreenA_Bg()
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
    Text(text = "Welcome to Blue Lock",
        fontSize = 24.sp,
        modifier = Modifier.padding(52.dp))
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        mytext(name)
        mytextfield(name, onNameChange = {
            name = it
        })
        Button(onClick = {
            navController.navigate("screen_B")
        }) {
            Text(text ="Next")

        }



    }
    
}

@Composable
fun mytext(name : String){
    Text(text = "Hello $name", style = TextStyle(fontSize = 30.sp),
        color = Color.White)
}

@Composable
fun mytextfield(name : String,onNameChange : (String)->Unit){

    OutlinedTextField(value = name, onValueChange = {
        onNameChange(it)
    },
        label = { Text(text = "Enter name ",
            color = Color.White)}
    )

}