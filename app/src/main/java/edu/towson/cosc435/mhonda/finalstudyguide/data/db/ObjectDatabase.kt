package edu.towson.cosc435.mhonda.finalstudyguide.data.db

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Query
import androidx.room.RoomDatabase
import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject

@Dao
interface ObjectsDao {
    @Query("SELECT id, name FROM MyObject")
    suspend fun getObjects(): List<MyObject>
}

@Database(entities = [MyObject::class], version = 2, exportSchema = false)
abstract class ObjectsDatabase: RoomDatabase(){
    abstract fun objectDao(): ObjectsDao
}