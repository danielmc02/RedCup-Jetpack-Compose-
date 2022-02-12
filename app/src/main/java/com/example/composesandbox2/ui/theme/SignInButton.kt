package com.example.composesandbox2.ui.theme

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.composesandbox2.R
import com.example.composesandbox2.Routes


@Composable
fun GoogleSignInButton(navController: NavHostController){

    Button(onClick = { navController.navigate(Routes.Home.route) },
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

