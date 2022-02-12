package com.example.composesandbox2.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Home(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)){
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(.8f)
                .fillMaxWidth()
                .background(Color.Green)){
        }
        Column(modifier = Modifier
            .background(Color.Magenta)
            .weight(5f)) {

        }
    }

}