package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var num_id: TextView = findViewById(R.id.txt_numId)
        var nombre: TextView = findViewById(R.id.txtNombre)
        var apellido: TextView = findViewById(R.id.txtApellido)
        var fechaNace: TextView = findViewById(R.id.txtFecha)
        var ciudad: TextView = findViewById(R.id.txtCiuda)
        var genero:TextView = findViewById(R.id.txtGenero)
        var correo: TextView = findViewById(R.id.txtemail)
        var telefono: TextView = findViewById(R.id.txtphone)


        var bun: Bundle? = this.intent.extras
        if (bun != null)
        {
            num_id.text = bun.getString("Num_Id")
            nombre.text = bun.getString("Nombres")
            apellido.text = bun.getString("Apellidos")
            fechaNace.text = bun.getString("Fechanace")
            ciudad.text = bun.getString("Ciudad")
            genero.text = bun.getString("Femenino")
           // genero.text = bun.getString("Masculino")
            correo.text = bun.getString("Correo")
            telefono.text = bun.getString("Telefono")
        }
    }


}