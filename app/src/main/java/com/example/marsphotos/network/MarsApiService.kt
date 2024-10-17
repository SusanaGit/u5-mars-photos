package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

// URL base del servicio web
private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

// compilador de Retrofit para compilar y crear un objeto Retrofit
private val retrofit = Retrofit.Builder()
    // fábrica de conversión para crear una API de servicios web
    // el conversor indica a Retrofit qué hacer con los datos que obtiene del servicio web
    // queremos recuperar una respuesta JSON del servicio web y mostrarla como String
    .addConverterFactory(ScalarsConverterFactory.create())
    // añado la URL base para el servicio web
    .baseUrl(BASE_URL)
    // creamos el objeto Retrofit
    .build()

// define cómo Retrofit se comunica con el servidor web mediante solicitudes HTTP
interface MarsApiService {
    // es una solicitud GET
    // "photos" es el endpoint (extremo), sería la parte de la url que va después de la base url
    // entonces el recurso que quiero consultar es: base de la url / photos
    @GET("photos")
    // obtener la String de respuesta del servicio web
    fun getPhotos(): String
}