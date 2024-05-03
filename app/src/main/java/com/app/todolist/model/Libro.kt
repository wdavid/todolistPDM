package com.app.todolist.model

data class Libro(val titulo:String, val descripcion:String)

val lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."

val booksList = mutableListOf(
    Libro("Pantera rosa", lorem),
    Libro("El señor de los anillos", lorem),
    Libro("Dragon ball gt", lorem),
    Libro("Dragon ball z", lorem),
    Libro("Dragon ball super", lorem),
    Libro("Kimetsu no yaiba", lorem)
)