package com.example.composesandbox2

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composesandbox2.ui.theme.ComposeSandbox2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSandbox2Theme {
                // A surface container using the 'background' color from the theme
                Main()
            }
        }


    }
}



@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun Main(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom){
        Surface(color = MaterialTheme.colors.background, modifier = Modifier
            .fillMaxWidth()
            .weight(3f)){

        }
        Surface(color = MaterialTheme.colors.primary, modifier = Modifier
            .fillMaxWidth()
            .weight(0.25f)){

        }
    }
}