package edu.towson.cosc435.mhonda.finalstudyguide.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

@Composable
fun ObjectOnesRow(
    objectOne: ObjectOne
){
    Text(objectOne.name)
}