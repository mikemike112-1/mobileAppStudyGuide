package edu.towson.cosc435.mhonda.finalstudyguide.data.impl

import edu.towson.cosc435.mhonda.finalstudyguide.data.IMyObjectRepository
import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject

class MyObjectMemoryRepository(
    private val db: ObjectsDatabaseRepository
) : IMyObjectRepository{

    private var privateMyObjects = listOf<MyObject>()

    init {
        privateMyObjects = (0..10).map { i ->
            MyObject(i,"defaultName$i")
        }
    }

    override suspend fun getObjects(): List<MyObject> {
        return db.getObjects()
    }

    override suspend fun addObject(myObject: MyObject) {
//        privateMyObjects = listOf(myObject) + privateMyObjects
        db.addObject(myObject)
    }
}