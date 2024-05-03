package com.app.denuncia.sivar.ui.components.BottonNavBar

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.app.todolist.ui.screens.AddToDoListScreen
import com.app.todolist.ui.screens.HomeScreen

@Composable
fun NavBarGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
){
    NavHost(
        navController = navController,
        startDestination = ScreenRoute.Home.route,
        enterTransition = { EnterTransition.None},
        exitTransition = { ExitTransition.None}
    ) {
        composable(ScreenRoute.Home.route){
            HomeScreen(innerPadding)
        }
        composable(ScreenRoute.AddToDoList.route){
            AddToDoListScreen(innerPadding)
        }
    }
}