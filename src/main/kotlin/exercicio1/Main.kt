package exercicio1

import Util.VerificaInputs
import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.format.DateTimeParseException
import kotlin.system.exitProcess

fun main() {
    val supermercado = Supermercado()
    println("Bem vindo ao ${supermercado.nomeSupermercado}!")
    while (true){
        try {
            println("1-Cadastrar produto\n2-Mostrar Produtos\n3-Sair")
            when(readln()){
                "1"->{
                    println("Digite o nome do produto: ")
                    val nome = readln()
                    println("Digite a marca do produto: ")
                    val marca = readln()
                    println("Digite a data de validade: ")
                    val dataValidade = readln()
                    supermercado.cadastrarProduto(nome,marca,LocalDate.parse(dataValidade,VerificaInputs.formatter))
                }
                "2"->supermercado.mostrarProdutos()
                "3"-> exitProcess(0)
                else -> println("Valor invalido!")
            }
        }catch (erro:IllegalArgumentException){
            println(erro.message)
        }catch (erro: DateTimeParseException){
            println("Data inválida")
        }
    }
}