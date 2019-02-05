package com.example.nirou.examenmoviles

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_crear_padre.setOnClickListener(){
            irActividadCrearEntrenador()
        }

        button_listar_padre.setOnClickListener(){

            irActividadListarEntrenador()

        }


    }

    fun irActividadCrearEntrenador(){
        val intent = Intent(
            this,
            CrearEntrenadorActivity::class.java
        )
        startActivity(intent)
    }

    fun irActividadListarEntrenador(){
        finish()
        // 1 Cargar datos de la API
        // 2 Ir al Intent
        // 3 Hacer esa cosa de matar al stack
        val intent = Intent(
            this,
            ListarEntrenadorActivity::class.java
        )
        startActivity(intent)

    }

}
