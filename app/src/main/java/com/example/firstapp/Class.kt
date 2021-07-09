package com.example.firstapp

class Class {

}

fun main(args: Array<String>) {
    val nume = intArrayOf(4, 8, 16, 32, 64, 128, 256, 512)
    val deno = intArrayOf(2, 0, 4, 4, 0, 8)
    try {
        for (i in nume.indices) {
            try {
                println(nume[i].toString() + " / " + deno[i] + " is " + nume[i] / deno[i])
            } catch (e: Exception) {
                println("can not divide by zero")
            }
        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Element not found")
    }
}