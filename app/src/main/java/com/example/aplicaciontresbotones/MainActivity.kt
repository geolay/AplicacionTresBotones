package com.example.aplicaciontresbotones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.aplicaciontresbotones.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
   // private lateinit var textouno: TextView
    private lateinit var binding: ActivityMainBinding
    private val numbersList = listOf("one", "five", "two", "three", "four")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        val ordenarLista= numbersList.sorted()
        val filtrarLargo = numbersList.filter { it.length >= 4 }
        var filtrarLetra = numbersList.filter{ it.startsWith("f") }
        binding.mostrarTexto2.setText("Entrada: "+numbersList.toString())


        binding.boton1.setOnClickListener {
            binding.mostrarTexto.setText(ordenarLista.toString())
            binding.mostrarTexto3.setText("Lista Ordenada")
        }
        binding.boton2.setOnClickListener {
            binding.mostrarTexto.setText(filtrarLargo.toString())
            binding.mostrarTexto3.setText("largo >= 4")
        }
        binding.boton3.setOnClickListener {
            binding.mostrarTexto.setText(filtrarLetra.toString())
            binding.mostrarTexto3.setText("Empiezan con f")

        }




    } // llave de onCreate


}