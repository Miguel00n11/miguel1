package com.miguelrodriguez.miguel1

fun main(){
    var name:String="miguel"
    var name1:String="miguel"
    var name2:String="miguel"
    var name3:String="miguel"
    var name4:String="miguel"
    var name5:String="miguel"

    val weekDays= arrayOf("lunes","martes","miecoles","jueves","viernes","sabado","domingo")

    println(weekDays[5])
    println(weekDays.count())


    //Bucles para array


//    for (position in weekDays){
//        println("hoy es $position de la semana.")
//    }
    for((abstract , abstract1) in weekDays.withIndex()){
        println("la posicion $abstract contioene $abstract1")
    }


    weekDays.forEach { weekDays-> println(weekDays) }
//    println(weekDays)

//    for ((position,value)in weekDays.withIndex()){
//        println(value)
//    }

}