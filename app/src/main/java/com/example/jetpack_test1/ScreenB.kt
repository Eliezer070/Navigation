package com.example.jetpack_test1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ScreenB(navController: NavHostController, cadena: String) {
    Column(
        modifier =
            Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen B " + cadena, fontSize = 36.sp)
        Spacer(modifier = Modifier.height(65.dp))
        Button(onClick = {
            navController.navigate("C")
        }) {
            Text(text = "Go to screen C", fontSize = 40.sp)
        }
    }
}