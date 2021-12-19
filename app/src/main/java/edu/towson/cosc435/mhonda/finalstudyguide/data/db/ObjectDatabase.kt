package edu.towson.cosc435.mhonda.finalstudyguide.data.db

import androidx.room.*
import edu.towson.cosc435.mhonda.finalstudyguide.model.MyObject

@Dao
interface ObjectsDao {
    @Query("SELECT id, name FROM MyObject")
    suspend fun getObjects(): List<MyObject>

    @Insert
    suspend fun addObject(myObject: MyObject)
}


@Database(entities = [MyObject::class], version = 2, exportSchema = false)
abstract class ObjectsDatabase: RoomDatabase(){
    abstract fun objectDao(): ObjectsDao
}