package com.example.marsphotos.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto (
    val id: String,

    // @SerialName -> para usar nombres de variables que difieren de los nombres de clave en la respuesta JSON
    @SerialName(value = "img_src")
    val imgSrc: String
)