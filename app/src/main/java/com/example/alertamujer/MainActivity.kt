package com.example.alertamujer

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Esto vincula el código con tu diseño XML
        setContentView(R.layout.activity_main)

        // Referencias a los botones y campos de tu dibujo
        val btnLogin = findViewById<Button>(R.id.btnIniciarSesion)
        val btnRegister = findViewById<Button>(R.id.btnRegistrate)
        val inputEmail = findViewById<EditText>(R.id.etEmail)
        val inputPass = findViewById<EditText>(R.id.etPassword)

        // Acción para el botón "INICIA SESIÓN"
        btnLogin.setOnClickListener {
            val email = inputEmail.text.toString()
            if (email.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa tu email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Iniciando sesión con: $email", Toast.LENGTH_SHORT).show()
            }
        }

        // Acción para el botón "REGÍSTRATE"
        btnRegister.setOnClickListener {
            Toast.makeText(this, "Abriendo pantalla de registro...", Toast.LENGTH_SHORT).show()
        }
    }
}