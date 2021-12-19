package edu.towson.cosc435.mhonda.finalstudyguide.data

import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject

interface IMyObjectRepository {
    suspend fun getObjects(): List<MyObject>
}