package edu.towson.cosc435.mhonda.finalstudyguide.data.impl

import android.app.Application
import androidx.room.Room
import edu.towson.cosc435.mhonda.finalstudyguide.data.IMyObjectRepository
import edu.towson.cosc435.mhonda.finalstudyguide.data.db.ObjectsDatabase
import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject

class ObjectsDatabaseRepository (app: Application) : IMyObjectRepository {
    private  val db: ObjectsDatabase

    init{
        db = Room.databaseBuilder(
            app,
            ObjectsDatabase::class.java,
            "myObjects.db"
        ).fallbackToDestructiveMigration().build()
    }

    private var private_myObjects: List<MyObject> = listOf()

    override suspend fun getObjects(): List<MyObject> {
        return db.objectDao().getObjects()
    }

}