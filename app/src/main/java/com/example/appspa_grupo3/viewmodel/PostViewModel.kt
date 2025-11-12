package com.example.appspa_grupo3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appspa_grupo3.data.model.PostModel
import com.example.appspa_grupo3.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

//ViewModel que mantiene el estado de los datos obtenidos

class PostViewModel : ViewModel() {

    private val repository = PostRepository()

    //flujo mutable que contiene la lista de posts
    private val _postList = MutableStateFlow<List<PostModel>>(emptyList())

    //flujo público de solo lectura
    val postList: StateFlow<List<PostModel>> = _postList
    //Se llama automaticamente al iniciar
    init{
        fetchPosts()
    }

    //Función que obtiene los datos en segundo plano
    private fun fetchPosts(){
        viewModelScope.launch{
            try {
                _postList.value = repository.getPosts()
            } catch (e: Exception){
                println("Error al obtener datos: ${e.localizedMessage}")
            }
        }
    }
}