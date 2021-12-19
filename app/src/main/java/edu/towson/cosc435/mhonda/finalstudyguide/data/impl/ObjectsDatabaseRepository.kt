package edu.towson.cosc435.mhonda.finalstudyguide.data.impl

import android.app.Application
import androidx.room.Room
import edu.towson.cosc435.mhonda.finalstudyguide.data.IObjectOneRepository
import edu.towson.cosc435.mhonda.finalstudyguide.data.db.ObjectsDatabase
import edu.towson.cosc435.mhonda.finalstudyguide.model.ObjectOne

class ObjectsDatabaseRepository (app: Application) : IObjectOneRepository {
    private  val db: ObjectsDatabase

    init{
        db = Room.databaseBuilder(
            app,
            ObjectsDatabase::class.java,
            "objectOnes.db"
        ).fallbackToDestructiveMigration().build()
    }

    private var private_objectOnes: List<ObjectOne> = listOf()

    override suspend fun getObjects(): List<ObjectOne> {
        return db.objectDao().getObjects()
    }

}