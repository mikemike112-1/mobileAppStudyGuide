package edu.towson.cosc435.mhonda.finalstudyguide.ui

import android.graphics.Paint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

@Composable
fun ObjectOnesRow(
    objectOne: ObjectOne,
){
    Text(
        text = objectOne.name,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        fontSize = 7.em,
        color = Color.Blue,
        textAlign = TextAlign.Center

    )
}