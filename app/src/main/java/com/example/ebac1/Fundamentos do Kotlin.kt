package com.example.ebac1


fun main() {

    //exercício 1
    var mutableVar = 6
    mutableVar = 5
    println("Exercício 1: $mutableVar") // 5

    //exercício 2
    val immutableVar = 6
    //immutableVar = 7
    println("Exercício 2: $immutableVar") // erro: Val cannot be reassigned

    //exercício 3
    var value = 2
    println("Exercício 3:")
    if (value % 2 == 0) println("O número é par") else println("O número é ímpar") // "O número é par"
    value = 3
    if (value % 2 == 0) println("O número é par") else println("O número é ímpar") // "O número é ímpar"

    //exercício 4
    value = 2
    println("Exercício 4:")
    when {
        value % 2 == 0 -> println("O número é par")
        else -> println("O número é ímpar")
    } // "O número é par"

    value = 3

    when {
        value % 2 == 0 -> println("O número é par")
        else -> println("O número é ímpar")
    } // "O número é ímpar"

    //exercício 5
    val array: IntArray = IntArray(40)
    for (i in 1..39) array[i] = i
    // não estava especificado no exercício, mas deixei o índice 0 com valor 0.
    //Poderia também ter escrito array[i-1] = i para deixar o valor 1 no índice 0.

    val list = mutableListOf<Int>()
    for (j in 1..99) list.add(j)

    var soma = 0

    for (item in list) soma += item

    println("Exercício 5: $soma")


}