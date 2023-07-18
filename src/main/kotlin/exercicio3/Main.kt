package exercicio3

import kotlin.system.exitProcess

fun main() {
    val dicionario = Dicionario()
    println("Bem-vindo!")
    while (true){
        println("1-Adicionar um termo ao dicionário\n2-Procurar termo no dicionário\n3-Listar termos\n4-Sair")
        when(readln()){
            "1"-> {
                println("Qual palavra deseja adicionar?")
                val palavra = readln()
                println("Qual significado de $palavra?")
                val significado = readln()
                dicionario.adicionarTermo(palavra, significado)
            }
            "2"->{
                println("Qual palavra deseja procurar o significado?")
                val palavra = readln()
                println("O significado de $palavra é: ${dicionario.buscarTermos(palavra)}")
            }
            "3"->dicionario.listarTermos()
            "4"-> exitProcess(0)
            else -> println("Valor inválido!")
        }
    }
}