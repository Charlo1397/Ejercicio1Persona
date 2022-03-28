package model

open class Persona {

    var nombre :String = ""
    var edad: Int = 0
    var cedula: String = ""
    var sexo: String = ""
    var peso: Float = 0.0f
    var altura: Float = 0.0f

    val pesoIdeal = 0
    val pesoBajo = -1
    val sobrePeso = 1

    var mayor = false
    var sexoDef: String ="H"

    constructor() {
        var nombre :String = ""
        var edad: Int = 0
        var cedula: String = ""
        var sexo: String = ""
        var peso: Float = 0.0f
        var altura: Float = 0.0f
    }
    constructor(nombre: String, edad: Int, sexo: String){

        this.nombre = ""
        this.edad = 0
        this.sexo = ""
    }

    constructor(nombre: String, edad: Int, cedula: String,sexo: String,peso: Float, altura: Float){
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

}