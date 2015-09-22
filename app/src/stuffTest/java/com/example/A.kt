package com.example

internal fun A.toB() = B(value)

internal class B(val value: Int)

internal class A(val value: Int)