package com.example.bluelock

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenD(navController: NavController) {
    CharacterList()
    Button(onClick = {
        navController.navigate("screen_A") }
    ) {
        Text(text = "Back to Home Page")
    }

}

@Composable
fun CharacterList() {
    var myCharList = getallCharacterShop()

    LazyColumn(content = {
        itemsIndexed(myCharList, itemContent = {index, item ->
            Characters(item = item)
        })
    })
}

@Composable

fun Characters(item: Characters){
    var context = LocalContext.current
    Column(
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                Toast.makeText(context,"Poked ${item.charactername}",Toast.LENGTH_SHORT)
                    .show()
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = item.img)
            , contentDescription = item.charactername,
            modifier = Modifier,
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = item.charactername,
                style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold
                , textAlign = TextAlign.Center)
            )
            Text(
                text = item.description,
                style = TextStyle(fontSize = 18.sp,)
            )

        }

    }

}

