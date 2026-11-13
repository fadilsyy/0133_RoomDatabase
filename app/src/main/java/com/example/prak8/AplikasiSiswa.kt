package com.example.prak8

import android.app.Application
import com.example.prak8.repositori.ContainerApp
import com.example.prak8.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    // appcontainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}