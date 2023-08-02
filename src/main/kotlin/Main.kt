import kotlin.math.max

fun main() {
    println(birthdayGreeting("Daniel", 21))
    println("------------------------------------------------------------------------------")
    println("El numero a colocar sera 50, asi que la conversion de temperatura sera de c a F")
    println(Temp(50.4))
    println("------------------------------------------------------------------------------")
}
//Ejercicio del curso
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
//aprendizaje y prueba
fun prueba():Unit{
    var userName: String = "Daniel"; var edad = 21
    userName = "Emill"
    var numMax: Int = Int.MAX_VALUE; var numMin: Int = Int.MIN_VALUE
    var numMaxB: Byte = Byte.MAX_VALUE; var numMinB: Byte = Byte.MIN_VALUE
    var flotante = 21.53f

    if(edad < 21){
        println("Hola $userName!, tu edad es $edad")
        println("Numero maximo INT: $numMax \nNumero Minimo INT: $numMin")
        println("Numero maximo Byte: $numMaxB \nNumero MinimoByte: $numMinB")
        println("Numero flotante $flotante")
        println("Una suma sencilla ${edad + flotante}") // se utiliza {para realizar una operacion}
    }else if(edad!=21){
        println("SALUDO")
    }else{
        print("BUENAS")
    }
}
//Ejercicio propuesto
fun Temp(Celsius: Double): Double{
    var Fahrenheit: Double = (Celsius * 9/5 + 31)
    return Fahrenheit
}