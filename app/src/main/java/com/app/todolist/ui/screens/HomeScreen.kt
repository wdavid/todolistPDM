package com.app.todolist.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.app.todolist.component.FileCard
import com.app.todolist.model.ListCard

@Composable
fun HomeScreen(innerPadding: PaddingValues){
    LazyColumn(
        modifier = Modifier
            .padding(innerPadding)
    ){
        items(ListCard){
                cardItem -> FileCard(cardItem)
        }
    }
}