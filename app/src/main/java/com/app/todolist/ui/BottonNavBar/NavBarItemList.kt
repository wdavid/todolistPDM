package com.app.denuncia.sivar.ui.components.BottonNavBar

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.app.todolist.R

@Composable
fun NavBarItemList(): List<NavBarItem>{
    return listOf(
        NavBarItem(
            "Inicio",
            ScreenRoute.Home.route,
            R.drawable.ic_home
        ),
        NavBarItem(
            "Agregar nueva tarea",
            ScreenRoute.AddToDoList.route,
            R.drawable.editprofile
        ),
    )
}