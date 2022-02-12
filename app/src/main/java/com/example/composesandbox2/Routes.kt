package com.example.composesandbox2


sealed class Routes(val route: String){
    object Home : Routes("home")
    object Login : Routes("login")
}
