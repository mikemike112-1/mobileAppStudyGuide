package edu.towson.cosc435.mhonda.finalstudyguide.data

import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

interface IObjectOneRepository {
    suspend fun getObjects(): List<ObjectOne>
}