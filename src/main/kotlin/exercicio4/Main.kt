package exercicio4

import kotlin.system.exitProcess

fun main() {
    val sistema = Sistema()
    while (true){
        println("1-Cadatrar habitante\n2-Mostrar Informações\n3-Mostrar salários\n4-Calcular Imposto\n5-Sair\n")
        when(readln()){
            "1"-> {
                sistema.cadastrarHabitante()
            }
            "2"->sistema.mostrarInfo()
            "3"->sistema.mostrarSalarios()
            "4"->sistema.mostrarSalarioImposto()
            "5"-> exitProcess(0)
            else -> println("Valor inválido!")
        }
    }
}