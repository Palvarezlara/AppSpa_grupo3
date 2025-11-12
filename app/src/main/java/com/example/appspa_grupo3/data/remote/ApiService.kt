package com.example.appspa_grupo3.data.remote
import com.example.appspa_grupo3.data.model.PostModel
import retrofit2.http.GET

//Esta interfaz define los endpoints HTTP
interface ApiService {

    //Define una solicitud GET al endpoint /posts
    @GET("/posts")
    suspend fun getPosts(): List<PostModel>

}