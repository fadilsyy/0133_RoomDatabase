package com.example.prak8.route

interface DestinasiNavigasi {
    // nama unuk untuk menentukan jalur untuk composable
    val route: String

    // string resource id yang berisi judul yang akan ditampilkan di layar halaman
    val titleRes: Int
}