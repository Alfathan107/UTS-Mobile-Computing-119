package com.example.utsmobcom119_alfathanahnaf.data

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.utsmobcom119_alfathanahnaf.MatkulListItem

@Composable
fun HomeContent() {
    val matkuls = remember { DataProvider.matkulList }
    LazyColumn(
        contentPadding = PaddingValues( horizontal = 16.dp, vertical = 8.dp, )
    ){
        items(
            items = matkuls,
            itemContent = {
                MatkulListItem (matkul = it)
            }
        )

    }
}