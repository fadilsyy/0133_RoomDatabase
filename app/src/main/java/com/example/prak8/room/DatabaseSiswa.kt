package com.example.prak8.room

import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context


abstract class DatabaseSiswa : RoomDatabase() {
    abstract fun siswaDao() : SiswaDao

}