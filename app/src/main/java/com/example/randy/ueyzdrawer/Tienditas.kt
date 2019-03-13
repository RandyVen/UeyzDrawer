package com.example.randy.ueyzdrawer

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_tienditas.*
import kotlinx.android.synthetic.main.content_tienditas.*

class Tienditas : AppCompatActivity() {
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienditas)
        setSupportActionBar(toolbar)
        button.setOnClickListener {
            finish()
        }

        val tiendas = arrayOf("La Bendicion No.23 - Zona 1", "Los amigos(venta de tostadas)- zona 10", "Tienda 'L'- Zona 2 ", "Tienda 'La María'- Zona 7 ", "Venta de churros- Zona 14")
        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tiendas)
        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext, "Llegarás a:" + tiendas[i], Toast.LENGTH_LONG).show()
        }
    }
}
