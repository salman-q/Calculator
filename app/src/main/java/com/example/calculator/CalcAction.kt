package com.example.calculator

sealed class CalcAction {
    object Clear: CalcAction()
    object Delete: CalcAction()
    data class Operation(val operation: CalcOperation): CalcAction()
    data class Number(val number: Int): CalcAction()
    object Decimal: CalcAction()
    object Calculate: CalcAction()
}