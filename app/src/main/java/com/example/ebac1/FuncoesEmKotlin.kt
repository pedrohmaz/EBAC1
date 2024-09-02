package com.example.ebac1


fun main() {

    println(sum(3, 5))  //8
    println(product(3, 5)) //15
    println(operation(3, 5, ::sum)) //8
    println(operation(3, 5, ::product)) //15

    val numList = createList(1, 99)
    val evenList = numList.filter { it % 2 == 0 }

    println(numList) //[1..99]
    println(evenList) //[2..98]

    val nameList = listOf("Tobias", "Shigeru", "Mohammad", "Amélia")
    val helloList = nameList.map { "Olá $it" }

    helloList.forEach { println(it) } //Olá {nome}...


}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun product(a: Int, b: Int) = a * b

fun operation(a: Int, b: Int, opType: (Int, Int) -> Int): Int {
    return opType(a, b)
}

fun createList(start: Int, end: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in start..end) {
        list.add(i)
    }
    return list
}
