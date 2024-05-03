package com.app.denuncia.sivar.ui.components.BottonNavBar

sealed class ScreenRoute (var route: String) {
    object Home : ScreenRoute("home")
    object AddToDoList : ScreenRoute("addtodolist")
}