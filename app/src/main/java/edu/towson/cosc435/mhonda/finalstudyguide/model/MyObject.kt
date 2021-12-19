package edu.towson.cosc435.mhonda.finalstudyguide.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyObject(
    @PrimaryKey
    val id: Int,
    val name: String
)