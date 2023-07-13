package exercicio2

import kotlin.math.pow

class Circulo(var raio:Double):Forma(){
    override fun calcularArea(): Double {
        return Math.PI * (raio.pow(2))
    }

    override fun calcularPerimetro(): Double {
        return (raio*2)*Math.PI
    }

}