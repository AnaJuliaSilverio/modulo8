package exercicio4

import java.time.format.DateTimeParseException

fun main() {
    try {
        println("Quantos funcionários deseja adicionar? ")
        val rh = RecursosHumanos()
        rh.nFuncionario= readln().toInt()

        rh.inserirFuncionario()
        rh.exibirFuncionarios()

    }catch (erro: DateTimeParseException){
        println("Data inválida")
    }


}