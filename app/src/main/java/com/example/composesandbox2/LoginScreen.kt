package com.example.composesandbox2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.composesandbox2.ui.theme.ComposeSandbox2Theme
import com.example.composesandbox2.ui.theme.GoogleSignInButton


//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun Login(navController: NavHostController) {
    ComposeSandbox2Theme {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
        ){
            Column(modifier = Modifier
                .weight(.8f)
                .fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start){
                Text(text = stringResource(id = R.string.intro),
                    color = MaterialTheme.colors.onBackground,
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    modifier = Modifier
                        .padding(25.dp,50.dp)
                )
            }
            Column(modifier = Modifier
                .weight(.2f)
                //.background(Color.Green)
                .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){
                GoogleSignInButton(navController = navController)

            }
        }
    }
}