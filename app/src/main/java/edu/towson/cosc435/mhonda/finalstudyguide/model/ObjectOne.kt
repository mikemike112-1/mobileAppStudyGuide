package edu.towson.cosc435.mhonda.finalstudyguide.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ObjectOne(
    @PrimaryKey
    val name: String
){
}
