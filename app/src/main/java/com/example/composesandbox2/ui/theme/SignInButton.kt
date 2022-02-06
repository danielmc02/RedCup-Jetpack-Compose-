package com.example.composesandbox2.ui.theme

import android.view.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun GoogleSignInButton(){
        val MyAppIcons = Icons.Filled
Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .background(MaterialTheme.colors.onBackground)
            .width(200.dp)
            .height(50.dp),
shape = RoundedCornerShape(5.dp)) {
    Icon( MyAppIcons.Person, contentDescription = "Sign-In Icon")
    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Sign In", fontSize = 27.sp)
}

}

@Preview(showBackground = true)
@Composable
fun Screen(){
 GoogleSignInButton()
}