package com.example.marsphotos.network

import retrofit2.Retrofit

// URL base del servicio web
private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

// compilador de Retrofit para compilar y crear un objeto Retrofit
private val retrofit = Retrofit.Builder()