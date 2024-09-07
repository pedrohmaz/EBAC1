package com.example.ebac1

fun main() {

    val factory = VehicleFactory()
    val vehicleList = mutableListOf<IVehicle>()
    vehicleList.add(factory.createVehicle(1, "Fusca"))
    vehicleList.add(factory.createVehicle(2, "Ninja"))

    vehicleList.forEach {vehicle ->
        vehicle.speedUp()
        println("${vehicle::class.simpleName} '${vehicle.model}' speed: ${vehicle.getCurrentSpeed()}")
    }

}

//Exercício 1
//abstract class Vehicle {
//    abstract val model: String
//    abstract val acc: Long
//    private var speed: Long = 0
//
//    fun speedUp() {
//        this.speed += acc
//    }
//
//    fun speedDown() {
//        speed -= acc
//        if (this.speed < 0)
//            this.speed = 0
//    }
//
//    fun getSpeed() = this.speed
//
//}


interface IVehicle {
    val model: String
    val acc: Long
    var speed: Long

    fun speedUp() {
        this.speed += acc
    }

    fun speedDown() {
        speed -= acc
        if (this.speed < 0)
            this.speed = 0
    }

    fun getCurrentSpeed() = this.speed
}

class Car(override var model: String) : IVehicle {

    override var acc = 10L
    override var speed = 0L


}

class Motorbike(override var model: String) : IVehicle {

    override var acc = 5L
    override var speed = 0L

}

class VehicleFactory {
    fun createVehicle(type: Int, model: String): IVehicle {
        return when (type) {
            1 -> Car(model)
            else -> Motorbike(model)
        }
    }
}

