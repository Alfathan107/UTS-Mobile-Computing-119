package com.example.utsmobcom119_alfathanahnaf

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.utsmobcom119_alfathanahnaf.data.Matkul

@Composable
fun MatkulListItem (matkul: Matkul) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp,)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(16.dp,))
    ) {

    }
    Row() {
        MatkulImage(matkul = matkul)
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
        ) {
            Text(text = matkul.name, style = MaterialTheme.typography.headlineSmall)
            Text(text = matkul.description, style = MaterialTheme.typography.bodySmall)
        }
    }

}

@Composable
fun MatkulImage(matkul:Matkul){
    Image(painter = painterResource(id = matkul.MatkulImage),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp,)
            .size(84.dp,)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp,)))
    )
}


