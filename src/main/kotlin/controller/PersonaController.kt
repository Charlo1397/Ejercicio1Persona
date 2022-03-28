package controller

import model.Persona
import kotlin.math.pow

class PersonaController() : Persona() {

    fun calcularIMC(peso: Float) {

        val x: Float = peso/(altura.pow(2))

         if (peso == x ) {
           println(pesoIdeal)
        } else if (x < peso) {
           println(pesoBajo)
        } else {
            println(sobrePeso)
        }
    }

    fun esMayorDeEdad(edad: Int) {

        if (edad >= 18) {
            mayor = true
        }
        println(mayor)
    }

    fun compruebaSexo(sexo: String)  {

        if (sexo == "H" || sexo == "M") {

          println("Es correcto")
        }else{
            sexoDef = sexo
            println(sexo)
        }

    }

    fun toString( nombre: String, edad: Int, sexo: String, peso: Float, altura: Float){

        val per = Persona()
         per.nombre = nombre
         per.edad = edad
         per.sexo = sexo
         per.peso = peso
        per.altura = altura

        println("$nombre $edad $sexo $peso $altura")

    }


}