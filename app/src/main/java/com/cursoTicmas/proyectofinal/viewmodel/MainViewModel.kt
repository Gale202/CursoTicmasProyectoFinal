package com.cursoTicmas.proyectofinal.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cursoTicmas.proyectofinal.model.QuoteModel

class MainViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val inputText1 = MutableLiveData<String>()
    val inputText2 = MutableLiveData<String>()
    val comparisonResult = MutableLiveData<String>()

    fun compareTexts() {
        val text1 = inputText1.value ?: ""
        val text2 = inputText2.value ?: ""

        val result = if (text1 == text2) "Los textos son iguales" else "Los textos son diferentes"
        comparisonResult.postValue(result)
    }

}