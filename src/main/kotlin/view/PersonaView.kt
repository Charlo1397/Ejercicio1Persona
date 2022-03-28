package view

import controller.PersonaController
import model.Persona
import javax.swing.JOptionPane




class PersonaView {

   val persona = PersonaController()
    val prsona1 = Persona()
    val persona2 = Persona("",0,"","",0.79f, 1.80f)
    val persona3 = Persona("Ana",28,"789456123", "M",0.60f,1.65f)

    fun peirDatos(){


        print("Nombre: ->")
        prsona1.nombre = readLine()?.toString() as String

        print("Edad: ->")
        prsona1.edad = readLine()?.toInt() as Int

        print("Sexo: ->")
        prsona1.sexo = readLine()?.toString() as String

        print("Peso: ->")
        prsona1.peso = readLine()?.toFloat() as Float

        print("Atura: ->")
        prsona1.altura = readLine()?.toFloat() as Float

        println("---------------------")
        println(" Datos Persona 1:")
        persona.toString(prsona1.nombre, prsona1.edad, prsona1.sexo, prsona1.peso, prsona1.altura)
        print(" Tipo de peso -> ")
        persona.calcularIMC(prsona1.peso)
        print("Es myor de edad -> ")
        persona.esMayorDeEdad(prsona1.edad)
        print("Comprueba Sexo -> ")
        persona.compruebaSexo(prsona1.sexo)
        println("---------------------")
        println("                     ")
        println(" Datos Persona 2:")
        print("Nombre: ->")
        persona2.nombre = readLine()?.toString() as String

        print("Edad: ->")
        persona2.edad = readLine()?.toInt() as Int

        print("Sexo: ->")
        persona2.sexo = readLine()?.toString() as String

        persona.toString(persona2.nombre, persona2.edad, persona2.sexo, persona2.peso, persona2.altura)
        print(" Tipo de peso -> ")
        persona.calcularIMC(persona2.peso)
        print("Es myor de edad -> ")
        persona.esMayorDeEdad(persona2.edad)
        print("Comprueba Sexo -> ")
        persona.compruebaSexo(persona2.sexo)
        println("---------------------")
        println("                     ")
        println(" Datos Persona 3:")
        persona.toString(persona3.nombre, persona3.edad, persona3.sexo, persona3.peso, persona3.altura)
        print(" Tipo de peso -> ")
        persona.calcularIMC(persona3.peso)
        print("Es myor de edad -> ")
        persona.esMayorDeEdad(persona3.edad)
        print("Comprueba Sexo -> ")
        persona.compruebaSexo(persona3.sexo)
        println("---------------------")

    }

}

