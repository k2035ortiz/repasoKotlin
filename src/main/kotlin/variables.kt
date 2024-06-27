package org.example

fun main(){

//    1. Declara una variable con un valor inicial de 5, luego asigna el valor 7 a esa variable.

    var numero=5
    println("el numero es $numero")
      numero=7
    println("el numero es $numero")

//    2. Declara una variable con un valor inicial de "Hello", luego asigna el valor "Bye" a esa variable.
    var variable="hello"
    println("la palabra es $variable")
    variable="Bey"
    println("la palabra es $variable")


//    3. Utiliza destructuring declarations para asignar el valor 1 a una variable y el valor 2 a otra variable.

    var (a,b)= listOf(1,2)
    println("el valor es $a")
    println("el valor es $b")

//    4. Asigna el valor de una variable a otra variable.

    var valor=3
    var valor2=valor
    println("el valor es $valor2")

//    5. Declara una variable con un valor inicial de "John", luego asigna el valor "Jane" a esa variable.
    var variable3="jonh"
    println("la palabra es $variable3")
    variable="jane"
    println("la palabra es $variable3")

//    6. Declara una variable con un valor inicial de 25, luego asigna el valor 30 a esa variable.
    var numero1=25
    println("el numero es $numero1")
    numero=30
    println("el numero es $numero1")


//    7. Declara una variable con un valor inicial de 'M', luego asigna el valor 'F' a esa variable.
    var valor3='m'
    println("el valor es $valor3")
       valor3='f'
    println("el valor es $valor3")

//    8. Utiliza destructuring declarations para asignar valores a tres variables, luego imprime los valores de esas variables.
    var (c,d,e)= listOf(1,2,3)
    println("el valor es $c y $d y $e")


//    9. Asigna el valor de una expresión a una variable, luego imprime el valor de esa variable.
    var x=3
    var y= 6
    var multi=(x*y)
    println("la multiplicacion es $multi")

//    10. Declara una variable con un valor inicial de 0.0, luego asigna el valor 45.6 a esa variable.
    var m=0.0
    println("el valo es de $m")
    m=45.6
    println("el valo es de $m")





}