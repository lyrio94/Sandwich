package com.example.sandwich

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.sandwich.model.OrderViewModel
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class ViewModelTests {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun quantity_one_sandwich() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(1)
        assertEquals(1, viewModel.quantity.value)
    }

    @Test
    fun price_one_sandwich() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(1)
        viewModel.price.observeForever {}
        assertEquals("$5.00", viewModel.price.value)
    }
    @Test
    fun quantity_six_sandwiches() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(6)
        assertEquals(6, viewModel.quantity.value)
    }

    @Test
    fun price_six_sandwiches() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(6)
        viewModel.price.observeForever {}
        assertEquals("$15.00", viewModel.price.value)
    }
    @Test
    fun quantity_twelve_sandwiches() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(12)
        assertEquals(12, viewModel.quantity.value)
    }

    @Test
    fun price_twelve_sandwiches() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(12)
        viewModel.price.observeForever {}
        assertEquals("$27.00", viewModel.price.value)
    }
}