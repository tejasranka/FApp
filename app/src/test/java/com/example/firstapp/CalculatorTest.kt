package com.example.firstapp

import junit.framework.TestCase

class CalculatorTest : TestCase(){
    fun test_Add()
    {
        var calculator = Calculator();
        var expected = 40
        var actual = calculator.add(-10, 20)
        assertEquals(expected,actual)
    }

}