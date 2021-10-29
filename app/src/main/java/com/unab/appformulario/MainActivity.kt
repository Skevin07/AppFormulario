package com.unab.appformulario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var et_Nombre:EditText
    private lateinit var et_Apellido:EditText
    private lateinit var rb_Masculino:RadioButton
    private lateinit var rb_Femenino:RadioButton
    private lateinit var etn_Telefono:EditText
    private lateinit var spinner_Departamento:Spinner
    private lateinit var spinner_Municipio:Spinner
    private lateinit var btn_Guardar:Button
    private lateinit var btn_Mostrar:Button
    private lateinit var tv_InfoMostrar:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_Nombre = findViewById(R.id.et_Nombre)
        et_Apellido = findViewById(R.id.et_Apellido)
        rb_Masculino = findViewById(R.id.rb_Masculino)
        rb_Femenino = findViewById(R.id.rb_Femenino)
        etn_Telefono = findViewById(R.id.etn_Telefono)
        spinner_Departamento = findViewById(R.id.spinner_Departamento)
        spinner_Municipio = findViewById(R.id.spinner_Municipio)
        btn_Guardar = findViewById(R.id.btn_Guardar)
        btn_Mostrar = findViewById(R.id.btn_Mostrar)
        tv_InfoMostrar = findViewById(R.id.tv_InfoMostrar)

        val opciones = arrayOf("Chalatenango","Santa Ana","Morazan","La Union","Cabañas",
            "La Libertad","Usulutan","San Miguel"," San Salvador","Sonsonate","Ahuachapan","San Vicente","La Paz","Cuscaclan")




    }
}