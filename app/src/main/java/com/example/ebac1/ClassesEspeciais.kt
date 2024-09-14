package com.example.ebac1

fun main() {

    val string = "Characters"
    string.defragList().forEach {
        println(it)
    }

    //Exercício 4
    val day = UtilityHelper
    println(day.isWeekend()) //true
    day.setCurrentDay(DayOfTheWeek.MONDAY)
    println(day.isWeekend()) //false
    val day2 = UtilityHelper
    println(day2.isWeekend()) //false
    day2.setCurrentDay(DayOfTheWeek.SUNDAY)
    println(day2.isWeekend()) //true
    println(day.isWeekend()) //true

}

//Exercício 1
fun String.defragList(): List<String> {
    val list = mutableListOf<String>()
    for (i in this.indices) {
        list.add(this[i].toString())
    }
    return list
}


//Exercício 2
enum class DayOfTheWeek(day: String) {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

}

//Exercício 3
object UtilityHelper {
    private var currentDay = DayOfTheWeek.SUNDAY

    fun setCurrentDay(day: DayOfTheWeek) {
        currentDay = day
    }

    fun isWeekend(): Boolean {

        return currentDay == DayOfTheWeek.SATURDAY ||
                currentDay == DayOfTheWeek.SUNDAY

    }

}