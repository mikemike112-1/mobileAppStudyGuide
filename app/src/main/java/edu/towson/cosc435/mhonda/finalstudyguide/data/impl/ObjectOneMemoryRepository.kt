package edu.towson.cosc435.mhonda.finalstudyguide.data.impl

import edu.towson.cosc435.mhonda.finalstudyguide.data.IObjectOneRepository
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

class ObjectOneMemoryRepository : IObjectOneRepository {

    private var privateObjectOnes = listOf<ObjectOne>()

    init {
        privateObjectOnes = (0..10).map { i ->
            ObjectOne("defaultName$i")
        }
    }

    override suspend fun getObjects(): List<ObjectOne> {
        return privateObjectOnes
    }
}