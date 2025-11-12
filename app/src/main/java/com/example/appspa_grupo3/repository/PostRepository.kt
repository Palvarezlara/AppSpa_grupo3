package com.example.appspa_grupo3.repository

import com.example.appspa_grupo3.data.model.PostModel
import com.example.appspa_grupo3.data.remote.RetrofitInstance

//Este repositorio se encarga de acceder a los datos usando Retrofit
class PostRepository {

    //Función que obtiene los datos de la API
    suspend fun getPosts(): List<PostModel> {
        return RetrofitInstance.api.getPosts()
    }
}