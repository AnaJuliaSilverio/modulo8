package exercicio2

fun main() {
    val formas = arrayListOf<Forma>()
    formas.add(Retangulo(5.0,7.0))
    formas.add(Circulo(10.0))
    formas.add(Quadrado(7.0))
    formas.add(Retangulo(8.2,6.5))
    formas.add(Circulo(15.2))

    println("---Retangulos e Quadrados--")
    formas.filterIsInstance<Retangulo>().forEach { println("Área ${it.calcularArea()} Perimetro ${it.calcularPerimetro()}")}
    formas.filterIsInstance<Retangulo>().forEach { it.desenhaRetangulo() }

    println("---Circulos--")
    formas.filterIsInstance<Circulo>().forEach { println("Área ${it.calcularArea()} Perimetro ${it.calcularPerimetro()}")}



}