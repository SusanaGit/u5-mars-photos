package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

// URL base del servicio web
private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

// compilador de Retrofit para compilar y crear un objeto Retrofit
private val retrofit = Retrofit.Builder()
    // fábrica de conversión para crear una API de servicios web
    // el conversor indica a Retrofit qué hacer con los datos que obtiene del servicio web
    // queremos recuperar una respuesta JSON del servicio web y mostrarla como String
    .addConverterFactory(ScalarsConverterFactory.create())