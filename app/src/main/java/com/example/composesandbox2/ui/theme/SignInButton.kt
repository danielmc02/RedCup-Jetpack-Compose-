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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composesandbox2.R


@Composable
fun GoogleSignInButton(){
Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .width(200.dp)
            .height(50.dp),
        shape = RoundedCornerShape(20.dp)) {
    Icon(
        painter = painterResource(id = R.drawable.ic_google__g__logo),
        contentDescription = "Sign-In Icon",
    tint = Color.Unspecified)
    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
    Text(text = "Sign In", fontSize = 27.sp, color = MaterialTheme.colors.onPrimary)
}

}

@Preview(showBackground = false)
@Composable
fun Screen(){
 GoogleSignInButton()
}