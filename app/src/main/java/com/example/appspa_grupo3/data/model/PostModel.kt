package com.example.appspa_grupo3.data.model

data class PostModel(
    val userId: Int,    //ID del usuario que creó el post
    val id: Int,        // ID del post
    val title: String,  // Título del post
    val body: String    // Contenido del post
)

