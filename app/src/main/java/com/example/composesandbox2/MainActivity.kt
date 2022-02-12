package com.example.composesandbox2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composesandbox2.ui.theme.ComposeSandbox2Theme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSandbox2Theme{
                ScreenMain()

            }
        }


    }
}


