package com.miguelrodriguez.miguel1
//Variables

fun main(){
    showMyName("Miguel Rodriguez")

showMyEdad(30)

    add(1,55)

println( restar(4,7)+3)


}



fun hola(name1:String){
 var nombre:String="Miguel"
 var apellido:String="Rodriguez"



 println(nombre)
}
fun showMyName(name: String){
    println("Me llamo $name")
}
fun showMyEdad(currentAge:Int){
    println("tengo $currentAge años")
}
fun add(firstNumber:Int,secundNamber:Int){
    println(firstNumber+secundNamber)

    if (firstNumber==1){
        println("si se cumple")
    }else{
        println("No se cumple")
    }
}
fun restar(firstNumber:Int,secundNamber:Int):Int=firstNumber-secundNamber
fun permisos(){
    var edadChuy:Int=18
    var permisos:Boolean=false
    if (edadChuy>18 || permisos){}

}