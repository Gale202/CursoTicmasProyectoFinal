package com.cursoTicmas.proyectofinal.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.cursoTicmas.proyectofinal.databinding.ActivityMainBinding
import com.cursoTicmas.proyectofinal.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            //binding.editText1.text = currentQuote.texto1
            //binding.editText2.text = currentQuote.texto2
            binding.txtVRes.text = currentQuote.txtRes
        })

        binding.btnComprar.setOnClickListener { quoteViewModel.compareTexts() }

    }
}