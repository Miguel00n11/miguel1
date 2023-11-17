package com.miguelrodriguez.miguel1

fun main(){
    getMount(9)

    getWhenMount(2)

}

fun getMount(mount:Int){
    if (mount==1){
        println("enero")
    }else if (mount==2){
        println("febrero")
    }else if (mount==3){
        println("marzo")
    }else if (mount==4){
        println("abril")
    }else if (mount==5){
        println("mayo")
    }else if (mount==6){
        println("junio")
    }else if (mount==7){
        println("julio")
    }else if (mount==8){
        println("agosto")
    }else if (mount==9){
        println("septiembre")
    }else if (mount==10){
        println("octubre")
    }else if (mount==11){
        println("noviembre")
    }else if (mount==12){
        println("diciembre")
    }else{
        println("No existe")
    }

}
fun getWhenMount(mount: Int){
    when(mount){
        1-> println("enero")
        2-> println("febrero")
        3-> println("marzo")
        4-> println("abril")
        5-> println("mayo")
        6-> println("junio")
        7-> println("julio")
        8-> println("agosto")
        9-> println("septiembre")
        10-> println("octubre")
        11-> println("noviembre")
        12-> println("diciembre")
    }
}