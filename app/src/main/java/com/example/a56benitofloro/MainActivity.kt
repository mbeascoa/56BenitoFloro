package com.example.a56benitofloro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_crear_mensaje.setOnClickListener {


        val emple = Empleado()

        emple.nombre="Benito"
        emple.apellido="Floro"
        emple.oficio="Entrenador"
        emple.salario= 120000
        emple.comision= 1300

            txtMensaje.text = "Hola  ${emple.nombre} ${emple.apellido} con profesion ${emple.oficio} y salario  ${emple.salario+emple.comision}"
            txtMensaje.textSize=30.toFloat()
        }
    }

}