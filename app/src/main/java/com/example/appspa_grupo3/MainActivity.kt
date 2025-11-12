package com.example.appspa_grupo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appspa_grupo3.ui.theme.AppSpa_grupo3Theme
import com.example.appspa_grupo3.ui.screens.PostScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Permite que la app dibuje contenido debajo de las barras del sistema
        WindowCompat.setDecorFitsSystemWindows(window, false)

        //Aqui inicio Jetpack Compose
        setContent{
            //Aplicamos el tema Material 3
            AppSpa_grupo3Theme{
                //Inventamos el ViewModel
                val postViewModel: com.example.appspa_grupo3.viewmodel.PostViewModel = viewModel()

                //Llamamos a la pantalla principal y pasamos el ViewModel
                PostScreen(viewModel = postViewModel)
            }
        }

    }
}