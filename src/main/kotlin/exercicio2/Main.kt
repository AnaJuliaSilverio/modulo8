package exercicio2

import Util.VerificaInputs
import java.time.LocalDate
import java.time.format.DateTimeParseException
import kotlin.system.exitProcess

fun main() {
    val biblioteca = Biblioteca()
    while (true){
        try {
            println("1-Cadastrar livro\n2-Mostrar Livros\n3-Sair")
            when(readln()){
                "1"->{
                    println("Digite o nome do livro: ")
                    val nomeLivro = readln()
                    println("Digite o gênero do livro: ")
                    val genero = readln()
                    println("Digite a data de lançamento: ")
                    val dataLancamento = LocalDate.parse(readln(), VerificaInputs.formatter)
                    println("Digite o nome do(a) autor(a): ")
                    val nomeAutora = readln()
                    println("Digite a idade do(a) autor(a): ")
                    val idade = readln().toInt()
                    println("Digite a nacionalidade do(a) autor(a):")
                    val nacionalidade = readln()
                    biblioteca.cadastrarLivro(nomeLivro,genero,
                        Biblioteca.Autora(nomeAutora, idade, nacionalidade),dataLancamento)
                }
                "2"->{
                    println("Deseja ver informações do autor?1-sim 2-nao")
                    when(readln()){
                        "1"->biblioteca.exibirLivros(true)
                        "2"->biblioteca.exibirLivros(false)
                        else -> println("Valor invalido!")
                    }
                }
                "3"-> exitProcess(0)
                else -> println("Valor invalido!")
            }
        }catch (erro: DateTimeParseException){
            println("Data inválida")
        }

    }
}