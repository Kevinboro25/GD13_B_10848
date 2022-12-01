package com.example.gd11_b_10848.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MahasiswaApi {
    companion object{
        val BASE_URL = "https://6368bba315219b84960558d7.mockapi.io/api/"

        val GET_ALL_URL = BASE_URL + "mahasiswa/"
        val GET_BY_ID_URL = BASE_URL + "mahasiswa/"
        val ADD_URL = BASE_URL + "mahasiswa"
        val UPDATE_URL = BASE_URL + "mahasiswa/"
        val DELETE_URL = BASE_URL + "mahasiswa/"
    }
}