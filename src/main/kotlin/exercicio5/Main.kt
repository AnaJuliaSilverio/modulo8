package exercicio5

import java.lang.IllegalArgumentException
import java.util.zip.DataFormatException
import kotlin.system.exitProcess

fun main() {
    val turma = Turma()
    while (true){
        try {
            println("1-Cadastra alunos\n2-Listar todos os alunos\n3-Aluno mais velho\n4-Média de idades\n5-Atualizar nome aluno\n6-Remover aluno\n7-Sair\n")
            when(readln()){
                "1"->turma.cadastrarAluno()
                "2"->turma.listarAlunos()
                "3"->turma.maisVelho()
                "4"->turma.mediaIdades()
                "5"-> {
                    println("Digite a matricula desejada: ")
                    turma.atualizaDados(readln())
                }
                "6"->{
                    println("Digite a matricula desejada: ")
                    turma.removeAluno(readln())
                }
                "7"-> exitProcess(0)
                else-> println("Valor invalido")
            }
        }catch (erro:IllegalArgumentException){
            println(erro.message)
        }catch (erro:DataFormatException){
            println("Data inválida")
        }
    }
}