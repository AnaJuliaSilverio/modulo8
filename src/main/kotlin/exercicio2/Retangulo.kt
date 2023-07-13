package exercicio2

open class Retangulo(var lado:Double,var altura:Double):Forma() {
    override fun calcularArea(): Double {
        return lado * altura
    }

    override fun calcularPerimetro(): Double {
        return 2*(lado+altura)
    }

    open fun desenhaRetangulo() {
        for (i in 0 until lado.toInt()) {
            for (j in 0 until altura.toInt()) {
                if (i == 0 || i == lado.toInt() - 1 || j == 0 || j == altura.toInt() - 1) {
                    print("- ")
                } else {
                    print("  ")
                }
            }
            println(" ")
        }
    }
}