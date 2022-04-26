package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailsScreen() {

    val itemsIndexedList = listOf("ASURAN", "NANI’s GANG LEADER", "GANTUMOOTE","AGENT SAI SRINIVASA","MADRAS","BROCHEVAREVARURA","KAITHI","KAVALUDAARI","VIRUS","THANNEER MATHAN DINANGAL",
        "ASURAN", "NANI’s GANG LEADER", "GANTUMOOTE","AGENT SAI SRINIVASA","MADRAS","BROCHEVAREVARURA","KAITHI","KAVALUDAARI","VIRUS","THANNEER MATHAN DINANGAL")

    LazyColumn {
        items(itemsIndexedList) {
            Card(modifier = Modifier.padding(5.dp),) {
                Text(
                    it,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        item {
            Text("Single item")
        }
        itemsIndexed(itemsIndexedList) { index, item ->
            Text("Item at index $index is $item")
        }
    }
}