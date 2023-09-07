package com.cursoTicmas.proyectofinal.test

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.cursoTicmas.proyectofinal.viewmodel.MainViewModel
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import kotlin.test.assertEquals

class UnitTest {
    private lateinit var viewModel: MainViewModel

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun testCompareTexts() {
        viewModel.inputText1.value = "Hello"
        viewModel.inputText2.value = "World"
        viewModel.compareTexts()
        assertEquals("Los textos son diferentes", viewModel.comparisonResult.value)
    }
}

class InstantTaskExecutorRule {

}
