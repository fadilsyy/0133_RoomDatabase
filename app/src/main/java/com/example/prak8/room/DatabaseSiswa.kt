package com.example.prak8.room

import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context


abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao() : SiswaDao

    companion object {
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return (Instance?: synchronized(this){
                Room.databaseBuilder(context,
                    DatabaseSiswa::class.java,
                    "siswa_database")
                    .build().also { Instance=it }
            })
        }
    }
}