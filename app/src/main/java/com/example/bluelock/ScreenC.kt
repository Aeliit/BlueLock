package com.example.bluelock

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun ScreenC(navController: NavController) {
    ListDemo()
    Button(onClick = {
        navController.navigate("screen_A") }
    ) {
        Text(text = "Back to Home Page")
    }

}
@Composable
fun ListDemo() {
    var myListItems = getallTshirtShop()

    LazyColumn(content = {
        itemsIndexed(myListItems, itemContent = {index, item ->
            TshirtShop(item = item)
        })
    })
}


@Composable
fun TshirtShop(item: TshirtShop){
    var context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                Toast
                    .makeText(context, "Buyed ${item.charName}", Toast.LENGTH_SHORT)
                    .show()
            }
    ) {
        Image(painter = painterResource(id = item.imageRes)
            , contentDescription = item.name,
            modifier = Modifier,
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = item.charName,
                style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = item.name,
                style = TextStyle(fontSize = 18.sp,)
            )

        }

    }

}





@Composable
fun TextItem(text : String) {
    Text(text = text,
        fontSize = 20.sp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
    )

}

