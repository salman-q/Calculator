package com.example.calculator

sealed class CalcOperation(val symbol: String) {
    object Divide: CalcOperation("÷")
    object Multiply: CalcOperation("×")
    object Subtract: CalcOperation("−")
    object Add: CalcOperation("+")
}