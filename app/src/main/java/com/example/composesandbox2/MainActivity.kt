package com.example.composesandbox2

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composesandbox2.ui.theme.ComposeSandbox2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSandbox2Theme{
                Test()
            }
        }


    }
}



@Preview(uiMode = UI_MODE_NIGHT_NO, showBackground = true,)
@Composable
fun Test() {
    ComposeSandbox2Theme {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
        ){
        Text( text = stringResource(id = R.string.intro), modifier = Modifier
            .background(Color.Transparent)
            .padding(25.dp), fontSize = 40.sp, color = MaterialTheme.colors.onBackground
            )
    }
    }
}