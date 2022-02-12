package com.example.composesandbox2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composesandbox2.ui.theme.Home

@Composable
fun ScreenMain(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Login.route){
        composable(route = Routes.Home.route){
            Home()
        }
        composable(route = Routes.Login.route){
        
            Login(navController = navController)
        }
    }


}