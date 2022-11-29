package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnEnviar(view: View){
        var intent = Intent (this, MainActivity2::class.java)
        var num_id: EditText? = findViewById(R.id.txtId) as? EditText
        var nombres: EditText? = findViewById(R.id.txtNombres) as? EditText
        var apellidos: EditText? = findViewById(R.id.txtApellidos) as? EditText
        var fechaNace: EditText? = findViewById(R.id.txtDate) as? EditText
        var ciudad: EditText? = findViewById(R.id.txtCiudad) as? EditText
        var femenino: RadioButton? = findViewById(R.id.rdbFemenino) as? RadioButton
        var masculino: RadioButton? = findViewById(R.id.rdbMasculino) as? RadioButton
        var correo: EditText? = findViewById(R.id.txtCorreo) as? EditText
        var telefono: EditText? = findViewById(R.id.txtTelefono) as? EditText


        var b: Bundle = Bundle()

        b.putString("Num_Id", num_id?.text.toString())
        b.putString("Nombres", nombres?.text.toString())
        b.putString("Apellidos", apellidos?.text.toString())
        b.putString("Fechanace", fechaNace?.text.toString())
        b.putString("Ciudad", ciudad?.text.toString())
        b.putString("Femenino", femenino?.text.toString())
        b.putString("Masculino", masculino?.text.toString())
        b.putString("Correo", correo?.text.toString())
        b.putString("Telefono", telefono?.text.toString())

        intent.putExtras(b)
        startActivity(intent)
    }

}