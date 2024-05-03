package com.app.todolist.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FileCard(){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Row (
            modifier = Modifier.padding(10.dp)
        ){
            Text(
                text = "Titulo:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "Topolliyo",
                textAlign = TextAlign.Center,
            )
        }
        Column (
            modifier = Modifier.padding(10.dp)
        ){
            Text(
                text = "Description:",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo Se cayo ",
                textAlign = TextAlign.Start,
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun FiledCardPreview(){
    FileCard()
}